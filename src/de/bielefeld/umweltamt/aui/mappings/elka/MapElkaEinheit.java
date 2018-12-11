/**
 * Copyright 2005-2042, Stadt Bielefeld
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

// Generated by Hibernate Tools 5.0.0.Final

package de.bielefeld.umweltamt.aui.mappings.elka;

import de.bielefeld.umweltamt.aui.mappings.DatabaseAccess;
import de.bielefeld.umweltamt.aui.mappings.DatabaseClassToString;
import de.bielefeld.umweltamt.aui.mappings.DatabaseQuery;
import de.bielefeld.umweltamt.aui.mappings.DatabaseSerialVersionUID;
import de.bielefeld.umweltamt.aui.utils.AuikLogger;
import java.util.List;

/**
 * A class that represents a row in the MapElkaEinheit database table.<br>
 * This class is meant to serve as a model and should be copied into the
 * appropriate package and may be customized below the given mark.
 */
public class MapElkaEinheit  implements java.io.Serializable {

    /** Generated serialVersionUID for Serializable interface */
    private static final long serialVersionUID =
        DatabaseSerialVersionUID.forMapElkaEinheit;
    
    /* Primary key, foreign keys (relations) and table columns */
    private Integer id;
    private String name;
    private Integer idElka;
    private Integer idAuik;

    /** Logging */
    private static final AuikLogger log = AuikLogger.getLogger();

    /** Default constructor */
    public MapElkaEinheit() {
        // This place is intentionally left blank.
    }

    /** Minimal constructor */
    public MapElkaEinheit(
        Integer id) {
        this.id = id;
    }

    /** Full constructor */
    public MapElkaEinheit(
        Integer id, String name, Integer idElka, Integer idAuik) {
        this.id = id;
        this.name = name;
        this.idElka = idElka;
        this.idAuik = idAuik;
    }

    /* Setter and getter methods */
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getIdElka() {
        return this.idElka;
    }

    public void setIdElka(Integer idElka) {
        this.idElka = idElka;
    }

    public Integer getIdAuik() {
        return this.idAuik;
    }

    public void setIdAuik(Integer idAuik) {
        this.idAuik = idAuik;
    }

    /**
     * To implement custom toString methods, jump to not generated code.<br>
     * Basically we either call on <code>toDebugString</code> for a debug
     * string, call on <code>toGuiString</code> for a gui representation or do
     * something completely different.
     * @return String
     */
    @Override
    public String toString() {
        return DatabaseClassToString.toStringForClass(this); 
    }

    /**
     * Get a string representation for debugging
     * @return String
     */
    public String toDebugString() {
        StringBuffer buffer = new StringBuffer();
        
        buffer.append(getClass().getSimpleName()).append("@").append(Integer.toHexString(hashCode())).append(" [");
        buffer.append("id").append("='").append(getId()).append("' ");			
        buffer.append("name").append("='").append(getName()).append("' ");			
        buffer.append("idElka").append("='").append(getIdElka()).append("' ");			
        buffer.append("idAuik").append("='").append(getIdAuik()).append("' ");			
        buffer.append("]");

        return buffer.toString();
    }

    /**
     * @param other
     * @return <code>true</code>, if this and other are equal,
     *         <code>false</code> otherwise
     */
    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null) return false;
        if (!(other instanceof MapElkaEinheit)) return false;
        return (this.getId().equals(
            ((MapElkaEinheit) other).getId()));
    }

    /**
     * Calculate a unique hashCode
     * @return <code>int</code>
     */
    @Override
    public int hashCode() {
        int result = 17;
        int idValue = this.getId() == null ?
            0 : this.getId().hashCode();
        result = result * 37 + idValue;
        return result;
    }
    
    /**
     * Merge (save or update) a detached instance
     * @param detachedInstance the instance to merge
     * @return <code>MapElkaEinheit</code> the merged instance,
     *         if everything went okay,
     *         <code>null</code> otherwise
     */
    public static MapElkaEinheit merge(MapElkaEinheit detachedInstance) {
        log.debug("Merging MapElkaEinheit instance " + detachedInstance);
        return (MapElkaEinheit) new DatabaseAccess().merge(detachedInstance);
    }

    /**
     * Merge (save or update) this instance
     * @return <code>true</code>, if everything went okay,
     *         <code>false</code> otherwise
     */
    public boolean merge() {
        MapElkaEinheit saved = MapElkaEinheit.merge(this);
        if (saved == null) {
            return false;
        } else {
            this.copy(saved);
            return true;
        }
    }

    /**
     * Update this MapElkaEinheit with its new values.<br>
     * This is meant to be used after merging!
     * @param copy MapElkaEinheit
     */
    private void copy(MapElkaEinheit copy) {
        this.id = copy.getId();            
        this.name = copy.getName();            
        this.idElka = copy.getIdElka();            
        this.idAuik = copy.getIdAuik();            
    }    

    /**
     * Delete (mark as deleted) a detached instance
     * @param detachedInstance the instance to delete
     * @return <code>true</code>, if everything went okay,
     *         <code>false</code> otherwise
     */
    public static boolean delete(MapElkaEinheit detachedInstance) {
        log.debug("Deleting MapElkaEinheit instance " + detachedInstance);
        return new DatabaseAccess().delete(detachedInstance);
    }

    /**
     * Delete (mark as deleted) this instance
     * @return <code>true</code>, if everything went okay,
     *         <code>false</code> otherwise
     */
    public boolean delete() {
        return MapElkaEinheit.delete(this);
    }

    /**
     * Find an <code>MapElkaEinheit</code> instance by its primary key
     * @param id the primary key value
     * @return <code>MapElkaEinheit</code> the requested instance,
     *         if one exists,
     *         <code>null</code> otherwise
     */
    public static MapElkaEinheit findById(java.lang.Integer id) {
        log.debug("Getting MapElkaEinheit instance with id: " + id);
        return (MapElkaEinheit)
            new DatabaseAccess().get(MapElkaEinheit.class, id);
    }

    /**
     * Get a list of all <code>MapElkaEinheit</code>
     * @return <code>List&lt;MapElkaEinheit&gt;</code>
     *         all <code>MapElkaEinheit</code>
     */
    public static List<MapElkaEinheit> getAll() {
        return DatabaseQuery.getAll(new MapElkaEinheit());
    }

    /* Custom code goes below here! */

}
