package com.anhdungpham.adapter;

public class Person implements IPerson {
    private final IStudent iStudent;

    public Person(IStudent iStudent) {
        super();
        this.iStudent = iStudent;
    }

    @Override
    public String getName() {
        return iStudent.getName();
    }

    @Override
    public void name() {
        //Firstname + lastName
        iStudent.firstName();
        iStudent.lastName();
    }
}
