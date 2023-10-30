package com.vid.springboot.java.dto;

import com.vid.springboot.java.entity.PassengerInfo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlightBookingAcknowledgement {

	private String status;
	private double totalFare;
	private String pnrNo;
	private PassengerInfo passengerInfo;
}
