package com.sparta.springBasic.week01.controller;

import com.sparta.springBasic.week01.prac.prac2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

    @GetMapping("/courses")
    public prac2.Course getCourses() {
        prac2.Course course = new prac2.Course();
        course.setTitle("웹개발의 봄 스프링");
        course.setDays(23);
        course.setTutor("주민기");
        return course;
    }
}
