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

import java.util.List;

import de.bielefeld.umweltamt.aui.mappings.DatabaseAccess;
import de.bielefeld.umweltamt.aui.mappings.DatabaseClassToString;
import de.bielefeld.umweltamt.aui.mappings.DatabaseQuery;
import de.bielefeld.umweltamt.aui.mappings.DatabaseSerialVersionUID;
import de.bielefeld.umweltamt.aui.utils.AuikLogger;

/**
 * A class that represents a row in the BasisStrassen database table.<br>
 * This class is meant to serve as a model and should be copied into the
 * appropriate package and may be customized below the given mark.
 */
public class BasisStrassen implements java.io.Serializable
{

	/** Generated serialVersionUID for Serializable interface */
	private static final long serialVersionUID =
			DatabaseSerialVersionUID.forBasisStrassen;

	/* Primary key, foreign keys (relations) and table columns */
	private Integer id;
	private String strasse;
	private String plz;
	private String ort;
	private boolean enabled;
	private boolean deleted;

	/** Logging */
	private static final AuikLogger log = AuikLogger.getLogger();

	/** Default constructor */
	public BasisStrassen()
	{
		// This place is intentionally left blank.
	}

	/** Minimal constructor */
	public BasisStrassen(
		Integer id, boolean enabled, boolean deleted)
	{
		this.id = id;
		this.enabled = enabled;
		this.deleted = deleted;
	}

	public BasisStrassen(String strasse)
	{
		this.strasse = strasse;
		this.enabled = true;
		this.deleted = true;
	}

	/** Full constructor */
	public BasisStrassen(
		Integer id, String strasse, String plz, boolean enabled, boolean deleted)
	{
		this.id = id;
		this.strasse = strasse;
		this.plz = plz;
		this.enabled = enabled;
		this.deleted = deleted;
	}

	/* Setter and getter methods */
	public Integer getId()
	{
		return this.id;
	}

	public void setId(Integer id)
	{
		this.id = id;
	}

	public String getStrasse()
	{
		return this.strasse;
	}

	public void setStrasse(String strasse)
	{
		this.strasse = strasse;
	}

	public String getPlz()
	{
		return this.plz;
	}

	public void setPlz(String plz)
	{
		this.plz = plz;
	}

	public String getOrt()
	{
		return this.ort;
	}

	public void setOrt(String ort)
	{
		this.ort = ort;
	}

	public boolean isEnabled()
	{
		return this.enabled;
	}

	public void setEnabled(boolean enabled)
	{
		this.enabled = enabled;
	}

	public boolean isDeleted()
	{
		return this.deleted;
	}

	public void setDeleted(boolean deleted)
	{
		this.deleted = deleted;
	}

	/**
	 * To implement custom toString methods, jump to not generated code.<br>
	 * Basically we either call on <code>toDebugString</code> for a debug
	 * string, call on <code>toGuiString</code> for a gui representation or do
	 * something completely different.
	 * 
	 * @return String
	 */
	@Override
	public String toString()
	{
		return DatabaseClassToString.toStringForClass(this);
	}

	/**
	 * Get a string representation for the gui
	 * 
	 * @return String
	 */
	public String toGuiString()
	{

		return getStrasse();
	}

	/**
	 * Get a string representation for debugging
	 * 
	 * @return String
	 */
	public String toDebugString()
	{
		StringBuffer buffer = new StringBuffer();

		buffer.append(getClass().getSimpleName()).append("@").append(Integer.toHexString(hashCode())).append(" [");
		buffer.append("id").append("='").append(getId()).append("' ");
		buffer.append("strasse").append("='").append(getStrasse()).append("' ");
		buffer.append("plz").append("='").append(getPlz()).append("' ");
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
	public boolean equals(Object other)
	{
		if (this == other)
			return true;
		if (other == null)
			return false;
		if (!(other instanceof BasisStrassen))
			return false;
		return (this.getId().equals(
				((BasisStrassen) other).getId()));
	}

	/**
	 * Calculate a unique hashCode
	 * 
	 * @return <code>int</code>
	 */
	@Override
	public int hashCode()
	{
		int result = 17;
		int idValue = this.getId() == null ?
				0 : this.getId().hashCode();
		result = result * 37 + idValue;
		return result;
	}

	/**
	 * Merge (save or update) a detached instance
	 * 
	 * @param detachedInstance
	 *            the instance to merge
	 * @return <code>BasisStrassen</code> the merged instance,
	 *         if everything went okay, <code>null</code> otherwise
	 */
	public static BasisStrassen merge(BasisStrassen detachedInstance)
	{
		log.debug("Merging BasisStrassen instance " + detachedInstance);
		return (BasisStrassen) new DatabaseAccess().merge(detachedInstance);
	}

	/**
	 * Merge (save or update) this instance
	 * 
	 * @return <code>true</code>, if everything went okay, <code>false</code>
	 *         otherwise
	 */
	public boolean merge()
	{
		BasisStrassen saved = BasisStrassen.merge(this);
		if (saved == null)
		{
			return false;
		}
		else
		{
			this.copy(saved);
			return true;
		}
	}

	/**
	 * Update this BasisStrassen with its new values.<br>
	 * This is meant to be used after merging!
	 * 
	 * @param copy
	 *            BasisStrassen
	 */
	private void copy(BasisStrassen copy)
	{
		this.id = copy.getId();
		this.strasse = copy.getStrasse();
		this.plz = copy.getPlz();
		this.enabled = copy.isEnabled();
		this.deleted = copy.isDeleted();
	}

	/**
	 * Delete (mark as deleted) a detached instance
	 * 
	 * @param detachedInstance
	 *            the instance to delete
	 * @return <code>true</code>, if everything went okay, <code>false</code>
	 *         otherwise
	 */
	public static boolean delete(BasisStrassen detachedInstance)
	{
		log.debug("Deleting BasisStrassen instance " + detachedInstance);
		return new DatabaseAccess().delete(detachedInstance);
	}

	/**
	 * Delete (mark as deleted) this instance
	 * 
	 * @return <code>true</code>, if everything went okay, <code>false</code>
	 *         otherwise
	 */
	public boolean delete()
	{
		return BasisStrassen.delete(this);
	}

	/**
	 * Find an <code>BasisStrassen</code> instance by its primary key
	 * 
	 * @param id
	 *            the primary key value
	 * @return <code>BasisStrassen</code> the requested instance,
	 *         if one exists, <code>null</code> otherwise
	 */
	public static BasisStrassen findById(java.lang.Integer id)
	{
		log.debug("Getting BasisStrassen instance with id: " + id);
		return (BasisStrassen) new DatabaseAccess().get(BasisStrassen.class, id);
	}

	/**
	 * Get a list of all <code>BasisStrassen</code>
	 * 
	 * @return <code>List&lt;BasisStrassen&gt;</code> all
	 *         <code>BasisStrassen</code>
	 */
	public static List<BasisStrassen> getAll()
	{
		return DatabaseQuery.getAll(new BasisStrassen());
	}

	/* Custom code goes below here! */

}
