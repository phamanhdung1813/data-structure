package com.anhdungpham.pripro;

public class Dog extends Animal {
    private String name;

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
