/**
 * 
 */
package com.ibs.airaidermasterdataservice.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.ibs.airaidermasterdataservice.entity.AirportDetailsEntity;
import com.ibs.airaidermasterdataservice.model.AirportDetailsModel;
import com.ibs.airaidermasterdataservice.model.MasterDataResponseModel;

/**
 * @author 91940
 *
 */
@Service
public class AirportMasterDataServiceImpl implements AirportMasterDataService {

	/*
	 * @see com.ibs.airaidermasterdataservice.service.AirportMasterDataService#
	 * getAirportDetails(java.util.Set, java.lang.String)
	 */
	@Override
	public MasterDataResponseModel getAirportDetails(Set<String> airportCodeSet, String queryId) {
		MasterDataResponseModel masterDataResponseModel = new MasterDataResponseModel();
		masterDataResponseModel.setQueryId(queryId);
		Map<String, AirportDetailsModel> airportDetailsMap = new HashMap<>();
		for (String airportCode : airportCodeSet) {
			AirportDetailsEntity airportDetailsEntity = new AirportDetailsEntity();
			airportDetailsMap.put(airportCode, AirportDetailsModel.entityToModel(airportDetailsEntity));
		}
		masterDataResponseModel.setAirportDetails(airportDetailsMap);

		return masterDataResponseModel;
	}

}
