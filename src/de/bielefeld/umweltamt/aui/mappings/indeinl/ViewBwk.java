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

package de.bielefeld.umweltamt.aui.mappings.indeinl;

import java.io.Serializable;
import java.util.List;

import de.bielefeld.umweltamt.aui.mappings.basis.BasisObjekt;
import de.bielefeld.umweltamt.aui.utils.DatabaseAccess;

/**
 * A class that represents a row in the 'ANH_BWK' table. This class may be
 * customized as it is never re-generated after being created.
 */
public class ViewBwk extends AbstractViewBwk implements Serializable {
    private static final long serialVersionUID = 4609805662436961510L;

    /**
     * Simple constructor of AnhBwk instances.
     */
    public ViewBwk() {
    }

    /**
     * Constructor of AnhBwk instances given a simple primary key.
     * @param bwkId
     */
    public ViewBwk(java.lang.Integer bwkId) {
        super(bwkId);
    }

    /**
     * Liefert einen String der Form "[BWK:ID,Hersteller Typ]"
     */
    @Override
    public String toString() {
        return "[BWK:" + getBwkId() + "," + getKHersteller() + " " + getKTyp()
            + "]";
    }

    public static ViewBwk getAnhBwkByObjekt(BasisObjekt objekt) {
        if (objekt.getBasisObjektarten().isBWK()) {
            return (ViewBwk) new DatabaseAccess()
                .createQuery(
                    "FROM ViewBwk as brennwert WHERE "
                        + "brennwert.basisObjekt = :objekt")
                .setEntity("objekt", objekt)
                .uniqueResult();
        }
        return null;
    }

    /**
     * Speichert ein BWK Fachdaten-Objekt in der Datenbank.
     * @param fachdaten Das zu speichernde Fachdaten-Objekt.
     * @return <code>true</code>, wenn das Objekt gespeichert wurde, sonst
     *         <code>false</code>.
     */
    public static boolean saveBwk(ViewBwk bwk) {
        return new DatabaseAccess().saveOrUpdate(bwk);
    }

    /**
     * Erzeugt eine Liste mit allen Brennwerkesseln eines bestimmten
     * Erfassungsjahrs.
     * @param jahr Das Erfassungsjahr (oder -1 wenn alle Kessel ausgegeben
     *            werden sollen).
     * @return Eine Liste aus AnhBwk-Objekten.
     */
    public static List<?> findByErfassungsjahr(Integer jahr) {
        String query = "FROM ViewBwk AS bwk ";

        if (jahr == null) {
            query += "WHERE bwk.erfassung IS NULL ";
            return new DatabaseAccess()
                .createQuery(query)
                .list();
        } else if (jahr != -1) {
            query += "WHERE bwk.erfassung = :jahr ";
            return new DatabaseAccess()
                .createQuery(query)
                .setInteger("jahr", jahr)
                .list();
        } else {
            return new DatabaseAccess().createQuery(query).list();
        }
    }

    public static Integer[] getErfassungsjahre() {
        Integer[] iJahre = null;
        iJahre = new DatabaseAccess()
            .createQuery(
                "SELECT DISTINCT bwk.erfassung "
                    + "FROM ViewBwk AS bwk")
            .array(new Integer[0]);
        return iJahre;
    }
}
