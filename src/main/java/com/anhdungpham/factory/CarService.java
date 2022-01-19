package com.anhdungpham.factory;

import org.springframework.stereotype.Component;

@Component
public class CarService {
    public Car createCar(String carType) {
        if (carType.equals("honda")) {
            return new Honda();
        } else {
            return null;
        }
    }
}
