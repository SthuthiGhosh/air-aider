/**
 * 
 */
package com.ibs.airaidermasterdataservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.ibs.airaidermasterdataservice.entity.AirportDetailsEntity;
import com.ibs.airaidermasterdataservice.entity.AirportEntity;
import com.ibs.airaidermasterdataservice.repository.AirportDetailsRepository;
import com.ibs.airaidermasterdataservice.repository.AirportRepository;
import com.ibs.airaidermasterdataservice.util.AirAiderCommonConstants.LangCodes;

/**
 * @author 91940
 *
 */
@Configuration
public class LoadDatabase implements CommandLineRunner {

	@Autowired
	private AirportRepository airportRepository;

	@Autowired
	private AirportDetailsRepository airportDetailsRepository;

	/*
	 * @see org.springframework.boot.CommandLineRunner#run(java.lang.String[])
	 */
	@Override
	public void run(String... args) throws Exception {

		
		AirportDetailsEntity airportDetailsEntity1 = new AirportDetailsEntity();
		airportDetailsEntity1.setLangCode(LangCodes.EN);
		airportDetailsEntity1.setAirportName("calicut");
		airportDetailsEntity1.setAirportId(1);
		
		AirportEntity airportEntity1 = new AirportEntity();
		airportEntity1.setAirportCode("AAA");
		airportEntity1.setCityId(123);
		airportEntity1.setAirportDetailsEntity(airportDetailsEntity1);
		airportRepository.save(airportEntity1);
		
		AirportDetailsEntity airportDetailsEntity2 = new AirportDetailsEntity();
		airportDetailsEntity2.setLangCode(LangCodes.JA);
		airportDetailsEntity2.setAirportName("Tokyo");
		airportDetailsEntity2.setAirportId(3);
		
		AirportEntity airportEntity2 = new AirportEntity();
		airportEntity2.setCityId(234);
		airportEntity2.setAirportCode("BBB");
		airportEntity2.setAirportDetailsEntity(airportDetailsEntity2);
		airportRepository.save(airportEntity2);


		
		
		

	}

}
