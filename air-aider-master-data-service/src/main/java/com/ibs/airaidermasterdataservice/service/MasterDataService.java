/**
 * 
 */
package com.ibs.airaidermasterdataservice.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.ibs.airaidermasterdataservice.model.MasterDataRequestModel;
import com.ibs.airaidermasterdataservice.model.MasterDataResponseModel;

/**
 * @author 91940
 *
 */
public class MasterDataService {

	@Autowired
	AirportMasterDataService airportMasterDataService;

	public MasterDataResponseModel fetchMasterData(MasterDataRequestModel masterDataRequestModel) {
		if (masterDataRequestModel.getAirportCodeSet() != null) {
			airportMasterDataService.getAirportDetails(masterDataRequestModel.getAirportCodeSet(),
					masterDataRequestModel.getQueryId());
		}

		return null;

	}
}
