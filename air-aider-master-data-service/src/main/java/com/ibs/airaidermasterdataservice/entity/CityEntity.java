/**
 * 
 */
package com.ibs.airaidermasterdataservice.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author 91940
 * Entity class for City Entity
 */
@Entity
@Table(name = "AIR_AIDER_CITY")
public class CityEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CITY_ID")
	private int cityId;

	@Column(name = "CITY_CODE")
	private String cityCode;

	@Column(name = "ACTIVE_FLAG")
	private boolean activeFlag;

	@Column(name = "CREATED_ON")
	private LocalDate createdOn;

	@Column(name = "UPDATED_ON")
	private LocalDate updatedOn;

	@OneToMany(targetEntity = CityDetailsEntity.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "cityId", referencedColumnName = "CITY_ID")
	private List<CityDetailsEntity> cityDetailsEntity;

	@OneToMany(targetEntity = AirportEntity.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "city_Id", referencedColumnName = "CITY_ID")
	private List<AirportEntity> airportEntities;

	/**
	 * @return the airportEntities
	 */
	public List<AirportEntity> getAirportEntities() {
		return airportEntities;
	}

	/**
	 * @param airportEntities the airportEntities to set
	 */
	public void setAirportEntities(List<AirportEntity> airportEntities) {
		this.airportEntities = airportEntities;
	}

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
	 * @return the activeFlag
	 */
	public boolean getActiveFlag() {
		return activeFlag;
	}

	/**
	 * @param activeFlag the activeFlag to set
	 */
	public void setActiveFlag(boolean activeFlag) {
		this.activeFlag = activeFlag;
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

	/**
	 * @return the cityDetailsEntity
	 */
	public List<CityDetailsEntity> getCityDetailsEntity() {
		return cityDetailsEntity;
	}

	/**
	 * @param cityDetailsEntity the cityDetailsEntity to set
	 */
	public void setCityDetailsEntity(List<CityDetailsEntity> cityDetailsEntity) {
		this.cityDetailsEntity = cityDetailsEntity;
	}

}
