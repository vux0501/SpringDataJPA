package com.spring.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.demo.repository.ChuyenBayRepository;
import com.spring.demo.model.*;

@RestController
public class ChuyenBayController {
	 @Autowired
	    private ChuyenBayRepository cbRes;
	    @RequestMapping("cau1")
	    public List<ChuyenBay> cau1(){
	        return  cbRes.findByGaden("DAD");
	    }

	    
	    
  

}
