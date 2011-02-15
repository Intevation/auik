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
// Generated 20.01.2011 11:39:19 by Hibernate Tools 3.3.0.GA

import java.io.Serializable;

/**
 * AbstractAtlParameterGruppen generated by hbm2java
 */
public abstract class AbstractAtlParameterGruppen
implements            Serializable {


     private Integer id;
     private String name;
     private Double preisfueranalyse;

    public AbstractAtlParameterGruppen() {
    }

    public AbstractAtlParameterGruppen(String name, Double preisfueranalyse) {
       this.name = name;
       this.preisfueranalyse = preisfueranalyse;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public Double getPreisfueranalyse() {
        return this.preisfueranalyse;
    }
    
    public void setPreisfueranalyse(Double preisfueranalyse) {
        this.preisfueranalyse = preisfueranalyse;
    }




}


