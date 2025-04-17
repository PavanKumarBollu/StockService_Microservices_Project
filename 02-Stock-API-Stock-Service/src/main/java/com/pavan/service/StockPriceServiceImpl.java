package com.pavan.service;

import org.springframework.stereotype.Service;

@Service(value="service")
public class StockPriceServiceImpl implements IStockPriceService {

	@Override
	public Double findByCompanyName(String companyName) {
		return null;
	}

}
