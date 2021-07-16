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
 * Interface for airport master data services
 *
 */
@Service
public interface AirportMasterDataService {

	/**
	 * @param airportCodeSet
	 * @param queryId
	 * @return MasterDataResponseModel having required airport entity details 
	 */
	MasterDataResponseModel getAirportDetails(Set<String> airportCodeSet, String queryId);

	/**
	 * @param airportCodeList
	 * @param queryId
	 * @return MasterDataResponseModel having required airport entity details 
	 */
	MasterDataResponseModel getAirportDetailsByCode(List<String> airportCodeList, String queryId);

	/**
	 * @param airportCodesForCityInfo
	 * @param queryId
	 * @return MasterDataResponseModel having city information
	 */
	MasterDataResponseModel getCityInfoByAirportCode(Set<String> airportCodesForCityInfo, String queryId);

	/**
	 * @param airportId
	 * @param queryId
	 * @return MasterDataResponseModel having required airport entity details 
	 */
	MasterDataResponseModel getAirportDetails(int airportId, String queryId);

}
