package com.brody.start.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.brody.start.models.Strategy;

@Repository
public interface StratRepository extends CrudRepository<Strategy, Long>{
	List<Strategy> findAll();
}
