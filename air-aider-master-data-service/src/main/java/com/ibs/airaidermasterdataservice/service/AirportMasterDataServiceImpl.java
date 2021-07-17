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
import com.ibs.airaidermasterdataservice.entity.CityDetailsEntity;
import com.ibs.airaidermasterdataservice.entity.CityEntity;
import com.ibs.airaidermasterdataservice.model.AirportDetailsModel;
import com.ibs.airaidermasterdataservice.model.CityDetailsModel;
import com.ibs.airaidermasterdataservice.model.MasterDataResponseModel;
import com.ibs.airaidermasterdataservice.model.MessageModel;
import com.ibs.airaidermasterdataservice.repository.AirportRepository;
import com.ibs.airaidermasterdataservice.repository.CityRepository;
import com.ibs.airaidermasterdataservice.util.AirAiderCommonConstants.LangCodes;

/**
 * @author 91940 Implementation class for airport master data services interface
 *
 */
@Service
public class AirportMasterDataServiceImpl implements AirportMasterDataService {

	/**
	 * Bean injected for Airport repository
	 */
	@Autowired
	private AirportRepository airportRepository;

	/**
	 * Bean injected for City repository
	 */
	@Autowired
	private CityRepository cityRepository;

	/*
	 * @see com.ibs.airaidermasterdataservice.service.AirportMasterDataService#
	 * getAirportDetails(java.util.Set, java.lang.String) Method for fetching
	 * airport info details from a set of airport codes
	 * 
	 * @return MasterDataResponseModel having required airport entity details
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
	 * getAirportDetailsByCode(java.util.List, java.lang.String) Method for fetching
	 * airport info details from a list of airport codes
	 * 
	 * @return MasterDataResponseModel having required airport entity details
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

	/*
	 * @see com.ibs.airaidermasterdataservice.service.AirportMasterDataService#
	 * getCityInfoByAirportCode(java.util.Set, java.lang.String)
	 * 
	 * @return MasterDataResponseModel having city information by airport codes
	 */
	@Override
	public MasterDataResponseModel getCityInfoByAirportCode(Set<String> airportCodesForCityInfo, String queryId) {
		MasterDataResponseModel masterDataResponseModel = new MasterDataResponseModel();
		masterDataResponseModel.setQueryId(queryId);
		Map<String, CityEntity> cityInfo = new HashMap<>();
		List<MessageModel> messageList = new ArrayList<>();
		List<CityEntity> cityEntities = cityRepository.findAll();
		for (String airportCode : airportCodesForCityInfo) {
			for (CityEntity city : cityEntities) {
				List<AirportEntity> airportList = city.getAirportEntities();
				for (AirportEntity airport : airportList) {
					if (airport.getAirportCode().equals(airportCode)) {
						cityInfo.put(airportCode, city);
					}
				}
			}
		}
		masterDataResponseModel.setCityInfo(cityInfo);
		return masterDataResponseModel;
	}

	/*
	 * @see com.ibs.airaidermasterdataservice.service.AirportMasterDataService#
	 * getAirportDetails(int, java.lang.String)
	 * 
	 * @return MasterDataResponseModel having required airport entity details by
	 * airport id
	 */
	@Override
	public MasterDataResponseModel getAirportDetails(int airportId, String queryId) {
		MasterDataResponseModel masterDataResponseModel = new MasterDataResponseModel();
		masterDataResponseModel.setQueryId(queryId);
		Map<LangCodes, AirportDetailsModel> airportDetail = new HashMap<>();
		List<MessageModel> messageList = new ArrayList<>();
		AirportEntity airportEntity = airportRepository.findByAirportId(airportId);
		if (airportEntity != null) {
			List<AirportDetailsEntity> airportDetailsEntity = airportEntity.getAirportDetailsEntity();
			List<AirportDetailsModel> airportDetailList = AirportDetailsModel.entityToModel(airportDetailsEntity);
			for (AirportDetailsModel model : airportDetailList) {
				airportDetail.put(model.getLangCode(), model);
			}

		} else {
			MessageModel messageModel = new MessageModel();
			messageModel.setMessage("Invalid airport Id" + airportId);
			messageList.add(messageModel);
		}
		if (messageList != null) {
			masterDataResponseModel.setMessageList(messageList);
		}
		masterDataResponseModel.setAirportDetail(airportDetail);
		return masterDataResponseModel;
	}

	/*
	 * @see com.ibs.airaidermasterdataservice.service.AirportMasterDataService#
	 * getCityInfoByCityCode(java.util.List, java.lang.String)
	 * 
	 * @return MasterDataResponseModel having required city details info by city
	 * code
	 */
	@Override
	public MasterDataResponseModel getCityInfoByCityCode(List<String> cityCodeSet, String queryId) {
		MasterDataResponseModel masterDataResponseModel = new MasterDataResponseModel();
		masterDataResponseModel.setQueryId(queryId);
		Map<String, HashMap<LangCodes, CityDetailsModel>> cityInfoDetails = new HashMap<>();
		HashMap<LangCodes, CityDetailsModel> cityMap = new HashMap<>();
		List<MessageModel> messageList = new ArrayList<>();
		for (String cityCode : cityCodeSet) {
			CityEntity cityEntity = cityRepository.findByCityCode(cityCode);
			if (cityEntity != null) {
				List<CityDetailsEntity> cityDetailsEntity = cityEntity.getCityDetailsEntity();
				List<CityDetailsModel> cityDetailList = CityDetailsModel.entityToModel(cityDetailsEntity);
				for (CityDetailsModel model : cityDetailList) {
					cityMap.put(model.getLangCode(), model);
				}
				cityInfoDetails.put(cityCode, cityMap);

			} else {
				MessageModel messageModel = new MessageModel();
				messageModel.setMessage("Invalid city code" + cityCode);
				messageList.add(messageModel);
			}
		}
		if (messageList != null) {

			masterDataResponseModel.setMessageList(messageList);
		}
		masterDataResponseModel.setCityInfoDetails(cityInfoDetails);
		return masterDataResponseModel;

	}

	/*
	 * @see com.ibs.airaidermasterdataservice.service.AirportMasterDataService#
	 * getCityDetails(int, java.lang.String)
	 * 
	 * @return MasterDataResponseModel having required city details info by city id
	 */
	@Override
	public MasterDataResponseModel getCityDetails(int cityId, String queryId) {
		MasterDataResponseModel masterDataResponseModel = new MasterDataResponseModel();
		masterDataResponseModel.setQueryId(queryId);
		Map<LangCodes, CityDetailsModel> cityDetail = new HashMap<>();
		List<MessageModel> messageList = new ArrayList<>();
		CityEntity cityEntity = cityRepository.findByCityId(cityId);
		if (cityEntity != null) {
			List<CityDetailsEntity> cityDetailsEntity = cityEntity.getCityDetailsEntity();
			List<CityDetailsModel> cityDetailList = CityDetailsModel.entityToModel(cityDetailsEntity);
			for (CityDetailsModel model : cityDetailList) {
				cityDetail.put(model.getLangCode(), model);
			}
		} else {
			MessageModel messageModel = new MessageModel();
			messageModel.setMessage("Invalid city Id" + cityId);
			messageList.add(messageModel);
		}
		if (messageList != null) {
			masterDataResponseModel.setMessageList(messageList);
		}
		masterDataResponseModel.setCityDetail(cityDetail);
		return masterDataResponseModel;

	}
}
