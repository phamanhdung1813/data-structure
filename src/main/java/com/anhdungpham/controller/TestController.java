package com.anhdungpham.controller;

import com.anhdungpham.builder.Person;
import com.anhdungpham.builder.PersonBuilder;
import com.anhdungpham.factory.Car;
import com.anhdungpham.factory.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/")
public class TestController {
    @Autowired
    private CarService carService;

    @PostMapping("car/{type}/{name}")
    public Car test(@PathVariable String type, @PathVariable String name) {
        Car car = carService.createCar(type);
        car.setName(name);
        car.getName();
        car.isRed();
        return car;
    }

    @GetMapping("/person")
    public List<Person> getPerson() {

        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Anh", "Pham", 21));
        personList.add(new Person("Stanley", "Pham", null));

        personList.add(new PersonBuilder().setAge(22).setFistName("ABC").builder());
        return personList;
    }
}
