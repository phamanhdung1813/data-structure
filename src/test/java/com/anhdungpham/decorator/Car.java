package com.anhdungpham.decorator;

public abstract class Car {
    protected String carName;

    public String getCarName() {
        return carName;
    }

    public abstract Integer price();
}
