/**
 * 
 */
package com.ibs.airaidermasterdataservice.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibs.airaidermasterdataservice.entity.AirportDetailsEntity;
import com.ibs.airaidermasterdataservice.entity.AirportEntity;
import com.ibs.airaidermasterdataservice.model.AirportDetailsModel;
import com.ibs.airaidermasterdataservice.model.MasterDataResponseModel;
import com.ibs.airaidermasterdataservice.repository.AirportDetailsRepository;
import com.ibs.airaidermasterdataservice.repository.AirportRepository;

/**
 * @author 91940
 *
 */
@Service
public class AirportMasterDataServiceImpl implements AirportMasterDataService {

	@Autowired
	private AirportDetailsRepository airportDetailsRepository;

	@Autowired
	private AirportRepository airportRepository;

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
			AirportEntity airportEntity = airportRepository.findByAirportCode(airportCode);
			AirportDetailsEntity airportDetailsEntity = airportDetailsRepository.findById(airportEntity.getAirportId())
					.get();
			airportDetailsMap.put(airportCode, AirportDetailsModel.entityToModel(airportDetailsEntity));
		}
		masterDataResponseModel.setAirportDetails(airportDetailsMap);

		return masterDataResponseModel;
	}

}
