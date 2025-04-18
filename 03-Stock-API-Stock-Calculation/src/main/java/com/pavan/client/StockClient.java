package com.pavan.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "02-Stock-API-Stock-Service")
public interface StockClient {

	@GetMapping(value="/price/stockprice/{company}")
	public ResponseEntity<Double> getStockPrice(@PathVariable String company);
	
	
}
