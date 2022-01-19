package com.anhdungpham.adapter;

import org.junit.jupiter.api.Test;

public class TestMethod {

    @Test
    void name() {
        IStudent iStudent = new Student();
        IPerson iPerson = new Person(iStudent);

        System.out.println(iPerson.getName());
        iPerson.name();
    }
}
