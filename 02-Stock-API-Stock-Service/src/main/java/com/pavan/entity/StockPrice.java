package com.pavan.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "STOCK_PRICE")
public class StockPrice {

	@Id
	private Integer stockId;
	private String companyName;
	private Double companyPrice;
}
