package com.sparta.springBasic.week01.models;


import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class PersonRequestDto {
    private String name;
    private int age;
    private String address;
    private String job;

    public PersonRequestDto(String name, int age, String address, String job) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.job = job;
    }
}
