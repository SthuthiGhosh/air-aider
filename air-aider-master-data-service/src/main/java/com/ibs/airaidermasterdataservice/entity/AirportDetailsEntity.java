/**
 * 
 */
package com.ibs.airaidermasterdataservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.ibs.airaidermasterdataservice.util.AirAiderCommonConstants.LangCodes;

/**
 * @author 91940
 *
 */
@Entity
@Table(name = "AIR_AIDER_AIRPORT_DETAILS")
public class AirportDetailsEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "AIRPORT_DETAIL_ID")
	private int airportdDetailId;

	@Column(name = "AIRPORT_ID")
	private int airportId;
	@Column(name = "AIRPORT_NAME")
	private String airportName;

	@Column(name = "LANG_CODE")
	private LangCodes langCode;

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
	 * @return the airportId
	 */
	public int getAirportId() {
		return airportId;
	}

	/**
	 * @param airportId the airportId to set
	 */
	public void setAirportId(int airportId) {
		this.airportId = airportId;
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
}
