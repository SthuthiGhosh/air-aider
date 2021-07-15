/**
 * 
 */
package com.ibs.airaidermasterdataservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibs.airaidermasterdataservice.model.MasterDataRequestModel;
import com.ibs.airaidermasterdataservice.model.MasterDataResponseModel;
import com.ibs.airaidermasterdataservice.service.MasterDataService;

/**
 * @author 91940
 *Controller class 
 */
@RestController
@RequestMapping("/airport")
public class AirportMasterDataController {

	/**
	 * Bean injected for master data services
	 */
	@Autowired
	private MasterDataService masterDataService;

	/**
	 * @param masterDataRequestModel
	 * @return
	 * Method for fetch airport details entity for all the given airport codes
	 */
	@PostMapping("/fetchmasterdata")
	MasterDataResponseModel fetchMasterData(@RequestBody MasterDataRequestModel masterDataRequestModel) {
		return masterDataService.fetchMasterData(masterDataRequestModel);

	}
}
