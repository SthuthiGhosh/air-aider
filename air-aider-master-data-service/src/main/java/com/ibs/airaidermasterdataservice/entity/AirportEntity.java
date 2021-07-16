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
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author Sthuthi Entity class for Airport
 */
@Entity
@Table(name = "AIR_AIDER_AIRPORT")
public class AirportEntity {

	@Id
	@GeneratedValue
	@Column(name = "AIRPORT_ID")
	private int airportId;

	@Column(name = "AIRPORT_CODE")
	private String airportCode;

	@Column(name = "ACTIVE_FLAG")
	private boolean activeFlag;

	@Column(name = "CREATED_ON")
	private LocalDate createdOn;

	@Column(name = "UPDATED_ON")
	private LocalDate updatedOn;

	@OneToMany(targetEntity = AirportDetailsEntity.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "airportId", referencedColumnName = "AIRPORT_ID")
	private List<AirportDetailsEntity> airportDetailsEntity;

	/**
	 * @return the airportDetailsEntity
	 */

	public List<AirportDetailsEntity> getAirportDetailsEntity() {
		return airportDetailsEntity;
	}

	/**
	 * @param airportDetailsEntity the airportDetailsEntity to set
	 */
	public void setAirportDetailsEntity(List<AirportDetailsEntity> airportDetailsEntity) {
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

}
