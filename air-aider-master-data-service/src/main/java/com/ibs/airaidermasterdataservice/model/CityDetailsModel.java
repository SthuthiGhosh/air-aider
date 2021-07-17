/**
 * 
 */
package com.ibs.airaidermasterdataservice.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.ibs.airaidermasterdataservice.entity.CityDetailsEntity;
import com.ibs.airaidermasterdataservice.util.AirAiderCommonConstants.LangCodes;

/**
 * @author 91940 CityDetailsModel is a class used to set cityDetails data into
 *         the object of cityDetailsModel
 */
public class CityDetailsModel {

	private int cityDetailId;
	private String cityName;
	private LangCodes langCode;
	private LocalDate createdOn;
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

	/**
	 * @param airportDetailsEntity
	 * @return list &lt;AirportDetailsModel &gt;List of AirportDetailsModel
	 */
	public static List<CityDetailsModel> entityToModel(List<CityDetailsEntity> cityDetailsEntity) {
		List<CityDetailsModel> cityDetailsModels = new ArrayList<>();

		for (CityDetailsEntity cityDetail : cityDetailsEntity) {
			CityDetailsModel cityDetailsModel = new CityDetailsModel();
			cityDetailsModel.setCityDetailId(cityDetail.getCityDetailId());
			cityDetailsModel.setCityName(cityDetail.getCityName());
			cityDetailsModel.setLangCode(cityDetail.getLangCode());
			cityDetailsModel.setCreatedOn(cityDetail.getCreatedOn());
			cityDetailsModel.setUpdatedOn(cityDetail.getUpdatedOn());
			cityDetailsModels.add(cityDetailsModel);
		}
		return cityDetailsModels;
	}
}
