/**
 * 
 */
package com.ibs.airaidermasterdataservice.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.ibs.airaidermasterdataservice.model.MasterDataRequestModel;
import com.ibs.airaidermasterdataservice.model.MasterDataResponseModel;

/**
 * @author 91940
 *
 */

@Service
public class MasterDataService {

	@Autowired
	private AirportMasterDataService airportMasterDataService;
	
	@Autowired
	private MasterDataResponseModel masterDataResponseModel;

	public MasterDataResponseModel fetchMasterData(MasterDataRequestModel masterDataRequestModel) {
		if (masterDataRequestModel.getAirportCodeSet() != null) {
		masterDataResponseModel=airportMasterDataService.getAirportDetails(masterDataRequestModel.getAirportCodeSet(),
					masterDataRequestModel.getQueryId());
		}

		return masterDataResponseModel;

	}
}
