/**
 * 
 */
package com.ibs.airaidermasterdataservice.service;

import java.util.Set;

import com.ibs.airaidermasterdataservice.model.MasterDataResponseModel;

/**
 * @author 91940
 *
 */
public interface AirportMasterDataService {

	MasterDataResponseModel getAirportDetails(Set<String> airportCodeSet, String queryId);

}
