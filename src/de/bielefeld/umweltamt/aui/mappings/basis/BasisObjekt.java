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

package de.bielefeld.umweltamt.aui.mappings.basis;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import de.bielefeld.umweltamt.aui.mappings.DatabaseAccess;
import de.bielefeld.umweltamt.aui.mappings.DatabaseClassToString;
import de.bielefeld.umweltamt.aui.mappings.DatabaseQuery;
import de.bielefeld.umweltamt.aui.mappings.DatabaseSerialVersionUID;
import de.bielefeld.umweltamt.aui.mappings.atl.AtlProbepkt;
import de.bielefeld.umweltamt.aui.mappings.atl.AtlSielhaut;
import de.bielefeld.umweltamt.aui.mappings.indeinl.Anh40Fachdaten;
import de.bielefeld.umweltamt.aui.mappings.indeinl.Anh49Fachdaten;
import de.bielefeld.umweltamt.aui.mappings.indeinl.Anh50Fachdaten;
import de.bielefeld.umweltamt.aui.mappings.indeinl.Anh52Fachdaten;
import de.bielefeld.umweltamt.aui.mappings.indeinl.Anh53Fachdaten;
import de.bielefeld.umweltamt.aui.mappings.indeinl.Anh55Fachdaten;
import de.bielefeld.umweltamt.aui.mappings.indeinl.Anh56Fachdaten;
import de.bielefeld.umweltamt.aui.mappings.indeinl.AnhBwkFachdaten;
import de.bielefeld.umweltamt.aui.mappings.indeinl.AnhSuevFachdaten;
import de.bielefeld.umweltamt.aui.mappings.indeinl.IndeinlGenehmigung;
import de.bielefeld.umweltamt.aui.mappings.vaws.VawsFachdaten;
import de.bielefeld.umweltamt.aui.utils.AuikLogger;

/**
 * A class that represents a row in the BasisObjekt database table.<br>
 * This class is meant to serve as a model and should be copied into the
 * appropriate package and may be customized below the given mark.
 */
public class BasisObjekt  implements java.io.Serializable {

    /** Generated serialVersionUID for Serializable interface */
    private static final long serialVersionUID =
        DatabaseSerialVersionUID.forBasisObjekt;

    /* Primary key, foreign keys (relations) and table columns */
    private Integer objektid;
    private BasisBetreiber basisBetreiber;
    private BasisStandort basisStandort;
    private BasisSachbearbeiter basisSachbearbeiter;
    private BasisObjektarten basisObjektarten;
    private Integer uschistdid;
    private String beschreibung;
    private Date wiedervorlage;
    private Date erfassungsdatum;
    private Date gueltigVon;
    private Date aenderungsdatum;
    private Date gueltigBis;
    private boolean inaktiv;
    private String prioritaet;
    private boolean enabled;
    private boolean deleted;
    private IndeinlGenehmigung indeinlGenehmigung;
    private Anh53Fachdaten anh53Fachdaten;
    private AnhSuevFachdaten anhSuevFachdaten;
    private AnhBwkFachdaten anhBwkFachdaten;
    private AtlProbepkt atlProbepkt;
    private Set<BasisObjektverknuepfung> basisObjektverknuepfungsForObjekt = new HashSet<BasisObjektverknuepfung>(0);
    private Set<VawsFachdaten> vawsFachdatens = new HashSet<VawsFachdaten>(0);
    private Anh55Fachdaten anh55Fachdaten;
    private Anh52Fachdaten anh52Fachdaten;
    private Anh56Fachdaten anh56Fachdaten;
    private Set<BasisObjektverknuepfung> basisObjektverknuepfungsForIstVerknuepftMit = new HashSet<BasisObjektverknuepfung>(0);
    private Anh40Fachdaten anh40Fachdaten;
    private Set<BasisObjektchrono> basisObjektchronos = new HashSet<BasisObjektchrono>(0);
    private Set<AtlSielhaut> atlSielhauts = new HashSet<AtlSielhaut>(0);
    private Anh49Fachdaten anh49Fachdaten;
    private Anh50Fachdaten anh50Fachdaten;

    /** Logging */
    private static final AuikLogger log = AuikLogger.getLogger();

    /** Default constructor */
    public BasisObjekt() {
        // This place is intentionally left blank.
    }

    /** Minimal constructor */
    public BasisObjekt(
        boolean inaktiv, boolean enabled, boolean deleted) {
        this.inaktiv = inaktiv;
        this.enabled = enabled;
        this.deleted = deleted;
    }

    /** Full constructor */
    public BasisObjekt(
        BasisBetreiber basisBetreiber, BasisStandort basisStandort, BasisSachbearbeiter basisSachbearbeiter, BasisObjektarten basisObjektarten, Integer uschistdid, String beschreibung, Date wiedervorlage, Date erfassungsdatum, Date gueltigVon, Date aenderungsdatum, Date gueltigBis, boolean inaktiv, String prioritaet, boolean enabled, boolean deleted, IndeinlGenehmigung indeinlGenehmigung, Anh53Fachdaten anh53Fachdaten, AnhSuevFachdaten anhSuevFachdaten, AnhBwkFachdaten anhBwkFachdaten, AtlProbepkt atlProbepkt, Set<BasisObjektverknuepfung> basisObjektverknuepfungsForObjekt, Set<VawsFachdaten> vawsFachdatens, Anh55Fachdaten anh55Fachdaten, Anh52Fachdaten anh52Fachdaten, Anh56Fachdaten anh56Fachdaten, Set<BasisObjektverknuepfung> basisObjektverknuepfungsForIstVerknuepftMit, Anh40Fachdaten anh40Fachdaten, Set<BasisObjektchrono> basisObjektchronos, Set<AtlSielhaut> atlSielhauts, Anh49Fachdaten anh49Fachdaten, Anh50Fachdaten anh50Fachdaten) {
        this.basisBetreiber = basisBetreiber;
        this.basisStandort = basisStandort;
        this.basisSachbearbeiter = basisSachbearbeiter;
        this.basisObjektarten = basisObjektarten;
        this.uschistdid = uschistdid;
        this.beschreibung = beschreibung;
        this.wiedervorlage = wiedervorlage;
        this.erfassungsdatum = erfassungsdatum;
        this.gueltigVon = gueltigVon;
        this.aenderungsdatum = aenderungsdatum;
        this.gueltigBis = gueltigBis;
        this.inaktiv = inaktiv;
        this.prioritaet = prioritaet;
        this.enabled = enabled;
        this.deleted = deleted;
        this.indeinlGenehmigung = indeinlGenehmigung;
        this.anh53Fachdaten = anh53Fachdaten;
        this.anhSuevFachdaten = anhSuevFachdaten;
        this.anhBwkFachdaten = anhBwkFachdaten;
        this.atlProbepkt = atlProbepkt;
        this.basisObjektverknuepfungsForObjekt = basisObjektverknuepfungsForObjekt;
        this.vawsFachdatens = vawsFachdatens;
        this.anh55Fachdaten = anh55Fachdaten;
        this.anh52Fachdaten = anh52Fachdaten;
        this.anh56Fachdaten = anh56Fachdaten;
        this.basisObjektverknuepfungsForIstVerknuepftMit = basisObjektverknuepfungsForIstVerknuepftMit;
        this.anh40Fachdaten = anh40Fachdaten;
        this.basisObjektchronos = basisObjektchronos;
        this.atlSielhauts = atlSielhauts;
        this.anh49Fachdaten = anh49Fachdaten;
        this.anh50Fachdaten = anh50Fachdaten;
    }

    /* Setter and getter methods */
    public Integer getObjektid() {
        return this.objektid;
    }

    public void setObjektid(Integer objektid) {
        this.objektid = objektid;
    }

    public BasisBetreiber getBasisBetreiber() {
        return this.basisBetreiber;
    }

    public void setBasisBetreiber(BasisBetreiber basisBetreiber) {
        this.basisBetreiber = basisBetreiber;
    }

    public BasisStandort getBasisStandort() {
        return this.basisStandort;
    }

    public void setBasisStandort(BasisStandort basisStandort) {
        this.basisStandort = basisStandort;
    }

    public BasisSachbearbeiter getBasisSachbearbeiter() {
        return this.basisSachbearbeiter;
    }

    public void setBasisSachbearbeiter(BasisSachbearbeiter basisSachbearbeiter) {
        this.basisSachbearbeiter = basisSachbearbeiter;
    }

    public BasisObjektarten getBasisObjektarten() {
        return this.basisObjektarten;
    }

    public void setBasisObjektarten(BasisObjektarten basisObjektarten) {
        this.basisObjektarten = basisObjektarten;
    }

    public Integer getUschistdid() {
        return this.uschistdid;
    }

    public void setUschistdid(Integer uschistdid) {
        this.uschistdid = uschistdid;
    }

    public String getBeschreibung() {
        return this.beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public Date getWiedervorlage() {
        return this.wiedervorlage;
    }

    public void setWiedervorlage(Date wiedervorlage) {
        this.wiedervorlage = wiedervorlage;
    }

    public Date getErfassungsdatum() {
        return this.erfassungsdatum;
    }

    public void setErfassungsdatum(Date erfassungsdatum) {
        this.erfassungsdatum = erfassungsdatum;
    }

    public Date getGueltigVon() {
        return this.gueltigVon;
    }

    public void setGueltigVon(Date gueltigVon) {
        this.gueltigVon = gueltigVon;
    }

    public Date getAenderungsdatum() {
        return this.aenderungsdatum;
    }

    public void setAenderungsdatum(Date aenderungsdatum) {
        this.aenderungsdatum = aenderungsdatum;
    }

    public Date getGueltigBis() {
        return this.gueltigBis;
    }

    public void setGueltigBis(Date gueltigBis) {
        this.gueltigBis = gueltigBis;
    }

    public boolean isInaktiv() {
        return this.inaktiv;
    }

    public void setInaktiv(boolean inaktiv) {
        this.inaktiv = inaktiv;
    }

    public String getPrioritaet() {
        return this.prioritaet;
    }

    public void setPrioritaet(String prioritaet) {
        this.prioritaet = prioritaet;
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

    public IndeinlGenehmigung getIndeinlGenehmigung() {
        return this.indeinlGenehmigung;
    }

    public void setIndeinlGenehmigung(IndeinlGenehmigung indeinlGenehmigung) {
        this.indeinlGenehmigung = indeinlGenehmigung;
    }

    public Anh53Fachdaten getAnh53Fachdaten() {
        return this.anh53Fachdaten;
    }

    public void setAnh53Fachdaten(Anh53Fachdaten anh53Fachdaten) {
        this.anh53Fachdaten = anh53Fachdaten;
    }

    public AnhSuevFachdaten getAnhSuevFachdaten() {
        return this.anhSuevFachdaten;
    }

    public void setAnhSuevFachdaten(AnhSuevFachdaten anhSuevFachdaten) {
        this.anhSuevFachdaten = anhSuevFachdaten;
    }

    public AnhBwkFachdaten getAnhBwkFachdaten() {
        return this.anhBwkFachdaten;
    }

    public void setAnhBwkFachdaten(AnhBwkFachdaten anhBwkFachdaten) {
        this.anhBwkFachdaten = anhBwkFachdaten;
    }

    public AtlProbepkt getAtlProbepkt() {
        return this.atlProbepkt;
    }

    public void setAtlProbepkt(AtlProbepkt atlProbepkt) {
        this.atlProbepkt = atlProbepkt;
    }

    public Set<BasisObjektverknuepfung> getBasisObjektverknuepfungsForObjekt() {
        return this.basisObjektverknuepfungsForObjekt;
    }

    public void setBasisObjektverknuepfungsForObjekt(Set<BasisObjektverknuepfung> basisObjektverknuepfungsForObjekt) {
        this.basisObjektverknuepfungsForObjekt = basisObjektverknuepfungsForObjekt;
    }

    public Set<VawsFachdaten> getVawsFachdatens() {
        return this.vawsFachdatens;
    }

    public void setVawsFachdatens(Set<VawsFachdaten> vawsFachdatens) {
        this.vawsFachdatens = vawsFachdatens;
    }

    public Anh55Fachdaten getAnh55Fachdaten() {
        return this.anh55Fachdaten;
    }

    public void setAnh55Fachdaten(Anh55Fachdaten anh55Fachdaten) {
        this.anh55Fachdaten = anh55Fachdaten;
    }

    public Anh52Fachdaten getAnh52Fachdaten() {
        return this.anh52Fachdaten;
    }

    public void setAnh52Fachdaten(Anh52Fachdaten anh52Fachdaten) {
        this.anh52Fachdaten = anh52Fachdaten;
    }

    public Anh56Fachdaten getAnh56Fachdaten() {
        return this.anh56Fachdaten;
    }

    public void setAnh56Fachdaten(Anh56Fachdaten anh56Fachdaten) {
        this.anh56Fachdaten = anh56Fachdaten;
    }

    public Set<BasisObjektverknuepfung> getBasisObjektverknuepfungsForIstVerknuepftMit() {
        return this.basisObjektverknuepfungsForIstVerknuepftMit;
    }

    public void setBasisObjektverknuepfungsForIstVerknuepftMit(Set<BasisObjektverknuepfung> basisObjektverknuepfungsForIstVerknuepftMit) {
        this.basisObjektverknuepfungsForIstVerknuepftMit = basisObjektverknuepfungsForIstVerknuepftMit;
    }

    public Anh40Fachdaten getAnh40Fachdaten() {
        return this.anh40Fachdaten;
    }

    public void setAnh40Fachdaten(Anh40Fachdaten anh40Fachdaten) {
        this.anh40Fachdaten = anh40Fachdaten;
    }

    public Set<BasisObjektchrono> getBasisObjektchronos() {
        return this.basisObjektchronos;
    }

    public void setBasisObjektchronos(Set<BasisObjektchrono> basisObjektchronos) {
        this.basisObjektchronos = basisObjektchronos;
    }

    public Set<AtlSielhaut> getAtlSielhauts() {
        return this.atlSielhauts;
    }

    public void setAtlSielhauts(Set<AtlSielhaut> atlSielhauts) {
        this.atlSielhauts = atlSielhauts;
    }

    public Anh49Fachdaten getAnh49Fachdaten() {
        return this.anh49Fachdaten;
    }

    public void setAnh49Fachdaten(Anh49Fachdaten anh49Fachdaten) {
        this.anh49Fachdaten = anh49Fachdaten;
    }

    public Anh50Fachdaten getAnh50Fachdaten() {
        return this.anh50Fachdaten;
    }

    public void setAnh50Fachdaten(Anh50Fachdaten anh50Fachdaten) {
        this.anh50Fachdaten = anh50Fachdaten;
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
        buffer.append("basisBetreiber").append("='").append(getBasisBetreiber()).append("' ");
        buffer.append("basisStandort").append("='").append(getBasisStandort()).append("' ");
        buffer.append("basisSachbearbeiter").append("='").append(getBasisSachbearbeiter()).append("' ");
        buffer.append("basisObjektarten").append("='").append(getBasisObjektarten()).append("' ");
        buffer.append("uschistdid").append("='").append(getUschistdid()).append("' ");
        buffer.append("beschreibung").append("='").append(getBeschreibung()).append("' ");
        buffer.append("wiedervorlage").append("='").append(getWiedervorlage()).append("' ");
        buffer.append("erfassungsdatum").append("='").append(getErfassungsdatum()).append("' ");
        buffer.append("gueltigVon").append("='").append(getGueltigVon()).append("' ");
        buffer.append("aenderungsdatum").append("='").append(getAenderungsdatum()).append("' ");
        buffer.append("gueltigBis").append("='").append(getGueltigBis()).append("' ");
        buffer.append("inaktiv").append("='").append(isInaktiv()).append("' ");
        buffer.append("prioritaet").append("='").append(getPrioritaet()).append("' ");
        buffer.append("enabled").append("='").append(isEnabled()).append("' ");
        buffer.append("deleted").append("='").append(isDeleted()).append("' ");
        buffer.append("indeinlGenehmigung").append("='").append(getIndeinlGenehmigung()).append("' ");
        buffer.append("anh53Fachdaten").append("='").append(getAnh53Fachdaten()).append("' ");
        buffer.append("anhSuevFachdaten").append("='").append(getAnhSuevFachdaten()).append("' ");
        buffer.append("anhBwkFachdaten").append("='").append(getAnhBwkFachdaten()).append("' ");
        buffer.append("atlProbepkt").append("='").append(getAtlProbepkt()).append("' ");
        buffer.append("basisObjektverknuepfungsForObjekt").append("='").append(getBasisObjektverknuepfungsForObjekt()).append("' ");
        buffer.append("vawsFachdatens").append("='").append(getVawsFachdatens()).append("' ");
        buffer.append("anh55Fachdaten").append("='").append(getAnh55Fachdaten()).append("' ");
        buffer.append("anh52Fachdaten").append("='").append(getAnh52Fachdaten()).append("' ");
        buffer.append("anh56Fachdaten").append("='").append(getAnh56Fachdaten()).append("' ");
        buffer.append("basisObjektverknuepfungsForIstVerknuepftMit").append("='").append(getBasisObjektverknuepfungsForIstVerknuepftMit()).append("' ");
        buffer.append("anh40Fachdaten").append("='").append(getAnh40Fachdaten()).append("' ");
        buffer.append("basisObjektchronos").append("='").append(getBasisObjektchronos()).append("' ");
        buffer.append("atlSielhauts").append("='").append(getAtlSielhauts()).append("' ");
        buffer.append("anh49Fachdaten").append("='").append(getAnh49Fachdaten()).append("' ");
        buffer.append("anh50Fachdaten").append("='").append(getAnh50Fachdaten()).append("' ");
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
        if (!(other instanceof BasisObjekt)) return false;
        return (this.getObjektid().equals(
            ((BasisObjekt) other).getObjektid()));
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
     * @return <code>BasisObjekt</code> the merged instance,
     *         if everything went okay,
     *         <code>null</code> otherwise
     */
    public static BasisObjekt merge(BasisObjekt detachedInstance) {
        log.debug("Merging BasisObjekt instance " + detachedInstance);
        return (BasisObjekt) new DatabaseAccess().merge(detachedInstance);
    }

    /**
     * Merge (save or update) this instance
     * @return <code>true</code>, if everything went okay,
     *         <code>false</code> otherwise
     */
    public boolean merge() {
        BasisObjekt saved = BasisObjekt.merge(this);
        if (saved == null) {
            return false;
        } else {
            this.copy(saved);
            return true;
        }
    }

    /**
     * Update this BasisObjekt with its new values.<br>
     * This is meant to be used after merging!
     * @param copy BasisObjekt
     */
    private void copy(BasisObjekt copy) {
        this.basisBetreiber = copy.getBasisBetreiber();
        this.basisStandort = copy.getBasisStandort();
        this.basisSachbearbeiter = copy.getBasisSachbearbeiter();
        this.basisObjektarten = copy.getBasisObjektarten();
        this.uschistdid = copy.getUschistdid();
        this.beschreibung = copy.getBeschreibung();
        this.wiedervorlage = copy.getWiedervorlage();
        this.erfassungsdatum = copy.getErfassungsdatum();
        this.gueltigVon = copy.getGueltigVon();
        this.aenderungsdatum = copy.getAenderungsdatum();
        this.gueltigBis = copy.getGueltigBis();
        this.inaktiv = copy.isInaktiv();
        this.prioritaet = copy.getPrioritaet();
        this.enabled = copy.isEnabled();
        this.deleted = copy.isDeleted();
        this.indeinlGenehmigung = copy.getIndeinlGenehmigung();
        this.anh53Fachdaten = copy.getAnh53Fachdaten();
        this.anhSuevFachdaten = copy.getAnhSuevFachdaten();
        this.anhBwkFachdaten = copy.getAnhBwkFachdaten();
        this.atlProbepkt = copy.getAtlProbepkt();
        this.basisObjektverknuepfungsForObjekt = copy.getBasisObjektverknuepfungsForObjekt();
        this.vawsFachdatens = copy.getVawsFachdatens();
        this.anh55Fachdaten = copy.getAnh55Fachdaten();
        this.anh52Fachdaten = copy.getAnh52Fachdaten();
        this.anh56Fachdaten = copy.getAnh56Fachdaten();
        this.basisObjektverknuepfungsForIstVerknuepftMit = copy.getBasisObjektverknuepfungsForIstVerknuepftMit();
        this.anh40Fachdaten = copy.getAnh40Fachdaten();
        this.basisObjektchronos = copy.getBasisObjektchronos();
        this.atlSielhauts = copy.getAtlSielhauts();
        this.anh49Fachdaten = copy.getAnh49Fachdaten();
        this.anh50Fachdaten = copy.getAnh50Fachdaten();
    }

    /**
     * Delete (mark as deleted) a detached instance
     * @param detachedInstance the instance to delete
     * @return <code>true</code>, if everything went okay,
     *         <code>false</code> otherwise
     */
    public static boolean delete(BasisObjekt detachedInstance) {
        log.debug("Deleting BasisObjekt instance " + detachedInstance);
        return new DatabaseAccess().delete(detachedInstance);
    }

    /**
     * Delete (mark as deleted) this instance
     * @return <code>true</code>, if everything went okay,
     *         <code>false</code> otherwise
     */
    public boolean delete() {
        return BasisObjekt.delete(this);
    }

    /**
     * Find an <code>BasisObjekt</code> instance by its primary key
     * @param id the primary key value
     * @return <code>BasisObjekt</code> the requested instance,
     *         if one exists,
     *         <code>null</code> otherwise
     */
    public static BasisObjekt findById(java.lang.Integer id) {
        log.debug("Getting BasisObjekt instance with id: " + id);
        return (BasisObjekt)
            new DatabaseAccess().get(BasisObjekt.class, id);
    }

    /**
     * Get a list of all <code>BasisObjekt</code>
     * @return <code>List&lt;BasisObjekt&gt;</code>
     *         all <code>BasisObjekt</code>
     */
    public static List<BasisObjekt> getAll() {
        return DatabaseQuery.getAll(new BasisObjekt());
    }

    /* Custom code goes below here! */

}
