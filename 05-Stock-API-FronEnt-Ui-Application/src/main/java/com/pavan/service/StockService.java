package com.pavan.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service(value = "service")
public class StockService {

	public String getTotalStockPrice(String compnayName, Integer quantity) {
		final String REST_ENT_POINT = "http://nobody:3333/api/calc/calc/calculate/{companyName}/{quantity}";
		String result = null;
		WebClient client = WebClient.create();
		try {
			result = client.get().uri(REST_ENT_POINT, compnayName, quantity).retrieve().bodyToMono(String.class)
					.block();
		} catch (Exception e) {
			result="Company not found";
		}
		return result;
	}

}
