/**
 * 
 */
package com.ibs.airaidermasterdataservice.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.ibs.airaidermasterdataservice.entity.CityEntity;
import com.ibs.airaidermasterdataservice.util.AirAiderCommonConstants.LangCodes;

/**
 * @author 91940
 * MasterDataResponseModel is a class used to set Response data
 */
@Component
public class MasterDataResponseModel {

	private String queryId;
	private Map<String, HashMap<LangCodes, AirportDetailsModel>> airportDetails;
	private List<MessageModel> messageList;
	private Map<String,CityEntity>cityInfo;
    private Map<LangCodes, AirportDetailsModel> airportDetail;
	
	/**
	 * @return the cityInfo
	 */
	public Map<String, CityEntity> getCityInfo() {
		return cityInfo;
	}

	/**
	 * @return the airportDetail
	 */
	public Map<LangCodes, AirportDetailsModel> getAirportDetail() {
		return airportDetail;
	}

	/**
	 * @param airportDetail the airportDetail to set
	 */
	public void setAirportDetail(Map<LangCodes, AirportDetailsModel> airportDetail) {
		this.airportDetail = airportDetail;
	}

	/**
	 * @param cityInfo the cityInfo to set
	 */
	public void setCityInfo(Map<String, CityEntity> cityInfo) {
		this.cityInfo = cityInfo;
	}

	/**
	 * @return the messageList
	 */
	public List<MessageModel> getMessageList() {
		return messageList;
	}

	/**
	 * @param messageList the messageList to set
	 */
	public void setMessageList(List<MessageModel> messageList) {
		this.messageList = messageList;
	}

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
	public Map<String, HashMap<LangCodes, AirportDetailsModel>> getAirportDetails() {
		return airportDetails;
	}

	/**
	 * @param airportDetails the airportDetails to set
	 */
	public void setAirportDetails(Map<String, HashMap<LangCodes, AirportDetailsModel>> airportDetails) {
		this.airportDetails = airportDetails;
	}

//	/**
//	 * @return the airportDetails
//	 */
//	public Map<String, AirportDetailsModel> getAirportDetails() {
//		return airportDetails;
//	}
//
//	/**
//	 * @param airportDetails the airportDetails to set
//	 */
//	public void setAirportDetails(Map<String, AirportDetailsModel> airportDetails) {
//		this.airportDetails = airportDetails;
//	}

}
