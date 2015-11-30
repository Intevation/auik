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
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import de.bielefeld.umweltamt.aui.mappings.DatabaseAccess;
import de.bielefeld.umweltamt.aui.mappings.DatabaseQuery;

// Generated 22.10.2015 16:17:13 by Hibernate Tools 3.4.0.CR1

/**
 * EEinleitungsstelle generated by hbm2java
 */
public class EEinleitungsstelle implements java.io.Serializable {

	private EStandort standort;
	private Integer nr;
	private Boolean typIndirekteinleitungTog;
	private String bezeichnung;
	private Integer e32;
	private Integer n32;
	private Boolean kaNichtInNrwTog;
	private Date aktualDat;
	private Date erstellDat;
	private String herkunft;
	private Set<EWasserrecht> wasserrechts = new HashSet<EWasserrecht>(0);

	public EEinleitungsstelle() {
	}

	public EEinleitungsstelle(Integer nr) {
		this.nr = nr;
	}

	public EEinleitungsstelle(Integer nr, EStandort standort,
			Boolean typIndirekteinleitungTog, String bezeichnung, Integer e32,
			Integer n32, Boolean kaNichtInNrwTog, Date aktualDat,
			Date erstellDat, String herkunft, Set<EWasserrecht> wasserrechts) {
		this.standort = standort;
		this.nr = nr;
		this.typIndirekteinleitungTog = typIndirekteinleitungTog;
		this.bezeichnung = bezeichnung;
		this.e32 = e32;
		this.n32 = n32;
		this.kaNichtInNrwTog = kaNichtInNrwTog;
		this.aktualDat = aktualDat;
		this.erstellDat = erstellDat;
		this.herkunft = herkunft;
		this.setWasserrechts(wasserrechts);
	}

	public EStandort getStandort() {
		return this.standort;
	}

	public void setStandort(EStandort standort) {
		this.standort = standort;
	}

	public Integer getNr() {
		return this.nr;
	}

	public void setNr(Integer nr) {
		this.nr = nr;
	}

	public Boolean getTypIndirekteinleitungTog() {
		return this.typIndirekteinleitungTog;
	}

	public void setTypIndirekteinleitungTog(Boolean typIndirekteinleitungTog) {
		this.typIndirekteinleitungTog = typIndirekteinleitungTog;
	}

	public String getBezeichnung() {
		return this.bezeichnung;
	}

	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}

	public Integer getE32() {
		return this.e32;
	}

	public void setE32(Integer e32) {
		this.e32 = e32;
	}

	public Integer getN32() {
		return this.n32;
	}

	public void setN32(Integer n32) {
		this.n32 = n32;
	}

	public Boolean getKaNichtInNrwTog() {
		return this.kaNichtInNrwTog;
	}

	public void setKaNichtInNrwTog(Boolean kaNichtInNrwTog) {
		this.kaNichtInNrwTog = kaNichtInNrwTog;
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
     * Update this EEinleitungsstelle with its new values.<br>
     * This is meant to be used after merging!
     * @param copy AtlKlaeranlagen
     */
    private void copy(EEinleitungsstelle copy) {
    	this.bezeichnung = copy.getBezeichnung();
    	this.e32 = copy.getE32();
    	this.n32 = copy.getN32();
    	this.nr = copy.getNr();
    	this.standort = copy.getStandort();
    	this.typIndirekteinleitungTog = copy.getTypIndirekteinleitungTog();
    	this.aktualDat = copy.getAktualDat();
    	this.erstellDat = copy.getErstellDat();
    	this.kaNichtInNrwTog = copy.getKaNichtInNrwTog();
    	this.herkunft = copy.getHerkunft();
    	this.setWasserrechts(copy.getWasserrechts());
    }

    /**
     * Find an <code>EEinleitungsstelle</code> instance by its primary key
     * @param id the primary key value
     * @return <code>EEinleitungsstelle</code> the requested instance,
     *         if one exists,
     *         <code>null</code> otherwise
     */
    public static EEinleitungsstelle findById(java.lang.Integer id) {
        return (EEinleitungsstelle)
            new DatabaseAccess().get(EEinleitungsstelle.class, id);
    }

    /**
     * Get a list of all <code>EEinleitungsstelle</code>
     * @return <code>List&lt;EEinleitungsstelle&gt;</code>
     *         all <code>EEinleitungsstelle</code>
     */
    public static List<EEinleitungsstelle> getAll() {
        return DatabaseQuery.getAll(new EEinleitungsstelle());
    }

	public Set<EWasserrecht> getWasserrechts() {
		return wasserrechts;
	}

	public void setWasserrechts(Set<EWasserrecht> wasserrechts) {
		this.wasserrechts = wasserrechts;
	}


}
