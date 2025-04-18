package com.pavan.controller;

import java.net.http.HttpRequest;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.pavan.service.StockService;

@Controller
public class StockUiController {
	
	
	@Autowired
	private StockService service;
	
	@GetMapping("/")
	public String loadPage()
	{
		return "index";
	}
	
	public String getTotalCost(HttpRequest request, Map<String, Object> model)
	{
		
	}

}
