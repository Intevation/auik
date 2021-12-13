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
 * Datei:
 * $Id: Anh56Model.java,v 1.3 2010-01-20 12:56:53 u633d Exp $
 *
 * Erstellt am 03.05.2006 von Gerd Genuit
 *
 * CVS-Log:
 * $Log: not supported by cvs2svn $
 * Revision 1.2  2009/03/24 12:35:23  u633d
 * Umstellung auf UTF8
 *
 * Revision 1.1  2008/06/05 11:38:40  u633d
 * Start AUIK auf Informix und Postgresql
 *
 * Revision 1.1  2006/05/03 09:01:54  u633d
 * Anhang 40 und 56 ergänzt
 *
 * Revision 1.1  2006/05/03 08:42:52  u633d
 * - Auswertungen und anderes
 *
 *
 */
package de.bielefeld.umweltamt.aui.module.common.tablemodels;

import de.bielefeld.umweltamt.aui.mappings.DatabaseQuery;
import de.bielefeld.umweltamt.aui.mappings.basis.Adresse;
import de.bielefeld.umweltamt.aui.mappings.basis.Objekt;
import de.bielefeld.umweltamt.aui.mappings.basis.Sachbearbeiter;
import de.bielefeld.umweltamt.aui.mappings.basis.Standort;
import de.bielefeld.umweltamt.aui.utils.StringUtils;
import de.bielefeld.umweltamt.aui.utils.tablemodelbase.ListTableModel;

/**
 * Ein einfaches TableModel für Priorität-Fachdaten.
 * @author Gerd Genuit
 */
public class PrioritaetModel extends ListTableModel {
    private static final long serialVersionUID = 5055568231368291920L;

    public PrioritaetModel() {
        super(new String[]{
                "Betreiber",
                "Standort",
                "Sachbearbeiter/in",
                "Priorität"
        },
        false);
    }

    /* (non-Javadoc)
     * @see de.bielefeld.umweltamt.aui.utils.tablemodelbase.ListTableModel#getColumnValue(java.lang.Object, int)
     */
    @Override
    public Object getColumnValue(Object objectAtRow, int columnIndex) {
    	Objekt obj = (Objekt) objectAtRow;
        Object tmp;

        switch (columnIndex) {
        case 0:
            tmp = obj.getBetreiberid();
            break;
		case 1:
			tmp = "";
			if (obj.getStandortid() != null) {
				tmp = DatabaseQuery.getStandortString(obj.getStandortid());
			}
			break;
        case 2:
			tmp = "";
			if (obj.getSachbearbeiter() != null) {
				tmp = obj.getSachbearbeiter().getName();
			}
			break;
        case 3:
			tmp = "";
			if (obj.getPrioritaet() != null) {
				tmp = obj.getPrioritaet();
			}
			break;

        default:
            tmp = "ERROR";
            break;
        }
        if (obj.isInaktiv()) {
            tmp = StringUtils.setStrike(tmp.toString());
        }
        return tmp;
    }

    /*
     * Leer, da kein Updaten der Liste nötig/möglich.
     */
    @Override
    public void updateList() {
    }
}
