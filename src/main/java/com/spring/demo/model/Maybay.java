package com.spring.demo.model;

import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Table(name = "maybay")
public class Maybay {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int mamb;
    private String loai;
    private int tambay;

}
