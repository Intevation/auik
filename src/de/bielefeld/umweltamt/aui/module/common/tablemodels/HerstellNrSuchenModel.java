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

 */
package de.bielefeld.umweltamt.aui.module.common.tablemodels;


import de.bielefeld.umweltamt.aui.mappings.vaws.VawsFachdaten;
import de.bielefeld.umweltamt.aui.utils.tablemodelbase.ListTableModel;

/**
 * Das TabelModel zur Darstellung des Suchergebnisses für die Herstellnummernsuche.
 * @author Sebastian Geller
 */

public class HerstellNrSuchenModel extends ListTableModel {
    /**
     * Das TableModel für die Ergebnisse der Suche nach Herstellnr.
     */
    public HerstellNrSuchenModel() {
        super(new String[]{
                "Herstellnr.",
                "Betreiber",
                "Standort",
                "Anlagenart",
                "Flüssigkeit",
                "Menge",
                "Stillgelegt"
        },
        false);
    }

    /* (non-Javadoc)
     * @see de.bielefeld.umweltamt.aui.utils.tablemodelbase.ListTableModel#getColumnValue(java.lang.Object, int)
     */
    // Die einzelnen Spalten werden mit Daten befüllt
    public Object getColumnValue(Object objectAtRow, int columnIndex) {
        VawsFachdaten fachdaten = (VawsFachdaten) objectAtRow;
        Object tmp;

        switch (columnIndex) {
        // Herstellnummer:
        case 0:
            tmp = fachdaten.getHerstellnr();
            break;
        //Betreiber:
        case 1:
            tmp = fachdaten.getBasisObjekt().getBasisBetreiber();
            break;
        //Standort
        case 2:
            tmp = fachdaten.getBasisObjekt().getBasisStandort();
            break;
        // Anlagenart:
        case 3:
            tmp = fachdaten.getAnlagenart();
            break;
        // Flüssigkeit:
        case 4:
            tmp = fachdaten.getFluessigkeit();
            break;
        // Menge:
        case 5:
            if(fachdaten.getMenge()!=null)
                tmp = Math.round(fachdaten.getMenge()*100.)/100.;
         // wenn keine Menge angegeben ist, wird tmp auf 0 gesetzt
            else
                tmp = 0;
            break;
        // Stillgelegt:
        case 6:
            tmp = fachdaten.getStillegungsDatumString();
            break;

        // Andere Spalten sollten nicht vorkommen, deshalb "ERROR":
        default:
            tmp = "ERROR";
            break;
        }
        // Wenn ein Objekt stillgelegt ist, wird es durchgestrichen
        if ((fachdaten.getStillegungsdatum() != null) && (tmp != null)) {
            tmp = "<html><strike>" + tmp + "</strike></html>";
        }

        return tmp;
    }

    /**
     * Liefert einen Datensatz in einer bestimmten Zeile.
     * @param row Die Zeile der Tabelle.
     * @return Den Datensatz, der in dieser Zeile angezeigt wird.
     */
    public VawsFachdaten getDatenSatz(int row) {
        return (VawsFachdaten) getObjectAtRow(row);
    }

    /*
     * Leer, da kein Updaten der Liste nötig/möglich.
     * Die Liste wird direkt mittels setList "befüllt".
     */
    public void updateList() {
    }


}

