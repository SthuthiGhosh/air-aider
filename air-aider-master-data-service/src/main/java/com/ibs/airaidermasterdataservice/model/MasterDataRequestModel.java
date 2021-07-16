/**
 * 
 */
package com.ibs.airaidermasterdataservice.model;

import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Component;

/**
 * @author 91940
 *
 */
@Component
public class MasterDataRequestModel {
    
	private String queryId;
	private Set<String> airportCodeSet;
	private List<String> airportCodeList;
	private Set<String> airportCodesForCityInfo;
	/**
	 * @return the airportCodesForCityInfo
	 */
	public Set<String> getAirportCodesForCityInfo() {
		return airportCodesForCityInfo;
	}
	/**
	 * @param airportCodesForCityInfo the airportCodesForCityInfo to set
	 */
	public void setAirportCodesForCityInfo(Set<String> airportCodesForCityInfo) {
		this.airportCodesForCityInfo = airportCodesForCityInfo;
	}
	/**
	 * @return the airportCodeList
	 */
	public List<String> getAirportCodeList() {
		return airportCodeList;
	}
	/**
	 * @param airportCodeList the airportCodeList to set
	 */
	public void setAirportCodeList(List<String> airportCodeList) {
		this.airportCodeList = airportCodeList;
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
	 * @return the airportCodeSet
	 */
	public Set<String> getAirportCodeSet() {
		return airportCodeSet;
	}
	/**
	 * @param airportCodeSet the airportCodeSet to set
	 */
	public void setAirportCodeSet(Set<String> airportCodeSet) {
		this.airportCodeSet = airportCodeSet;
	}
	
}
