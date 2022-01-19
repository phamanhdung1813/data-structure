package com.anhdungpham.pripro;

import org.junit.jupiter.api.Test;

public class TestService {
    @Test
    void test() {
        Test1 test1 = new Test1();
        test1.name1 = "Anh";
        test1.setName2("Pham");
        System.out.println(test1.name1);
        System.out.println(test1.getName2());

        Dog dog = new Dog();
        dog.setName("TOM");
        System.out.println(dog.getName());

    }
}
