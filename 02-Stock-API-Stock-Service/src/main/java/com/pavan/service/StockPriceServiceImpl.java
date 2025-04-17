package com.pavan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pavan.entity.StockPrice;
import com.pavan.exception.StockNotFoundException;
import com.pavan.repository.IStockRepository;

@Service(value="service")
public class StockPriceServiceImpl implements IStockPriceService {

	@Autowired
	private IStockRepository repo;
	
	@Override
	public Double findByCompanyName(String companyName) {
		StockPrice stockPrice = repo.findByCompanyName(companyName);
		if(stockPrice == null)
		{
			throw new StockNotFoundException("Company Not Available With " + companyName + " Name");
		}
		
		return stockPrice.getCompanyPrice();
	}

}
