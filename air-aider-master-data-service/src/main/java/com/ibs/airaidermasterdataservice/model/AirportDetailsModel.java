/**
 * 
 */
package com.ibs.airaidermasterdataservice.model;

import java.util.ArrayList;
import java.util.List;

import com.ibs.airaidermasterdataservice.entity.AirportDetailsEntity;
import com.ibs.airaidermasterdataservice.util.AirAiderCommonConstants.LangCodes;

/**
 * @author 91940
 *
 */

public class AirportDetailsModel {

	private int airportdDetailId;

//	private int airportId;

	private String airportName;

	private LangCodes langCode;

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

	public static List<AirportDetailsModel> entityToModel(List<AirportDetailsEntity> airportDetailsEntity) {
		List<AirportDetailsModel> airportDetailsModels = new ArrayList<>();

		for (AirportDetailsEntity airportDetail : airportDetailsEntity) {
			AirportDetailsModel airportDetailsModel = new AirportDetailsModel();
			airportDetailsModel.setAirportdDetailId(airportDetail.getAirportdDetailId());
			airportDetailsModel.setAirportName(airportDetail.getAirportName());
			airportDetailsModel.setLangCode(airportDetail.getLangCode());
			airportDetailsModels.add(airportDetailsModel);
		}
		return airportDetailsModels;
	}
}
