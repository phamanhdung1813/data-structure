package com.anhdungpham.decorator;

public class CarWithColor extends Color {
    private final CarBasicInfo carBasicInfo;

    public CarWithColor(CarBasicInfo carBasicInfo) {
        this.carBasicInfo = carBasicInfo;
    }

    @Override
    public Integer price() {
        return carBasicInfo.price() + 10;
    }

    @Override
    public String getColorName() {
        return "HONDA RED";
    }
}
