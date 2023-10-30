package com.vid.springboot.java.entity.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;

import com.vid.springboot.java.Utils.PaymentUtil;
import com.vid.springboot.java.dto.FlightBookingAcknowledgement;
import com.vid.springboot.java.dto.FlightBookingRequest;
import com.vid.springboot.java.entity.PassengerInfo;
import com.vid.springboot.java.entity.PaymentInfo;
import com.vid.springboot.java.repository.PassengerInfoRepository;
import com.vid.springboot.java.repository.PaymentInfoRepository;



@Service
public class FlightBookingService {

	@Autowired
	private PassengerInfoRepository passengerInfoRepository;
	@Autowired
	private PaymentInfoRepository paymentInfoRepository;
	
	@org.springframework.transaction.annotation.Transactional(readOnly = false, isolation = Isolation.READ_COMMITTED,propagation = Propagation.REQUIRED)
	public FlightBookingAcknowledgement bookFligtTicket(FlightBookingRequest flightBookingRequest) {
		
	
		
		PassengerInfo passengerInfo=flightBookingRequest.getPassengerInfo();
		passengerInfoRepository.save(passengerInfo);
		
		PaymentInfo paymentInfo=flightBookingRequest.getPaymentInfo();
		
		PaymentUtil.validateCreditLimit(paymentInfo.getAccountNo(), passengerInfo.getFare());
		paymentInfo.setPassengerId(passengerInfo.getPid());
		paymentInfo.setAmount(passengerInfo.getFare());
		
		paymentInfoRepository.save(paymentInfo);
		
		return new FlightBookingAcknowledgement("SUCESS",passengerInfo.getFare(),UUID.randomUUID().toString().split("-")[0],passengerInfo);
		
	}
}
