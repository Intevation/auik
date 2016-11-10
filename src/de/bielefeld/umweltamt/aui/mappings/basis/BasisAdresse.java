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

package de.bielefeld.umweltamt.aui.mappings.basis;

import de.bielefeld.umweltamt.aui.mappings.DatabaseAccess;
import de.bielefeld.umweltamt.aui.mappings.DatabaseClassToString;
import de.bielefeld.umweltamt.aui.mappings.DatabaseQuery;
import de.bielefeld.umweltamt.aui.mappings.DatabaseSerialVersionUID;
import de.bielefeld.umweltamt.aui.mappings.vaws.VawsWirtschaftszweige;
import de.bielefeld.umweltamt.aui.utils.AuikLogger;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * A class that represents a row in the BasisAdresse database table.<br>
 * This class is meant to serve as a model and should be copied into the
 * appropriate package and may be customized below the given mark.
 */
public class BasisAdresse  implements java.io.Serializable {

    /** Generated serialVersionUID for Serializable interface */
    private static final long serialVersionUID =
        DatabaseSerialVersionUID.forBasisAdresse;
    
    /* Primary key, foreign keys (relations) and table columns */
    private Integer id;
    private VawsWirtschaftszweige vawsWirtschaftszweige;
    private String betranrede;
    private String betrname;
    private String betrnamezus;
    private String namebetrbeauf;
    private String vornamebetrbeauf;
    private String strasse;
    private Integer hausnr;
    private String hausnrzus;
    private String plzzs;
    private String plz;
    private String ort;
    private String telefon;
    private String telefax;
    private String email;
    private String bemerkungen;
    private Date revidatum;
    private String revihandz;
    private String kassenzeichen;
    private String betrvorname;
    private boolean enabled;
    private boolean deleted;
    private String auikWzCode;
    private Integer objektid;
    private Set<BasisObjekt> basisObjekts = new HashSet<BasisObjekt>(0);
    private Set<BasisObjekt> basisObjektStandort = new HashSet<BasisObjekt>(0);
    private Set<BasisMapAdresseLage> basisMapAdresseLages = new HashSet<BasisMapAdresseLage>(0);
    /** Logging */
    private static final AuikLogger log = AuikLogger.getLogger();

    /** Default constructor */
    public BasisAdresse() {
        // This place is intentionally left blank.
    }

    /** Minimal constructor */
    public BasisAdresse(
        boolean enabled, boolean deleted) {
        this.enabled = enabled;
        this.deleted = deleted;
    }

    /** Full constructor */
    public BasisAdresse(
        VawsWirtschaftszweige vawsWirtschaftszweige, String betranrede, String betrname, String betrnamezus, String namebetrbeauf, String vornamebetrbeauf, String strasse, Integer hausnr, String hausnrzus, String plzzs, String plz, String ort, String telefon, String telefax, String email, String bemerkungen, Date revidatum, String revihandz, String kassenzeichen, String betrvorname, boolean enabled, boolean deleted, String auikWzCode, Integer objektid, Set<BasisObjekt> basisObjekts, Set<BasisObjekt> basisObjektStandort,  Set<BasisMapAdresseLage> basisMapAdresseLages) {
        this.vawsWirtschaftszweige = vawsWirtschaftszweige;
        this.betranrede = betranrede;
        this.betrname = betrname;
        this.betrnamezus = betrnamezus;
        this.namebetrbeauf = namebetrbeauf;
        this.vornamebetrbeauf = vornamebetrbeauf;
        this.strasse = strasse;
        this.hausnr = hausnr;
        this.hausnrzus = hausnrzus;
        this.plzzs = plzzs;
        this.plz = plz;
        this.ort = ort;
        this.telefon = telefon;
        this.telefax = telefax;
        this.email = email;
        this.bemerkungen = bemerkungen;
        this.revidatum = revidatum;
        this.revihandz = revihandz;
        this.kassenzeichen = kassenzeichen;
        this.betrvorname = betrvorname;
        this.enabled = enabled;
        this.deleted = deleted;
        this.auikWzCode = auikWzCode;
        this.objektid = objektid;
        this.basisObjekts = basisObjekts;
        this.basisObjektStandort = basisObjektStandort;
        this.basisMapAdresseLages = basisMapAdresseLages;
    }

    /* Setter and getter methods */
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Set<BasisObjekt> getBasisObjektStandort(){
        return basisObjektStandort;
    }

    public void setBasisObjektStandort(Set<BasisObjekt> basisObjektStandort){
        this.basisObjektStandort = basisObjektStandort;
    }

    public VawsWirtschaftszweige getVawsWirtschaftszweige() {
        return this.vawsWirtschaftszweige;
    }

    public void setVawsWirtschaftszweige(VawsWirtschaftszweige vawsWirtschaftszweige) {
        this.vawsWirtschaftszweige = vawsWirtschaftszweige;
    }

    public String getBetranrede() {
        return this.betranrede;
    }

    public void setBetranrede(String betranrede) {
        this.betranrede = betranrede;
    }

    public String getBetrname() {
        return this.betrname;
    }

    public void setBetrname(String betrname) {
        this.betrname = betrname;
    }

    public String getBetrnamezus() {
        return this.betrnamezus;
    }

    public void setBetrnamezus(String betrnamezus) {
        this.betrnamezus = betrnamezus;
    }

    public String getNamebetrbeauf() {
        return this.namebetrbeauf;
    }

    public void setNamebetrbeauf(String namebetrbeauf) {
        this.namebetrbeauf = namebetrbeauf;
    }

    public String getVornamebetrbeauf() {
        return this.vornamebetrbeauf;
    }

    public void setVornamebetrbeauf(String vornamebetrbeauf) {
        this.vornamebetrbeauf = vornamebetrbeauf;
    }

    public String getStrasse() {
        return this.strasse;
    }

    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    public Integer getHausnr() {
        return this.hausnr;
    }

    public void setHausnr(Integer hausnr) {
        this.hausnr = hausnr;
    }

    public String getHausnrzus() {
        return this.hausnrzus;
    }

    public void setHausnrzus(String hausnrzus) {
        this.hausnrzus = hausnrzus;
    }

    public String getPlzzs() {
        return this.plzzs;
    }

    public void setPlzzs(String plzzs) {
        this.plzzs = plzzs;
    }

    public String getPlz() {
        return this.plz;
    }

    public void setPlz(String plz) {
        this.plz = plz;
    }

    public String getOrt() {
        return this.ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
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

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBemerkungen() {
        return this.bemerkungen;
    }

    public void setBemerkungen(String bemerkungen) {
        this.bemerkungen = bemerkungen;
    }

    public Date getRevidatum() {
        return this.revidatum;
    }

    public void setRevidatum(Date revidatum) {
        this.revidatum = revidatum;
    }

    public String getRevihandz() {
        return this.revihandz;
    }

    public void setRevihandz(String revihandz) {
        this.revihandz = revihandz;
    }

    public String getKassenzeichen() {
        return this.kassenzeichen;
    }

    public void setKassenzeichen(String kassenzeichen) {
        this.kassenzeichen = kassenzeichen;
    }

    public String getBetrvorname() {
        return this.betrvorname;
    }

    public void setBetrvorname(String betrvorname) {
        this.betrvorname = betrvorname;
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

    public String getAuikWzCode() {
        return this.auikWzCode;
    }

    public void setAuikWzCode(String auikWzCode) {
        this.auikWzCode = auikWzCode;
    }

    public Integer getObjektid() {
        return this.objektid;
    }

    public void setObjektid(Integer objektid) {
        this.objektid = objektid;
    }

    public Set<BasisObjekt> getBasisObjekts() {
        return this.basisObjekts;
    }

    public void setBasisObjekts(Set<BasisObjekt> basisObjekts) {
        this.basisObjekts = basisObjekts;
    }

    public Set<BasisMapAdresseLage> getBasisMapAdresseLages() {
        return this.basisMapAdresseLages;
    }

    public void setBasisMapAdresseLages(Set<BasisMapAdresseLage> basisMapAdresseLages) {
        this.basisMapAdresseLages = basisMapAdresseLages;
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
		// return DatabaseClassToString.toStringForClass(this);
		String adr = "";
		adr = adr + (getBetrname() + ", ");
		adr = adr + (getStrasse() + " ");
		adr = adr + (getHausnr().toString());
		if (getHausnrzus() != null) {
			adr = adr + getHausnrzus();
		}
		adr = adr + ", " + getOrt();
		return adr;
	}
    
    /**
     * Get a string representation for debugging
     * @return String
     */
    public String toDebugString() {
        StringBuffer buffer = new StringBuffer();
        
        buffer.append(getClass().getSimpleName()).append("@").append(Integer.toHexString(hashCode())).append(" [");
        buffer.append("vawsWirtschaftszweige").append("='").append(getVawsWirtschaftszweige()).append("' ");			
        buffer.append("betranrede").append("='").append(getBetranrede()).append("' ");			
        buffer.append("betrname").append("='").append(getBetrname()).append("' ");			
        buffer.append("betrnamezus").append("='").append(getBetrnamezus()).append("' ");			
        buffer.append("namebetrbeauf").append("='").append(getNamebetrbeauf()).append("' ");			
        buffer.append("vornamebetrbeauf").append("='").append(getVornamebetrbeauf()).append("' ");			
        buffer.append("strasse").append("='").append(getStrasse()).append("' ");			
        buffer.append("hausnr").append("='").append(getHausnr()).append("' ");			
        buffer.append("hausnrzus").append("='").append(getHausnrzus()).append("' ");			
        buffer.append("plzzs").append("='").append(getPlzzs()).append("' ");			
        buffer.append("plz").append("='").append(getPlz()).append("' ");			
        buffer.append("ort").append("='").append(getOrt()).append("' ");			
        buffer.append("telefon").append("='").append(getTelefon()).append("' ");			
        buffer.append("telefax").append("='").append(getTelefax()).append("' ");			
        buffer.append("email").append("='").append(getEmail()).append("' ");			
        buffer.append("bemerkungen").append("='").append(getBemerkungen()).append("' ");			
        buffer.append("revidatum").append("='").append(getRevidatum()).append("' ");			
        buffer.append("revihandz").append("='").append(getRevihandz()).append("' ");			
        buffer.append("kassenzeichen").append("='").append(getKassenzeichen()).append("' ");			
        buffer.append("betrvorname").append("='").append(getBetrvorname()).append("' ");			
        buffer.append("enabled").append("='").append(isEnabled()).append("' ");			
        buffer.append("deleted").append("='").append(isDeleted()).append("' ");			
        buffer.append("auikWzCode").append("='").append(getAuikWzCode()).append("' ");			
        buffer.append("objektid").append("='").append(getObjektid()).append("' ");			
        buffer.append("basisObjekts").append("='").append(getBasisObjekts()).append("' ");			
        buffer.append("basisObjektStandort").append("='").append(getBasisObjektStandort()).append("' ");
        buffer.append("basisMapAdresseLages").append("='").append(getBasisMapAdresseLages()).append("' ");		
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
        if (!(other instanceof BasisAdresse)) return false;
        return (this.getId().equals(
            ((BasisAdresse) other).getId()));
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
     * @return <code>BasisAdresse</code> the merged instance,
     *         if everything went okay,
     *         <code>null</code> otherwise
     */
    public static BasisAdresse merge(BasisAdresse detachedInstance) {
        log.debug("Merging BasisAdresse instance " + detachedInstance);
        return (BasisAdresse) new DatabaseAccess().merge(detachedInstance);
    }

    /**
     * Merge (save or update) this instance
     * @return <code>true</code>, if everything went okay,
     *         <code>false</code> otherwise
     */
    public boolean merge() {
        BasisAdresse saved = BasisAdresse.merge(this);
        if (saved == null) {
            return false;
        } else {
            this.copy(saved);
            return true;
        }
    }

    /**
     * Update this BasisAdresse with its new values.<br>
     * This is meant to be used after merging!
     * @param copy BasisAdresse
     */
    private void copy(BasisAdresse copy) {
        this.vawsWirtschaftszweige = copy.getVawsWirtschaftszweige();            
        this.betranrede = copy.getBetranrede();            
        this.betrname = copy.getBetrname();            
        this.betrnamezus = copy.getBetrnamezus();            
        this.namebetrbeauf = copy.getNamebetrbeauf();            
        this.vornamebetrbeauf = copy.getVornamebetrbeauf();            
        this.strasse = copy.getStrasse();            
        this.hausnr = copy.getHausnr();            
        this.hausnrzus = copy.getHausnrzus();            
        this.plzzs = copy.getPlzzs();            
        this.plz = copy.getPlz();            
        this.ort = copy.getOrt();            
        this.telefon = copy.getTelefon();            
        this.telefax = copy.getTelefax();            
        this.email = copy.getEmail();            
        this.bemerkungen = copy.getBemerkungen();            
        this.revidatum = copy.getRevidatum();            
        this.revihandz = copy.getRevihandz();            
        this.kassenzeichen = copy.getKassenzeichen();            
        this.betrvorname = copy.getBetrvorname();            
        this.enabled = copy.isEnabled();            
        this.deleted = copy.isDeleted();            
        this.auikWzCode = copy.getAuikWzCode();            
        this.objektid = copy.getObjektid();            
        this.basisObjekts = copy.getBasisObjekts();
        this.basisObjektStandort = copy.getBasisObjektStandort();   
        this.basisMapAdresseLages = copy.getBasisMapAdresseLages();           
    }    

    /**
     * Delete (mark as deleted) a detached instance
     * @param detachedInstance the instance to delete
     * @return <code>true</code>, if everything went okay,
     *         <code>false</code> otherwise
     */
    public static boolean delete(BasisAdresse detachedInstance) {
        log.debug("Deleting BasisAdresse instance " + detachedInstance);
        return new DatabaseAccess().delete(detachedInstance);
    }

    /**
     * Delete (mark as deleted) this instance
     * @return <code>true</code>, if everything went okay,
     *         <code>false</code> otherwise
     */
    public boolean delete() {
        return BasisAdresse.delete(this);
    }

    /**
     * Find an <code>BasisAdresse</code> instance by its primary key
     * @param id the primary key value
     * @return <code>BasisAdresse</code> the requested instance,
     *         if one exists,
     *         <code>null</code> otherwise
     */
    public static BasisAdresse findById(java.lang.Integer id) {
        log.debug("Getting BasisAdresse instance with id: " + id);
        return (BasisAdresse)
            new DatabaseAccess().get(BasisAdresse.class, id);
    }

    /**
     * Get a list of all <code>BasisAdresse</code>
     * @return <code>List&lt;BasisAdresse&gt;</code>
     *         all <code>BasisAdresse</code>
     */
    public static List<BasisAdresse> getAll() {
        return DatabaseQuery.getAll(new BasisAdresse());
    }

	public void setBasisMapAdresseLages(BasisLage lage) {
		// TODO Auto-generated method stub
		
	}

    /* Custom code goes below here! */

}
