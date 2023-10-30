package com.vid.springboot.java.dto;

import com.vid.springboot.java.entity.PassengerInfo;
import com.vid.springboot.java.entity.PaymentInfo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlightBookingRequest {

	
	private PassengerInfo passengerInfo;
	private PaymentInfo paymentInfo;
}
