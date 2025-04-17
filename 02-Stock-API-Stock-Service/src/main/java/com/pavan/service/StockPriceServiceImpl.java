package com.pavan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pavan.repository.IStockRepository;

@Service(value="service")
public class StockPriceServiceImpl implements IStockPriceService {

	@Autowired
	private IStockRepository repo;
	
	@Override
	public Double findByCompanyName(String companyName) {
		return null;
	}

}
