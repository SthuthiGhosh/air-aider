/**
 * 
 */
package com.ibs.airaidermasterdataservice.model;

import com.ibs.airaidermasterdataservice.entity.AirportDetailsEntity;
import com.ibs.airaidermasterdataservice.util.AirAiderCommonConstants.LangCodes;

/**
 * @author 91940
 *
 */

public class AirportDetailsModel {

	private int airportdDetailId;

	private int airportId;

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

	public static AirportDetailsModel entityToModel(AirportDetailsEntity airportDetailsEntity) {
		AirportDetailsModel airportDetailsModel = new AirportDetailsModel();
		airportDetailsModel.setAirportdDetailId(airportDetailsEntity.getAirportdDetailId());
//		airportDetailsModel.setAirportId(airportDetailsEntity.getAirportEntity().getAirportId());
		airportDetailsModel.setAirportName(airportDetailsEntity.getAirportName());
		airportDetailsModel.setLangCode(airportDetailsEntity.getLangCode());
		return airportDetailsModel;

	}
}
