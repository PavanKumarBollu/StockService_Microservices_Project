package com.pavan.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pavan.service.IStockPriceService;

@RestController
@RequestMapping(value="/price")
public class StockPriceController {
	
	@Autowired
	private IStockPriceService service;

}
