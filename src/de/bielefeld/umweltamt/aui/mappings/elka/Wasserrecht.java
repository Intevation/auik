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

import de.bielefeld.umweltamt.aui.HibernateSessionFactory;
import de.bielefeld.umweltamt.aui.mappings.DatabaseAccess;
import de.bielefeld.umweltamt.aui.mappings.DatabaseClassToString;
import de.bielefeld.umweltamt.aui.mappings.DatabaseQuery;
import de.bielefeld.umweltamt.aui.mappings.DatabaseSerialVersionUID;
import de.bielefeld.umweltamt.aui.mappings.basis.Objekt;
import de.bielefeld.umweltamt.aui.mappings.oberflgw.Entwaesserungsgrundstueck;
import de.bielefeld.umweltamt.aui.mappings.oberflgw.Sonderbauwerk;
import de.bielefeld.umweltamt.aui.utils.AuikLogger;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * A class that represents a row in the Wasserrecht database table.<br>
 * This class is meant to serve as a model and should be copied into the
 * appropriate package and may be customized below the given mark.
 */
public class Wasserrecht  implements java.io.Serializable {

    /** Generated serialVersionUID for Serializable interface */
    private static final long serialVersionUID =
        DatabaseSerialVersionUID.forWasserrecht;
    
    /* Primary key, foreign keys (relations) and table columns */
    private Integer id;
    private Objekt objekt;
    private String bemerkungen;
    private Date erstellungsDatum;
    private Date aenderungsDatum;
    private Date antragDatum;
    private Boolean befristet;
    private Date befristetBis;
    private Integer anhang;
    private Integer genMenge;
    private Boolean gen58;
    private Boolean gen59;
    private Boolean selbstueberw;
    private Boolean ESatzung;
    private boolean enabled;
    private boolean deleted;
    private Integer uebergabestelleE32;
    private Integer uebergabestelleN32;
    private String rechtBehoerdenId;
    private String wrBeschreibung;
    private Integer rechtArtOpt;
    private String aktenzeichen;
    private String bemerkung;
    private String wasserbuchId;
    private String beerWrNr;
    private Date erstellDat;
    private Date aktualDat;
    private Boolean gen8;
    private Set<Entwaesserungsgrundstueck> entwaesserungsgrundstuecks = new HashSet<Entwaesserungsgrundstueck>(0);
    private Set<Sonderbauwerk> sonderbauwerks = new HashSet<Sonderbauwerk>(0);

    /** Logging */
    private static final AuikLogger log = AuikLogger.getLogger();

    /** Default constructor */
    public Wasserrecht() {
        // This place is intentionally left blank.
    }

    /** Minimal constructor */
    public Wasserrecht(
        Integer id, Objekt objekt, boolean enabled, boolean deleted) {
        this.id = id;
        this.objekt = objekt;
        this.enabled = enabled;
        this.deleted = deleted;
    }

    /** Full constructor */
    public Wasserrecht(
        Integer id, Objekt objekt, String bemerkungen, Date erstellungsDatum, Date aenderungsDatum, Date antragDatum, Boolean befristet, Date befristetBis, Integer anhang, Integer genMenge, Boolean gen58, Boolean gen59, Boolean selbstueberw, Boolean ESatzung, boolean enabled, boolean deleted, Integer uebergabestelleE32, Integer uebergabestelleN32, String rechtBehoerdenId, String wrBeschreibung, Integer rechtArtOpt, String aktenzeichen, String bemerkung, String wasserbuchId, String beerWrNr, Date erstellDat, Date aktualDat, Set<Entwaesserungsgrundstueck> entwaesserungsgrundstuecks, Set<Sonderbauwerk> sonderbauwerks) {
        this.id = id;
        this.objekt = objekt;
        this.bemerkungen = bemerkungen;
        this.erstellungsDatum = erstellungsDatum;
        this.aenderungsDatum = aenderungsDatum;
        this.antragDatum = antragDatum;
        this.befristet = befristet;
        this.befristetBis = befristetBis;
        this.anhang = anhang;
        this.genMenge = genMenge;
        this.gen58 = gen58;
        this.gen59 = gen59;
        this.selbstueberw = selbstueberw;
        this.ESatzung = ESatzung;
        this.enabled = enabled;
        this.deleted = deleted;
        this.uebergabestelleE32 = uebergabestelleE32;
        this.uebergabestelleN32 = uebergabestelleN32;
        this.rechtBehoerdenId = rechtBehoerdenId;
        this.wrBeschreibung = wrBeschreibung;
        this.rechtArtOpt = rechtArtOpt;
        this.aktenzeichen = aktenzeichen;
        this.bemerkung = bemerkung;
        this.wasserbuchId = wasserbuchId;
        this.beerWrNr = beerWrNr;
        this.erstellDat = erstellDat;
        this.aktualDat = aktualDat;
        this.entwaesserungsgrundstuecks = entwaesserungsgrundstuecks;
        this.sonderbauwerks = sonderbauwerks;
    }

    /* Setter and getter methods */
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Objekt getObjekt() {
        return this.objekt;
    }

    public void setObjekt(Objekt objekt) {
        this.objekt = objekt;
    }

    public String getBemerkungen() {
        return this.bemerkungen;
    }

    public void setBemerkungen(String bemerkungen) {
        this.bemerkungen = bemerkungen;
    }

    public Date getErstellungsDatum() {
        return this.erstellungsDatum;
    }

    public void setErstellungsDatum(Date erstellungsDatum) {
        this.erstellungsDatum = erstellungsDatum;
    }

    public Date getAenderungsDatum() {
        return this.aenderungsDatum;
    }

    public void setAenderungsDatum(Date aenderungsDatum) {
        this.aenderungsDatum = aenderungsDatum;
    }

    public Date getAntragDatum() {
        return this.antragDatum;
    }

    public void setAntragDatum(Date antragDatum) {
        this.antragDatum = antragDatum;
    }

    public Boolean getBefristet() {
        return this.befristet;
    }

    public void setBefristet(Boolean befristet) {
        this.befristet = befristet;
    }

    public Date getBefristetBis() {
        return this.befristetBis;
    }

    public void setBefristetBis(Date befristetBis) {
        this.befristetBis = befristetBis;
    }

    public Integer getAnhang() {
        return this.anhang;
    }

    public void setAnhang(Integer anhang) {
        this.anhang = anhang;
    }

    public Integer getGenMenge() {
        return this.genMenge;
    }

    public void setGenMenge(Integer genMenge) {
        this.genMenge = genMenge;
    }

    public Boolean getGen58() {
        return this.gen58;
    }

    public void setGen58(Boolean gen58) {
        this.gen58 = gen58;
    }

    public Boolean getGen59() {
        return this.gen59;
    }

    public void setGen59(Boolean gen59) {
        this.gen59 = gen59;
    }

    public Boolean getSelbstueberw() {
        return this.selbstueberw;
    }

    public void setSelbstueberw(Boolean selbstueberw) {
        this.selbstueberw = selbstueberw;
    }

    public Boolean getESatzung() {
        return this.ESatzung;
    }

    public void setESatzung(Boolean ESatzung) {
        this.ESatzung = ESatzung;
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

    public Integer getUebergabestelleE32() {
        return this.uebergabestelleE32;
    }

    public void setUebergabestelleE32(Integer uebergabestelleE32) {
        this.uebergabestelleE32 = uebergabestelleE32;
    }

    public Integer getUebergabestelleN32() {
        return this.uebergabestelleN32;
    }

    public void setUebergabestelleN32(Integer uebergabestelleN32) {
        this.uebergabestelleN32 = uebergabestelleN32;
    }

    public String getRechtBehoerdenId() {
        return this.rechtBehoerdenId;
    }

    public void setRechtBehoerdenId(String rechtBehoerdenId) {
        this.rechtBehoerdenId = rechtBehoerdenId;
    }

    public String getWrBeschreibung() {
        return this.wrBeschreibung;
    }

    public void setWrBeschreibung(String wrBeschreibung) {
        this.wrBeschreibung = wrBeschreibung;
    }

    public Integer getRechtArtOpt() {
        return this.rechtArtOpt;
    }

    public void setRechtArtOpt(Integer rechtArtOpt) {
        this.rechtArtOpt = rechtArtOpt;
    }

    public String getAktenzeichen() {
        return this.aktenzeichen;
    }

    public void setAktenzeichen(String aktenzeichen) {
        this.aktenzeichen = aktenzeichen;
    }

    public String getBemerkung() {
        return this.bemerkung;
    }

    public void setBemerkung(String bemerkung) {
        this.bemerkung = bemerkung;
    }

    public String getWasserbuchId() {
        return this.wasserbuchId;
    }

    public void setWasserbuchId(String wasserbuchId) {
        this.wasserbuchId = wasserbuchId;
    }

    public String getBeerWrNr() {
        return this.beerWrNr;
    }

    public void setBeerWrNr(String beerWrNr) {
        this.beerWrNr = beerWrNr;
    }

    public Date getErstellDat() {
        return this.erstellDat;
    }

    public void setErstellDat(Date erstellDat) {
        this.erstellDat = erstellDat;
    }

    public Date getAktualDat() {
        return this.aktualDat;
    }

    public void setAktualDat(Date aktualDat) {
        this.aktualDat = aktualDat;
    }

   	public Boolean getGen8() {
		return gen8;
	}

	public void setGen8(Boolean gen8) {
		this.gen8 = gen8;
	}

	public Set<Entwaesserungsgrundstueck> getEntwaesserungsgrundstuecks() {
        return this.entwaesserungsgrundstuecks;
    }

    public void setEntwaesserungsgrundstuecks(Set<Entwaesserungsgrundstueck> entwaesserungsgrundstuecks) {
        this.entwaesserungsgrundstuecks = entwaesserungsgrundstuecks;
    }

    public Set<Sonderbauwerk> getSonderbauwerks() {
        return this.sonderbauwerks;
    }

    public void setSonderbauwerks(Set<Sonderbauwerk> sonderbauwerks) {
        this.sonderbauwerks = sonderbauwerks;
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
        buffer.append("objekt").append("='").append(getObjekt()).append("' ");			
        buffer.append("bemerkungen").append("='").append(getBemerkungen()).append("' ");			
        buffer.append("erstellungsDatum").append("='").append(getErstellungsDatum()).append("' ");			
        buffer.append("aenderungsDatum").append("='").append(getAenderungsDatum()).append("' ");			
        buffer.append("antragDatum").append("='").append(getAntragDatum()).append("' ");			
        buffer.append("befristet").append("='").append(getBefristet()).append("' ");			
        buffer.append("befristetBis").append("='").append(getBefristetBis()).append("' ");			
        buffer.append("anhang").append("='").append(getAnhang()).append("' ");			
        buffer.append("genMenge").append("='").append(getGenMenge()).append("' ");			
        buffer.append("gen58").append("='").append(getGen58()).append("' ");			
        buffer.append("gen59").append("='").append(getGen59()).append("' ");			
        buffer.append("selbstueberw").append("='").append(getSelbstueberw()).append("' ");			
        buffer.append("ESatzung").append("='").append(getESatzung()).append("' ");			
        buffer.append("enabled").append("='").append(isEnabled()).append("' ");			
        buffer.append("deleted").append("='").append(isDeleted()).append("' ");			
        buffer.append("uebergabestelleE32").append("='").append(getUebergabestelleE32()).append("' ");			
        buffer.append("uebergabestelleN32").append("='").append(getUebergabestelleN32()).append("' ");			
        buffer.append("rechtBehoerdenId").append("='").append(getRechtBehoerdenId()).append("' ");			
        buffer.append("wrBeschreibung").append("='").append(getWrBeschreibung()).append("' ");			
        buffer.append("rechtArtOpt").append("='").append(getRechtArtOpt()).append("' ");			
        buffer.append("aktenzeichen").append("='").append(getAktenzeichen()).append("' ");			
        buffer.append("bemerkung").append("='").append(getBemerkung()).append("' ");			
        buffer.append("wasserbuchId").append("='").append(getWasserbuchId()).append("' ");			
        buffer.append("beerWrNr").append("='").append(getBeerWrNr()).append("' ");			
        buffer.append("erstellDat").append("='").append(getErstellDat()).append("' ");			
        buffer.append("aktualDat").append("='").append(getAktualDat()).append("' ");			
        buffer.append("entwaesserungsgrundstuecks").append("='").append(getEntwaesserungsgrundstuecks()).append("' ");			
        buffer.append("sonderbauwerks").append("='").append(getSonderbauwerks()).append("' ");			
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
        if (!(other instanceof Wasserrecht)) return false;
        return (this.getId().equals(
            ((Wasserrecht) other).getId()));
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
     * @return <code>Wasserrecht</code> the merged instance,
     *         if everything went okay,
     *         <code>null</code> otherwise
     */
    public static Wasserrecht merge(Wasserrecht detachedInstance) {
        log.debug("Merging Wasserrecht instance " + detachedInstance);
        return (Wasserrecht) new DatabaseAccess().merge(detachedInstance);
    }

    /**
     * Merge (save or update) this instance
     * @return <code>true</code>, if everything went okay,
     *         <code>false</code> otherwise
     */
    public boolean merge() {
        Wasserrecht saved = Wasserrecht.merge(this);
        if (saved == null) {
            return false;
        } else {
            this.copy(saved);
            return true;
        }
    }

    /**
     * Update this Wasserrecht with its new values.<br>
     * This is meant to be used after merging!
     * @param copy Wasserrecht
     */
    private void copy(Wasserrecht copy) {
        this.id = copy.getId();            
        this.objekt = copy.getObjekt();            
        this.bemerkungen = copy.getBemerkungen();            
        this.erstellungsDatum = copy.getErstellungsDatum();            
        this.aenderungsDatum = copy.getAenderungsDatum();            
        this.antragDatum = copy.getAntragDatum();            
        this.befristet = copy.getBefristet();            
        this.befristetBis = copy.getBefristetBis();            
        this.anhang = copy.getAnhang();            
        this.genMenge = copy.getGenMenge();            
        this.gen58 = copy.getGen58();            
        this.gen59 = copy.getGen59();            
        this.selbstueberw = copy.getSelbstueberw();            
        this.ESatzung = copy.getESatzung();            
        this.enabled = copy.isEnabled();            
        this.deleted = copy.isDeleted();            
        this.uebergabestelleE32 = copy.getUebergabestelleE32();            
        this.uebergabestelleN32 = copy.getUebergabestelleN32();            
        this.rechtBehoerdenId = copy.getRechtBehoerdenId();            
        this.wrBeschreibung = copy.getWrBeschreibung();            
        this.rechtArtOpt = copy.getRechtArtOpt();            
        this.aktenzeichen = copy.getAktenzeichen();            
        this.bemerkung = copy.getBemerkung();            
        this.wasserbuchId = copy.getWasserbuchId();            
        this.beerWrNr = copy.getBeerWrNr();            
        this.erstellDat = copy.getErstellDat();            
        this.aktualDat = copy.getAktualDat();            
        this.entwaesserungsgrundstuecks = copy.getEntwaesserungsgrundstuecks();            
        this.sonderbauwerks = copy.getSonderbauwerks();            
    }    

    /**
     * Delete (mark as deleted) a detached instance
     * @param detachedInstance the instance to delete
     * @return <code>true</code>, if everything went okay,
     *         <code>false</code> otherwise
     */
    public static boolean delete(Wasserrecht detachedInstance) {
        log.debug("Deleting Wasserrecht instance " + detachedInstance);
        return new DatabaseAccess().delete(detachedInstance);
    }

    /**
     * Delete (mark as deleted) this instance
     * @return <code>true</code>, if everything went okay,
     *         <code>false</code> otherwise
     */
    public boolean delete() {
        return Wasserrecht.delete(this);
    }

    /**
     * Find an <code>Wasserrecht</code> instance by its primary key
     * @param id the primary key value
     * @return <code>Wasserrecht</code> the requested instance,
     *         if one exists,
     *         <code>null</code> otherwise
     */
    public static Wasserrecht findById(java.lang.Integer id) {
        log.debug("Getting Wasserrecht instance with id: " + id);
        return (Wasserrecht)
            new DatabaseAccess().get(Wasserrecht.class, id);
    }

    /**
     * Get a list of all <code>Wasserrecht</code>
     * @return <code>List&lt;Wasserrecht&gt;</code>
     *         all <code>Wasserrecht</code>
     */
    public static List<Wasserrecht> getAll() {
        return DatabaseQuery.getAll(new Wasserrecht());
    }

    /* Custom code goes below here! */

    public static Wasserrecht findByObjektId(java.lang.Integer id) {
        Objekt objekt = (Objekt) HibernateSessionFactory.currentSession().createQuery("from Objekt where id= " + id).list().get(0);
        Set<Wasserrecht> list = objekt.getWasserrechts();
        return list.iterator().next();
    }
}
