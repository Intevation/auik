/**
 * Copyright 2005-2011, Stadt Bielefeld
 *
 * This file is part of AUIK (Anlagen- und Indirekteinleiter-Kataster).
 *
 * AUIK is free software: you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the
 * Free Software Foundation, either version 2 of the License, or (at your
 * option) any later version.
 *
 * AUIK is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public
 * License for more details.
 *
 * You should have received a copy of the GNU General Public
 * License along with AUIK. If not, see <http://www.gnu.org/licenses/>.
 *
 * AUIK has been developed by Stadt Bielefeld and Intevation GmbH.
 */

/*
Copyright (c) 2005-2007, Robert F. Beeger & Arno Haase & Stefan Roock & Sebastian Sanitz
All rights reserved.

Redistribution and use in source and binary forms, with or without modification,
are permitted provided that the following conditions are met:

    * Redistributions of source code must retain the above copyright notice,
      this list of conditions and the following disclaimer.
    * Redistributions in binary form must reproduce the above copyright notice,
      this list of conditions and the following disclaimer in the documentation and/or
      other materials provided with the distribution.
    * Neither the name of the the authors nor the names of its contributors may be
      used to endorse or promote products derived from this software without specific
      prior written permission.

THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY
EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF
MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL
THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE
GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE
OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
POSSIBILITY OF SUCH DAMAGE.
 */
package de.bielefeld.umweltamt.aui.tests;

import java.util.List;

import junit.framework.TestCase;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import de.bielefeld.umweltamt.aui.mappings.atl.AtlSielhaut;
import de.bielefeld.umweltamt.aui.mappings.basis.BasisObjekt;

public class SielhautTest extends TestCase {

    private SessionFactory _sessionFactory;
    private static final String Messstelle = "JUnit";
    private int _id;

    /**
     * Starten einer SessionFactory und erzeugen schon mal einens neues
     * Sielhaupunkt.
     */
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        Configuration configuration = new Configuration().configure();

        _sessionFactory = configuration.buildSessionFactory();
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
        _sessionFactory.close();
    }

    public void testErzeugen() {
        String id = "leer";
        _id = erzeugeSielhaut(Messstelle);
        if (_id != 0) {
            id = "vorhanden";
        }
        assertEquals(id, "vorhanden");
    }

    /**
     * Und hier versuchen wir ihn über eine Datenbankabfrage zu finden.
     */
    private AtlSielhaut testQuery() {
        Session session = null;

        try {
            session = _sessionFactory.openSession();

            List<?> result = AtlSielhaut.findPunkte(Messstelle);

            AtlSielhaut sielhaut = (AtlSielhaut) result.get(0);

            assertEquals(Messstelle, sielhaut.getBezeichnung());

            return sielhaut; // Hier return und darunter finally? Strange...
        } finally {
            if (session != null && session.isConnected()) {
                session.close();
            }
        }
    }

    /**
     * Hier wird getestet ob der Sielhautpunkt verändert werden kann
     */
    public void testUpdate() {
        Session session = null;

        session = _sessionFactory.openSession();
        AtlSielhaut sielhaut = testQuery();
        Transaction transaction = session.beginTransaction();
        sielhaut.setBemerkungen("neue");
        AtlSielhaut.saveSielhautPunkt(sielhaut, new BasisObjekt());
        transaction.commit();
        session.close();
        session = _sessionFactory.openSession();

        sielhaut = testQuery();

        assertEquals(Messstelle, sielhaut.getBezeichnung());
        assertEquals("neue", sielhaut.getBemerkungen());
        delete();

        if (session != null && session.isConnected()) {
            session.close();
        }
    }

    /**
     * der Sielhutpunkt wird gelöscht
     */
    public void delete() {
        Session session = null;
        session = _sessionFactory.openSession();

        AtlSielhaut sielhaut = testQuery();
        Transaction transaction = session.beginTransaction();
        session.delete(sielhaut);
        transaction.commit();
        session.close();
        session = _sessionFactory.openSession();

        if (session != null && session.isConnected()) {
            session.close();
        }
    }

    /**
     * Kleine Hilfsmethode, mit der ein Sielhautpunkt erzeugt und in der
     * Datenbank gesichert wird.
     * @param messtelle Messtellenbezeichnung
     * @return Gibt die ID des Sielhautpunktes zurück.
     */
    private int erzeugeSielhaut(String messstelle) {
        AtlSielhaut sielhaut = new AtlSielhaut();
        sielhaut.setBezeichnung(messstelle);

        Session session = null;
        Transaction transaction = null;
        try {
            session = _sessionFactory.openSession();
            transaction = session.beginTransaction();

            AtlSielhaut.saveSielhautPunkt(sielhaut, new BasisObjekt());
            transaction.commit();
        } catch (HibernateException e) {
            if (transaction != null) {
                transaction.rollback();
                throw e;
            }
        } finally {
            if (session != null) {
                session.close();
            }
        }

        return sielhaut.getId();
    }
}
