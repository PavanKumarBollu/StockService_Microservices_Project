package com.pavan.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.pavan.service.StockService;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class StockUiController {
	
	
	@Autowired
	private StockService service;
	
	@GetMapping("/")
	public String loadPage()
	{
		return "index";
	}
	
	@GetMapping(value="/getTotalCost")
	public String getTotalCost(HttpServletRequest request, Map<String, Object> model)
	{
		String companyName = request.getParameter("companyName");
		String quantity = request.getParameter("quantity");
		
		String stockPrice = service.getTotalStockPrice(companyName,Integer.parseInt(quantity));
		model.put("msg", stockPrice);
		return "index";
	}

}
