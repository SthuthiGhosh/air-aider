package com.ibs.airaidermasterdataservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 91940
 *@SpringBootApplication make my application a spring boot Application
 * Here is from this application starts to run
 * Auto configuration is done by spring Boot
 * Embedded server tomcat starts to run when application runs as java application
 */
@SpringBootApplication
public class AirAiderMasterDataServiceApplication {

	/**
	 * @param args
	 * Main method where application runs on server
	 */
	public static void main(String[] args) {
		SpringApplication.run(AirAiderMasterDataServiceApplication.class, args);
	}

}
