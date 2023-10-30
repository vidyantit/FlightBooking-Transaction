package com.vid.springboot.java.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vid.springboot.java.entity.PassengerInfo;

@Repository
public interface PassengerInfoRepository extends JpaRepository<PassengerInfo, Long> {

}
