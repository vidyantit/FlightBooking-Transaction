package com.vid.springboot.java.exception;

import java.lang.reflect.Constructor;

public class InsuffientAmountException extends RuntimeException {
	
	public InsuffientAmountException(String message){
		super(message);
	}

}
