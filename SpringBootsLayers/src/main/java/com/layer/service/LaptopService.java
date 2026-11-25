package com.layer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.layer.model.Laptop;
import com.layer.repo.LaptopRepo;

@Service
public class LaptopService {

	@Autowired
	private LaptopRepo repo;
	public void addLap(Laptop laptop) {
		// TODO Auto-generated method stub
		repo.save(laptop);
	}

}
