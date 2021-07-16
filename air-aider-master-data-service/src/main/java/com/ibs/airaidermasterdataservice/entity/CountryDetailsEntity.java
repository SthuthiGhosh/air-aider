/**
 * 
 */
package com.ibs.airaidermasterdataservice.entity;

import java.time.LocalDate;


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

import com.ibs.airaidermasterdataservice.util.AirAiderCommonConstants.LangCodes;

/**
 * @author 91940
 *
 */
@Entity
@Table(name = "AIR_AIDER_COUNTRY_DETAILS")
public class CountryDetailsEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int countryDetailId;

	@Column
	private String countryName;

	@Column(name = "LANG_CODE")
	private LangCodes langCode;
	

	@Column(name = "CREATED_ON")
	private LocalDate createdOn;
	
	@Column(name = "UPDATED_ON")
	private LocalDate updatedOn;

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "countryId", referencedColumnName = "COUNTRY_ID")
	private CountryEntity countryEntity;

	/**
	 * @return the countryDetailId
	 */
	public int getCountryDetailId() {
		return countryDetailId;
	}

	/**
	 * @param countryDetailId the countryDetailId to set
	 */
	public void setCountryDetailId(int countryDetailId) {
		this.countryDetailId = countryDetailId;
	}

	/**
	 * @return the countryName
	 */
	public String getCountryName() {
		return countryName;
	}

	/**
	 * @param countryName the countryName to set
	 */
	public void setCountryName(String countryName) {
		this.countryName = countryName;
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
	 * @return the countryEntity
	 */
	public CountryEntity getCountryEntity() {
		return countryEntity;
	}

	/**
	 * @param countryEntity the countryEntity to set
	 */
	public void setCountryEntity(CountryEntity countryEntity) {
		this.countryEntity = countryEntity;
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
