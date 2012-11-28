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
import java.util.Set;

import de.bielefeld.umweltamt.aui.mappings.DatabaseTableWithCollection;
import de.bielefeld.umweltamt.aui.mappings.basis.BasisSachbearbeiter;

/**
 * A class that represents a row in the ATL_PROBENAHMEN table. You can customize
 * the behavior of this class by editing the class, {@link AtlProbenahmen}.
 */
public abstract class AbstractAtlProbenahmen implements Serializable,
    DatabaseTableWithCollection {
    private static final long serialVersionUID = -8219312709181534758L;

    /**
     * The cached hash code value for this instance. Setting to 0 triggers
     * re-calculation.
     */
    private int hashValue = 0;

    /** The composite primary key value. */
    private java.lang.Integer id;

    /** The value of the simple kennummer property. */
    private java.lang.String kennummer;

    /** The value of the atlProbepkt association. */
    private AtlProbepkt atlProbepkt;

    /** The value of the atlStatus association. */
    private AtlStatus atlStatus;

    /** The value of the atlStatus association. */
    private BasisSachbearbeiter basisSachbearbeiter;

    /** The value of the atlAnalysepositionen association. */
    private Set<AtlAnalyseposition> atlAnalysepositionen;

    /** The value of the simple id property. */
    private java.lang.Integer objektid;

    /** The value of the simple art property. */
    private java.lang.String art;

    /** The value of the simple datumDerEntnahme property. */
    private java.sql.Timestamp datumDerEntnahme;

    /** The value of the simple datumDerEntnahme property. */
    private java.util.Date zeitAnfang;

    /** The value of the simple bisDatum property. */
    private java.util.Date bisDatum;

    /** The value of the simple zeitDerEntnahmen property. */
    private java.lang.String zeitDerEntnahmen;

    /** The value of the simple einwaage property. */
    private java.lang.Float einwaage;

    /** The value of the simple vm3 property. */
    private java.lang.String vm3;

    /** The value of the simple fahrer property. */
    private java.lang.String fahrer;

    /** The value of the simple objektNr property. */
    private java.lang.String objektNr;

    /** The value of the simple datumIcp property. */
    private java.util.Date datumIcp;

    /** The value of the simple sonderparameter property. */
    private java.lang.String sonderparameter;

    /** The value of the simple bemerkung property. */
    private java.lang.String bemerkung;

    /** The value of the simple an360x11 property. */
    private java.util.Date an360x11;

    /** The value of the simple ueberschreitung property. */
    private java.lang.String ueberschreitung;

    /** The value of the simple anzahlbeteiligte property. */
    private java.lang.Integer anzahlbeteiligte;

    /** The value of the simple uhrzeitbeginn property. */
    private java.lang.String uhrzeitbeginn;

    /** The value of the simple uhrzeitende property. */
    private java.lang.String uhrzeitende;

    /** The value of the simple fahrtzeit property. */
    private java.lang.String fahrtzeit;

    /** The value of the simple bescheid property. */
    private java.util.Date bescheid;

    /** The value of the simple kosten property. */
    private java.lang.Double kosten;

    /** The value of the simple status property. */
    private java.lang.String status;

    /** The value of the simple sachbearbeiter property. */
    private java.lang.String sachbearbeiter;

    /** The value of the simple massnahmen property. */
    private java.lang.String massnahmen;

    /** The value of the simple bezeichnung property. */
    private java.lang.String bezeichnung;

    /**
     * The value of the simple _enabled property.<br>
     * If a data record is _enabled, it can come up in the views, but will be
     * marked as being not active.
     */
    private java.lang.Boolean enabled = true;

    /**
     * The value of the simple _deleted property.<br>
     * If a data record is _deleted, it will not show up anywhere but in the
     * database itself.
     */
    private java.lang.Boolean deleted = false;

    /**
     * Simple constructor of AbstractAtlProbenahmen instances.
     */
    public AbstractAtlProbenahmen() {
    }

    /**
     * Constructor of AbstractAtlProbenahmen instances given a simple primary
     * key.
     * @param id
     */
    public AbstractAtlProbenahmen(java.lang.Integer id) {
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
     * Return the value of the ID column.
     * @return java.lang.Integer
     */
    public java.lang.Integer getObjektid() {
        return this.objektid;
    }

    /**
     * Set the value of the ID column.
     * @param id
     */
    public void setObjektid(java.lang.Integer objektid) {
        this.objektid = objektid;
    }

    /**
     * Return the value of the PROBEPKT_ID column.
     * @return AtlProbepkt
     */
    public AtlProbepkt getAtlProbepkt() {
        return this.atlProbepkt;
    }

    /**
     * Set the value of the PROBEPKT_ID column.
     * @param atlProbepkt
     */
    public void setAtlProbepkt(AtlProbepkt atlProbepkt) {
        this.atlProbepkt = atlProbepkt;
    }

    /**
     * Return the value of the AtlStatus column.
     * @return AtlProbepkt
     */
    public BasisSachbearbeiter getBasisSachbearbeiter() {
        return this.basisSachbearbeiter;
    }

    /**
     * Set the value of the AtlStatus column.
     * @param atlProbepkt
     */
    public void setBasisSachbearbeiter(BasisSachbearbeiter basisSachbearbeiter) {
        this.basisSachbearbeiter = basisSachbearbeiter;
    }

    /**
     * Return the value of the AtlStatus column.
     * @return AtlProbepkt
     */
    public AtlStatus getAtlStatus() {
        return this.atlStatus;
    }

    /**
     * Set the value of the AtlStatus column.
     * @param atlProbepkt
     */
    public void setAtlStatus(AtlStatus atlStatus) {
        this.atlStatus = atlStatus;
    }

    /**
     * Return the AtlAnalysepositionen
     * @return Set
     */
    public Set<AtlAnalyseposition> getAtlAnalysepositionen() {
        return atlAnalysepositionen;
    }

    /**
     * Set the AtlAnalysepositionen
     * @param atlAnalysepositionen
     */
    public void setAtlAnalysepositionen(
        Set<AtlAnalyseposition> atlAnalysepositionen) {
        this.atlAnalysepositionen = atlAnalysepositionen;
    }

    /**
     * Return the simple primary key value that identifies this object.
     * @return java.lang.String
     */
    public java.lang.String getKennummer() {
        return kennummer;
    }

    /**
     * Set the simple primary key value that identifies this object.
     * @param kennummer
     */
    public void setKennummer(java.lang.String kennummer) {
        this.hashValue = 0;
        this.kennummer = kennummer;
    }

    /**
     * Return the value of the ART column.
     * @return java.lang.String
     */
    public java.lang.String getArt() {
        return this.art;
    }

    /**
     * Set the value of the ART column.
     * @param art
     */
    public void setArt(java.lang.String art) {
        this.art = art;
    }

    /**
     * Return the value of the DATUM_DER_ENTNAHME column.
     * @return java.util.Date
     */
    public java.util.Date getDatumDerEntnahme() {
        return this.datumDerEntnahme;
    }

    /**
     * Set the value of the DATUM_DER_ENTNAHME column.
     * @param datumDerEntnahme
     */
    public void setDatumDerEntnahme(java.sql.Timestamp datumDerEntnahme) {
        this.datumDerEntnahme = datumDerEntnahme;
    }

    /**
     * Return the value of the DATUM_DER_ENTNAHME column.
     * @return java.util.Date
     */
    public java.util.Date getZeitAnfang() {
        return this.zeitAnfang;
    }

    /**
     * Set the value of the DATUM_DER_ENTNAHME column.
     * @param zeitAnfang
     */
    public void setZeitAnfang(java.util.Date zeitAnfang) {
        this.zeitAnfang = zeitAnfang;
    }

    /**
     * Return the value of the BIS_DATUM column.
     * @return java.util.Date
     */
    public java.util.Date getBisDatum() {
        return this.bisDatum;
    }

    /**
     * Set the value of the BIS_DATUM column.
     * @param bisDatum
     */
    public void setBisDatum(java.util.Date bisDatum) {
        this.bisDatum = bisDatum;
    }

    /**
     * Return the value of the ZEIT_DER_ENTNAHMEN column.
     * @return java.lang.String
     */
    public java.lang.String getZeitDerEntnahmen() {
        return this.zeitDerEntnahmen;
    }

    /**
     * Set the value of the ZEIT_DER_ENTNAHMEN column.
     * @param zeitDerEntnahmen
     */
    public void setZeitDerEntnahmen(java.lang.String zeitDerEntnahmen) {
        this.zeitDerEntnahmen = zeitDerEntnahmen;
    }

    /**
     * Return the value of the EINWAAGE column.
     * @return java.lang.Float
     */
    public java.lang.Float getEinwaage() {
        return this.einwaage;
    }

    /**
     * Set the value of the EINWAAGE column.
     * @param einwaage
     */
    public void setEinwaage(java.lang.Float einwaage) {
        this.einwaage = einwaage;
    }

    /**
     * Return the value of the V_M3 column.
     * @return java.lang.String
     */
    public java.lang.String getVm3() {
        return this.vm3;
    }

    /**
     * Set the value of the V_M3 column.
     * @param vm3
     */
    public void setVm3(java.lang.String vm3) {
        this.vm3 = vm3;
    }

    /**
     * Return the value of the FAHRER column.
     * @return java.lang.String
     */
    public java.lang.String getFahrer() {
        return this.fahrer;
    }

    /**
     * Set the value of the FAHRER column.
     * @param fahrer
     */
    public void setFahrer(java.lang.String fahrer) {
        this.fahrer = fahrer;
    }

    /**
     * Return the value of the OBJEKT_NR column.
     * @return java.lang.String
     */
    public java.lang.String getObjektNr() {
        return this.objektNr;
    }

    /**
     * Set the value of the OBJEKT_NR column.
     * @param objektNr
     */
    public void setObjektNr(java.lang.String objektNr) {
        this.objektNr = objektNr;
    }

    /**
     * Return the value of the DATUM_ICP column.
     * @return java.util.Date
     */
    public java.util.Date getDatumIcp() {
        return this.datumIcp;
    }

    /**
     * Set the value of the DATUM_ICP column.
     * @param datumIcp
     */
    public void setDatumIcp(java.util.Date datumIcp) {
        this.datumIcp = datumIcp;
    }

    /**
     * Return the value of the SONDERPARAMETER column.
     * @return java.lang.String
     */
    public java.lang.String getSonderparameter() {
        return this.sonderparameter;
    }

    /**
     * Set the value of the SONDERPARAMETER column.
     * @param sonderparameter
     */
    public void setSonderparameter(java.lang.String sonderparameter) {
        this.sonderparameter = sonderparameter;
    }

    /**
     * Return the value of the BEMERKUNG column.
     * @return java.lang.String
     */
    public java.lang.String getBemerkung() {
        return this.bemerkung;
    }

    /**
     * Set the value of the BEMERKUNG column.
     * @param bemerkung
     */
    public void setBemerkung(java.lang.String bemerkung) {
        this.bemerkung = bemerkung;
    }

    /**
     * Return the value of the AN_360X11 column.
     * @return java.util.Date
     */
    public java.util.Date getAn360x11() {
        return this.an360x11;
    }

    /**
     * Set the value of the AN_360X11 column.
     * @param an360x11
     */
    public void setAn360x11(java.util.Date an360x11) {
        this.an360x11 = an360x11;
    }

    /**
     * Return the value of the UEBERSCHREITUNG column.
     * @return java.lang.String
     */
    public java.lang.String getUeberschreitung() {
        return this.ueberschreitung;
    }

    /**
     * Set the value of the UEBERSCHREITUNG column.
     * @param ueberschreitung
     */
    public void setUeberschreitung(java.lang.String ueberschreitung) {
        this.ueberschreitung = ueberschreitung;
    }

    /**
     * Return the value of the anzahlbeteiligte column.
     * @return java.lang.String
     */
    public java.lang.Integer getAnzahlbeteiligte() {
        return this.anzahlbeteiligte;
    }

    /**
     * Set the value of the UEBERSCHREITUNG column.
     * @param ueberschreitung
     */
    public void setAnzahlbeteiligte(java.lang.Integer anzahlbeteiligte) {
        this.anzahlbeteiligte = anzahlbeteiligte;
    }

    /**
     * Return the value of the uhrzeitbeginn column.
     * @return java.lang.String
     */
    public java.lang.String getUhrzeitbeginn() {
        return this.uhrzeitbeginn;
    }

    /**
     * Set the value of the uhrzeitbeginn column.
     * @param uhrzeitbeginn
     */
    public void setUhrzeitbeginn(java.lang.String uhrzeitbeginn) {
        this.uhrzeitbeginn = uhrzeitbeginn;
    }

    /**
     * Return the value of the uhrzeitende column.
     * @return java.lang.String
     */
    public java.lang.String getUhrzeitende() {
        return this.uhrzeitende;
    }

    /**
     * Set the value of the uhrzeitende column.
     * @param uhrzeitende
     */
    public void setUhrzeitende(java.lang.String uhrzeitende) {
        this.uhrzeitende = uhrzeitende;
    }

    /**
     * Return the value of the fahrtzeit column.
     * @return java.lang.String
     */
    public java.lang.String getFahrtzeit() {
        return this.fahrtzeit;
    }

    /**
     * Set the value of the fahrtzeit column.
     * @param fahrtzeit
     */
    public void setFahrtzeit(java.lang.String fahrtzeit) {
        this.fahrtzeit = fahrtzeit;
    }

    /**
     * Return the value of the BESCHEID column.
     * @return java.util.Date
     */
    public java.util.Date getBescheid() {
        return this.bescheid;
    }

    /**
     * Set the value of the BESCHEID column.
     * @param bescheid
     */
    public void setBescheid(java.util.Date bescheid) {
        this.bescheid = bescheid;
    }

    /**
     * Return the value of the KOSTEN column.
     * @return java.lang.Double
     */
    public java.lang.Double getKosten() {
        return this.kosten;
    }

    /**
     * Set the value of the KOSTEN column.
     * @param kosten
     */
    public void setKosten(java.lang.Double kosten) {
        this.kosten = kosten;
    }

    /**
     * Return the value of the Status column.
     * @return java.lang.String
     */
    public java.lang.String getStatus() {
        return this.status;
    }

    /**
     * Set the value of the Status column.
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }

    /**
     * Return the value of the Sachbearbeiter column.
     * @return java.lang.String
     */
    public java.lang.String getSachbearbeiter() {
        return this.sachbearbeiter;
    }

    /**
     * Set the value of the Sachbearbeiter column.
     * @param sachbearbeiter
     */
    public void setSachbearbeiter(java.lang.String sachbearbeiter) {
        this.sachbearbeiter = sachbearbeiter;
    }

    /**
     * Return the value of the MASSNAHMEN column.
     * @return java.lang.String
     */
    public java.lang.String getMassnahmen() {
        return this.massnahmen;
    }

    /**
     * Set the value of the MASSNAHMEN column.
     * @param massnahmen
     */
    public void setMassnahmen(java.lang.String massnahmen) {
        this.massnahmen = massnahmen;
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
     * Return the value of the _ENABLED column.
     * @return java.lang.Boolean
     */
    public java.lang.Boolean isEnabled() {
        return enabled;
    }

    /**
     * Set the value of the _ENABLED column.
     * @param _enabled the _enabled to set
     */
    public void setEnabled(boolean _enabled) {
        this.enabled = _enabled;
    }

    /**
     * Return the value of the _DELETED column.
     * @return java.lang.Boolean
     */
    public java.lang.Boolean isDeleted() {
        return deleted;
    }

    /**
     * Set the value of the _DELETED column.
     * @param _deleted the _deleted to set
     */
    public void setDeleted(boolean _deleted) {
        this.deleted = _deleted;
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
        if (!(rhs instanceof AtlProbenahmen))
            return false;
        AtlProbenahmen that = (AtlProbenahmen) rhs;
        if (this.getKennummer() != null && that.getKennummer() != null) {
            if (!this.getKennummer().equals(that.getKennummer())) {
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
            int kennummerValue = this.getKennummer() == null ? 0 : this
                    .getKennummer().hashCode();
            result = result * 37 + kennummerValue;
            this.hashValue = result;
        }
        return this.hashValue;
    }
}
