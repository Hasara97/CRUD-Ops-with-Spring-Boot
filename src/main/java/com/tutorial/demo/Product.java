package com.tutorial.demo;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Product {
    private Long id;
    private String name;
    private String brand;
    private String madein;
    private float price;

    protected Product(){

    }

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    public long getId(){

        return id;

    }
}
