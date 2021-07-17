/**
 * 
 */
package com.ibs.airaidermasterdataservice.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.ibs.airaidermasterdataservice.entity.AirportDetailsEntity;
import com.ibs.airaidermasterdataservice.util.AirAiderCommonConstants.LangCodes;

/**
 * @author 91940 
 * AirportDetailsModel is a class used to set airportdDetails data
 *         into the object of airportDetailsModel 
 */

public class AirportDetailsModel {

	private int airportdDetailId;

	private String airportName;

	private LangCodes langCode;
	
	private LocalDate createdOn;
	
	private LocalDate updatedOn;

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
	 * @return the airportdDetailId
	 */
	public int getAirportdDetailId() {
		return airportdDetailId;
	}

	/**
	 * @param airportdDetailId the airportdDetailId to set
	 */
	public void setAirportdDetailId(int airportdDetailId) {
		this.airportdDetailId = airportdDetailId;
	}

	/**
	 * @return the airportName
	 */
	public String getAirportName() {
		return airportName;
	}

	/**
	 * @param airportName the airportName to set
	 */
	public void setAirportName(String airportName) {
		this.airportName = airportName;
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
	public static List<AirportDetailsModel> entityToModel(List<AirportDetailsEntity> airportDetailsEntity) {
		List<AirportDetailsModel> airportDetailsModels = new ArrayList<>();

		for (AirportDetailsEntity airportDetail : airportDetailsEntity) {
			AirportDetailsModel airportDetailsModel = new AirportDetailsModel();
			airportDetailsModel.setAirportdDetailId(airportDetail.getAirportdDetailId());
			airportDetailsModel.setAirportName(airportDetail.getAirportName());
			airportDetailsModel.setLangCode(airportDetail.getLangCode());
			airportDetailsModel.setCreatedOn(airportDetail.getCreatedOn());
			airportDetailsModel.setUpdatedOn(airportDetail.getUpdatedOn());
			airportDetailsModels.add(airportDetailsModel);
		}
		return airportDetailsModels;
	}
}
