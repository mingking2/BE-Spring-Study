package com.sparta.springBasic.week01.controller;

import com.sparta.springBasic.week01.assginment.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @GetMapping("/myinfo")
    public Person getPerson() {
        Person person = new Person();
        person.setName("주민기");
        person.setAge(23);
        person.setAddress("대구");
        person.setJob("에이전트");

        return person;
    }
}
