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
import de.bielefeld.umweltamt.aui.mappings.elka.Referenz;
import de.bielefeld.umweltamt.aui.utils.AuikLogger;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonBackReference;

/**
 * A class that represents a row in the Klaeranlage database table.<br>
 * This class is meant to serve as a model and should be copied into the
 * appropriate package and may be customized below the given mark.
 */
public class Klaeranlage  implements java.io.Serializable {

    /** Generated serialVersionUID for Serializable interface */
    private static final long serialVersionUID =
        DatabaseSerialVersionUID.forKlaeranlage;

    /* Primary key, foreign keys (relations) and table columns */
    private Integer nr;
    private Integer origNr;
    private String anlage;
    private Integer deaKlaeranlageNr;
    private boolean enabled;
    private boolean deleted;
    private Set<Referenz> referenzsForQKaNr = new HashSet<Referenz>(0);
    private Set<Referenz> referenzsForZKaNr = new HashSet<Referenz>(0);
    private Set<Messstelle> messstelles = new HashSet<Messstelle>(0);

    /** Logging */
    private static final AuikLogger log = AuikLogger.getLogger();

    /** Default constructor */
    public Klaeranlage() {
        // This place is intentionally left blank.
    }

    /** Minimal constructor */
    public Klaeranlage(
        Integer nr, String anlage, Integer deaKlaeranlageNr, boolean enabled, boolean deleted) {
        this.nr = nr;
        this.anlage = anlage;
        this.deaKlaeranlageNr = deaKlaeranlageNr;
        this.enabled = enabled;
        this.deleted = deleted;
    }

    /** Full constructor */
    public Klaeranlage(
        Integer nr, String anlage, Integer deaKlaeranlageNr, boolean enabled, boolean deleted, Set<Referenz> referenzsForQKaNr, Set<Referenz> referenzsForZKaNr, Set<Messstelle> messstelles) {
        this.nr = nr;
        this.anlage = anlage;
        this.deaKlaeranlageNr = deaKlaeranlageNr;
        this.enabled = enabled;
        this.deleted = deleted;
        this.referenzsForQKaNr = referenzsForQKaNr;
        this.referenzsForZKaNr = referenzsForZKaNr;
        this.messstelles = messstelles;
    }

    /* Setter and getter methods */
    public Integer getNr() {
        return this.nr;
    }

    public void setNr(Integer nr) {
        this.nr = nr;
    }

    @JsonIgnore
    public Integer getOrigNr() {
        return this.origNr;
    }

    public void setOrigNr(Integer origId) {
        this.origNr = origId;
    }

    public String getAnlage() {
        return this.anlage;
    }

    public void setAnlage(String anlage) {
        this.anlage = anlage;
    }

    public Integer getDeaKlaeranlageNr() {
        return this.deaKlaeranlageNr;
    }

    public void setDeaKlaeranlageNr(Integer deaKlaeranlageNr) {
        this.deaKlaeranlageNr = deaKlaeranlageNr;
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

    @JsonBackReference
    public Set<Referenz> getReferenzsForQKaNr() {
        return this.referenzsForQKaNr;
    }

    public void setReferenzsForQKaNr(Set<Referenz> referenzsForQKaNr) {
        this.referenzsForQKaNr = referenzsForQKaNr;
    }

    @JsonBackReference
    public Set<Referenz> getReferenzsForZKaNr() {
        return this.referenzsForZKaNr;
    }

    public void setReferenzsForZKaNr(Set<Referenz> referenzsForZKaNr) {
        this.referenzsForZKaNr = referenzsForZKaNr;
    }

    @JsonBackReference
    public Set<Messstelle> getMessstelles() {
        return this.messstelles;
    }

    public void setMessstelles(Set<Messstelle> messstelles) {
        this.messstelles = messstelles;
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
        buffer.append("id").append("='").append(getNr()).append("' ");
        buffer.append("anlage").append("='").append(getAnlage()).append("' ");
        buffer.append("deaKlaeranlageKlaeranlageNr").append("='").append(getDeaKlaeranlageNr()).append("' ");
        buffer.append("enabled").append("='").append(isEnabled()).append("' ");
        buffer.append("deleted").append("='").append(isDeleted()).append("' ");
        buffer.append("referenzsForQKaNr").append("='").append(getReferenzsForQKaNr()).append("' ");
        buffer.append("referenzsForZKaNr").append("='").append(getReferenzsForZKaNr()).append("' ");
        buffer.append("messstelles").append("='").append(getMessstelles()).append("' ");
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
        if (!(other instanceof Klaeranlage)) return false;
        return (this.getNr().equals(
            ((Klaeranlage) other).getNr()));
    }

    /**
     * Calculate a unique hashCode
     * @return <code>int</code>
     */
    @Override
    public int hashCode() {
        int result = 17;
        int idValue = this.getNr() == null ?
            0 : this.getNr().hashCode();
        result = result * 37 + idValue;
        return result;
    }

    /**
     * Merge (save or update) a detached instance
     * @param detachedInstance the instance to merge
     * @return <code>Klaeranlage</code> the merged instance,
     *         if everything went okay,
     *         <code>null</code> otherwise
     */
    public static Klaeranlage merge(Klaeranlage detachedInstance) {
        log.debug("Merging Klaeranlage instance " + detachedInstance);
        return (Klaeranlage) new DatabaseAccess().merge(detachedInstance);
    }

    /**
     * Merge (save or update) this instance
     * @return <code>true</code>, if everything went okay,
     *         <code>false</code> otherwise
     */
    public boolean merge() {
        Klaeranlage saved = Klaeranlage.merge(this);
        if (saved == null) {
            return false;
        } else {
            this.copy(saved);
            return true;
        }
    }

    /**
     * Update this Klaeranlage with its new values.<br>
     * This is meant to be used after merging!
     * @param copy Klaeranlage
     */
    private void copy(Klaeranlage copy) {
        this.nr = copy.getNr();
        this.anlage = copy.getAnlage();
        this.deaKlaeranlageNr = copy.getDeaKlaeranlageNr();
        this.enabled = copy.isEnabled();
        this.deleted = copy.isDeleted();
        this.referenzsForQKaNr = copy.getReferenzsForQKaNr();
        this.referenzsForZKaNr = copy.getReferenzsForZKaNr();
        this.messstelles = copy.getMessstelles();
    }

    /**
     * Delete (mark as deleted) a detached instance
     * @param detachedInstance the instance to delete
     * @return <code>true</code>, if everything went okay,
     *         <code>false</code> otherwise
     */
    public static boolean delete(Klaeranlage detachedInstance) {
        log.debug("Deleting Klaeranlage instance " + detachedInstance);
        return new DatabaseAccess().delete(detachedInstance);
    }

    /**
     * Delete (mark as deleted) this instance
     * @return <code>true</code>, if everything went okay,
     *         <code>false</code> otherwise
     */
    public boolean delete() {
        return Klaeranlage.delete(this);
    }

    /**
     * Find an <code>Klaeranlage</code> instance by its primary key
     * @param id the primary key value
     * @return <code>Klaeranlage</code> the requested instance,
     *         if one exists,
     *         <code>null</code> otherwise
     */
    public static Klaeranlage findById(java.lang.Integer id) {
        log.debug("Getting Klaeranlage instance with id: " + id);
        return (Klaeranlage)
            new DatabaseAccess().get(Klaeranlage.class, id);
    }

    /**
     * Get a list of all <code>Klaeranlage</code>
     * @return <code>List&lt;Klaeranlage&gt;</code>
     *         all <code>Klaeranlage</code>
     */
    public static List<Klaeranlage> getAll() {
        return DatabaseQuery.getAll(new Klaeranlage());
    }

	public String toGuiString() {
		return getAnlage();
	}

    /* Custom code goes below here! */

}
