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

// Generated by Hibernate Tools 3.3.0.GA

package de.bielefeld.umweltamt.aui.mappings.vaws;

import java.util.Date;
import java.util.List;

import de.bielefeld.umweltamt.aui.mappings.DatabaseAccess;
import de.bielefeld.umweltamt.aui.mappings.DatabaseClassToString;
import de.bielefeld.umweltamt.aui.mappings.DatabaseQuery;
import de.bielefeld.umweltamt.aui.mappings.DatabaseSerialVersionUID;
import de.bielefeld.umweltamt.aui.utils.AuikLogger;

/**
 * A class that represents a row in the VawsKontrollen database table.<br>
 * This class is meant to serve as a model and should be copied into the
 * appropriate package and may be customized below the given mark.
 */
public class VawsKontrollen  implements java.io.Serializable {

    /** Generated serialVersionUID for Serializable interface */
    private static final long serialVersionUID =
        DatabaseSerialVersionUID.forVawsKontrollen;

    /* Primary key, foreign keys (relations) and table columns */
    private Integer id;
    private VawsFachdaten vawsFachdaten;
    private String grundderpruefung;
    private Float pruefturnus;
    private Date pruefdatum;
    private String pruefer;
    private Boolean pruefungabgeschlossen;
    private Boolean nachpruefung;
    private Date nachpruefdatum;
    private String nachpruefer;
    private Date naechstepruefung;
    private String pruefergebnis;
    private boolean enabled;
    private boolean deleted;

    /** Logging */
    private static final AuikLogger log = AuikLogger.getLogger();

    /** Default constructor */
    public VawsKontrollen() {
        // This place is intentionally left blank.
    }

    /** Minimal constructor */
    public VawsKontrollen(
        boolean enabled, boolean deleted) {
        this.enabled = enabled;
        this.deleted = deleted;
    }

    /** Full constructor */
    public VawsKontrollen(
        VawsFachdaten vawsFachdaten, String grundderpruefung, Float pruefturnus, Date pruefdatum, String pruefer, Boolean pruefungabgeschlossen, Boolean nachpruefung, Date nachpruefdatum, String nachpruefer, Date naechstepruefung, String pruefergebnis, boolean enabled, boolean deleted) {
        this.vawsFachdaten = vawsFachdaten;
        this.grundderpruefung = grundderpruefung;
        this.pruefturnus = pruefturnus;
        this.pruefdatum = pruefdatum;
        this.pruefer = pruefer;
        this.pruefungabgeschlossen = pruefungabgeschlossen;
        this.nachpruefung = nachpruefung;
        this.nachpruefdatum = nachpruefdatum;
        this.nachpruefer = nachpruefer;
        this.naechstepruefung = naechstepruefung;
        this.pruefergebnis = pruefergebnis;
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

    public VawsFachdaten getVawsFachdaten() {
        return this.vawsFachdaten;
    }

    public void setVawsFachdaten(VawsFachdaten vawsFachdaten) {
        this.vawsFachdaten = vawsFachdaten;
    }

    public String getGrundderpruefung() {
        return this.grundderpruefung;
    }

    public void setGrundderpruefung(String grundderpruefung) {
        this.grundderpruefung = grundderpruefung;
    }

    public Float getPruefturnus() {
        return this.pruefturnus;
    }

    public void setPruefturnus(Float pruefturnus) {
        this.pruefturnus = pruefturnus;
    }

    public Date getPruefdatum() {
        return this.pruefdatum;
    }

    public void setPruefdatum(Date pruefdatum) {
        this.pruefdatum = pruefdatum;
    }

    public String getPruefer() {
        return this.pruefer;
    }

    public void setPruefer(String pruefer) {
        this.pruefer = pruefer;
    }

    public Boolean getPruefungabgeschlossen() {
        return this.pruefungabgeschlossen;
    }

    public void setPruefungabgeschlossen(Boolean pruefungabgeschlossen) {
        this.pruefungabgeschlossen = pruefungabgeschlossen;
    }

    public Boolean getNachpruefung() {
        return this.nachpruefung;
    }

    public void setNachpruefung(Boolean nachpruefung) {
        this.nachpruefung = nachpruefung;
    }

    public Date getNachpruefdatum() {
        return this.nachpruefdatum;
    }

    public void setNachpruefdatum(Date nachpruefdatum) {
        this.nachpruefdatum = nachpruefdatum;
    }

    public String getNachpruefer() {
        return this.nachpruefer;
    }

    public void setNachpruefer(String nachpruefer) {
        this.nachpruefer = nachpruefer;
    }

    public Date getNaechstepruefung() {
        return this.naechstepruefung;
    }

    public void setNaechstepruefung(Date naechstepruefung) {
        this.naechstepruefung = naechstepruefung;
    }

    public String getPruefergebnis() {
        return this.pruefergebnis;
    }

    public void setPruefergebnis(String pruefergebnis) {
        this.pruefergebnis = pruefergebnis;
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
        buffer.append("vawsFachdaten").append("='").append(getVawsFachdaten()).append("' ");
        buffer.append("grundderpruefung").append("='").append(getGrundderpruefung()).append("' ");
        buffer.append("pruefturnus").append("='").append(getPruefturnus()).append("' ");
        buffer.append("pruefdatum").append("='").append(getPruefdatum()).append("' ");
        buffer.append("pruefer").append("='").append(getPruefer()).append("' ");
        buffer.append("pruefungabgeschlossen").append("='").append(getPruefungabgeschlossen()).append("' ");
        buffer.append("nachpruefung").append("='").append(getNachpruefung()).append("' ");
        buffer.append("nachpruefdatum").append("='").append(getNachpruefdatum()).append("' ");
        buffer.append("nachpruefer").append("='").append(getNachpruefer()).append("' ");
        buffer.append("naechstepruefung").append("='").append(getNaechstepruefung()).append("' ");
        buffer.append("pruefergebnis").append("='").append(getPruefergebnis()).append("' ");
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
        if (!(other instanceof VawsKontrollen)) return false;
        return (this.getId().equals(
            ((VawsKontrollen) other).getId()));
    }

    /**
     * Merge (save or update) a detached instance
     * @param detachedInstance the instance to merge
     * @return <code>VawsKontrollen</code> the merged instance,
     *         if everything went okay,
     *         <code>null</code> otherwise
     */
    public static VawsKontrollen merge(VawsKontrollen detachedInstance) {
        log.debug("Merging VawsKontrollen instance " + detachedInstance);
        return (VawsKontrollen) new DatabaseAccess().merge(detachedInstance);
    }

    /**
     * Merge (save or update) this instance
     * @return <code>true</code>, if everything went okay,
     *         <code>false</code> otherwise
     */
    public boolean merge() {
        VawsKontrollen saved = VawsKontrollen.merge(this);
        if (saved == null) {
            return false;
        } else {
            this.copy(saved);
            return true;
        }
    }

    /**
     * Update this VawsKontrollen with its new values.<br>
     * This is meant to be used after merging!
     * @param copy VawsKontrollen
     */
    private void copy(VawsKontrollen copy) {
        this.vawsFachdaten = copy.getVawsFachdaten();
        this.grundderpruefung = copy.getGrundderpruefung();
        this.pruefturnus = copy.getPruefturnus();
        this.pruefdatum = copy.getPruefdatum();
        this.pruefer = copy.getPruefer();
        this.pruefungabgeschlossen = copy.getPruefungabgeschlossen();
        this.nachpruefung = copy.getNachpruefung();
        this.nachpruefdatum = copy.getNachpruefdatum();
        this.nachpruefer = copy.getNachpruefer();
        this.naechstepruefung = copy.getNaechstepruefung();
        this.pruefergebnis = copy.getPruefergebnis();
        this.enabled = copy.isEnabled();
        this.deleted = copy.isDeleted();
    }

    /**
     * Delete (mark as deleted) a detached instance
     * @param detachedInstance the instance to delete
     * @return <code>true</code>, if everything went okay,
     *         <code>false</code> otherwise
     */
    public static boolean delete(VawsKontrollen detachedInstance) {
        log.debug("Deleting VawsKontrollen instance " + detachedInstance);
        return new DatabaseAccess().delete(detachedInstance);
    }

    /**
     * Delete (mark as deleted) this instance
     * @return <code>true</code>, if everything went okay,
     *         <code>false</code> otherwise
     */
    public boolean delete() {
        return VawsKontrollen.delete(this);
    }

    /**
     * Find an <code>VawsKontrollen</code> instance by its primary key
     * @param id the primary key value
     * @return <code>VawsKontrollen</code> the requested instance,
     *         if one exists,
     *         <code>null</code> otherwise
     */
    public static VawsKontrollen findById(java.lang.Integer id) {
        log.debug("Getting VawsKontrollen instance with id: " + id);
        return (VawsKontrollen)
            new DatabaseAccess().get(VawsKontrollen.class, id);
    }

    /**
     * Get a list of all <code>VawsKontrollen</code>
     * @return <code>List&lt;VawsKontrollen&gt;</code>
     *         all <code>VawsKontrollen</code>
     */
    public static List<VawsKontrollen> getAll() {
        return DatabaseQuery.getAll(new VawsKontrollen());
    }

    /* Custom code goes below here! */

}
