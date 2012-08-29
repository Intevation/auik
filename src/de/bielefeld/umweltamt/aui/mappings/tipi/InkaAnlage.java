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
import de.nrw.lds.tipi.inka.Inka_Anlage;

/**
 * A class that represents a row in the InkaAnlage database table.<br>
 * This class is meant to serve as a model and should be copied into the
 * appropriate package and may be customized below the given mark.
 */
public class InkaAnlage  implements java.io.Serializable {

    /** Generated serialVersionUID for Serializable interface */
    private static final long serialVersionUID = 3472042834605284957L;
    /* Primary key, foreign keys (relations) and table columns */
    private Integer anlageNr;
    private Integer anlageVer;
    private Calendar gueltigVon;
    private Calendar gueltigBis;
    private Calendar aenderungsDatum;
    private Calendar erfassungsDatum;
    private Integer historienNr;
    private Boolean istAktuellJn;
    private Integer betriebseinrichtungNr;
    private Integer betriebseinrichtungVer;
    private String gemeindekennzahl;
    private Integer gemeindeVer;
    private Integer uebergabestelleLfdNr;
    private Integer uebergabestelleVer;
    private Integer genehmigungNr;
    private Integer genehmigungVer;
    private Integer stuaBezirk;
    private Integer stuaVer;
    private String behoerdenId;
    private Integer behoerdenVer;
    private String wasBehoerdenId;
    private Integer wasBehoerdenVer;
    private Integer adresseAnsprNr;
    private Integer adresseAnsprVer;
    private Boolean genPflichtigJn;
    private Integer genArt;
    private Boolean anlBauaufsZulJn;
    private Boolean anlDinDeJn;
    private Boolean anlOhneZulJn;
    private Boolean anlBaurechtPrJn;
    private Boolean anlEinzelabnJn;
    private Calendar datGenehmigung;
    private Boolean befristungJn;
    private Calendar befristungBis;
    private String aktenzeichen;
    private Calendar datInbetrieb;
    private Boolean schlammfangJn;
    private Boolean abscheiderJn;
    private Boolean neutralisationJn;
    private Boolean flockungJn;
    private Boolean flotationJn;
    private Boolean emulsionsspaltJn;
    private Boolean absorptionJn;
    private Boolean sonstAbscheiderJn;
    private Boolean ionenaustauschJn;
    private Boolean strippAnlageJn;
    private Boolean extraktionJn;
    private Boolean filtrationJn;
    private Boolean membranfiltrationJn;
    private Boolean siebRechenJn;
    private Boolean ausgleichsbeckenJn;
    private Boolean vorklaerungAbsetzJn;
    private String sonstigeMechVerf;
    private Boolean anaerobeVorbJn;
    private Boolean tropfkoerperJn;
    private Boolean belCEliJn;
    private Boolean belNEliJn;
    private Boolean biologPEliJn;
    private Boolean nachklaerungJn;
    private String sonstigeBiolVerf;
    private Boolean abfuhrUnbehJn;
    private Boolean maschEntwJn;
    private Boolean statEntwJn;
    private Boolean vakuumfilterJn;
    private Boolean kammerfilterpJn;
    private Boolean siebbandpJn;
    private Boolean zentrifugeJn;
    private Boolean natEntwJn;
    private String sonstigeSchlammBeh;

    /** Logging */
    private static final AuikLogger log = AuikLogger.getLogger();

    /** Default constructor */
    public InkaAnlage() {
        // This place is intentionally left blank.
    }

    /** Minimal constructor */
    public InkaAnlage(
        Integer anlageNr) {
        this.anlageNr = anlageNr;
    }

    /** Full constructor */
    public InkaAnlage(
        Integer anlageNr, Integer anlageVer, Calendar gueltigVon, Calendar gueltigBis, Calendar aenderungsDatum, Calendar erfassungsDatum, Integer historienNr, Boolean istAktuellJn, Integer betriebseinrichtungNr, Integer betriebseinrichtungVer, String gemeindekennzahl, Integer gemeindeVer, Integer uebergabestelleLfdNr, Integer uebergabestelleVer, Integer genehmigungNr, Integer genehmigungVer, Integer stuaBezirk, Integer stuaVer, String behoerdenId, Integer behoerdenVer, String wasBehoerdenId, Integer wasBehoerdenVer, Integer adresseAnsprNr, Integer adresseAnsprVer, Boolean genPflichtigJn, Integer genArt, Boolean anlBauaufsZulJn, Boolean anlDinDeJn, Boolean anlOhneZulJn, Boolean anlBaurechtPrJn, Boolean anlEinzelabnJn, Calendar datGenehmigung, Boolean befristungJn, Calendar befristungBis, String aktenzeichen, Calendar datInbetrieb, Boolean schlammfangJn, Boolean abscheiderJn, Boolean neutralisationJn, Boolean flockungJn, Boolean flotationJn, Boolean emulsionsspaltJn, Boolean absorptionJn, Boolean sonstAbscheiderJn, Boolean ionenaustauschJn, Boolean strippAnlageJn, Boolean extraktionJn, Boolean filtrationJn, Boolean membranfiltrationJn, Boolean siebRechenJn, Boolean ausgleichsbeckenJn, Boolean vorklaerungAbsetzJn, String sonstigeMechVerf, Boolean anaerobeVorbJn, Boolean tropfkoerperJn, Boolean belCEliJn, Boolean belNEliJn, Boolean biologPEliJn, Boolean nachklaerungJn, String sonstigeBiolVerf, Boolean abfuhrUnbehJn, Boolean maschEntwJn, Boolean statEntwJn, Boolean vakuumfilterJn, Boolean kammerfilterpJn, Boolean siebbandpJn, Boolean zentrifugeJn, Boolean natEntwJn, String sonstigeSchlammBeh) {
        this.anlageNr = anlageNr;
        this.anlageVer = anlageVer;
        this.gueltigVon = gueltigVon;
        this.gueltigBis = gueltigBis;
        this.aenderungsDatum = aenderungsDatum;
        this.erfassungsDatum = erfassungsDatum;
        this.historienNr = historienNr;
        this.istAktuellJn = istAktuellJn;
        this.betriebseinrichtungNr = betriebseinrichtungNr;
        this.betriebseinrichtungVer = betriebseinrichtungVer;
        this.gemeindekennzahl = gemeindekennzahl;
        this.gemeindeVer = gemeindeVer;
        this.uebergabestelleLfdNr = uebergabestelleLfdNr;
        this.uebergabestelleVer = uebergabestelleVer;
        this.genehmigungNr = genehmigungNr;
        this.genehmigungVer = genehmigungVer;
        this.stuaBezirk = stuaBezirk;
        this.stuaVer = stuaVer;
        this.behoerdenId = behoerdenId;
        this.behoerdenVer = behoerdenVer;
        this.wasBehoerdenId = wasBehoerdenId;
        this.wasBehoerdenVer = wasBehoerdenVer;
        this.adresseAnsprNr = adresseAnsprNr;
        this.adresseAnsprVer = adresseAnsprVer;
        this.genPflichtigJn = genPflichtigJn;
        this.genArt = genArt;
        this.anlBauaufsZulJn = anlBauaufsZulJn;
        this.anlDinDeJn = anlDinDeJn;
        this.anlOhneZulJn = anlOhneZulJn;
        this.anlBaurechtPrJn = anlBaurechtPrJn;
        this.anlEinzelabnJn = anlEinzelabnJn;
        this.datGenehmigung = datGenehmigung;
        this.befristungJn = befristungJn;
        this.befristungBis = befristungBis;
        this.aktenzeichen = aktenzeichen;
        this.datInbetrieb = datInbetrieb;
        this.schlammfangJn = schlammfangJn;
        this.abscheiderJn = abscheiderJn;
        this.neutralisationJn = neutralisationJn;
        this.flockungJn = flockungJn;
        this.flotationJn = flotationJn;
        this.emulsionsspaltJn = emulsionsspaltJn;
        this.absorptionJn = absorptionJn;
        this.sonstAbscheiderJn = sonstAbscheiderJn;
        this.ionenaustauschJn = ionenaustauschJn;
        this.strippAnlageJn = strippAnlageJn;
        this.extraktionJn = extraktionJn;
        this.filtrationJn = filtrationJn;
        this.membranfiltrationJn = membranfiltrationJn;
        this.siebRechenJn = siebRechenJn;
        this.ausgleichsbeckenJn = ausgleichsbeckenJn;
        this.vorklaerungAbsetzJn = vorklaerungAbsetzJn;
        this.sonstigeMechVerf = sonstigeMechVerf;
        this.anaerobeVorbJn = anaerobeVorbJn;
        this.tropfkoerperJn = tropfkoerperJn;
        this.belCEliJn = belCEliJn;
        this.belNEliJn = belNEliJn;
        this.biologPEliJn = biologPEliJn;
        this.nachklaerungJn = nachklaerungJn;
        this.sonstigeBiolVerf = sonstigeBiolVerf;
        this.abfuhrUnbehJn = abfuhrUnbehJn;
        this.maschEntwJn = maschEntwJn;
        this.statEntwJn = statEntwJn;
        this.vakuumfilterJn = vakuumfilterJn;
        this.kammerfilterpJn = kammerfilterpJn;
        this.siebbandpJn = siebbandpJn;
        this.zentrifugeJn = zentrifugeJn;
        this.natEntwJn = natEntwJn;
        this.sonstigeSchlammBeh = sonstigeSchlammBeh;
    }

    /* Setter and getter methods */
    public Integer getAnlageNr() {
        return this.anlageNr;
    }

    public void setAnlageNr(Integer anlageNr) {
        this.anlageNr = anlageNr;
    }

    public Integer getAnlageVer() {
        return this.anlageVer;
    }

    public void setAnlageVer(Integer anlageVer) {
        this.anlageVer = anlageVer;
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

    public Integer getBetriebseinrichtungNr() {
        return this.betriebseinrichtungNr;
    }

    public void setBetriebseinrichtungNr(Integer betriebseinrichtungNr) {
        this.betriebseinrichtungNr = betriebseinrichtungNr;
    }

    public Integer getBetriebseinrichtungVer() {
        return this.betriebseinrichtungVer;
    }

    public void setBetriebseinrichtungVer(Integer betriebseinrichtungVer) {
        this.betriebseinrichtungVer = betriebseinrichtungVer;
    }

    public String getGemeindekennzahl() {
        return this.gemeindekennzahl;
    }

    public void setGemeindekennzahl(String gemeindekennzahl) {
        this.gemeindekennzahl = gemeindekennzahl;
    }

    public Integer getGemeindeVer() {
        return this.gemeindeVer;
    }

    public void setGemeindeVer(Integer gemeindeVer) {
        this.gemeindeVer = gemeindeVer;
    }

    public Integer getUebergabestelleLfdNr() {
        return this.uebergabestelleLfdNr;
    }

    public void setUebergabestelleLfdNr(Integer uebergabestelleLfdNr) {
        this.uebergabestelleLfdNr = uebergabestelleLfdNr;
    }

    public Integer getUebergabestelleVer() {
        return this.uebergabestelleVer;
    }

    public void setUebergabestelleVer(Integer uebergabestelleVer) {
        this.uebergabestelleVer = uebergabestelleVer;
    }

    public Integer getGenehmigungNr() {
        return this.genehmigungNr;
    }

    public void setGenehmigungNr(Integer genehmigungNr) {
        this.genehmigungNr = genehmigungNr;
    }

    public Integer getGenehmigungVer() {
        return this.genehmigungVer;
    }

    public void setGenehmigungVer(Integer genehmigungVer) {
        this.genehmigungVer = genehmigungVer;
    }

    public Integer getStuaBezirk() {
        return this.stuaBezirk;
    }

    public void setStuaBezirk(Integer stuaBezirk) {
        this.stuaBezirk = stuaBezirk;
    }

    public Integer getStuaVer() {
        return this.stuaVer;
    }

    public void setStuaVer(Integer stuaVer) {
        this.stuaVer = stuaVer;
    }

    public String getBehoerdenId() {
        return this.behoerdenId;
    }

    public void setBehoerdenId(String behoerdenId) {
        this.behoerdenId = behoerdenId;
    }

    public Integer getBehoerdenVer() {
        return this.behoerdenVer;
    }

    public void setBehoerdenVer(Integer behoerdenVer) {
        this.behoerdenVer = behoerdenVer;
    }

    public String getWasBehoerdenId() {
        return this.wasBehoerdenId;
    }

    public void setWasBehoerdenId(String wasBehoerdenId) {
        this.wasBehoerdenId = wasBehoerdenId;
    }

    public Integer getWasBehoerdenVer() {
        return this.wasBehoerdenVer;
    }

    public void setWasBehoerdenVer(Integer wasBehoerdenVer) {
        this.wasBehoerdenVer = wasBehoerdenVer;
    }

    public Integer getAdresseAnsprNr() {
        return this.adresseAnsprNr;
    }

    public void setAdresseAnsprNr(Integer adresseAnsprNr) {
        this.adresseAnsprNr = adresseAnsprNr;
    }

    public Integer getAdresseAnsprVer() {
        return this.adresseAnsprVer;
    }

    public void setAdresseAnsprVer(Integer adresseAnsprVer) {
        this.adresseAnsprVer = adresseAnsprVer;
    }

    public Boolean getGenPflichtigJn() {
        return this.genPflichtigJn;
    }

    public void setGenPflichtigJn(Boolean genPflichtigJn) {
        this.genPflichtigJn = genPflichtigJn;
    }

    public Integer getGenArt() {
        return this.genArt;
    }

    public void setGenArt(Integer genArt) {
        this.genArt = genArt;
    }

    public Boolean getAnlBauaufsZulJn() {
        return this.anlBauaufsZulJn;
    }

    public void setAnlBauaufsZulJn(Boolean anlBauaufsZulJn) {
        this.anlBauaufsZulJn = anlBauaufsZulJn;
    }

    public Boolean getAnlDinDeJn() {
        return this.anlDinDeJn;
    }

    public void setAnlDinDeJn(Boolean anlDinDeJn) {
        this.anlDinDeJn = anlDinDeJn;
    }

    public Boolean getAnlOhneZulJn() {
        return this.anlOhneZulJn;
    }

    public void setAnlOhneZulJn(Boolean anlOhneZulJn) {
        this.anlOhneZulJn = anlOhneZulJn;
    }

    public Boolean getAnlBaurechtPrJn() {
        return this.anlBaurechtPrJn;
    }

    public void setAnlBaurechtPrJn(Boolean anlBaurechtPrJn) {
        this.anlBaurechtPrJn = anlBaurechtPrJn;
    }

    public Boolean getAnlEinzelabnJn() {
        return this.anlEinzelabnJn;
    }

    public void setAnlEinzelabnJn(Boolean anlEinzelabnJn) {
        this.anlEinzelabnJn = anlEinzelabnJn;
    }

    public Calendar getDatGenehmigung() {
        return this.datGenehmigung;
    }

    public void setDatGenehmigung(Calendar datGenehmigung) {
        this.datGenehmigung = datGenehmigung;
    }

    public Boolean getBefristungJn() {
        return this.befristungJn;
    }

    public void setBefristungJn(Boolean befristungJn) {
        this.befristungJn = befristungJn;
    }

    public Calendar getBefristungBis() {
        return this.befristungBis;
    }

    public void setBefristungBis(Calendar befristungBis) {
        this.befristungBis = befristungBis;
    }

    public String getAktenzeichen() {
        return this.aktenzeichen;
    }

    public void setAktenzeichen(String aktenzeichen) {
        this.aktenzeichen = aktenzeichen;
    }

    public Calendar getDatInbetrieb() {
        return this.datInbetrieb;
    }

    public void setDatInbetrieb(Calendar datInbetrieb) {
        this.datInbetrieb = datInbetrieb;
    }

    public Boolean getSchlammfangJn() {
        return this.schlammfangJn;
    }

    public void setSchlammfangJn(Boolean schlammfangJn) {
        this.schlammfangJn = schlammfangJn;
    }

    public Boolean getAbscheiderJn() {
        return this.abscheiderJn;
    }

    public void setAbscheiderJn(Boolean abscheiderJn) {
        this.abscheiderJn = abscheiderJn;
    }

    public Boolean getNeutralisationJn() {
        return this.neutralisationJn;
    }

    public void setNeutralisationJn(Boolean neutralisationJn) {
        this.neutralisationJn = neutralisationJn;
    }

    public Boolean getFlockungJn() {
        return this.flockungJn;
    }

    public void setFlockungJn(Boolean flockungJn) {
        this.flockungJn = flockungJn;
    }

    public Boolean getFlotationJn() {
        return this.flotationJn;
    }

    public void setFlotationJn(Boolean flotationJn) {
        this.flotationJn = flotationJn;
    }

    public Boolean getEmulsionsspaltJn() {
        return this.emulsionsspaltJn;
    }

    public void setEmulsionsspaltJn(Boolean emulsionsspaltJn) {
        this.emulsionsspaltJn = emulsionsspaltJn;
    }

    public Boolean getAbsorptionJn() {
        return this.absorptionJn;
    }

    public void setAbsorptionJn(Boolean absorptionJn) {
        this.absorptionJn = absorptionJn;
    }

    public Boolean getSonstAbscheiderJn() {
        return this.sonstAbscheiderJn;
    }

    public void setSonstAbscheiderJn(Boolean sonstAbscheiderJn) {
        this.sonstAbscheiderJn = sonstAbscheiderJn;
    }

    public Boolean getIonenaustauschJn() {
        return this.ionenaustauschJn;
    }

    public void setIonenaustauschJn(Boolean ionenaustauschJn) {
        this.ionenaustauschJn = ionenaustauschJn;
    }

    public Boolean getStrippAnlageJn() {
        return this.strippAnlageJn;
    }

    public void setStrippAnlageJn(Boolean strippAnlageJn) {
        this.strippAnlageJn = strippAnlageJn;
    }

    public Boolean getExtraktionJn() {
        return this.extraktionJn;
    }

    public void setExtraktionJn(Boolean extraktionJn) {
        this.extraktionJn = extraktionJn;
    }

    public Boolean getFiltrationJn() {
        return this.filtrationJn;
    }

    public void setFiltrationJn(Boolean filtrationJn) {
        this.filtrationJn = filtrationJn;
    }

    public Boolean getMembranfiltrationJn() {
        return this.membranfiltrationJn;
    }

    public void setMembranfiltrationJn(Boolean membranfiltrationJn) {
        this.membranfiltrationJn = membranfiltrationJn;
    }

    public Boolean getSiebRechenJn() {
        return this.siebRechenJn;
    }

    public void setSiebRechenJn(Boolean siebRechenJn) {
        this.siebRechenJn = siebRechenJn;
    }

    public Boolean getAusgleichsbeckenJn() {
        return this.ausgleichsbeckenJn;
    }

    public void setAusgleichsbeckenJn(Boolean ausgleichsbeckenJn) {
        this.ausgleichsbeckenJn = ausgleichsbeckenJn;
    }

    public Boolean getVorklaerungAbsetzJn() {
        return this.vorklaerungAbsetzJn;
    }

    public void setVorklaerungAbsetzJn(Boolean vorklaerungAbsetzJn) {
        this.vorklaerungAbsetzJn = vorklaerungAbsetzJn;
    }

    public String getSonstigeMechVerf() {
        return this.sonstigeMechVerf;
    }

    public void setSonstigeMechVerf(String sonstigeMechVerf) {
        this.sonstigeMechVerf = sonstigeMechVerf;
    }

    public Boolean getAnaerobeVorbJn() {
        return this.anaerobeVorbJn;
    }

    public void setAnaerobeVorbJn(Boolean anaerobeVorbJn) {
        this.anaerobeVorbJn = anaerobeVorbJn;
    }

    public Boolean getTropfkoerperJn() {
        return this.tropfkoerperJn;
    }

    public void setTropfkoerperJn(Boolean tropfkoerperJn) {
        this.tropfkoerperJn = tropfkoerperJn;
    }

    public Boolean getBelCEliJn() {
        return this.belCEliJn;
    }

    public void setBelCEliJn(Boolean belCEliJn) {
        this.belCEliJn = belCEliJn;
    }

    public Boolean getBelNEliJn() {
        return this.belNEliJn;
    }

    public void setBelNEliJn(Boolean belNEliJn) {
        this.belNEliJn = belNEliJn;
    }

    public Boolean getBiologPEliJn() {
        return this.biologPEliJn;
    }

    public void setBiologPEliJn(Boolean biologPEliJn) {
        this.biologPEliJn = biologPEliJn;
    }

    public Boolean getNachklaerungJn() {
        return this.nachklaerungJn;
    }

    public void setNachklaerungJn(Boolean nachklaerungJn) {
        this.nachklaerungJn = nachklaerungJn;
    }

    public String getSonstigeBiolVerf() {
        return this.sonstigeBiolVerf;
    }

    public void setSonstigeBiolVerf(String sonstigeBiolVerf) {
        this.sonstigeBiolVerf = sonstigeBiolVerf;
    }

    public Boolean getAbfuhrUnbehJn() {
        return this.abfuhrUnbehJn;
    }

    public void setAbfuhrUnbehJn(Boolean abfuhrUnbehJn) {
        this.abfuhrUnbehJn = abfuhrUnbehJn;
    }

    public Boolean getMaschEntwJn() {
        return this.maschEntwJn;
    }

    public void setMaschEntwJn(Boolean maschEntwJn) {
        this.maschEntwJn = maschEntwJn;
    }

    public Boolean getStatEntwJn() {
        return this.statEntwJn;
    }

    public void setStatEntwJn(Boolean statEntwJn) {
        this.statEntwJn = statEntwJn;
    }

    public Boolean getVakuumfilterJn() {
        return this.vakuumfilterJn;
    }

    public void setVakuumfilterJn(Boolean vakuumfilterJn) {
        this.vakuumfilterJn = vakuumfilterJn;
    }

    public Boolean getKammerfilterpJn() {
        return this.kammerfilterpJn;
    }

    public void setKammerfilterpJn(Boolean kammerfilterpJn) {
        this.kammerfilterpJn = kammerfilterpJn;
    }

    public Boolean getSiebbandpJn() {
        return this.siebbandpJn;
    }

    public void setSiebbandpJn(Boolean siebbandpJn) {
        this.siebbandpJn = siebbandpJn;
    }

    public Boolean getZentrifugeJn() {
        return this.zentrifugeJn;
    }

    public void setZentrifugeJn(Boolean zentrifugeJn) {
        this.zentrifugeJn = zentrifugeJn;
    }

    public Boolean getNatEntwJn() {
        return this.natEntwJn;
    }

    public void setNatEntwJn(Boolean natEntwJn) {
        this.natEntwJn = natEntwJn;
    }

    public String getSonstigeSchlammBeh() {
        return this.sonstigeSchlammBeh;
    }

    public void setSonstigeSchlammBeh(String sonstigeSchlammBeh) {
        this.sonstigeSchlammBeh = sonstigeSchlammBeh;
    }

    /**
     * Merge (save or update) a detached instance
     * @param detachedInstance the instance to merge
     * @return <code>InkaAnlage</code> the merged instance,
     *         if everything went okay,
     *         <code>null</code> otherwise
     */
    public static InkaAnlage merge(InkaAnlage detachedInstance) {
        log.debug("Merging InkaAnlage instance " + detachedInstance);
        return (InkaAnlage) new DatabaseAccess().merge(detachedInstance);
    }

    /**
     * Merge (save or update) this instance
     * @return <code>true</code>, if everything went okay,
     *         <code>false</code> otherwise
     */
    public boolean merge() {
        return InkaAnlage.merge(this).equals(this);
    }

    /**
     * Delete (mark as deleted) a detached instance
     * @param detachedInstance the instance to delete
     * @return <code>true</code>, if everything went okay,
     *         <code>false</code> otherwise
     */
    public static boolean delete(InkaAnlage detachedInstance) {
        log.debug("Deleting InkaAnlage instance " + detachedInstance);
        return new DatabaseAccess().delete(detachedInstance);
    }

    /**
     * Delete (mark as deleted) this instance
     * @return <code>true</code>, if everything went okay,
     *         <code>false</code> otherwise
     */
    public boolean delete() {
        return InkaAnlage.delete(this);
    }

    /**
     * Find an <code>InkaAnlage</code> instance by its primary key
     * @param id the primary key value
     * @return <code>InkaAnlage</code> the requested instance,
     *         if one exists,
     *         <code>null</code> otherwise
     */
    public static InkaAnlage findById(java.lang.Integer id) {
        log.debug("Getting InkaAnlage instance with id: " + id);
        return (InkaAnlage)
            new DatabaseAccess().get(InkaAnlage.class, id);
    }

    /**
     * Get a list of all <code>InkaAnlage</code>
     * @return <code>List&lt;InkaAnlage&gt;</code>
     *         all <code>InkaAnlage</code>
     */
    public static List<InkaAnlage> getAll() {
        log.debug("Getting all InkaAnlage instances");
        String query = "FROM InkaAnlage ORDER BY 1";
        List<?> objectList = new DatabaseAccess().createQuery(query).list();
        List<InkaAnlage> resultList = new ArrayList<InkaAnlage>();
        InkaAnlage result = null;
        for (Object object : objectList) {
            result = (InkaAnlage) object;
            resultList.add(result);
        }
        return resultList;
    }

    /* Custom code goes below here! */

    public Inka_Anlage toServiceType() {
        Inka_Anlage serviceInstance = new Inka_Anlage(
            this.getAenderungsDatum(),
            this.getErfassungsDatum(),
            this.getGueltigBis(),
            this.getGueltigVon(),
            this.getIstAktuellJn(),
//            this.getHistorienNr(),
            this.getAbfuhrUnbehJn(),
            this.getAbscheiderJn(),
            this.getAbsorptionJn(),
            this.getAdresseAnsprNr(),
            this.getAdresseAnsprVer(),
            this.getAktenzeichen(),
            this.getAnaerobeVorbJn(),
            this.getAnlBauaufsZulJn(),
            this.getAnlBaurechtPrJn(),
            this.getAnlDinDeJn(),
            this.getAnlEinzelabnJn(),
            this.getAnlOhneZulJn(),
            this.getAnlageNr(),
            this.getAnlageVer(),
            this.getAusgleichsbeckenJn(),
            this.getBefristungBis(),
            this.getBefristungJn(),
            this.getBehoerdenId(),
            this.getBehoerdenVer(),
            this.getBelCEliJn(),
            this.getBelNEliJn(),
            this.getBetriebseinrichtungNr(),
            this.getBetriebseinrichtungVer(),
            this.getBiologPEliJn(),
            this.getDatGenehmigung(),
            this.getDatInbetrieb(),
            this.getEmulsionsspaltJn(),
            this.getExtraktionJn(),
            this.getFiltrationJn(),
            this.getFlockungJn(),
            this.getFlotationJn(),
            this.getGemeindeVer(),
            this.getGemeindekennzahl(),
            this.getGenArt(),
            this.getGenPflichtigJn(),
            this.getGenehmigungNr(),
            this.getGenehmigungVer(),
            this.getIonenaustauschJn(),
            this.getKammerfilterpJn(),
            this.getMaschEntwJn(),
            this.getMembranfiltrationJn(),
            this.getNachklaerungJn(),
            this.getNatEntwJn(),
            this.getNeutralisationJn(),
            this.getSchlammfangJn(),
            this.getSiebRechenJn(),
            this.getSiebbandpJn(),
            this.getSonstAbscheiderJn(),
            this.getSonstigeBiolVerf(),
            this.getSonstigeMechVerf(),
            this.getSonstigeSchlammBeh(),
            this.getStatEntwJn(),
            this.getStrippAnlageJn(),
            this.getStuaBezirk(),
            this.getStuaVer(),
            this.getTropfkoerperJn(),
            this.getUebergabestelleLfdNr(),
            this.getUebergabestelleVer(),
            this.getVakuumfilterJn(),
            this.getVorklaerungAbsetzJn(),
            this.getWasBehoerdenId(),
            this.getWasBehoerdenVer(),
            this.getZentrifugeJn()
        );
        return serviceInstance;
    }

}
