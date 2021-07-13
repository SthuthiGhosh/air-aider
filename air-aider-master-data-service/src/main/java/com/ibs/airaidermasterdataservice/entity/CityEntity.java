/**
 * 
 */
package com.ibs.airaidermasterdataservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author 91940
 *
 */
@Entity
@Table(name = "AIR_AIDER_CITY")
public class CityEntity {

	@Id
	@Column(name = "CITY_ID")
	private int cityId;
	@Column(name = "COUNTRY_ID")
	private int countryId;

	@Column(name = "CITY_CODE")
	private String cityCode;

	/**
	 * @return the cityCode
	 */
	public String getCityCode() {
		return cityCode;
	}

	/**
	 * @param cityCode the cityCode to set
	 */
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
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
	 * @return the countryId
	 */
	public int getCountryId() {
		return countryId;
	}

	/**
	 * @param countryId the countryId to set
	 */
	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}
}
