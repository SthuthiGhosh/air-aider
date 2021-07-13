/**
 * 
 */
package com.ibs.airaidermasterdataservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.ibs.airaidermasterdataservice.entity.AirportDetailsEntity;
import com.ibs.airaidermasterdataservice.entity.AirportEntity;
import com.ibs.airaidermasterdataservice.util.AirAiderCommonConstants.LangCodes;

/**
 * @author 91940
 *
 */
@Configuration
public class LoadDatabase implements CommandLineRunner {

	/*
	 * @see org.springframework.boot.CommandLineRunner#run(java.lang.String[])
	 */
	@Override
	public void run(String... args) throws Exception {
		AirportEntity airportEntity1 = new AirportEntity();
		airportEntity1.setAirportCode("AAA");
		airportEntity1.setCityId(123);
		
		
		AirportEntity airportEntity2 = new AirportEntity();
		airportEntity2.setCityId(234);
		airportEntity1.setAirportCode("BBB");
		
		
		AirportDetailsEntity airportDetailsEntity=new AirportDetailsEntity();
		airportDetailsEntity.setLangCode(LangCodes.EN);
		airportDetailsEntity.setAirportName("calicut");
		

	}

}
