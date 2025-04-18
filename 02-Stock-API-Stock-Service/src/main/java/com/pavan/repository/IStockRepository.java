package com.pavan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pavan.entity.StockPrice;

public interface IStockRepository extends JpaRepository<StockPrice, Integer> {
	
	public StockPrice findByCompanyName(String companyName);

}
