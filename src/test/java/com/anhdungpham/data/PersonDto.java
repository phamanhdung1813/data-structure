package com.anhdungpham.data;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class PersonDto {
    private String name; // firstName + lastName
    private Integer age;

    public static PersonDto mappingData(Person person) {
        return new PersonDto(person.getFirstName() + person.getLastName(), person.getAge());
    }
}
