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

import de.bielefeld.umweltamt.aui.mappings.DatabaseQuery;
import de.bielefeld.umweltamt.aui.mappings.basis.Gemarkung;
import de.bielefeld.umweltamt.aui.utils.tablemodelbase.EditableListTableModel;

/**
 * Ein einfaches TableModel für die Einheitentabelle.
 * @author Gerd Genuit
 */
public class EditorGemarkungModel extends EditableListTableModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7170618777899362092L;

	public EditorGemarkungModel() {
        super(new String[]{
                "ID",
                "Gemarkung"
        },
        false);
    }

    /**
     * Tell the model which column is of which class type.<br>
     * @param columnIndex The index of the requested column
     */

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case 0: return Integer.class;
            case 1: return String.class;
            default: return null;
        }
    }

    /* (non-Javadoc)
     * @see de.bielefeld.umweltamt.aui.utils.tablemodelbase.ListTableModel#getColumnValue(java.lang.Object, int)
     */
    @Override
    public Object getColumnValue(Object objectAtRow, int columnIndex) {
    	Gemarkung gemarkung = (Gemarkung) objectAtRow;
        Object tmp;

        switch (columnIndex) {
        case 0:
            tmp = gemarkung.getId();
            break;
        case 1:
            tmp = gemarkung.getGemarkung();
            break;

        default:
            tmp = "ERROR";
            break;
        }
        return tmp;
    }


    @Override
    public void updateList() {
    }

	@Override
	public void editObject(Object objectAtRow, int columnIndex, Object newValue) {
		
		Gemarkung tmp = (Gemarkung) objectAtRow;
		switch (columnIndex) {
        case 0:
        	Integer tmpID = (Integer) newValue;
        	tmp.setId(tmpID);
        	break;
        	
        case 1:
        	String tmpArt = (String) newValue;
        	tmp.setGemarkung(tmpArt);
        	break;

        default:
            break;        	
        	
		}
		Gemarkung.merge(tmp);
	}

	@Override
	public Object newObject() {
		Gemarkung tmp = new Gemarkung();
		tmp.setId(DatabaseQuery.newGemarkungID());
		return tmp;
	}

    @Override
    public boolean objectRemoved(Object objectAtRow) {
    	Gemarkung removedGemarkung = (Gemarkung) objectAtRow;
        return Gemarkung.delete(removedGemarkung);
    }

    /**
     * Liefert die Gemarkung einer bestimmten Zeile.
     * @param rowIndex Die Zeile
     * @return Das Objekt bei rowIndex
     */
    public Gemarkung getRow(int rowIndex) {
        return (Gemarkung) getObjectAtRow(rowIndex);
    }
}
