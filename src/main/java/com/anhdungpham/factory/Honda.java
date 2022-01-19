package com.anhdungpham.factory;

public class Honda implements Car {
    private String name;
    private boolean red;

    public Honda() {
        this.red = false;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public boolean isRed() {
        return this.red;
    }
}
