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

package de.bielefeld.umweltamt.aui.mappings.atl;

import de.bielefeld.umweltamt.aui.mappings.DatabaseAccess;
import de.bielefeld.umweltamt.aui.mappings.DatabaseClassToString;
import de.bielefeld.umweltamt.aui.mappings.DatabaseQuery;
import de.bielefeld.umweltamt.aui.mappings.DatabaseSerialVersionUID;
import de.bielefeld.umweltamt.aui.mappings.basis.BasisObjekt;
import de.bielefeld.umweltamt.aui.utils.AuikLogger;
import java.util.List;

/**
 * A class that represents a row in the AtlSielhaut database table.<br>
 * This class is meant to serve as a model and should be copied into the
 * appropriate package and may be customized below the given mark.
 */
public class AtlSielhaut  implements java.io.Serializable {

    /** Generated serialVersionUID for Serializable interface */
    private static final long serialVersionUID =
        DatabaseSerialVersionUID.forAtlSielhaut;
    
    /* Primary key, foreign keys (relations) and table columns */
    private Integer objektid;
    private BasisObjekt basisObjekt;
    private AtlProbepkt atlProbepkt;
    private String bezeichnung;
    private String haltungsnr;
    private String alarmplannr;
    private String entgeb;
    private Double e32;
    private Double n32;
    private String lage;
    private String bemerkungen;
    private String twabfluss;
    private String bsb;
    private String ew;
    private String gebiet;
    private Boolean PSielhaut;
    private Boolean PAlarmplan;
    private Boolean PNachprobe;
    private Boolean schlammprobe;
    private Boolean PFirmenprobe;
    private boolean enabled;
    private boolean deleted;

    /** Logging */
    private static final AuikLogger log = AuikLogger.getLogger();

    /** Default constructor */
    public AtlSielhaut() {
        // This place is intentionally left blank.
    }

    /** Minimal constructor */
    public AtlSielhaut(
        BasisObjekt basisObjekt, AtlProbepkt atlProbepkt, boolean enabled, boolean deleted) {
        this.basisObjekt = basisObjekt;
        this.atlProbepkt = atlProbepkt;
        this.enabled = enabled;
        this.deleted = deleted;
    }

    /** Full constructor */
    public AtlSielhaut(
        BasisObjekt basisObjekt, AtlProbepkt atlProbepkt, String bezeichnung, String haltungsnr, String alarmplannr, String entgeb, Double e32, Double n32, String lage, String bemerkungen, String twabfluss, String bsb, String ew, String gebiet, Boolean PSielhaut, Boolean PAlarmplan, Boolean PNachprobe, Boolean schlammprobe, Boolean PFirmenprobe, boolean enabled, boolean deleted) {
        this.basisObjekt = basisObjekt;
        this.atlProbepkt = atlProbepkt;
        this.bezeichnung = bezeichnung;
        this.haltungsnr = haltungsnr;
        this.alarmplannr = alarmplannr;
        this.entgeb = entgeb;
        this.e32 = e32;
        this.n32 = n32;
        this.lage = lage;
        this.bemerkungen = bemerkungen;
        this.twabfluss = twabfluss;
        this.bsb = bsb;
        this.ew = ew;
        this.gebiet = gebiet;
        this.PSielhaut = PSielhaut;
        this.PAlarmplan = PAlarmplan;
        this.PNachprobe = PNachprobe;
        this.schlammprobe = schlammprobe;
        this.PFirmenprobe = PFirmenprobe;
        this.enabled = enabled;
        this.deleted = deleted;
    }

    /* Setter and getter methods */
    public Integer getObjektid() {
        return this.objektid;
    }

    public void setObjektid(Integer objektid) {
        this.objektid = objektid;
    }

    public BasisObjekt getBasisObjekt() {
        return this.basisObjekt;
    }

    public void setBasisObjekt(BasisObjekt basisObjekt) {
        this.basisObjekt = basisObjekt;
    }

    public AtlProbepkt getAtlProbepkt() {
        return this.atlProbepkt;
    }

    public void setAtlProbepkt(AtlProbepkt atlProbepkt) {
        this.atlProbepkt = atlProbepkt;
    }

    public String getBezeichnung() {
        return this.bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public String getHaltungsnr() {
        return this.haltungsnr;
    }

    public void setHaltungsnr(String haltungsnr) {
        this.haltungsnr = haltungsnr;
    }

    public String getAlarmplannr() {
        return this.alarmplannr;
    }

    public void setAlarmplannr(String alarmplannr) {
        this.alarmplannr = alarmplannr;
    }

    public String getEntgeb() {
        return this.entgeb;
    }

    public void setEntgeb(String entgeb) {
        this.entgeb = entgeb;
    }

    public Double getE32() {
        return this.e32;
    }

    public void setE32(Double e32) {
        this.e32 = e32;
    }

    public Double getN32() {
        return this.n32;
    }

    public void setN32(Double n32) {
        this.n32 = n32;
    }

    public String getLage() {
        return this.lage;
    }

    public void setLage(String lage) {
        this.lage = lage;
    }

    public String getBemerkungen() {
        return this.bemerkungen;
    }

    public void setBemerkungen(String bemerkungen) {
        this.bemerkungen = bemerkungen;
    }

    public String getTwabfluss() {
        return this.twabfluss;
    }

    public void setTwabfluss(String twabfluss) {
        this.twabfluss = twabfluss;
    }

    public String getBsb() {
        return this.bsb;
    }

    public void setBsb(String bsb) {
        this.bsb = bsb;
    }

    public String getEw() {
        return this.ew;
    }

    public void setEw(String ew) {
        this.ew = ew;
    }

    public String getGebiet() {
        return this.gebiet;
    }

    public void setGebiet(String gebiet) {
        this.gebiet = gebiet;
    }

    public Boolean getPSielhaut() {
        return this.PSielhaut;
    }

    public void setPSielhaut(Boolean PSielhaut) {
        this.PSielhaut = PSielhaut;
    }

    public Boolean getPAlarmplan() {
        return this.PAlarmplan;
    }

    public void setPAlarmplan(Boolean PAlarmplan) {
        this.PAlarmplan = PAlarmplan;
    }

    public Boolean getPNachprobe() {
        return this.PNachprobe;
    }

    public void setPNachprobe(Boolean PNachprobe) {
        this.PNachprobe = PNachprobe;
    }

    public Boolean getSchlammprobe() {
        return this.schlammprobe;
    }

    public void setSchlammprobe(Boolean schlammprobe) {
        this.schlammprobe = schlammprobe;
    }

    public Boolean getPFirmenprobe() {
        return this.PFirmenprobe;
    }

    public void setPFirmenprobe(Boolean PFirmenprobe) {
        this.PFirmenprobe = PFirmenprobe;
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
        buffer.append("basisObjekt").append("='").append(getBasisObjekt()).append("' ");			
        buffer.append("atlProbepkt").append("='").append(getAtlProbepkt()).append("' ");			
        buffer.append("bezeichnung").append("='").append(getBezeichnung()).append("' ");			
        buffer.append("haltungsnr").append("='").append(getHaltungsnr()).append("' ");			
        buffer.append("alarmplannr").append("='").append(getAlarmplannr()).append("' ");			
        buffer.append("entgeb").append("='").append(getEntgeb()).append("' ");			
        buffer.append("e32").append("='").append(getE32()).append("' ");			
        buffer.append("n32").append("='").append(getN32()).append("' ");			
        buffer.append("lage").append("='").append(getLage()).append("' ");			
        buffer.append("bemerkungen").append("='").append(getBemerkungen()).append("' ");			
        buffer.append("twabfluss").append("='").append(getTwabfluss()).append("' ");			
        buffer.append("bsb").append("='").append(getBsb()).append("' ");			
        buffer.append("ew").append("='").append(getEw()).append("' ");			
        buffer.append("gebiet").append("='").append(getGebiet()).append("' ");			
        buffer.append("PSielhaut").append("='").append(getPSielhaut()).append("' ");			
        buffer.append("PAlarmplan").append("='").append(getPAlarmplan()).append("' ");			
        buffer.append("PNachprobe").append("='").append(getPNachprobe()).append("' ");			
        buffer.append("schlammprobe").append("='").append(getSchlammprobe()).append("' ");			
        buffer.append("PFirmenprobe").append("='").append(getPFirmenprobe()).append("' ");			
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
        if (!(other instanceof AtlSielhaut)) return false;
        return (this.getObjektid().equals(
            ((AtlSielhaut) other).getObjektid()));
    }

    /**
     * Calculate a unique hashCode
     * @return <code>int</code>
     */
    @Override
    public int hashCode() {
        int result = 17;
        int idValue = this.getObjektid() == null ?
            0 : this.getObjektid().hashCode();
        result = result * 37 + idValue;
        return result;
    }
    
    /**
     * Merge (save or update) a detached instance
     * @param detachedInstance the instance to merge
     * @return <code>AtlSielhaut</code> the merged instance,
     *         if everything went okay,
     *         <code>null</code> otherwise
     */
    public static AtlSielhaut merge(AtlSielhaut detachedInstance) {
        log.debug("Merging AtlSielhaut instance " + detachedInstance);
        return (AtlSielhaut) new DatabaseAccess().merge(detachedInstance);
    }

    /**
     * Merge (save or update) this instance
     * @return <code>true</code>, if everything went okay,
     *         <code>false</code> otherwise
     */
    public boolean merge() {
        AtlSielhaut saved = AtlSielhaut.merge(this);
        if (saved == null) {
            return false;
        } else {
            this.copy(saved);
            return true;
        }
    }

    /**
     * Update this AtlSielhaut with its new values.<br>
     * This is meant to be used after merging!
     * @param copy AtlSielhaut
     */
    private void copy(AtlSielhaut copy) {
        this.basisObjekt = copy.getBasisObjekt();            
        this.atlProbepkt = copy.getAtlProbepkt();            
        this.bezeichnung = copy.getBezeichnung();            
        this.haltungsnr = copy.getHaltungsnr();            
        this.alarmplannr = copy.getAlarmplannr();            
        this.entgeb = copy.getEntgeb();            
        this.e32 = copy.getE32();            
        this.n32 = copy.getN32();            
        this.lage = copy.getLage();            
        this.bemerkungen = copy.getBemerkungen();            
        this.twabfluss = copy.getTwabfluss();            
        this.bsb = copy.getBsb();            
        this.ew = copy.getEw();            
        this.gebiet = copy.getGebiet();            
        this.PSielhaut = copy.getPSielhaut();            
        this.PAlarmplan = copy.getPAlarmplan();            
        this.PNachprobe = copy.getPNachprobe();            
        this.schlammprobe = copy.getSchlammprobe();            
        this.PFirmenprobe = copy.getPFirmenprobe();            
        this.enabled = copy.isEnabled();            
        this.deleted = copy.isDeleted();            
    }    

    /**
     * Delete (mark as deleted) a detached instance
     * @param detachedInstance the instance to delete
     * @return <code>true</code>, if everything went okay,
     *         <code>false</code> otherwise
     */
    public static boolean delete(AtlSielhaut detachedInstance) {
        log.debug("Deleting AtlSielhaut instance " + detachedInstance);
        return new DatabaseAccess().delete(detachedInstance);
    }

    /**
     * Delete (mark as deleted) this instance
     * @return <code>true</code>, if everything went okay,
     *         <code>false</code> otherwise
     */
    public boolean delete() {
        return AtlSielhaut.delete(this);
    }

    /**
     * Find an <code>AtlSielhaut</code> instance by its primary key
     * @param id the primary key value
     * @return <code>AtlSielhaut</code> the requested instance,
     *         if one exists,
     *         <code>null</code> otherwise
     */
    public static AtlSielhaut findById(java.lang.Integer id) {
        log.debug("Getting AtlSielhaut instance with id: " + id);
        return (AtlSielhaut)
            new DatabaseAccess().get(AtlSielhaut.class, id);
    }

    /**
     * Get a list of all <code>AtlSielhaut</code>
     * @return <code>List&lt;AtlSielhaut&gt;</code>
     *         all <code>AtlSielhaut</code>
     */
    public static List<AtlSielhaut> getAll() {
        return DatabaseQuery.getAll(new AtlSielhaut());
    }

    /* Custom code goes below here! */

}
