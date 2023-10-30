package com.vid.springboot.java.entity;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Table(name="Payment_Info")
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class PaymentInfo {

	@Id
	@GeneratedValue(generator = "uuid2")
	private int paymentId;
	private String accountNo;
	private double amount;
	private String cardType;
	private Long passengerId;
	
}
