package com.pavan.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pavan.client.StockClient;

@RestController
@RequestMapping(value = "/calc")
public class StockCalculationRestController {

	@Autowired
	private StockClient client;

	@GetMapping(value = "/calculate/{companyName}/{quantity}")
	public ResponseEntity<?> caluculate(@PathVariable String companyName, @PathVariable Integer quantity) {
		ResponseEntity<?> response;
		Double totalStockPrice;
		try {

			response = client.getStockPrice(companyName);
			int statusCode = response.getStatusCode().value();
			if (statusCode == 200) {
				System.out.println("StockCalculationRestController.caluculate()");
				Double stockPrice = (Double) response.getBody();
				totalStockPrice = quantity * stockPrice;

				String result = "Total Stock Price of : " + companyName + " is : " + totalStockPrice;
				response = new ResponseEntity<String>(result, HttpStatus.OK);
			}
		} catch (Exception e) {
			response = new ResponseEntity<String>("Company Not Found", HttpStatus.BAD_REQUEST);
		}

		return response;
	}

}
