/**
 * 
 */
package com.ibs.airaidermasterdataservice.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author Sthuthi
 *
 */
@Entity
@Table(name = "AIR_AIDER_AIRPORT")
public class AirportEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "AIRPORT_ID")
	private int airportId;

	@Column(name = "CITY_ID")
	private int cityId;

	@Column(name = "AIRPORT_CODE")
	private String airportCode;

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "AIRPORT_DETAIL_ID_FK")
	private AirportDetailsEntity airportDetailsEntity;

	/**
	 * @return the airportDetailsEntity
	 */

	public AirportDetailsEntity getAirportDetailsEntity() {
		return airportDetailsEntity;
	}

	/**
	 * @param airportDetailsEntity the airportDetailsEntity to set
	 */
	public void setAirportDetailsEntity(AirportDetailsEntity airportDetailsEntity) {
		this.airportDetailsEntity = airportDetailsEntity;
	}

	/**
	 * @return the airportCodeConstants
	 */
	public String getAirportCode() {
		return airportCode;
	}

	/**
	 * @param string the airportCodeConstants to set
	 */
	public void setAirportCode(String string) {
		this.airportCode = string;
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
}
