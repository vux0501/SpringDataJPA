package com.spring.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.spring.demo.model.ChuyenBay;

public interface ChuyenBayRepository extends JpaRepository<ChuyenBay, String> {
    public List<ChuyenBay> findByGaden(String gaden);

	
}
