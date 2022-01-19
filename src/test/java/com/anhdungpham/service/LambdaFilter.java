package com.anhdungpham.service;

import com.anhdungpham.data.Person;
import com.anhdungpham.data.PersonDto;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LambdaFilter {

    @Test
    void name() {
        List<Person> personList = List.of(
                new Person("anh", "pham", 21),
                new Person("stanley", "dung", 22),
                new Person("jaa", "dung", 21)

        );

        System.out.println(personList.stream().map(PersonDto::mappingData).collect(Collectors.toList()));
    }

}
