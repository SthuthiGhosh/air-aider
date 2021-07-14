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
@Table(name = "AIR_AIDER_CITY_DETAILS")
public class CityDetailsEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "CITY_DETAIL_ID")
	private int cityDetailId;

	@Column(name = "CITY_ID")
	private int cityId;
	@Column(name = "CITY_NAME")
	private String cityName;

	@Column(name = "LANG_CODE")
	private LangCodes langCode;

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
	 * @return the cityId
	 */
	public int getCityId() {
		return cityId;
	}

	/**
	 * @param cityId the cityId to set
	 */
	public void setCityId(int cityId) {
		this.cityId = cityId;
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

}
