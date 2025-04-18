package com.pavan.restcontroller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/calc")
public class StockCalculationRestController {

	@GetMapping(value="/calculate/{companyName}/{quantity}")
	public ResponseEntity<?> caluculate(@PathVariable String companyName, @PathVariable Integer quantity)
	{
		return null;
	}
	
}
