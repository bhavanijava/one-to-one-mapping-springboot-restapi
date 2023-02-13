package com.web.advise;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.web.exception1.CustomerNotFoundException;


@RestControllerAdvice
public class HandlerMethods {

	@ExceptionHandler(CustomerNotFoundException.class)
	public Map<String,String> handleCustomerServiceException(CustomerNotFoundException ex)
	{
		Map<String,String> errorMap=new HashMap<>();
		errorMap.put("errorMessage", ex.getMessage());
		return errorMap;
	}
}