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
	 * @return Method for direction into different services
	 */
	public MasterDataResponseModel fetchMasterData(MasterDataRequestModel masterDataRequestModel) {
		if (masterDataRequestModel.getAirportCodeSet() != null) {
			masterDataResponseModel = airportMasterDataService
					.getAirportDetails(masterDataRequestModel.getAirportCodeSet(), masterDataRequestModel.getQueryId());
		} else if (masterDataRequestModel.getAirportCodeList() != null) {
			masterDataResponseModel = airportMasterDataService.getAirportDetailsByCode(
					masterDataRequestModel.getAirportCodeList(), masterDataRequestModel.getQueryId());
		}

		return masterDataResponseModel;

	}
}
