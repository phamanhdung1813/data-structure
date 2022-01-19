package com.anhdungpham.builder;

public class PersonBuilder {
    private String fistName;
    private String lastName;
    private Integer age;

    public PersonBuilder setFistName(String fistName) {
        this.fistName = fistName;
        return this;
    }

    public PersonBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public PersonBuilder setAge(Integer age) {
        this.age = age;
        return this;
    }

    public Person builder() {
        return new Person(fistName, lastName, age);
    }
}
