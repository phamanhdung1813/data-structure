package com.anhdungpham.adapter;

public class Student implements IStudent {

    @Override
    public String getName() {
        return "ANH DUNG PHAM";
    }

    @Override
    public void firstName() {
        System.out.println("Anh");
    }

    @Override
    public void lastName() {
        System.out.println("Pham");
    }
}
