package com.anhdungpham.decorator;

import org.junit.jupiter.api.Test;

public class TestDecorator {
    @Test
    void name() {
        CarBasicInfo carBasicInfo = new CarBasicInfo();
        System.out.println(carBasicInfo.carName);
        System.out.println(carBasicInfo.price());
        System.out.println("###############");

        CarWithColor carWithColor = new CarWithColor(carBasicInfo);
        System.out.println(carWithColor.price());
        System.out.println(carWithColor.getColorName());




    }
}
