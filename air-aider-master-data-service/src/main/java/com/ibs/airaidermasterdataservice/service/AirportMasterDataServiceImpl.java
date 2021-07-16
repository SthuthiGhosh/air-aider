/**
 * 
 */
package com.ibs.airaidermasterdataservice.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibs.airaidermasterdataservice.entity.AirportDetailsEntity;
import com.ibs.airaidermasterdataservice.entity.AirportEntity;
import com.ibs.airaidermasterdataservice.model.AirportDetailsModel;
import com.ibs.airaidermasterdataservice.model.MasterDataResponseModel;
import com.ibs.airaidermasterdataservice.model.MessageModel;
import com.ibs.airaidermasterdataservice.repository.AirportRepository;
import com.ibs.airaidermasterdataservice.util.AirAiderCommonConstants.LangCodes;

/**
 * @author 91940
 *
 */
@Service
public class AirportMasterDataServiceImpl implements AirportMasterDataService {

	/**
	 * Bean injected for Airport repository
	 */
	@Autowired
	private AirportRepository airportRepository;

	/*
	 * @see com.ibs.airaidermasterdataservice.service.AirportMasterDataService#
	 * getAirportDetails(java.util.Set, java.lang.String)
	 * Method for fetching airport info details from a set of airport codes
	 * 
	 */
	@Override
	public MasterDataResponseModel getAirportDetails(Set<String> airportCodeSet, String queryId) {
		MasterDataResponseModel masterDataResponseModel = new MasterDataResponseModel();
		masterDataResponseModel.setQueryId(queryId);
		HashMap<LangCodes, AirportDetailsModel> airportMap = new HashMap<>();
		Map<String, HashMap<LangCodes, AirportDetailsModel>> airportDetailsMap = new HashMap<>();
		List<MessageModel> messageList = new ArrayList<>();
		for (String airportCode : airportCodeSet) {
			AirportEntity airportEntity = airportRepository.findByAirportCode(airportCode);
			if (airportEntity != null) {
				List<AirportDetailsEntity> airportDetailsEntity = airportEntity.getAirportDetailsEntity();
				List<AirportDetailsModel> airportDetailList = AirportDetailsModel.entityToModel(airportDetailsEntity);
				for (AirportDetailsModel model : airportDetailList) {
					airportMap.put(model.getLangCode(), model);
					
				}
				airportDetailsMap.put(airportCode, airportMap);
				
			} else {
				MessageModel messageModel = new MessageModel();
				messageModel.setMessage("Invalid airport code" + airportCode);
				messageList.add(messageModel);
			}
		}
		if (messageList != null) {

			masterDataResponseModel.setMessageList(messageList);
		}
		masterDataResponseModel.setAirportDetails(airportDetailsMap);
		return masterDataResponseModel;
	}

	/*
	 * @see com.ibs.airaidermasterdataservice.service.AirportMasterDataService#
	 * getAirportDetailsByCode(java.util.List, java.lang.String)
	 * Method for fetching airport info details from a list of airport codes
	 */
	@Override
	public MasterDataResponseModel getAirportDetailsByCode(List<String> airportCodeList, String queryId) {
		MasterDataResponseModel masterDataResponseModel = new MasterDataResponseModel();
		masterDataResponseModel.setQueryId(queryId);
		HashMap<LangCodes, AirportDetailsModel> airportMap = new HashMap<>();
		Map<String, HashMap<LangCodes, AirportDetailsModel>> airportDetailsMap = new HashMap<>();
		List<MessageModel> messageList = new ArrayList<>();
		for (String airportCode : airportCodeList) {
			AirportEntity airportEntity = airportRepository.findByAirportCode(airportCode);
			if (airportEntity != null) {
				List<AirportDetailsEntity> airportDetailsEntity = airportEntity.getAirportDetailsEntity();
				List<AirportDetailsModel> airportDetailList = AirportDetailsModel.entityToModel(airportDetailsEntity);
				for (AirportDetailsModel model : airportDetailList) {
					airportMap.put(model.getLangCode(), model);
					
				}
				airportDetailsMap.put(airportCode, airportMap);
				
			} else {
				MessageModel messageModel = new MessageModel();
				messageModel.setMessage("Invalid airport code" + airportCode);
				messageList.add(messageModel);
			}
		}
		if (messageList != null) {

			masterDataResponseModel.setMessageList(messageList);
		}
		masterDataResponseModel.setAirportDetails(airportDetailsMap);
		return masterDataResponseModel;
}
}
