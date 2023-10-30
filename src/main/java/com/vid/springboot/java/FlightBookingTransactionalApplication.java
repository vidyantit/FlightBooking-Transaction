package com.vid.springboot.java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vid.springboot.java.dto.FlightBookingAcknowledgement;
import com.vid.springboot.java.dto.FlightBookingRequest;
import com.vid.springboot.java.entity.service.FlightBookingService;

@EnableTransactionManagement
@RestController
@SpringBootApplication
public class FlightBookingTransactionalApplication {

	@Autowired
	private FlightBookingService flightBookingService;
	
	
	@PostMapping("/bookFlightTicket")
	public FlightBookingAcknowledgement bookFlightTicket(@RequestBody FlightBookingRequest request) {
		return flightBookingService.bookFligtTicket(request);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(FlightBookingTransactionalApplication.class, args);
		
	}

}




/*
 * { "passengerInfo":{ "name":"vidyant", "email":"singh@gmail.com",
 * "source":"bangalore", "destination":"delhi", "travelDate":"11-12-2022",
 * "pickupTime":"4-pm", "arrivalTime":"6-pm", "fare":12000 },"paymentInfo":{
 * "accountNo":"acc1", "cardType":"Debit" } }
 */