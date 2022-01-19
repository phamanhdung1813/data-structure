package com.anhdungpham.decorator;

public class CarBasicInfo extends Car {

    public CarBasicInfo() {
        this.carName = "Honda";
    }

    @Override
    public Integer price() {
        return 15;
    }

}
