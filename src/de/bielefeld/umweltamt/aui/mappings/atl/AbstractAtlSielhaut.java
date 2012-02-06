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

package de.bielefeld.umweltamt.aui.mappings.atl;

import java.io.Serializable;

/**
 * A class that represents a row in the ATL_SIELHAUT table. You can customize
 * the behavior of this class by editing the class, {@link AtlSielhaut}.
 */
public abstract class AbstractAtlSielhaut implements Serializable {
    private static final long serialVersionUID = -8533084088334040290L;

    /**
     * The cached hash code value for this instance. Setting to 0 triggers
     * re-calculation.
     */
    private int hashValue = 0;

    /** The composite primary key value. */
    private java.lang.Integer id;

    /** The value of the simple bezeichnung property. */
    private java.lang.String bezeichnung;

    /** The value of the simple haltungsnr property. */
    private java.lang.String haltungsnr;

    /** The value of the simple alarmplannr property. */
    private java.lang.String alarmplannr;

    /** The value of the simple entgeb property. */
    private java.lang.String entgeb;

    /** The value of the simple rechtswert property. */
    private java.lang.Double rechtswert;

    /** The value of the simple hochwert property. */
    private java.lang.Double hochwert;

    /** The value of the simple lage property. */
    private java.lang.String lage;

    /** The value of the simple bemerkungen property. */
    private java.lang.String bemerkungen;

    /** The value of the simple twabfluss property. */
    private java.lang.String twabfluss;

    /** The value of the simple bsb property. */
    private java.lang.String bsb;

    /** The value of the simple ew property. */
    private java.lang.String ew;

    /** The value of the simple gebiet property. */
    private java.lang.String gebiet;

    /** The value of the simple psielhaut property. */
    private java.lang.Boolean psielhaut;

    /** The value of the simple palarmplan property. */
    private java.lang.Boolean palarmplan;

    /** The value of the simple pnachprobe property. */
    private java.lang.Boolean pnachprobe;

    /** The value of the simple schlammprobe property. */
    private java.lang.Boolean schlammprobe;

    /** The value of the simple pnachprobe property. */
    private java.lang.Boolean pfirmenprobe;

    /**
     * Simple constructor of AbstractAtlSielhaut instances.
     */
    public AbstractAtlSielhaut() {
    }

    /**
     * Constructor of AbstractAtlSielhaut instances given a simple primary key.
     * @param id
     */
    public AbstractAtlSielhaut(java.lang.Integer id) {
        this.setId(id);
    }

    /**
     * Return the simple primary key value that identifies this object.
     * @return java.lang.Integer
     */
    public java.lang.Integer getId() {
        return id;
    }

    /**
     * Set the simple primary key value that identifies this object.
     * @param id
     */
    public void setId(java.lang.Integer id) {
        this.hashValue = 0;
        this.id = id;
    }

    /**
     * Return the value of the BEZEICHNUNG column.
     * @return java.lang.String
     */
    public java.lang.String getBezeichnung() {
        return this.bezeichnung;
    }

    /**
     * Set the value of the BEZEICHNUNG column.
     * @param bezeichnung
     */
    public void setBezeichnung(java.lang.String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    /**
     * Return the value of the HALTUNGSNR column.
     * @return java.lang.String
     */
    public java.lang.String getHaltungsnr() {
        return this.haltungsnr;
    }

    /**
     * Set the value of the HALTUNGSNR column.
     * @param haltungsnr
     */
    public void setHaltungsnr(java.lang.String haltungsnr) {
        this.haltungsnr = haltungsnr;
    }

    /**
     * Return the value of the ALARMPLANNR column.
     * @return java.lang.String
     */
    public java.lang.String getAlarmplannr() {
        return this.alarmplannr;
    }

    /**
     * Set the value of the ALARMPLANNR column.
     * @param alarmplannr
     */
    public void setAlarmplannr(java.lang.String alarmplannr) {
        this.alarmplannr = alarmplannr;
    }

    /**
     * Return the value of the ENTGEB column.
     * @return java.lang.String
     */
    public java.lang.String getEntgeb() {
        return this.entgeb;
    }

    /**
     * Set the value of the ENTGEB column.
     * @param entgeb
     */
    public void setEntgeb(java.lang.String entgeb) {
        this.entgeb = entgeb;
    }

    /**
     * Return the value of the RECHTSWERT column.
     * @return java.lang.Double
     */
    public java.lang.Double getRechtswert() {
        return this.rechtswert;
    }

    /**
     * Set the value of the RECHTSWERT column.
     * @param rechtswert
     */
    public void setRechtswert(java.lang.Double rechtswert) {
        this.rechtswert = rechtswert;
    }

    /**
     * Return the value of the HOCHWERT column.
     * @return java.lang.Double
     */
    public java.lang.Double getHochwert() {
        return this.hochwert;
    }

    /**
     * Set the value of the HOCHWERT column.
     * @param hochwert
     */
    public void setHochwert(java.lang.Double hochwert) {
        this.hochwert = hochwert;
    }

    /**
     * Return the value of the LAGE column.
     * @return java.lang.String
     */
    public java.lang.String getLage() {
        return this.lage;
    }

    /**
     * Set the value of the LAGE column.
     * @param lage
     */
    public void setLage(java.lang.String lage) {
        this.lage = lage;
    }

    /**
     * Return the value of the BEMERKUNGEN column.
     * @return java.lang.String
     */
    public java.lang.String getBemerkungen() {
        return this.bemerkungen;
    }

    /**
     * Set the value of the BEMERKUNGEN column.
     * @param bemerkungen
     */
    public void setBemerkungen(java.lang.String bemerkungen) {
        this.bemerkungen = bemerkungen;
    }

    /**
     * Return the value of the TWABFLUSS column.
     * @return java.lang.String
     */
    public java.lang.String getTwabfluss() {
        return this.twabfluss;
    }

    /**
     * Set the value of the TWABFLUSS column.
     * @param twabfluss
     */
    public void setTwabfluss(java.lang.String twabfluss) {
        this.twabfluss = twabfluss;
    }

    /**
     * Return the value of the BSB column.
     * @return java.lang.String
     */
    public java.lang.String getBsb() {
        return this.bsb;
    }

    /**
     * Set the value of the BSB column.
     * @param bsb
     */
    public void setBsb(java.lang.String bsb) {
        this.bsb = bsb;
    }

    /**
     * Return the value of the EW column.
     * @return java.lang.String
     */
    public java.lang.String getEw() {
        return this.ew;
    }

    /**
     * Set the value of the EW column.
     * @param ew
     */
    public void setEw(java.lang.String ew) {
        this.ew = ew;
    }

    /**
     * Return the value of the GEBIET column.
     * @return java.lang.String
     */
    public java.lang.String getGebiet() {
        return this.gebiet;
    }

    /**
     * Set the value of the GEBIET column.
     * @param gebiet
     */
    public void setGebiet(java.lang.String gebiet) {
        this.gebiet = gebiet;
    }

    /**
     * Return the value of the P_SIELHAUT column.
     * @return java.lang.Boolean
     */
    public java.lang.Boolean getPsielhaut() {
        return this.psielhaut;
    }

    /**
     * Set the value of the P_SIELHAUT column.
     * @param psielhaut
     */
    public void setPsielhaut(java.lang.Boolean psielhaut) {
        this.psielhaut = psielhaut;
    }

    /**
     * Return the value of the P_ALARMPLAN column.
     * @return java.lang.Boolean
     */
    public java.lang.Boolean getPalarmplan() {
        return this.palarmplan;
    }

    /**
     * Set the value of the P_ALARMPLAN column.
     * @param palarmplan
     */
    public void setPalarmplan(java.lang.Boolean palarmplan) {
        this.palarmplan = palarmplan;
    }

    /**
     * Return the value of the P_NACHPROBE column.
     * @return java.lang.Boolean
     */
    public java.lang.Boolean getPnachprobe() {
        return this.pnachprobe;
    }

    /**
     * Set the value of the P_NACHPROBE column.
     * @param pnachprobe
     */
    public void setPnachprobe(java.lang.Boolean pnachprobe) {
        this.pnachprobe = pnachprobe;
    }

    /**
     * Return the value of the SCHLAMMPROBE column.
     * @return java.lang.Boolean
     */
    public java.lang.Boolean getSchlammprobe() {
        return this.schlammprobe;
    }

    /**
     * Set the value of the SCHLAMMPROBE column.
     * @param schlammprobe
     */
    public void setSchlammprobe(java.lang.Boolean schlammprobe) {
        this.schlammprobe = schlammprobe;
    }

    /**
     * Return the value of the P_FIRMENPROBE column.
     * @return java.lang.Boolean
     */
    public java.lang.Boolean getPfirmenprobe() {
        return this.pfirmenprobe;
    }

    /**
     * Set the value of the P_FIRMENPROBE column.
     * @param pnachprobe
     */
    public void setPfirmenprobe(java.lang.Boolean pfirmenprobe) {
        this.pfirmenprobe = pfirmenprobe;
    }

    /**
     * Implementation of the equals comparison on the basis of equality of the
     * primary key values.
     * @param rhs
     * @return boolean
     */
    @Override
    public boolean equals(Object rhs) {
        if (rhs == null)
            return false;
        if (!(rhs instanceof AtlSielhaut))
            return false;
        AtlSielhaut that = (AtlSielhaut) rhs;
        if (this.getId() != null && that.getId() != null) {
            if (!this.getId().equals(that.getId())) {
                return false;
            }
        }
        return true;
    }

    /**
     * Implementation of the hashCode method conforming to the Bloch pattern
     * with the exception of array properties (these are very unlikely primary
     * key types).
     * @return int
     */
    @Override
    public int hashCode() {
        if (this.hashValue == 0) {
            int result = 17;
            int idValue = this.getId() == null ? 0 : this.getId().hashCode();
            result = result * 37 + idValue;
            this.hashValue = result;
        }
        return this.hashValue;
    }
}
