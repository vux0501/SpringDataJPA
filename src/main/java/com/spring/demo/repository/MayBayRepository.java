package com.spring.demo.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.spring.demo.model.Maybay;
public interface MayBayRepository extends JpaRepository<Maybay,Integer>  {
	 @Query(value = "select * from maybay where tambay>=?1",nativeQuery = true)
	    public List<Maybay> findByTambayMoreThanNKm(Integer tambay);
}
