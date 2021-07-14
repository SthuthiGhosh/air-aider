/**
 * 
 */
package com.ibs.airaidermasterdataservice.model;

import java.util.Map;

import org.springframework.stereotype.Component;

/**
 * @author 91940
 *
 */
@Component
public class MasterDataResponseModel {

	private String queryId;
	private Map<String, AirportDetailsModel> airportDetails;

	/**
	 * @return the queryId
	 */
	public String getQueryId() {
		return queryId;
	}

	/**
	 * @param queryId the queryId to set
	 */
	public void setQueryId(String queryId) {
		this.queryId = queryId;
	}

	/**
	 * @return the airportDetails
	 */
	public Map<String, AirportDetailsModel> getAirportDetails() {
		return airportDetails;
	}

	/**
	 * @param airportDetails the airportDetails to set
	 */
	public void setAirportDetails(Map<String, AirportDetailsModel> airportDetails) {
		this.airportDetails = airportDetails;
	}

}
