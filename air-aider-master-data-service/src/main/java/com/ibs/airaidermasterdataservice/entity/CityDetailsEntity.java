/**

 * 
 */
package com.ibs.airaidermasterdataservice.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.ibs.airaidermasterdataservice.util.AirAiderCommonConstants.LangCodes;

/**
 * @author 91940
 * Entity class for City Details Entity
 */
@Entity
@Table(name = "AIR_AIDER_CITY_DETAILS")
public class CityDetailsEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CITY_DETAIL_ID")
	private int cityDetailId;

	@Column(name = "CITY_NAME")
	private String cityName;

	@Column(name = "LANG_CODE")
	private LangCodes langCode;
	
	@Column(name = "CREATED_ON")
	private LocalDate createdOn;
	
	@Column(name = "UPDATED_ON")
	private LocalDate updatedOn;



	/**
	 * @return the cityDetailId
	 */
	public int getCityDetailId() {
		return cityDetailId;
	}

	/**
	 * @param cityDetailId the cityDetailId to set
	 */
	public void setCityDetailId(int cityDetailId) {
		this.cityDetailId = cityDetailId;
	}


	/**
	 * @return the cityName
	 */
	public String getCityName() {
		return cityName;
	}

	/**
	 * @param cityName the cityName to set
	 */
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

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
