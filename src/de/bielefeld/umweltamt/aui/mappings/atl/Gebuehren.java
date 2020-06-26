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

package de.bielefeld.umweltamt.aui.mappings.atl;

import de.bielefeld.umweltamt.aui.mappings.DatabaseAccess;
import de.bielefeld.umweltamt.aui.mappings.DatabaseClassToString;
import de.bielefeld.umweltamt.aui.mappings.DatabaseQuery;
import de.bielefeld.umweltamt.aui.mappings.DatabaseSerialVersionUID;
import de.bielefeld.umweltamt.aui.utils.AuikLogger;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * A class that represents a row in the Gebuehren database table.<br>
 * This class is meant to serve as a model and should be copied into the
 * appropriate package and may be customized below the given mark.
 */
public class Gebuehren implements java.io.Serializable {

    /** Generated serialVersionUID for Serializable interface */
    private static final long serialVersionUID =
        DatabaseSerialVersionUID.forGebuehren;

    /* Primary key, foreign keys (relations) and table columns */
    private Integer id;
    private String bezeichnung;
    private Integer wert;
    private Boolean enabled;
    private Boolean deleted;

    /** Logging */
    private static final AuikLogger log = AuikLogger.getLogger();

    /** Default constructor */
    public Gebuehren() {
        // This place is intentionally left blank.
    }

    /** Minimal constructor */
    public Gebuehren(
        Integer id, boolean enabled, boolean deleted) {
        this.id = id;
        this.enabled = enabled;
        this.deleted = deleted;
    }

    /** Full constructor */
    public Gebuehren(
        Integer id, String bezeichnung, Integer wert, Boolean enabled, Boolean deleted) {
        this.id = id;
        this.bezeichnung = bezeichnung;
        this.wert = wert;
        this.enabled = enabled;
        this.deleted = deleted;
    }

    /* Setter and getter methods */
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBezeichnung() {
        return this.bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public Integer getWert() {
        return this.wert;
    }

    public void setWert(Integer wert) {
        this.wert = wert;
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
        buffer.append("bezeichnung").append("='").append(getBezeichnung()).append("' ");
        buffer.append("wert").append("='").append(getWert()).append("' ");
        buffer.append("enabled").append("='").append(isEnabled()).append("' ");
        buffer.append("deleted").append("='").append(isDeleted()).append("' ");
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
        if (!(other instanceof Gebuehren)) return false;
        return (this.getId().equals(
            ((Gebuehren) other).getId()));
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
     * @return <code>Gebuehren</code> the merged instance,
     *         if everything went okay,
     *         <code>null</code> otherwise
     */
    public static Gebuehren merge(Gebuehren detachedInstance) {
        log.debug("Merging Gebuehren instance " + detachedInstance);
        return (Gebuehren) new DatabaseAccess().merge(detachedInstance);
    }

    /**
     * Merge (save or update) this instance
     * @return <code>true</code>, if everything went okay,
     *         <code>false</code> otherwise
     */
    public boolean merge() {
        Gebuehren saved = Gebuehren.merge(this);
        if (saved == null) {
            return false;
        } else {
            this.copy(saved);
            return true;
        }
    }

    /**
     * Update this Gebuehren with its new values.<br>
     * This is meant to be used after merging!
     * @param copy Gebuehren
     */
    private void copy(Gebuehren copy) {
        this.id = copy.getId();
        this.bezeichnung = copy.getBezeichnung();
        this.wert = copy.getWert();
        this.enabled = copy.isEnabled();
        this.deleted = copy.isDeleted();
    }

    /**
     * Delete (mark as deleted) a detached instance
     * @param detachedInstance the instance to delete
     * @return <code>true</code>, if everything went okay,
     *         <code>false</code> otherwise
     */
    public static boolean delete(Gebuehren detachedInstance) {
        log.debug("Deleting Gebuehren instance " + detachedInstance);
        return new DatabaseAccess().delete(detachedInstance);
    }

    /**
     * Delete (mark as deleted) this instance
     * @return <code>true</code>, if everything went okay,
     *         <code>false</code> otherwise
     */
    public boolean delete() {
        return Gebuehren.delete(this);
    }

    /**
     * Find an <code>Gebuehren</code> instance by its primary key
     * @param id the primary key value
     * @return <code>Gebuehren</code> the requested instance,
     *         if one exists,
     *         <code>null</code> otherwise
     */
    public static Gebuehren findById(java.lang.Integer id) {
        log.debug("Getting Gebuehren instance with id: " + id);
        return (Gebuehren)
            new DatabaseAccess().get(Gebuehren.class, id);
    }

    /**
     * Get a list of all <code>Gebuehren</code>
     * @return <code>List&lt;Gebuehren&gt;</code>
     *         all <code>Gebuehren</code>
     */
    public static List<Gebuehren> getAll() {
        return DatabaseQuery.getAll(new Gebuehren());
    }

	public String toGuiString() {
		return getBezeichnung();
	}

    /* Custom code goes below here! */

    /**
     * Find gebuehren record by bezeichnung field
     * @param bezeichnung Bezeichnung to search by
     * @return Gebuehren instance if found, else null
     */
    public static Gebuehren findByBezeichnung(String bezeichnung) {
        List<Gebuehren> gebuehrens = Gebuehren.getAll();
        if (gebuehrens == null || gebuehrens.isEmpty()) {
            return null;
        }
        Gebuehren foundItem = null;
        final AtomicInteger itemIndex = new AtomicInteger(-1);
        gebuehrens.forEach(item -> {
            if (item.getBezeichnung().equals(bezeichnung)) {
                itemIndex.set(gebuehrens.indexOf(item));
            }
        });
        if (itemIndex.get() > -1) {
            foundItem = gebuehrens.get(itemIndex.get());
        }
        return foundItem;
    }
}
