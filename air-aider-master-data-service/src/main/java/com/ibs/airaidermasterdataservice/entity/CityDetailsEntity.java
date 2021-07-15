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
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.ibs.airaidermasterdataservice.util.AirAiderCommonConstants.LangCodes;

/**
 * @author 91940
 *
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


	@OneToOne
	@JoinColumn(name = "cityId", referencedColumnName = "CITY_ID")
	private CityEntity cityEntity;
	
//	public CityDetailsEntity(LangCodes langCode, String cityName,CityEntity cityEntity) {
//		this.langCode = langCode;
//		this.cityName = cityName;
//		this.cityEntity = cityEntity;
//	}

	/**
	 * @return the cityEntity
	 */
	public CityEntity getCityEntity() {
		return cityEntity;
	}

	/**
	 * @param cityEntity the cityEntity to set
	 */
	public void setCityEntity(CityEntity cityEntity) {
		this.cityEntity = cityEntity;
	}

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

//	/**
//	 * @return the cityId
//	 */
//	public int getCityId() {
//		return cityId;
//	}
//
//	/**
//	 * @param cityId the cityId to set
//	 */
//	public void setCityId(int cityId) {
//		this.cityId = cityId;
//	}

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
