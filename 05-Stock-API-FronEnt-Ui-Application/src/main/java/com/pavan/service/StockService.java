package com.pavan.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service(value="service")
public class StockService {

	

	public String getTotalStockPrice(String compnayName, Integer quantity)
	{
		final String REST_ENT_POINT = "http://nobody:3333/api/calc/calc/calculate/{companyName}/{";
		WebClient client = WebClient.create();
		client.get().uri(REST_ENT_POINT,compnayName,quantity)
		return null;
	}
	
	
}
