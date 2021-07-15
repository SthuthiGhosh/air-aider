/**
 * 
 */
package com.ibs.airaidermasterdataservice.service;

import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.ibs.airaidermasterdataservice.model.MasterDataResponseModel;

/**
 * @author 91940
 *
 */
@Service
public interface AirportMasterDataService {

	MasterDataResponseModel getAirportDetails(Set<String> airportCodeSet, String queryId);

//	MasterDataResponseModel getAirportDetailsByCode(List<String> airportCodeList, String queryId);

}
