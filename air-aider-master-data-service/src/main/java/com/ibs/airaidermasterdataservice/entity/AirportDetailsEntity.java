/**
 * 
 */
package com.ibs.airaidermasterdataservice.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.ibs.airaidermasterdataservice.util.AirAiderCommonConstants.LangCodes;

/**
 * @author 91940
 * Entity class for Airport details
 *
 */
@Entity
@Table(name = "AIR_AIDER_AIRPORT_DETAILS")
public class AirportDetailsEntity {

	@Id
	@Column(name = "AIRPORT_DETAIL_ID_PK")
	private int airportdDetailId;

	@Column(name = "AIRPORT_NAME")
	private String airportName;

	@Column(name = "LANG_CODE")
	private LangCodes langCode;

	@Column(name = "CREATED_ON")
	private LocalDate createdOn;

	@Column(name = "UPDATED_ON")
	private LocalDate updatedOn;

	/**
	 * @return the langCode
	 */
	public LangCodes getLangCode() {
		return langCode;
	}

	/**
	 * @param langCode the langCode to set
	 */
	public void setLangCode(LangCodes langCode) {
		this.langCode = langCode;
	}

	/**
	 * @return the airportdDetailId
	 */
	public int getAirportdDetailId() {
		return airportdDetailId;
	}

	/**
	 * @param airportdDetailId the airportdDetailId to set
	 */
	public void setAirportdDetailId(int airportdDetailId) {
		this.airportdDetailId = airportdDetailId;
	}

	/**
	 * @return the airportName
	 */
	public String getAirportName() {
		return airportName;
	}

	/**
	 * @param airportName the airportName to set
	 */
	public void setAirportName(String airportName) {
		this.airportName = airportName;
	}

	/**
	 * @return the createdOn
	 */
	public LocalDate getCreatedOn() {
		return createdOn;
	}

	/**
	 * @param createdOn the createdOn to set
	 */
	public void setCreatedOn(LocalDate createdOn) {
		this.createdOn = createdOn;
	}

	/**
	 * @return the updatedOn
	 */
	public LocalDate getUpdatedOn() {
		return updatedOn;
	}

	/**
	 * @param updatedOn the updatedOn to set
	 */
	public void setUpdatedOn(LocalDate updatedOn) {
		this.updatedOn = updatedOn;
	}
}
