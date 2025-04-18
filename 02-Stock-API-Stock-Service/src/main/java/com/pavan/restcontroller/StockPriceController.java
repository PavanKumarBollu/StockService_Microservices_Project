package com.pavan.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pavan.service.IStockPriceService;

@RestController
@RequestMapping(value="/price")
public class StockPriceController {
	
	@Autowired
	private IStockPriceService service;
	
	public ResponseEntity<Double> getStockPrice(String companyName)
	{
		Double price = service.findByCompanyName(companyName);
		System.out.println("company name and price + " + companyName + price);
		return new ResponseEntity<Double> (price, HttpStatus.OK);
	}
	

}
