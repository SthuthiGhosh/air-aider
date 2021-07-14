/**
 * 
 */
package com.ibs.airaidermasterdataservice.model;

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
