/**
 * 
 */
package com.ibs.airaidermasterdataservice.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author 91940
 * 
 */
@Entity
@Table(name = "AIR_AIDER_COUNTRY")
public class CountryEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "COUNTRY_ID")
	private int countryId;
	
	@Column(name = "COUNTRY_CODE")
	private String countryCode;
	
	@Column(name = "ACTIVE_FLAG")
	private int activeFlag;
	
	@Column(name = "CREATED_ON")
	private LocalDate createdOn;
	
	@Column(name = "UPDATED_ON")
	private LocalDate updatedOn;

	@OneToOne(mappedBy = "countryEntity")
	private CountryDetailsEntity countryDetailsEntity;
	

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

	/**
	 * @return the countryCode
	 */
	public String getCountryCode() {
		return countryCode;
	}

	/**
	 * @param countryCode the countryCode to set
	 */
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	/**
	 * @return the countryDetailsEntity
	 */
	public CountryDetailsEntity getCountryDetailsEntity() {
		return countryDetailsEntity;
	}

	/**
	 * @param countryDetailsEntity the countryDetailsEntity to set
	 */
	public void setCountryDetailsEntity(CountryDetailsEntity countryDetailsEntity) {
		this.countryDetailsEntity = countryDetailsEntity;
	}

	/**
	 * @return the activeFlag
	 */
	public int getActiveFlag() {
		return activeFlag;
	}

	/**
	 * @param activeFlag the activeFlag to set
	 */
	public void setActiveFlag(int activeFlag) {
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
