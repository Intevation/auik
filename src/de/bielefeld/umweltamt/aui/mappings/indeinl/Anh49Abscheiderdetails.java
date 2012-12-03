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

package de.bielefeld.umweltamt.aui.mappings.indeinl;

import java.util.Date;
import java.util.List;

import de.bielefeld.umweltamt.aui.mappings.DatabaseAccess;
import de.bielefeld.umweltamt.aui.mappings.DatabaseClassToString;
import de.bielefeld.umweltamt.aui.mappings.DatabaseQuery;
import de.bielefeld.umweltamt.aui.mappings.DatabaseSerialVersionUID;
import de.bielefeld.umweltamt.aui.utils.AuikLogger;

/**
 * A class that represents a row in the Anh49Abscheiderdetails database table.<br>
 * This class is meant to serve as a model and should be copied into the
 * appropriate package and may be customized below the given mark.
 */
public class Anh49Abscheiderdetails  implements java.io.Serializable {

    /** Generated serialVersionUID for Serializable interface */
    private static final long serialVersionUID =
        DatabaseSerialVersionUID.forAnh49Abscheiderdetails;

    /* Primary key, foreign keys (relations) and table columns */
    private Integer id;
    private Anh49Fachdaten anh49Fachdaten;
    private Integer abscheidernr;
    private Integer von;
    private String lage;
    private Integer nenngroesse;
    private Boolean tankstelle;
    private Boolean waschplatzHalle;
    private Boolean kfzBetrieb;
    private Boolean lebensmittelbetrieb;
    private Boolean wohnhaus;
    private Boolean oberflaechenentwaesserung;
    private Boolean produktionsabwasser;
    private Boolean schlammfang;
    private Boolean benzinOelabscheider;
    private Boolean koaleszenzfilter;
    private Boolean integriert;
    private Boolean emulsionsspaltanlage;
    private Boolean fettabscheider;
    private String baujahr;
    private Boolean din1999;
    private String bauartzulassungsnummer;
    private Integer ngSf;
    private Integer ngBa;
    private Integer ngKa;
    private Boolean schwimmer;
    private Boolean warnsignal;
    private Boolean wartungsvertrag;
    private String vertragspartner;
    private String letzteWartung;
    private String letzteLeerung;
    private String hersteller;
    private Boolean schmutzwasserkanal;
    private Boolean regenwasserkanal;
    private Boolean mischwasserkanal;
    private Boolean direkteinleiter;
    private String entsorgungnachweis;
    private String entsorgungsvertrag;
    private String entsorgungsintervalle;
    private Integer flaeche;
    private String bemerkung;
    private Date entsorgungsnachweis;
    private String entsorgungsnachweisDurch;
    private boolean enabled;
    private boolean deleted;

    /** Logging */
    private static final AuikLogger log = AuikLogger.getLogger();

    /** Default constructor */
    public Anh49Abscheiderdetails() {
        // This place is intentionally left blank.
    }

    /** Minimal constructor */
    public Anh49Abscheiderdetails(
        boolean enabled, boolean deleted) {
        this.enabled = enabled;
        this.deleted = deleted;
    }

    /** Full constructor */
    public Anh49Abscheiderdetails(
        Anh49Fachdaten anh49Fachdaten, Integer abscheidernr, Integer von, String lage, Integer nenngroesse, Boolean tankstelle, Boolean waschplatzHalle, Boolean kfzBetrieb, Boolean lebensmittelbetrieb, Boolean wohnhaus, Boolean oberflaechenentwaesserung, Boolean produktionsabwasser, Boolean schlammfang, Boolean benzinOelabscheider, Boolean koaleszenzfilter, Boolean integriert, Boolean emulsionsspaltanlage, Boolean fettabscheider, String baujahr, Boolean din1999, String bauartzulassungsnummer, Integer ngSf, Integer ngBa, Integer ngKa, Boolean schwimmer, Boolean warnsignal, Boolean wartungsvertrag, String vertragspartner, String letzteWartung, String letzteLeerung, String hersteller, Boolean schmutzwasserkanal, Boolean regenwasserkanal, Boolean mischwasserkanal, Boolean direkteinleiter, String entsorgungnachweis, String entsorgungsvertrag, String entsorgungsintervalle, Integer flaeche, String bemerkung, Date entsorgungsnachweis, String entsorgungsnachweisDurch, boolean enabled, boolean deleted) {
        this.anh49Fachdaten = anh49Fachdaten;
        this.abscheidernr = abscheidernr;
        this.von = von;
        this.lage = lage;
        this.nenngroesse = nenngroesse;
        this.tankstelle = tankstelle;
        this.waschplatzHalle = waschplatzHalle;
        this.kfzBetrieb = kfzBetrieb;
        this.lebensmittelbetrieb = lebensmittelbetrieb;
        this.wohnhaus = wohnhaus;
        this.oberflaechenentwaesserung = oberflaechenentwaesserung;
        this.produktionsabwasser = produktionsabwasser;
        this.schlammfang = schlammfang;
        this.benzinOelabscheider = benzinOelabscheider;
        this.koaleszenzfilter = koaleszenzfilter;
        this.integriert = integriert;
        this.emulsionsspaltanlage = emulsionsspaltanlage;
        this.fettabscheider = fettabscheider;
        this.baujahr = baujahr;
        this.din1999 = din1999;
        this.bauartzulassungsnummer = bauartzulassungsnummer;
        this.ngSf = ngSf;
        this.ngBa = ngBa;
        this.ngKa = ngKa;
        this.schwimmer = schwimmer;
        this.warnsignal = warnsignal;
        this.wartungsvertrag = wartungsvertrag;
        this.vertragspartner = vertragspartner;
        this.letzteWartung = letzteWartung;
        this.letzteLeerung = letzteLeerung;
        this.hersteller = hersteller;
        this.schmutzwasserkanal = schmutzwasserkanal;
        this.regenwasserkanal = regenwasserkanal;
        this.mischwasserkanal = mischwasserkanal;
        this.direkteinleiter = direkteinleiter;
        this.entsorgungnachweis = entsorgungnachweis;
        this.entsorgungsvertrag = entsorgungsvertrag;
        this.entsorgungsintervalle = entsorgungsintervalle;
        this.flaeche = flaeche;
        this.bemerkung = bemerkung;
        this.entsorgungsnachweis = entsorgungsnachweis;
        this.entsorgungsnachweisDurch = entsorgungsnachweisDurch;
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

    public Anh49Fachdaten getAnh49Fachdaten() {
        return this.anh49Fachdaten;
    }

    public void setAnh49Fachdaten(Anh49Fachdaten anh49Fachdaten) {
        this.anh49Fachdaten = anh49Fachdaten;
    }

    public Integer getAbscheidernr() {
        return this.abscheidernr;
    }

    public void setAbscheidernr(Integer abscheidernr) {
        this.abscheidernr = abscheidernr;
    }

    public Integer getVon() {
        return this.von;
    }

    public void setVon(Integer von) {
        this.von = von;
    }

    public String getLage() {
        return this.lage;
    }

    public void setLage(String lage) {
        this.lage = lage;
    }

    public Integer getNenngroesse() {
        return this.nenngroesse;
    }

    public void setNenngroesse(Integer nenngroesse) {
        this.nenngroesse = nenngroesse;
    }

    public Boolean getTankstelle() {
        return this.tankstelle;
    }

    public void setTankstelle(Boolean tankstelle) {
        this.tankstelle = tankstelle;
    }

    public Boolean getWaschplatzHalle() {
        return this.waschplatzHalle;
    }

    public void setWaschplatzHalle(Boolean waschplatzHalle) {
        this.waschplatzHalle = waschplatzHalle;
    }

    public Boolean getKfzBetrieb() {
        return this.kfzBetrieb;
    }

    public void setKfzBetrieb(Boolean kfzBetrieb) {
        this.kfzBetrieb = kfzBetrieb;
    }

    public Boolean getLebensmittelbetrieb() {
        return this.lebensmittelbetrieb;
    }

    public void setLebensmittelbetrieb(Boolean lebensmittelbetrieb) {
        this.lebensmittelbetrieb = lebensmittelbetrieb;
    }

    public Boolean getWohnhaus() {
        return this.wohnhaus;
    }

    public void setWohnhaus(Boolean wohnhaus) {
        this.wohnhaus = wohnhaus;
    }

    public Boolean getOberflaechenentwaesserung() {
        return this.oberflaechenentwaesserung;
    }

    public void setOberflaechenentwaesserung(Boolean oberflaechenentwaesserung) {
        this.oberflaechenentwaesserung = oberflaechenentwaesserung;
    }

    public Boolean getProduktionsabwasser() {
        return this.produktionsabwasser;
    }

    public void setProduktionsabwasser(Boolean produktionsabwasser) {
        this.produktionsabwasser = produktionsabwasser;
    }

    public Boolean getSchlammfang() {
        return this.schlammfang;
    }

    public void setSchlammfang(Boolean schlammfang) {
        this.schlammfang = schlammfang;
    }

    public Boolean getBenzinOelabscheider() {
        return this.benzinOelabscheider;
    }

    public void setBenzinOelabscheider(Boolean benzinOelabscheider) {
        this.benzinOelabscheider = benzinOelabscheider;
    }

    public Boolean getKoaleszenzfilter() {
        return this.koaleszenzfilter;
    }

    public void setKoaleszenzfilter(Boolean koaleszenzfilter) {
        this.koaleszenzfilter = koaleszenzfilter;
    }

    public Boolean getIntegriert() {
        return this.integriert;
    }

    public void setIntegriert(Boolean integriert) {
        this.integriert = integriert;
    }

    public Boolean getEmulsionsspaltanlage() {
        return this.emulsionsspaltanlage;
    }

    public void setEmulsionsspaltanlage(Boolean emulsionsspaltanlage) {
        this.emulsionsspaltanlage = emulsionsspaltanlage;
    }

    public Boolean getFettabscheider() {
        return this.fettabscheider;
    }

    public void setFettabscheider(Boolean fettabscheider) {
        this.fettabscheider = fettabscheider;
    }

    public String getBaujahr() {
        return this.baujahr;
    }

    public void setBaujahr(String baujahr) {
        this.baujahr = baujahr;
    }

    public Boolean getDin1999() {
        return this.din1999;
    }

    public void setDin1999(Boolean din1999) {
        this.din1999 = din1999;
    }

    public String getBauartzulassungsnummer() {
        return this.bauartzulassungsnummer;
    }

    public void setBauartzulassungsnummer(String bauartzulassungsnummer) {
        this.bauartzulassungsnummer = bauartzulassungsnummer;
    }

    public Integer getNgSf() {
        return this.ngSf;
    }

    public void setNgSf(Integer ngSf) {
        this.ngSf = ngSf;
    }

    public Integer getNgBa() {
        return this.ngBa;
    }

    public void setNgBa(Integer ngBa) {
        this.ngBa = ngBa;
    }

    public Integer getNgKa() {
        return this.ngKa;
    }

    public void setNgKa(Integer ngKa) {
        this.ngKa = ngKa;
    }

    public Boolean getSchwimmer() {
        return this.schwimmer;
    }

    public void setSchwimmer(Boolean schwimmer) {
        this.schwimmer = schwimmer;
    }

    public Boolean getWarnsignal() {
        return this.warnsignal;
    }

    public void setWarnsignal(Boolean warnsignal) {
        this.warnsignal = warnsignal;
    }

    public Boolean getWartungsvertrag() {
        return this.wartungsvertrag;
    }

    public void setWartungsvertrag(Boolean wartungsvertrag) {
        this.wartungsvertrag = wartungsvertrag;
    }

    public String getVertragspartner() {
        return this.vertragspartner;
    }

    public void setVertragspartner(String vertragspartner) {
        this.vertragspartner = vertragspartner;
    }

    public String getLetzteWartung() {
        return this.letzteWartung;
    }

    public void setLetzteWartung(String letzteWartung) {
        this.letzteWartung = letzteWartung;
    }

    public String getLetzteLeerung() {
        return this.letzteLeerung;
    }

    public void setLetzteLeerung(String letzteLeerung) {
        this.letzteLeerung = letzteLeerung;
    }

    public String getHersteller() {
        return this.hersteller;
    }

    public void setHersteller(String hersteller) {
        this.hersteller = hersteller;
    }

    public Boolean getSchmutzwasserkanal() {
        return this.schmutzwasserkanal;
    }

    public void setSchmutzwasserkanal(Boolean schmutzwasserkanal) {
        this.schmutzwasserkanal = schmutzwasserkanal;
    }

    public Boolean getRegenwasserkanal() {
        return this.regenwasserkanal;
    }

    public void setRegenwasserkanal(Boolean regenwasserkanal) {
        this.regenwasserkanal = regenwasserkanal;
    }

    public Boolean getMischwasserkanal() {
        return this.mischwasserkanal;
    }

    public void setMischwasserkanal(Boolean mischwasserkanal) {
        this.mischwasserkanal = mischwasserkanal;
    }

    public Boolean getDirekteinleiter() {
        return this.direkteinleiter;
    }

    public void setDirekteinleiter(Boolean direkteinleiter) {
        this.direkteinleiter = direkteinleiter;
    }

    public String getEntsorgungnachweis() {
        return this.entsorgungnachweis;
    }

    public void setEntsorgungnachweis(String entsorgungnachweis) {
        this.entsorgungnachweis = entsorgungnachweis;
    }

    public String getEntsorgungsvertrag() {
        return this.entsorgungsvertrag;
    }

    public void setEntsorgungsvertrag(String entsorgungsvertrag) {
        this.entsorgungsvertrag = entsorgungsvertrag;
    }

    public String getEntsorgungsintervalle() {
        return this.entsorgungsintervalle;
    }

    public void setEntsorgungsintervalle(String entsorgungsintervalle) {
        this.entsorgungsintervalle = entsorgungsintervalle;
    }

    public Integer getFlaeche() {
        return this.flaeche;
    }

    public void setFlaeche(Integer flaeche) {
        this.flaeche = flaeche;
    }

    public String getBemerkung() {
        return this.bemerkung;
    }

    public void setBemerkung(String bemerkung) {
        this.bemerkung = bemerkung;
    }

    public Date getEntsorgungsnachweis() {
        return this.entsorgungsnachweis;
    }

    public void setEntsorgungsnachweis(Date entsorgungsnachweis) {
        this.entsorgungsnachweis = entsorgungsnachweis;
    }

    public String getEntsorgungsnachweisDurch() {
        return this.entsorgungsnachweisDurch;
    }

    public void setEntsorgungsnachweisDurch(String entsorgungsnachweisDurch) {
        this.entsorgungsnachweisDurch = entsorgungsnachweisDurch;
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
        buffer.append("anh49Fachdaten").append("='").append(getAnh49Fachdaten()).append("' ");
        buffer.append("abscheidernr").append("='").append(getAbscheidernr()).append("' ");
        buffer.append("von").append("='").append(getVon()).append("' ");
        buffer.append("lage").append("='").append(getLage()).append("' ");
        buffer.append("nenngroesse").append("='").append(getNenngroesse()).append("' ");
        buffer.append("tankstelle").append("='").append(getTankstelle()).append("' ");
        buffer.append("waschplatzHalle").append("='").append(getWaschplatzHalle()).append("' ");
        buffer.append("kfzBetrieb").append("='").append(getKfzBetrieb()).append("' ");
        buffer.append("lebensmittelbetrieb").append("='").append(getLebensmittelbetrieb()).append("' ");
        buffer.append("wohnhaus").append("='").append(getWohnhaus()).append("' ");
        buffer.append("oberflaechenentwaesserung").append("='").append(getOberflaechenentwaesserung()).append("' ");
        buffer.append("produktionsabwasser").append("='").append(getProduktionsabwasser()).append("' ");
        buffer.append("schlammfang").append("='").append(getSchlammfang()).append("' ");
        buffer.append("benzinOelabscheider").append("='").append(getBenzinOelabscheider()).append("' ");
        buffer.append("koaleszenzfilter").append("='").append(getKoaleszenzfilter()).append("' ");
        buffer.append("integriert").append("='").append(getIntegriert()).append("' ");
        buffer.append("emulsionsspaltanlage").append("='").append(getEmulsionsspaltanlage()).append("' ");
        buffer.append("fettabscheider").append("='").append(getFettabscheider()).append("' ");
        buffer.append("baujahr").append("='").append(getBaujahr()).append("' ");
        buffer.append("din1999").append("='").append(getDin1999()).append("' ");
        buffer.append("bauartzulassungsnummer").append("='").append(getBauartzulassungsnummer()).append("' ");
        buffer.append("ngSf").append("='").append(getNgSf()).append("' ");
        buffer.append("ngBa").append("='").append(getNgBa()).append("' ");
        buffer.append("ngKa").append("='").append(getNgKa()).append("' ");
        buffer.append("schwimmer").append("='").append(getSchwimmer()).append("' ");
        buffer.append("warnsignal").append("='").append(getWarnsignal()).append("' ");
        buffer.append("wartungsvertrag").append("='").append(getWartungsvertrag()).append("' ");
        buffer.append("vertragspartner").append("='").append(getVertragspartner()).append("' ");
        buffer.append("letzteWartung").append("='").append(getLetzteWartung()).append("' ");
        buffer.append("letzteLeerung").append("='").append(getLetzteLeerung()).append("' ");
        buffer.append("hersteller").append("='").append(getHersteller()).append("' ");
        buffer.append("schmutzwasserkanal").append("='").append(getSchmutzwasserkanal()).append("' ");
        buffer.append("regenwasserkanal").append("='").append(getRegenwasserkanal()).append("' ");
        buffer.append("mischwasserkanal").append("='").append(getMischwasserkanal()).append("' ");
        buffer.append("direkteinleiter").append("='").append(getDirekteinleiter()).append("' ");
        buffer.append("entsorgungnachweis").append("='").append(getEntsorgungnachweis()).append("' ");
        buffer.append("entsorgungsvertrag").append("='").append(getEntsorgungsvertrag()).append("' ");
        buffer.append("entsorgungsintervalle").append("='").append(getEntsorgungsintervalle()).append("' ");
        buffer.append("flaeche").append("='").append(getFlaeche()).append("' ");
        buffer.append("bemerkung").append("='").append(getBemerkung()).append("' ");
        buffer.append("entsorgungsnachweis").append("='").append(getEntsorgungsnachweis()).append("' ");
        buffer.append("entsorgungsnachweisDurch").append("='").append(getEntsorgungsnachweisDurch()).append("' ");
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
        if (!(other instanceof Anh49Abscheiderdetails)) return false;
        return (this.getId().equals(
            ((Anh49Abscheiderdetails) other).getId()));
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
     * @return <code>Anh49Abscheiderdetails</code> the merged instance,
     *         if everything went okay,
     *         <code>null</code> otherwise
     */
    public static Anh49Abscheiderdetails merge(Anh49Abscheiderdetails detachedInstance) {
        log.debug("Merging Anh49Abscheiderdetails instance " + detachedInstance);
        return (Anh49Abscheiderdetails) new DatabaseAccess().merge(detachedInstance);
    }

    /**
     * Merge (save or update) this instance
     * @return <code>true</code>, if everything went okay,
     *         <code>false</code> otherwise
     */
    public boolean merge() {
        Anh49Abscheiderdetails saved = Anh49Abscheiderdetails.merge(this);
        if (saved == null) {
            return false;
        } else {
            this.copy(saved);
            return true;
        }
    }

    /**
     * Update this Anh49Abscheiderdetails with its new values.<br>
     * This is meant to be used after merging!
     * @param copy Anh49Abscheiderdetails
     */
    private void copy(Anh49Abscheiderdetails copy) {
        this.anh49Fachdaten = copy.getAnh49Fachdaten();
        this.abscheidernr = copy.getAbscheidernr();
        this.von = copy.getVon();
        this.lage = copy.getLage();
        this.nenngroesse = copy.getNenngroesse();
        this.tankstelle = copy.getTankstelle();
        this.waschplatzHalle = copy.getWaschplatzHalle();
        this.kfzBetrieb = copy.getKfzBetrieb();
        this.lebensmittelbetrieb = copy.getLebensmittelbetrieb();
        this.wohnhaus = copy.getWohnhaus();
        this.oberflaechenentwaesserung = copy.getOberflaechenentwaesserung();
        this.produktionsabwasser = copy.getProduktionsabwasser();
        this.schlammfang = copy.getSchlammfang();
        this.benzinOelabscheider = copy.getBenzinOelabscheider();
        this.koaleszenzfilter = copy.getKoaleszenzfilter();
        this.integriert = copy.getIntegriert();
        this.emulsionsspaltanlage = copy.getEmulsionsspaltanlage();
        this.fettabscheider = copy.getFettabscheider();
        this.baujahr = copy.getBaujahr();
        this.din1999 = copy.getDin1999();
        this.bauartzulassungsnummer = copy.getBauartzulassungsnummer();
        this.ngSf = copy.getNgSf();
        this.ngBa = copy.getNgBa();
        this.ngKa = copy.getNgKa();
        this.schwimmer = copy.getSchwimmer();
        this.warnsignal = copy.getWarnsignal();
        this.wartungsvertrag = copy.getWartungsvertrag();
        this.vertragspartner = copy.getVertragspartner();
        this.letzteWartung = copy.getLetzteWartung();
        this.letzteLeerung = copy.getLetzteLeerung();
        this.hersteller = copy.getHersteller();
        this.schmutzwasserkanal = copy.getSchmutzwasserkanal();
        this.regenwasserkanal = copy.getRegenwasserkanal();
        this.mischwasserkanal = copy.getMischwasserkanal();
        this.direkteinleiter = copy.getDirekteinleiter();
        this.entsorgungnachweis = copy.getEntsorgungnachweis();
        this.entsorgungsvertrag = copy.getEntsorgungsvertrag();
        this.entsorgungsintervalle = copy.getEntsorgungsintervalle();
        this.flaeche = copy.getFlaeche();
        this.bemerkung = copy.getBemerkung();
        this.entsorgungsnachweis = copy.getEntsorgungsnachweis();
        this.entsorgungsnachweisDurch = copy.getEntsorgungsnachweisDurch();
        this.enabled = copy.isEnabled();
        this.deleted = copy.isDeleted();
    }

    /**
     * Delete (mark as deleted) a detached instance
     * @param detachedInstance the instance to delete
     * @return <code>true</code>, if everything went okay,
     *         <code>false</code> otherwise
     */
    public static boolean delete(Anh49Abscheiderdetails detachedInstance) {
        log.debug("Deleting Anh49Abscheiderdetails instance " + detachedInstance);
        return new DatabaseAccess().delete(detachedInstance);
    }

    /**
     * Delete (mark as deleted) this instance
     * @return <code>true</code>, if everything went okay,
     *         <code>false</code> otherwise
     */
    public boolean delete() {
        return Anh49Abscheiderdetails.delete(this);
    }

    /**
     * Find an <code>Anh49Abscheiderdetails</code> instance by its primary key
     * @param id the primary key value
     * @return <code>Anh49Abscheiderdetails</code> the requested instance,
     *         if one exists,
     *         <code>null</code> otherwise
     */
    public static Anh49Abscheiderdetails findById(java.lang.Integer id) {
        log.debug("Getting Anh49Abscheiderdetails instance with id: " + id);
        return (Anh49Abscheiderdetails)
            new DatabaseAccess().get(Anh49Abscheiderdetails.class, id);
    }

    /**
     * Get a list of all <code>Anh49Abscheiderdetails</code>
     * @return <code>List&lt;Anh49Abscheiderdetails&gt;</code>
     *         all <code>Anh49Abscheiderdetails</code>
     */
    public static List<Anh49Abscheiderdetails> getAll() {
        return DatabaseQuery.getAll(new Anh49Abscheiderdetails());
    }

    /* Custom code goes below here! */

}
