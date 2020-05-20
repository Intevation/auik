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

package de.bielefeld.umweltamt.aui.mappings.awsv;

import de.bielefeld.umweltamt.aui.mappings.DatabaseAccess;
import de.bielefeld.umweltamt.aui.mappings.DatabaseClassToString;
import de.bielefeld.umweltamt.aui.mappings.DatabaseQuery;
import de.bielefeld.umweltamt.aui.mappings.DatabaseSerialVersionUID;
import de.bielefeld.umweltamt.aui.mappings.basis.Standort;
import de.bielefeld.umweltamt.aui.utils.AuikLogger;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * A class that represents a row in the Standortgghwsg database table.<br>
 * This class is meant to serve as a model and should be copied into the
 * appropriate package and may be customized below the given mark.
 */
public class Standortgghwsg  implements java.io.Serializable {

    /** Generated serialVersionUID for Serializable interface */
    private static final long serialVersionUID =
        DatabaseSerialVersionUID.forStandortgghwsg;
    
    /* Primary key, foreign keys (relations) and table columns */
    private Integer id;
    private String standortgg;
    private boolean enabled;
    private boolean deleted;
    private Set<Standort> standorts = new HashSet<Standort>(0);

    /** Logging */
    private static final AuikLogger log = AuikLogger.getLogger();

    /** Default constructor */
    public Standortgghwsg() {
        // This place is intentionally left blank.
    }

    /** Minimal constructor */
    public Standortgghwsg(
        Integer id, boolean enabled, boolean deleted) {
        this.id = id;
        this.enabled = enabled;
        this.deleted = deleted;
    }

    /** Full constructor */
    public Standortgghwsg(
        Integer id, String standortgg, boolean enabled, boolean deleted, Set<Standort> standorts) {
        this.id = id;
        this.standortgg = standortgg;
        this.enabled = enabled;
        this.deleted = deleted;
        this.standorts = standorts;
    }

    /* Setter and getter methods */
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStandortgg() {
        return this.standortgg;
    }

    public void setStandortgg(String standortgg) {
        this.standortgg = standortgg;
    }

    public boolean isEnabled() {
        return this.enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public boolean isDeleted() {
        return this.deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public Set<Standort> getStandorts() {
        return this.standorts;
    }

    public void setStandorts(Set<Standort> standorts) {
        this.standorts = standorts;
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
        buffer.append("standortgg").append("='").append(getStandortgg()).append("' ");			
        buffer.append("enabled").append("='").append(isEnabled()).append("' ");			
        buffer.append("deleted").append("='").append(isDeleted()).append("' ");			
        buffer.append("standorts").append("='").append(getStandorts()).append("' ");			
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
        if (!(other instanceof Standortgghwsg)) return false;
        return (this.getId().equals(
            ((Standortgghwsg) other).getId()));
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
     * @return <code>Standortgghwsg</code> the merged instance,
     *         if everything went okay,
     *         <code>null</code> otherwise
     */
    public static Standortgghwsg merge(Standortgghwsg detachedInstance) {
        log.debug("Merging Standortgghwsg instance " + detachedInstance);
        return (Standortgghwsg) new DatabaseAccess().merge(detachedInstance);
    }

    /**
     * Merge (save or update) this instance
     * @return <code>true</code>, if everything went okay,
     *         <code>false</code> otherwise
     */
    public boolean merge() {
        Standortgghwsg saved = Standortgghwsg.merge(this);
        if (saved == null) {
            return false;
        } else {
            this.copy(saved);
            return true;
        }
    }

    /**
     * Update this Standortgghwsg with its new values.<br>
     * This is meant to be used after merging!
     * @param copy Standortgghwsg
     */
    private void copy(Standortgghwsg copy) {
        this.id = copy.getId();            
        this.standortgg = copy.getStandortgg();            
        this.enabled = copy.isEnabled();            
        this.deleted = copy.isDeleted();            
        this.standorts = copy.getStandorts();            
    }    

    /**
     * Delete (mark as deleted) a detached instance
     * @param detachedInstance the instance to delete
     * @return <code>true</code>, if everything went okay,
     *         <code>false</code> otherwise
     */
    public static boolean delete(Standortgghwsg detachedInstance) {
        log.debug("Deleting Standortgghwsg instance " + detachedInstance);
        return new DatabaseAccess().delete(detachedInstance);
    }

    /**
     * Delete (mark as deleted) this instance
     * @return <code>true</code>, if everything went okay,
     *         <code>false</code> otherwise
     */
    public boolean delete() {
        return Standortgghwsg.delete(this);
    }

    /**
     * Find an <code>Standortgghwsg</code> instance by its primary key
     * @param id the primary key value
     * @return <code>Standortgghwsg</code> the requested instance,
     *         if one exists,
     *         <code>null</code> otherwise
     */
    public static Standortgghwsg findById(java.lang.Integer id) {
        log.debug("Getting Standortgghwsg instance with id: " + id);
        return (Standortgghwsg)
            new DatabaseAccess().get(Standortgghwsg.class, id);
    }

    /**
     * Get a list of all <code>Standortgghwsg</code>
     * @return <code>List&lt;Standortgghwsg&gt;</code>
     *         all <code>Standortgghwsg</code>
     */
    public static List<Standortgghwsg> getAll() {
        return DatabaseQuery.getAll(new Standortgghwsg());
    }

	public String toGuiString() {
		return getStandortgg();
	}

    /* Custom code goes below here! */

}
