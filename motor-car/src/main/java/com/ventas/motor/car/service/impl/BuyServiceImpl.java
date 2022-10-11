package com.ventas.motor.car.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ventas.motor.car.model.entities.Buy;
import com.ventas.motor.car.repository.BuyRepository;
import com.ventas.motor.car.service.BuyService;

@Service
public class BuyServiceImpl implements BuyService {

	 @Autowired
	 private BuyRepository buyRepository;
	 
	@Override
	public void saveBuy(Buy buy) {
		this.buyRepository.save(buy);
	}

}
