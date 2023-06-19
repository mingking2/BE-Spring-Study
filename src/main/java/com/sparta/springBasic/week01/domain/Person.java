package com.sparta.springBasic.week01.domain;


import com.sparta.springBasic.week01.models.PersonRequestDto;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Entity
public class Person {
    @Id // ID 값, Primary Key로 사용하겟다는 의미이다.
    @GeneratedValue(strategy = GenerationType.AUTO) // 자동 증가 명령이다.
    private Long id;

    @Column(nullable = false) // 컬럼 값이고 반드시 값이 존재해야 함을 나타낸다.
    private String name;

    @Column(nullable = false)
    private int age;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private String job;

   public Person(PersonRequestDto requestDto) {
       this.name = requestDto.getName();
       this.age = requestDto.getAge();
       this.address = requestDto.getAddress();
       this.job = requestDto.getJob();
   }

   public void update(PersonRequestDto requestDto) {
       this.name = requestDto.getName();
       this.age = requestDto.getAge();
       this.address = requestDto.getAddress();
       this.job = requestDto.getJob();
   }
}
