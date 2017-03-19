package com.test.model;

import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/3/19.
 */

public class Car
{
    private String brand = "红旗 CA72";
    private double price = 2000;
    public String getBrand(){
        return this.brand;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public double getPrice(){
        return this.price;
    }
    public void setPrice(double price){
        this.price = price;
    }

    @Override
    public String toString() {
        return "brand:" + brand + "," + "price:" + price;
    }

}
