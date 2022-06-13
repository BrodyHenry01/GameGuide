package com.brody.start.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.brody.start.models.Strategy;
import com.brody.start.repos.StratRepository;

public class StratService {
	
	@Autowired 
	private StratRepository repository;
	
	public List<Strategy> all() {
		return this.repository.findAll();
	}
	
	public void create(Strategy strategy) {
		repository.save(strategy);
	}
	
	public void delete(Long id) {
		this.repository.deleteById(id);
	}
	
	public Strategy retrieve(Long id) {
		return this.repository.findById(id).orElse(null);
	}
	public Strategy save(Strategy strategy) {
		return this.repository.save(strategy);
	}
}
