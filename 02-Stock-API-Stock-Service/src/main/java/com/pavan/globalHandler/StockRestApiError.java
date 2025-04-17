package com.pavan.globalHandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.pavan.exception.StockNotFoundException;

@RestControllerAdvice
public class StockRestApiError {
	
	@ExceptionHandler(StockNotFoundException.class)
	public ResponseEntity<String> handleCompanyNotFoundException(StockNotFoundException snf)
	{
		return new ResponseEntity<String>(snf.getMessage(), HttpStatus.BAD_REQUEST);
	}
	

}
