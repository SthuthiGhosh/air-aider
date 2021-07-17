/**
 * 
 */
package com.ibs.airaidermasterdataservice.model;

import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Component;

/**
 * @author 91940
 * MasterDataRequestModel is a class used to get request data
 */
@Component
public class MasterDataRequestModel {
    
	private String queryId;
	private Set<String> airportCodeSet;
	private List<String> airportCodeList;
	private Set<String> airportCodesForCityInfo;
	private int airportId;
	private List<String> cityCodeSet;
	private int cityId;
	/**
	 * @return the cityId
	 */
	public int getCityId() {
		return cityId;
	}
	/**
	 * @param cityId the cityId to set
	 */
	public void setCityId(int cityId) {
		this.cityId = cityId;
	}
	/**
	 * @return the cityCodeSet
	 */
	public List<String> getCityCodeSet() {
		return cityCodeSet;
	}
	/**
	 * @param cityCodeSet the cityCodeSet to set
	 */
	public void setCityCodeSet(List<String> cityCodeSet) {
		this.cityCodeSet = cityCodeSet;
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
