/**
 * Copyright 2005-2011, Stadt Bielefeld
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
package de.bielefeld.umweltamt.aui.mappings.elka;

import java.util.Date;
import java.util.List;

import de.bielefeld.umweltamt.aui.mappings.DatabaseAccess;
import de.bielefeld.umweltamt.aui.mappings.DatabaseQuery;

// Generated 22.10.2015 16:17:13 by Hibernate Tools 3.4.0.CR1

/**
 * EAnfallstelle generated by hbm2java
 */
public class EAnfallstelle implements java.io.Serializable {

	private Integer nr;
	private EStandort standort;
	private EAdresse adresse;
	private String anhangId;
	private Integer abwaBeschaffOpt;
	private String bezeichnung;
	private String bemerkung;
	private Boolean aufzBetriebTog;
	private Date aktualDat;
	private Date erstellDat;
	private String herkunft;

	public EAnfallstelle() {
	}

	public EAnfallstelle(Integer nr) {
		this.nr = nr;
	}

	public EAnfallstelle(Integer nr, EStandort standort, EAdresse adresse,
			String anhangId, Integer abwaBeschaffOpt, String bezeichnung,
			String bemerkung, Boolean aufzBetriebTog, Date aktualDat,
			Date erstellDat, String herkunft) {
		this.nr = nr;
		this.standort = standort;
		this.adresse = adresse;
		this.anhangId = anhangId;
		this.abwaBeschaffOpt = abwaBeschaffOpt;
		this.bezeichnung = bezeichnung;
		this.bemerkung = bemerkung;
		this.aufzBetriebTog = aufzBetriebTog;
		this.aktualDat = aktualDat;
		this.erstellDat = erstellDat;
		this.herkunft = herkunft;
	}

	public Integer getNr() {
		return this.nr;
	}

	public void setNr(Integer nr) {
		this.nr = nr;
	}

	public EStandort getStandort() {
		return this.standort;
	}

	public void setStandort(EStandort standort) {
		this.standort = standort;
	}

	public EAdresse getAdresse() {
		return this.adresse;
	}

	public void setAdresse(EAdresse adresse) {
		this.adresse = adresse;
	}

	public String getAnhangId() {
		return this.anhangId;
	}

	public void setAnhangId(String anhangId) {
		this.anhangId = anhangId;
	}

	public Integer getAbwaBeschaffOpt() {
		return this.abwaBeschaffOpt;
	}

	public void setAbwaBeschaffOpt(Integer abwaBeschaffOpt) {
		this.abwaBeschaffOpt = abwaBeschaffOpt;
	}

	public String getBezeichnung() {
		return this.bezeichnung;
	}

	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}

	public String getBemerkung() {
		return this.bemerkung;
	}

	public void setBemerkung(String bemerkung) {
		this.bemerkung = bemerkung;
	}

	public Boolean getAufzBetriebTog() {
		return this.aufzBetriebTog;
	}

	public void setAufzBetriebTog(Boolean aufzBetriebTog) {
		this.aufzBetriebTog = aufzBetriebTog;
	}

	public Date getAktualDat() {
		return this.aktualDat;
	}

	public void setAktualDat(Date aktualDat) {
		this.aktualDat = aktualDat;
	}

	public Date getErstellDat() {
		return this.erstellDat;
	}

	public void setErstellDat(Date erstellDat) {
		this.erstellDat = erstellDat;
	}

	public String getHerkunft() {
		return this.herkunft;
	}

	public void setHerkunft(String herkunft) {
		this.herkunft = herkunft;
	}

    /**
     * Update this EAbwasserbehandlungsanlage with its new values.<br>
     * This is meant to be used after merging!
     * @param copy AtlKlaeranlagen
     */
    private void copy(EAnfallstelle copy) {
        this.bezeichnung = copy.getBezeichnung();
        this.standort = copy.getStandort();
        this.nr = copy.getNr();
        this.abwaBeschaffOpt = copy.getAbwaBeschaffOpt();
        this.adresse = copy.getAdresse();
        this.anhangId = copy.getAnhangId();
        this.bemerkung = copy.getBemerkung();
        this.aktualDat = copy.getAktualDat();
        this.aufzBetriebTog = copy.getAufzBetriebTog();
        this.erstellDat = copy.getErstellDat();
        this.herkunft = copy.getHerkunft();
    }

    /**
     * Find an <code>AtlKlaeranlagen</code> instance by its primary key
     * @param id the primary key value
     * @return <code>AtlKlaeranlagen</code> the requested instance,
     *         if one exists,
     *         <code>null</code> otherwise
     */
    public static EAnfallstelle findById(java.lang.Integer id) {
        return (EAnfallstelle)
            new DatabaseAccess().get(EAnfallstelle.class, id);
    }

    /**
     * Get a list of all <code>AtlKlaeranlagen</code>
     * @return <code>List&lt;AtlKlaeranlagen&gt;</code>
     *         all <code>AtlKlaeranlagen</code>
     */
    public static List<EAnfallstelle> getAll() {
        return DatabaseQuery.getAll(new EAnfallstelle());
    }
}
