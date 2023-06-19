package com.sparta.springBasic.week01.controller;

import com.sparta.springBasic.week01.domain.Person;
import com.sparta.springBasic.week01.domain.PersonRepository;
import com.sparta.springBasic.week01.models.PersonRequestDto;
import com.sparta.springBasic.week01.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class PersonController {

    private final PersonRepository personRepository;


    @GetMapping("/api/persons")
    public List<Person> getPersons() {return personRepository.findAll();}

    private final PersonService personService;

    @PostMapping("/api/persons")
    public Person createPerson(@RequestBody PersonRequestDto requestDto) {
        Person person = new Person(requestDto);

        return personRepository.save(person);
    }

    @PutMapping("/api/persons/{id}")
    public Long updatePerson(@PathVariable Long id, @RequestBody PersonRequestDto requestDto) {
        return personService.update(id, requestDto);
    }

    @DeleteMapping("/api/persons/{id}")
    public Long deletePerson(@PathVariable Long id) {
        personRepository.deleteById(id);
        return id;
    }
}

