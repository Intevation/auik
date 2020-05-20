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

package de.bielefeld.umweltamt.aui.mappings.indeinl;

import de.bielefeld.umweltamt.aui.HibernateSessionFactory;
import de.bielefeld.umweltamt.aui.mappings.DatabaseAccess;
import de.bielefeld.umweltamt.aui.mappings.DatabaseClassToString;
import de.bielefeld.umweltamt.aui.mappings.DatabaseQuery;
import de.bielefeld.umweltamt.aui.mappings.DatabaseSerialVersionUID;
import de.bielefeld.umweltamt.aui.mappings.basis.Objekt;
import de.bielefeld.umweltamt.aui.mappings.elka.Anfallstelle;
import de.bielefeld.umweltamt.aui.utils.AuikLogger;
import java.util.Date;
import java.util.List;
import java.util.Set;

/**
 * A class that represents a row in the Anh52Fachdaten database table.<br>
 * This class is meant to serve as a model and should be copied into the
 * appropriate package and may be customized below the given mark.
 */
public class Anh52Fachdaten  implements java.io.Serializable {

    /** Generated serialVersionUID for Serializable interface */
    private static final long serialVersionUID =
        DatabaseSerialVersionUID.forAnh52Fachdaten;
    
    /* Primary key, foreign keys (relations) and table columns */
    private Integer id;
    private Anfallstelle anfallstelle;
    private Integer nrbetriebsstaette;
    private String firmenname;
    private String telefon;
    private String telefax;
    private String ansprechpartner;
    private Date datumgenehmigung;
    private String bemerkungen;
    private boolean enabled;
    private boolean deleted;

    /** Logging */
    private static final AuikLogger log = AuikLogger.getLogger();

    /** Default constructor */
    public Anh52Fachdaten() {
        // This place is intentionally left blank.
    }

    /** Minimal constructor */
    public Anh52Fachdaten(
        Integer id, Anfallstelle anfallstelle, boolean enabled, boolean deleted) {
        this.id = id;
        this.anfallstelle = anfallstelle;
        this.enabled = enabled;
        this.deleted = deleted;
    }

    /** Full constructor */
    public Anh52Fachdaten(
        Integer id, Anfallstelle anfallstelle, Integer nrbetriebsstaette, String firmenname, String telefon, String telefax, String ansprechpartner, Date datumgenehmigung, String bemerkungen, boolean enabled, boolean deleted) {
        this.id = id;
        this.anfallstelle = anfallstelle;
        this.nrbetriebsstaette = nrbetriebsstaette;
        this.firmenname = firmenname;
        this.telefon = telefon;
        this.telefax = telefax;
        this.ansprechpartner = ansprechpartner;
        this.datumgenehmigung = datumgenehmigung;
        this.bemerkungen = bemerkungen;
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

    public Anfallstelle getAnfallstelle() {
        return this.anfallstelle;
    }

    public void setAnfallstelle(Anfallstelle anfallstelle) {
        this.anfallstelle = anfallstelle;
    }

    public Integer getNrbetriebsstaette() {
        return this.nrbetriebsstaette;
    }

    public void setNrbetriebsstaette(Integer nrbetriebsstaette) {
        this.nrbetriebsstaette = nrbetriebsstaette;
    }

    public String getFirmenname() {
        return this.firmenname;
    }

    public void setFirmenname(String firmenname) {
        this.firmenname = firmenname;
    }

    public String getTelefon() {
        return this.telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getTelefax() {
        return this.telefax;
    }

    public void setTelefax(String telefax) {
        this.telefax = telefax;
    }

    public String getAnsprechpartner() {
        return this.ansprechpartner;
    }

    public void setAnsprechpartner(String ansprechpartner) {
        this.ansprechpartner = ansprechpartner;
    }

    public Date getDatumgenehmigung() {
        return this.datumgenehmigung;
    }

    public void setDatumgenehmigung(Date datumgenehmigung) {
        this.datumgenehmigung = datumgenehmigung;
    }

    public String getBemerkungen() {
        return this.bemerkungen;
    }

    public void setBemerkungen(String bemerkungen) {
        this.bemerkungen = bemerkungen;
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
        buffer.append("anfallstelle").append("='").append(getAnfallstelle()).append("' ");			
        buffer.append("nrbetriebsstaette").append("='").append(getNrbetriebsstaette()).append("' ");			
        buffer.append("firmenname").append("='").append(getFirmenname()).append("' ");			
        buffer.append("telefon").append("='").append(getTelefon()).append("' ");			
        buffer.append("telefax").append("='").append(getTelefax()).append("' ");			
        buffer.append("ansprechpartner").append("='").append(getAnsprechpartner()).append("' ");			
        buffer.append("datumgenehmigung").append("='").append(getDatumgenehmigung()).append("' ");			
        buffer.append("bemerkungen").append("='").append(getBemerkungen()).append("' ");			
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
        if (!(other instanceof Anh52Fachdaten)) return false;
        return (this.getId().equals(
            ((Anh52Fachdaten) other).getId()));
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
     * @return <code>Anh52Fachdaten</code> the merged instance,
     *         if everything went okay,
     *         <code>null</code> otherwise
     */
    public static Anh52Fachdaten merge(Anh52Fachdaten detachedInstance) {
        log.debug("Merging Anh52Fachdaten instance " + detachedInstance);
        return (Anh52Fachdaten) new DatabaseAccess().merge(detachedInstance);
    }

    /**
     * Merge (save or update) this instance
     * @return <code>true</code>, if everything went okay,
     *         <code>false</code> otherwise
     */
    public boolean merge() {
        Anh52Fachdaten saved = Anh52Fachdaten.merge(this);
        if (saved == null) {
            return false;
        } else {
            this.copy(saved);
            return true;
        }
    }

    /**
     * Update this Anh52Fachdaten with its new values.<br>
     * This is meant to be used after merging!
     * @param copy Anh52Fachdaten
     */
    private void copy(Anh52Fachdaten copy) {
        this.id = copy.getId();            
        this.anfallstelle = copy.getAnfallstelle();            
        this.nrbetriebsstaette = copy.getNrbetriebsstaette();            
        this.firmenname = copy.getFirmenname();            
        this.telefon = copy.getTelefon();            
        this.telefax = copy.getTelefax();            
        this.ansprechpartner = copy.getAnsprechpartner();            
        this.datumgenehmigung = copy.getDatumgenehmigung();            
        this.bemerkungen = copy.getBemerkungen();            
        this.enabled = copy.isEnabled();            
        this.deleted = copy.isDeleted();            
    }    

    /**
     * Delete (mark as deleted) a detached instance
     * @param detachedInstance the instance to delete
     * @return <code>true</code>, if everything went okay,
     *         <code>false</code> otherwise
     */
    public static boolean delete(Anh52Fachdaten detachedInstance) {
        log.debug("Deleting Anh52Fachdaten instance " + detachedInstance);
        return new DatabaseAccess().delete(detachedInstance);
    }

    /**
     * Delete (mark as deleted) this instance
     * @return <code>true</code>, if everything went okay,
     *         <code>false</code> otherwise
     */
    public boolean delete() {
        return Anh52Fachdaten.delete(this);
    }

    /**
     * Find an <code>Anh52Fachdaten</code> instance by its primary key
     * @param id the primary key value
     * @return <code>Anh52Fachdaten</code> the requested instance,
     *         if one exists,
     *         <code>null</code> otherwise
     */
    public static Anh52Fachdaten findById(java.lang.Integer id) {
        log.debug("Getting Anh52Fachdaten instance with id: " + id);
        return (Anh52Fachdaten)
            new DatabaseAccess().get(Anh52Fachdaten.class, id);
    }

    /**
     * Get a list of all <code>Anh52Fachdaten</code>
     * @return <code>List&lt;Anh52Fachdaten&gt;</code>
     *         all <code>Anh52Fachdaten</code>
     */
    public static List<Anh52Fachdaten> getAll() {
        return DatabaseQuery.getAll(new Anh52Fachdaten());
    }

    /* Custom code goes below here! */
    public static Anh52Fachdaten findByAnfallstelleId(java.lang.Integer id){
        log.debug("Getting Anh52Fachdaten instance with connected Anfallstelle with id: " + id);
        Anfallstelle anfallstelle = (Anfallstelle) HibernateSessionFactory.currentSession().createQuery("from Anfallstelle where id= " + id).list().get(0);
        Set<Anh52Fachdaten> list = anfallstelle.getAnh52Fachdatens();
        return list.iterator().next();
    }
}
