package com.spring.demo;

import java.util.List;
import java.util.Optional;

import com.spring.demo.ChuyenBay;

import org.springframework.data.repository.CrudRepository;

public interface ChuyenBayRepository extends CrudRepository<ChuyenBay, String> {
	Optional<ChuyenBay> findById(String primaryKey);
	
}
