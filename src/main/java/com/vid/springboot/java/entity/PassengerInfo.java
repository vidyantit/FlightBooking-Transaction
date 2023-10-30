package com.vid.springboot.java.entity;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name="PassengerInfo")
@AllArgsConstructor
@NoArgsConstructor
public class PassengerInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long pid;
	private String name;
	private String email;
	private String source;
	private String destination;
	@JsonFormat(shape = Shape.STRING,pattern = "dd-mm-yyyy")
	private Date travelDate;
	private String pickupTime;
	private String arrivalTime;
	private double fare;
	
	
}
