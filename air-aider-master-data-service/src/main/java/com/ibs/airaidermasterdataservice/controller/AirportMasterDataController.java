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
 *
 */
@RestController
@RequestMapping("/airport")
public class AirportMasterDataController {
	
	@Autowired
	private MasterDataService masterDataService;
	

	@PostMapping("/fetchmasterdata")
	MasterDataResponseModel fetchMasterData(@RequestBody MasterDataRequestModel masterDataRequestModel) {
		return masterDataService.fetchMasterData(masterDataRequestModel);
		
	}
}
