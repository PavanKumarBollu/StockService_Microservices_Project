package com.pavan.restcontroller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/calc")
public class StockCalculationRestController {

	
	public ResponseEntity<?> caluculate(String companyName, Integer quantity)
	{
		
	}
	
}
