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

package de.bielefeld.umweltamt.aui.mappings.tipi;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import de.bielefeld.umweltamt.aui.utils.AuikLogger;
import de.bielefeld.umweltamt.aui.utils.DatabaseAccess;
import de.nrw.lds.tipi.inka.Dea_Adresse;

/**
 * A class that represents a row in the DeaAdresse database table.<br>
 * This class is meant to serve as a model and should be copied into the
 * appropriate package and may be customized below the given mark.
 */
public class DeaAdresse  implements java.io.Serializable {

    /** Generated serialVersionUID for Serializable interface */
    private static final long serialVersionUID = 3184366511630120026L;
    /* Primary key, foreign keys (relations) and table columns */
    private Integer adresseNr;
    private Integer adresseVer;
    private Calendar gueltigVon;
    private Calendar gueltigBis;
    private Calendar aenderungsDatum;
    private Calendar erfassungsDatum;
    private Integer historienNr;
    private Boolean istAktuellJn;
    private String name1;
    private String name2;
    private String strasse;
    private String hausnr;
    private String plz;
    private String ort;
    private String staatskennung;
    private String telefon;
    private String telefonMobil;
    private String fax;
    private String email;

    /** Logging */
    private static final AuikLogger log = AuikLogger.getLogger();

    /** Default constructor */
    public DeaAdresse() {
        // This place is intentionally left blank.
    }

    /** Minimal constructor */
    public DeaAdresse(
        Integer adresseNr) {
        this.adresseNr = adresseNr;
    }

    /** Full constructor */
    public DeaAdresse(
        Integer adresseNr, Integer adresseVer, Calendar gueltigVon, Calendar gueltigBis, Calendar aenderungsDatum, Calendar erfassungsDatum, Integer historienNr, Boolean istAktuellJn, String name1, String name2, String strasse, String hausnr, String plz, String ort, String staatskennung, String telefon, String telefonMobil, String fax, String email) {
        this.adresseNr = adresseNr;
        this.adresseVer = adresseVer;
        this.gueltigVon = gueltigVon;
        this.gueltigBis = gueltigBis;
        this.aenderungsDatum = aenderungsDatum;
        this.erfassungsDatum = erfassungsDatum;
        this.historienNr = historienNr;
        this.istAktuellJn = istAktuellJn;
        this.name1 = name1;
        this.name2 = name2;
        this.strasse = strasse;
        this.hausnr = hausnr;
        this.plz = plz;
        this.ort = ort;
        this.staatskennung = staatskennung;
        this.telefon = telefon;
        this.telefonMobil = telefonMobil;
        this.fax = fax;
        this.email = email;
    }

    /* Setter and getter methods */
    public Integer getAdresseNr() {
        return this.adresseNr;
    }

    public void setAdresseNr(Integer adresseNr) {
        this.adresseNr = adresseNr;
    }

    public Integer getAdresseVer() {
        return this.adresseVer;
    }

    public void setAdresseVer(Integer adresseVer) {
        this.adresseVer = adresseVer;
    }

    public Calendar getGueltigVon() {
        return this.gueltigVon;
    }

    public void setGueltigVon(Calendar gueltigVon) {
        this.gueltigVon = gueltigVon;
    }

    public Calendar getGueltigBis() {
        return this.gueltigBis;
    }

    public void setGueltigBis(Calendar gueltigBis) {
        this.gueltigBis = gueltigBis;
    }

    public Calendar getAenderungsDatum() {
        return this.aenderungsDatum;
    }

    public void setAenderungsDatum(Calendar aenderungsDatum) {
        this.aenderungsDatum = aenderungsDatum;
    }

    public Calendar getErfassungsDatum() {
        return this.erfassungsDatum;
    }

    public void setErfassungsDatum(Calendar erfassungsDatum) {
        this.erfassungsDatum = erfassungsDatum;
    }

    public Integer getHistorienNr() {
        return this.historienNr;
    }

    public void setHistorienNr(Integer historienNr) {
        this.historienNr = historienNr;
    }

    public Boolean getIstAktuellJn() {
        return this.istAktuellJn;
    }

    public void setIstAktuellJn(Boolean istAktuellJn) {
        this.istAktuellJn = istAktuellJn;
    }

    public String getName1() {
        return this.name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public String getName2() {
        return this.name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public String getStrasse() {
        return this.strasse;
    }

    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    public String getHausnr() {
        return this.hausnr;
    }

    public void setHausnr(String hausnr) {
        this.hausnr = hausnr;
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

    public String getStaatskennung() {
        return this.staatskennung;
    }

    public void setStaatskennung(String staatskennung) {
        this.staatskennung = staatskennung;
    }

    public String getTelefon() {
        return this.telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getTelefonMobil() {
        return this.telefonMobil;
    }

    public void setTelefonMobil(String telefonMobil) {
        this.telefonMobil = telefonMobil;
    }

    public String getFax() {
        return this.fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Merge (save or update) a detached instance
     * @param detachedInstance the instance to merge
     * @return <code>DeaAdresse</code> the merged instance,
     *         if everything went okay,
     *         <code>null</code> otherwise
     */
    public static DeaAdresse merge(DeaAdresse detachedInstance) {
        log.debug("Merging DeaAdresse instance " + detachedInstance);
        return (DeaAdresse) new DatabaseAccess().merge(detachedInstance);
    }

    /**
     * Merge (save or update) this instance
     * @return <code>true</code>, if everything went okay,
     *         <code>false</code> otherwise
     */
    public boolean merge() {
        return DeaAdresse.merge(this).equals(this);
    }

    /**
     * Delete (mark as deleted) a detached instance
     * @param detachedInstance the instance to delete
     * @return <code>true</code>, if everything went okay,
     *         <code>false</code> otherwise
     */
    public static boolean delete(DeaAdresse detachedInstance) {
        log.debug("Deleting DeaAdresse instance " + detachedInstance);
        return new DatabaseAccess().delete(detachedInstance);
    }

    /**
     * Delete (mark as deleted) this instance
     * @return <code>true</code>, if everything went okay,
     *         <code>false</code> otherwise
     */
    public boolean delete() {
        return DeaAdresse.delete(this);
    }

    /**
     * Find an <code>DeaAdresse</code> instance by its primary key
     * @param id the primary key value
     * @return <code>DeaAdresse</code> the requested instance,
     *         if one exists,
     *         <code>null</code> otherwise
     */
    public static DeaAdresse findById(java.lang.Integer id) {
        log.debug("Getting DeaAdresse instance with id: " + id);
        return (DeaAdresse)
            new DatabaseAccess().get(DeaAdresse.class, id);
    }

    /**
     * Get a list of all <code>DeaAdresse</code>
     * @return <code>List&lt;DeaAdresse&gt;</code>
     *         all <code>DeaAdresse</code>
     */
    public static List<DeaAdresse> getAll() {
        log.debug("Getting all DeaAdresse instances");
        String query = "FROM DeaAdresse ORDER BY 1";
        List<?> objectList = new DatabaseAccess().createQuery(query).list();
        List<DeaAdresse> resultList = new ArrayList<DeaAdresse>();
        DeaAdresse result = null;
        for (Object object : objectList) {
            result = (DeaAdresse) object;
            resultList.add(result);
        }
        return resultList;
    }

    /* Custom code goes below here! */

    public Dea_Adresse toServiceType() {
        Dea_Adresse serviceInstance = new Dea_Adresse(
            this.getAenderungsDatum(),
            this.getErfassungsDatum(),
            this.getGueltigBis(),
            this.getGueltigVon(),
            this.getIstAktuellJn(),
//            this.getHistorienNr(),
            this.getAdresseNr(),
            this.getAdresseVer(),
            this.getEmail(),
            this.getFax(),
            this.getHausnr(),
            this.getName1(),
            this.getName2(),
            this.getOrt(),
            this.getPlz(),
            this.getStaatskennung(),
            this.getStrasse(),
            this.getTelefon(),
            this.getTelefonMobil());
        return serviceInstance;
    }
}
