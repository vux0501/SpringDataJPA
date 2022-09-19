package com.spring.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.spring.demo.repository.MayBayRepository;
import com.spring.demo.model.Maybay;

@RestController
public class MaybayController {
    @Autowired
    private MayBayRepository mbRes;

    @GetMapping("cau2")
    public List<Maybay> cau2(){
        return mbRes.findByTambayMoreThanNKm(10000);
    }

}