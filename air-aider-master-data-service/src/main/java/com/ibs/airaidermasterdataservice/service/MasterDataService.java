/**
 * 
 */
package com.ibs.airaidermasterdataservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibs.airaidermasterdataservice.model.MasterDataRequestModel;
import com.ibs.airaidermasterdataservice.model.MasterDataResponseModel;

/**
 * @author 91940 Master data service method for directing into particular
 *         services
 */

@Service
public class MasterDataService {

	/**
	 * Bean injected for Airport master data service
	 */
	@Autowired
	private AirportMasterDataService airportMasterDataService;

	/**
	 * Bean injected for master data response model
	 */
	@Autowired
	private MasterDataResponseModel masterDataResponseModel;

	/**
	 * @param masterDataRequestModel
	 * @return Method for directing apis into different different services This
	 *         method navigates to four different methods in the Air aider master
	 *         data services
	 */
	public MasterDataResponseModel fetchMasterData(MasterDataRequestModel masterDataRequestModel) {
		if (masterDataRequestModel.getAirportCodeSet() != null) {
			masterDataResponseModel = airportMasterDataService
					.getAirportDetails(masterDataRequestModel.getAirportCodeSet(), masterDataRequestModel.getQueryId());
		} else if (masterDataRequestModel.getAirportCodeList() != null) {
			masterDataResponseModel = airportMasterDataService.getAirportDetailsByCode(
					masterDataRequestModel.getAirportCodeList(), masterDataRequestModel.getQueryId());
		} else if (masterDataRequestModel.getAirportCodesForCityInfo() != null) {
			masterDataResponseModel = airportMasterDataService.getCityInfoByAirportCode(
					masterDataRequestModel.getAirportCodesForCityInfo(), masterDataRequestModel.getQueryId());
		} else if (masterDataRequestModel.getAirportId() != 0) {
			masterDataResponseModel = airportMasterDataService.getAirportDetails(masterDataRequestModel.getAirportId(),
					masterDataRequestModel.getQueryId());
		} else if (masterDataRequestModel.getCityCodeSet() != null) {
			masterDataResponseModel = airportMasterDataService.getCityInfoByCityCode(
					masterDataRequestModel.getCityCodeSet(), masterDataRequestModel.getQueryId());
		}else if (masterDataRequestModel.getCityId() != 0) {
			masterDataResponseModel = airportMasterDataService.getCityDetails(masterDataRequestModel.getCityId(),
					masterDataRequestModel.getQueryId());
		}
		return masterDataResponseModel;

	}
}
