package com.pavan.client;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "02-Stock-API-Stock-Service")
public interface StockClient {

	
	
	
}
