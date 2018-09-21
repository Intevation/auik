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
import de.bielefeld.umweltamt.aui.mappings.elka_sync.EAbwasserbehandlungsanlage;
import de.bielefeld.umweltamt.aui.mappings.elka_sync.EProbenahme;
import de.bielefeld.umweltamt.aui.mappings.oberflgw.Sonderbauwerk;
import de.bielefeld.umweltamt.aui.utils.AuikLogger;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * A class that represents a row in the ZAbaVerfahren database table.<br>
 * This class is meant to serve as a model and should be copied into the
 * appropriate package and may be customized below the given mark.
 */
public class ZAbaVerfahren  implements java.io.Serializable {

    /** Generated serialVersionUID for Serializable interface */
    private static final long serialVersionUID =
        DatabaseSerialVersionUID.forZAbaVerfahren;

    /* Primary key, foreign keys (relations) and table columns */
    private Integer nr;
    private EAbwasserbehandlungsanlage abwasserbehandlungsanlage;
    private Abaverfahren abaverfahren;

    /** Logging */
    private static final AuikLogger log = AuikLogger.getLogger();

    /** Default constructor */
    public ZAbaVerfahren() {
        // This place is intentionally left blank.
    }

    /** Full constructor */
    public ZAbaVerfahren(
        Integer nr) {
        this.nr = nr;
    }

    /* Setter and getter methods */
    public Integer getNr() {
        return this.nr;
    }

    public void setNr(Integer nr) {
        this.nr = nr;
    }

    public EAbwasserbehandlungsanlage getAbwasserbehandlungsanlage() {
        return this.abwasserbehandlungsanlage;
    }

    public void setAbwasserbehandlungsanlage(EAbwasserbehandlungsanlage abwasserbehandlungsanlage) {
        this.abwasserbehandlungsanlage = abwasserbehandlungsanlage;
    }

    public Abaverfahren getAbaverfahren() {
        return this.abaverfahren;
    }

    public void setAbaverfahren(Abaverfahren abaverfahren) {
        this.abaverfahren = abaverfahren;
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
        //TODO
        return "";
    }

    /**
     * Get a string representation for debugging
     * @return String
     */
    public String toDebugString() {
        StringBuffer buffer = new StringBuffer();

        buffer.append(getClass().getSimpleName()).append("@").append(Integer.toHexString(hashCode())).append(" [");
        buffer.append("nr").append("='").append(getNr()).append("' ");
        buffer.append("aba").append("='").append(getAbwasserbehandlungsanlage()).append("' ");
        buffer.append("abaverfahren").append("='").append(getAbaverfahren()).append("' ");
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
        if (!(other instanceof ZAbaVerfahren)) return false;
        return (this.getNr().equals(
            ((ZAbaVerfahren) other).getNr()));
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
     * @return <code>ZAbaVerfahren</code> the merged instance,
     *         if everything went okay,
     *         <code>null</code> otherwise
     */
    public static ZAbaVerfahren merge(ZAbaVerfahren detachedInstance) {
        log.debug("Merging ZAbaVerfahren instance " + detachedInstance);
        return (ZAbaVerfahren) new DatabaseAccess().merge(detachedInstance);
    }

    /**
     * Merge (save or update) this instance
     * @return <code>true</code>, if everything went okay,
     *         <code>false</code> otherwise
     */
    public boolean merge() {
        ZAbaVerfahren saved = ZAbaVerfahren.merge(this);
        if (saved == null) {
            return false;
        } else {
            this.copy(saved);
            return true;
        }
    }

    /**
     * Update this ZAbaVerfahren with its new values.<br>
     * This is meant to be used after merging!
     * @param copy ZAbaVerfahren
     */
    private void copy(ZAbaVerfahren copy) {
        this.nr = copy.getNr();
        this.abwasserbehandlungsanlage = copy.getAbwasserbehandlungsanlage();
        this.abaverfahren = copy.getAbaverfahren();
    }

    /**
     * Delete (mark as deleted) a detached instance
     * @param detachedInstance the instance to delete
     * @return <code>true</code>, if everything went okay,
     *         <code>false</code> otherwise
     */
    public static boolean delete(ZAbaVerfahren detachedInstance) {
        log.debug("Deleting ZAbaVerfahren instance " + detachedInstance);
        return new DatabaseAccess().delete(detachedInstance);
    }

    /**
     * Delete (mark as deleted) this instance
     * @return <code>true</code>, if everything went okay,
     *         <code>false</code> otherwise
     */
    public boolean delete() {
        return ZAbaVerfahren.delete(this);
    }

    /**
     * Find an <code>ZAbaVerfahren</code> instance by its primary key
     * @param id the primary key value
     * @return <code>ZAbaVerfahren</code> the requested instance,
     *         if one exists,
     *         <code>null</code> otherwise
     */
    public static ZAbaVerfahren findById(de.bielefeld.umweltamt.aui.mappings.elka.ZAbaVerfahrenId id) {
        log.debug("Getting ZAbaVerfahren instance with id: " + id);
        return (ZAbaVerfahren)
            new DatabaseAccess().get(ZAbaVerfahren.class, id);
    }

    /**
     * Get a list of all <code>ZAbaVerfahren</code>
     * @return <code>List&lt;ZAbaVerfahren&gt;</code>
     *         all <code>ZAbaVerfahren</code>
     */
    public static List<ZAbaVerfahren> getAll() {
        return DatabaseQuery.getAll(new ZAbaVerfahren());
    }

    /* Custom code goes below here! */

}
