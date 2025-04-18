package com.pavan.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pavan.client.StockClient;

@RestController
@RequestMapping(value="/calc")
public class StockCalculationRestController {
	
	@Autowired
	private StockClient client;

	@GetMapping(value="/calculate/{companyName}/{quantity}")
	public ResponseEntity<?> caluculate(@PathVariable String companyName, @PathVariable Integer quantity)
	{
		
		return null;
	}
	
}
