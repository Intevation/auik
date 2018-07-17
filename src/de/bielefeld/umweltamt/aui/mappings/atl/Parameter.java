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

package de.bielefeld.umweltamt.aui.mappings.atl;

import de.bielefeld.umweltamt.aui.mappings.DatabaseAccess;
import de.bielefeld.umweltamt.aui.mappings.DatabaseClassToString;
import de.bielefeld.umweltamt.aui.mappings.DatabaseQuery;
import de.bielefeld.umweltamt.aui.mappings.DatabaseSerialVersionUID;
import de.bielefeld.umweltamt.aui.utils.AuikLogger;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * A class that represents a row in the Parameter database table.<br>
 * This class is meant to serve as a model and should be copied into the
 * appropriate package and may be customized below the given mark.
 */
public class Parameter  implements java.io.Serializable {

    /** Generated serialVersionUID for Serializable interface */
    private static final long serialVersionUID =
        DatabaseSerialVersionUID.forParameter;
    
    /* Primary key, foreign keys (relations) and table columns */
    private String ordnungsbegriff;
    private Parametergruppen parametergruppen;
    private String analyseverfahren;
    private String bezeichnung;
    private Integer wirdgemessenineinheit;
    private Double grenzwert;
    private String grenzwertname;
    private Double sielhautGw;
    private Double klaerschlammGw;
    private Double preisfueranalyse;
    private Boolean einzelnbeauftragbar;
    private String kennzeichnung;
    private String konservierung;
    private Integer reihenfolge;
    private boolean enabled;
    private boolean deleted;
    private Integer deaStoffeStoffNr;
    private Set<MetaParameter> metaParameters = new HashSet<MetaParameter>(0);
    private Set<Analyseposition> analysepositions = new HashSet<Analyseposition>(0);

    /** Logging */
    private static final AuikLogger log = AuikLogger.getLogger();

    /** Default constructor */
    public Parameter() {
        // This place is intentionally left blank.
    }

    /** Minimal constructor */
    public Parameter(
        String ordnungsbegriff, boolean enabled, boolean deleted) {
        this.ordnungsbegriff = ordnungsbegriff;
        this.enabled = enabled;
        this.deleted = deleted;
    }

    /** Full constructor */
    public Parameter(
        String ordnungsbegriff, Parametergruppen parametergruppen, String analyseverfahren, String bezeichnung, Integer wirdgemessenineinheit, Double grenzwert, String grenzwertname, Double sielhautGw, Double klaerschlammGw, Double preisfueranalyse, Boolean einzelnbeauftragbar, String kennzeichnung, String konservierung, Integer reihenfolge, boolean enabled, boolean deleted, Integer deaStoffeStoffNr, Set<MetaParameter> metaParameters, Set<Analyseposition> analysepositions) {
        this.ordnungsbegriff = ordnungsbegriff;
        this.parametergruppen = parametergruppen;
        this.analyseverfahren = analyseverfahren;
        this.bezeichnung = bezeichnung;
        this.wirdgemessenineinheit = wirdgemessenineinheit;
        this.grenzwert = grenzwert;
        this.grenzwertname = grenzwertname;
        this.sielhautGw = sielhautGw;
        this.klaerschlammGw = klaerschlammGw;
        this.preisfueranalyse = preisfueranalyse;
        this.einzelnbeauftragbar = einzelnbeauftragbar;
        this.kennzeichnung = kennzeichnung;
        this.konservierung = konservierung;
        this.reihenfolge = reihenfolge;
        this.enabled = enabled;
        this.deleted = deleted;
        this.deaStoffeStoffNr = deaStoffeStoffNr;
        this.metaParameters = metaParameters;
        this.analysepositions = analysepositions;
    }

    /* Setter and getter methods */
    public String getOrdnungsbegriff() {
        return this.ordnungsbegriff;
    }

    public void setOrdnungsbegriff(String ordnungsbegriff) {
        this.ordnungsbegriff = ordnungsbegriff;
    }

    public Parametergruppen getParametergruppen() {
        return this.parametergruppen;
    }

    public void setParametergruppen(Parametergruppen parametergruppen) {
        this.parametergruppen = parametergruppen;
    }

    public String getAnalyseverfahren() {
        return this.analyseverfahren;
    }

    public void setAnalyseverfahren(String analyseverfahren) {
        this.analyseverfahren = analyseverfahren;
    }

    public String getBezeichnung() {
        return this.bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public Integer getWirdgemessenineinheit() {
        return this.wirdgemessenineinheit;
    }

    public void setWirdgemessenineinheit(Integer wirdgemessenineinheit) {
        this.wirdgemessenineinheit = wirdgemessenineinheit;
    }

    public Double getGrenzwert() {
        return this.grenzwert;
    }

    public void setGrenzwert(Double grenzwert) {
        this.grenzwert = grenzwert;
    }

    public String getGrenzwertname() {
        return this.grenzwertname;
    }

    public void setGrenzwertname(String grenzwertname) {
        this.grenzwertname = grenzwertname;
    }

    public Double getSielhautGw() {
        return this.sielhautGw;
    }

    public void setSielhautGw(Double sielhautGw) {
        this.sielhautGw = sielhautGw;
    }

    public Double getKlaerschlammGw() {
        return this.klaerschlammGw;
    }

    public void setKlaerschlammGw(Double klaerschlammGw) {
        this.klaerschlammGw = klaerschlammGw;
    }

    public Double getPreisfueranalyse() {
        return this.preisfueranalyse;
    }

    public void setPreisfueranalyse(Double preisfueranalyse) {
        this.preisfueranalyse = preisfueranalyse;
    }

    public Boolean getEinzelnbeauftragbar() {
        return this.einzelnbeauftragbar;
    }

    public void setEinzelnbeauftragbar(Boolean einzelnbeauftragbar) {
        this.einzelnbeauftragbar = einzelnbeauftragbar;
    }

    public String getKennzeichnung() {
        return this.kennzeichnung;
    }

    public void setKennzeichnung(String kennzeichnung) {
        this.kennzeichnung = kennzeichnung;
    }

    public String getKonservierung() {
        return this.konservierung;
    }

    public void setKonservierung(String konservierung) {
        this.konservierung = konservierung;
    }

    public Integer getReihenfolge() {
        return this.reihenfolge;
    }

    public void setReihenfolge(Integer reihenfolge) {
        this.reihenfolge = reihenfolge;
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

    public Integer getDeaStoffeStoffNr() {
        return this.deaStoffeStoffNr;
    }

    public void setDeaStoffeStoffNr(Integer deaStoffeStoffNr) {
        this.deaStoffeStoffNr = deaStoffeStoffNr;
    }

    public Set<MetaParameter> getMetaParameters() {
        return this.metaParameters;
    }

    public void setMetaParameters(Set<MetaParameter> metaParameters) {
        this.metaParameters = metaParameters;
    }

    public Set<Analyseposition> getAnalysepositions() {
        return this.analysepositions;
    }

    public void setAnalysepositions(Set<Analyseposition> analysepositions) {
        this.analysepositions = analysepositions;
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
        buffer.append("ordnungsbegriff").append("='").append(getOrdnungsbegriff()).append("' ");			
        buffer.append("parametergruppen").append("='").append(getParametergruppen()).append("' ");			
        buffer.append("analyseverfahren").append("='").append(getAnalyseverfahren()).append("' ");			
        buffer.append("bezeichnung").append("='").append(getBezeichnung()).append("' ");			
        buffer.append("wirdgemessenineinheit").append("='").append(getWirdgemessenineinheit()).append("' ");			
        buffer.append("grenzwert").append("='").append(getGrenzwert()).append("' ");			
        buffer.append("grenzwertname").append("='").append(getGrenzwertname()).append("' ");			
        buffer.append("sielhautGw").append("='").append(getSielhautGw()).append("' ");			
        buffer.append("klaerschlammGw").append("='").append(getKlaerschlammGw()).append("' ");			
        buffer.append("preisfueranalyse").append("='").append(getPreisfueranalyse()).append("' ");			
        buffer.append("einzelnbeauftragbar").append("='").append(getEinzelnbeauftragbar()).append("' ");			
        buffer.append("kennzeichnung").append("='").append(getKennzeichnung()).append("' ");			
        buffer.append("konservierung").append("='").append(getKonservierung()).append("' ");			
        buffer.append("reihenfolge").append("='").append(getReihenfolge()).append("' ");			
        buffer.append("enabled").append("='").append(isEnabled()).append("' ");			
        buffer.append("deleted").append("='").append(isDeleted()).append("' ");			
        buffer.append("deaStoffeStoffNr").append("='").append(getDeaStoffeStoffNr()).append("' ");			
        buffer.append("metaParameters").append("='").append(getMetaParameters()).append("' ");			
        buffer.append("analysepositions").append("='").append(getAnalysepositions()).append("' ");			
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
        if (!(other instanceof Parameter)) return false;
        return (this.getOrdnungsbegriff().equals(
            ((Parameter) other).getOrdnungsbegriff()));
    }

    /**
     * Calculate a unique hashCode
     * @return <code>int</code>
     */
    @Override
    public int hashCode() {
        int result = 17;
        int idValue = this.getOrdnungsbegriff() == null ?
            0 : this.getOrdnungsbegriff().hashCode();
        result = result * 37 + idValue;
        return result;
    }
    
    /**
     * Merge (save or update) a detached instance
     * @param detachedInstance the instance to merge
     * @return <code>Parameter</code> the merged instance,
     *         if everything went okay,
     *         <code>null</code> otherwise
     */
    public static Parameter merge(Parameter detachedInstance) {
        log.debug("Merging Parameter instance " + detachedInstance);
        return (Parameter) new DatabaseAccess().merge(detachedInstance);
    }

    /**
     * Merge (save or update) this instance
     * @return <code>true</code>, if everything went okay,
     *         <code>false</code> otherwise
     */
    public boolean merge() {
        Parameter saved = Parameter.merge(this);
        if (saved == null) {
            return false;
        } else {
            this.copy(saved);
            return true;
        }
    }

    /**
     * Update this Parameter with its new values.<br>
     * This is meant to be used after merging!
     * @param copy Parameter
     */
    private void copy(Parameter copy) {
        this.ordnungsbegriff = copy.getOrdnungsbegriff();            
        this.parametergruppen = copy.getParametergruppen();            
        this.analyseverfahren = copy.getAnalyseverfahren();            
        this.bezeichnung = copy.getBezeichnung();            
        this.wirdgemessenineinheit = copy.getWirdgemessenineinheit();            
        this.grenzwert = copy.getGrenzwert();            
        this.grenzwertname = copy.getGrenzwertname();            
        this.sielhautGw = copy.getSielhautGw();            
        this.klaerschlammGw = copy.getKlaerschlammGw();            
        this.preisfueranalyse = copy.getPreisfueranalyse();            
        this.einzelnbeauftragbar = copy.getEinzelnbeauftragbar();            
        this.kennzeichnung = copy.getKennzeichnung();            
        this.konservierung = copy.getKonservierung();            
        this.reihenfolge = copy.getReihenfolge();            
        this.enabled = copy.isEnabled();            
        this.deleted = copy.isDeleted();            
        this.deaStoffeStoffNr = copy.getDeaStoffeStoffNr();            
        this.metaParameters = copy.getMetaParameters();            
        this.analysepositions = copy.getAnalysepositions();            
    }    

    /**
     * Delete (mark as deleted) a detached instance
     * @param detachedInstance the instance to delete
     * @return <code>true</code>, if everything went okay,
     *         <code>false</code> otherwise
     */
    public static boolean delete(Parameter detachedInstance) {
        log.debug("Deleting Parameter instance " + detachedInstance);
        return new DatabaseAccess().delete(detachedInstance);
    }

    /**
     * Delete (mark as deleted) this instance
     * @return <code>true</code>, if everything went okay,
     *         <code>false</code> otherwise
     */
    public boolean delete() {
        return Parameter.delete(this);
    }

    /**
     * Find an <code>Parameter</code> instance by its primary key
     * @param id the primary key value
     * @return <code>Parameter</code> the requested instance,
     *         if one exists,
     *         <code>null</code> otherwise
     */
    public static Parameter findById(java.lang.String id) {
        log.debug("Getting Parameter instance with id: " + id);
        return (Parameter)
            new DatabaseAccess().get(Parameter.class, id);
    }

    /**
     * Get a list of all <code>Parameter</code>
     * @return <code>List&lt;Parameter&gt;</code>
     *         all <code>Parameter</code>
     */
    public static List<Parameter> getAll() {
        return DatabaseQuery.getAll(new Parameter());
    }

	public String toGuiString() {
		// TODO Auto-generated method stub
		return null;
	}

    /* Custom code goes below here! */

}
