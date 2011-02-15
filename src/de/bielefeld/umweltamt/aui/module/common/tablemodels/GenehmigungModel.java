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

package de.bielefeld.umweltamt.aui.module.common.tablemodels;

import de.bielefeld.umweltamt.aui.mappings.indeinl.IndeinlGenehmigung;
import de.bielefeld.umweltamt.aui.utils.AuikUtils;
import de.bielefeld.umweltamt.aui.utils.tablemodelbase.ListTableModel;

/**
 * Ein einfaches TableModel für Anhang 52-Fachdaten.
 * @author Gerd Genuit
 */
public class GenehmigungModel extends ListTableModel {
    public GenehmigungModel() {
        super(new String[]{
                "Betreiber",
                "Standort",
                "Datum",
                "Anhang",
                "58er",
                "59er",
                "Bemerkungen"
        },
        false);
    }

    /* (non-Javadoc)
     * @see de.bielefeld.umweltamt.aui.utils.tablemodelbase.ListTableModel#getColumnValue(java.lang.Object, int)
     */
    public Object getColumnValue(Object objectAtRow, int columnIndex) {
        IndeinlGenehmigung fd = (IndeinlGenehmigung) objectAtRow;
        Object tmp;

        switch (columnIndex) {
        case 0:
            tmp = fd.getBasisObjekt().getBasisBetreiber();
            break;
        case 1:
            tmp = fd.getBasisObjekt().getBasisStandort();
            break;
        case 2:
            tmp = AuikUtils.getStringFromDate(fd.getErstellungsDatum());
            break;
        case 3:
            tmp = fd.getAnhang();
            break;
        case 4:
            if (fd.getGen58()!= null)
                tmp = new Boolean(fd.getGen58());
            else
                tmp = new Boolean(false);
            break;
        case 5:
            if (fd.getGen59()!= null)
                tmp = new Boolean(fd.getGen59());
            else
                tmp = new Boolean(false);
            break;
        case 6:
            tmp = fd.getBemerkungen();
            break;

        default:
            tmp = "ERROR";
            break;
        }
        if (fd.getBasisObjekt().getInaktiv() == true && columnIndex != 4 && columnIndex != 5)
        {
            tmp = "<html><strike>" + tmp + "</strike></html>";
        }
        return tmp;
    }

    public Class getColumnClass(int columnIndex) {
        if (columnIndex == 4) {
            return Boolean.class;
        }else if (columnIndex == 5) {
            return Boolean.class;
        } else {
            return super.getColumnClass(columnIndex);
        }
    }

    /*
     * Leer, da kein Updaten der Liste nötig/möglich.
     */
    public void updateList() {
    }
}
