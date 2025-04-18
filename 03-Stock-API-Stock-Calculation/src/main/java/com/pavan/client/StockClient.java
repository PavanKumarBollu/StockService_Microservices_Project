package com.pavan.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;

@FeignClient(name = "02-Stock-API-Stock-Service")
public interface StockClient {

	public ResponseEntity<String> getStockPrice(String company);
	
	
}
