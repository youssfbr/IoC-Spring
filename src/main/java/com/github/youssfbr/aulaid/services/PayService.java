package com.github.youssfbr.aulaid.services;

import org.springframework.stereotype.Service;

@Service
public class PayService {
	
	private final TaxService taxService;
	
	private final DeliverService deliverService;
	
	public PayService(TaxService taxService, DeliverService deliverService) {
		this.taxService = taxService;
		this.deliverService = deliverService;
	}
	
	public double finalPrice(double cost, String state) {
		
		return cost + deliverService.fee(state) + taxService.tax(cost);
	}

}

