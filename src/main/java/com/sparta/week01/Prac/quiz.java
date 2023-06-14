package com.sparta.week01.Prac;

import java.util.ArrayList;
import java.util.List;

public class quiz {
    public static void main(String[] args) {

//      - [1주차 자바 기초 문법 - 2] 연습 퀴즈
//         course1 이라는 이름의 변수에 값을 "웹개발 종합반",
//         course2 라는 이름의 변수에 값을 "앱개발 종합반",
//         넣고, course1과 course2를 courseList 라는 배열에 순서대로 넣으려면 어떻게 해야 하는가?

        String course1 = "웹개발 종합반";
        String course2 = "앱개발 종합반";

        List<String> courseList = new ArrayList<>();
        courseList.add(course1);
        courseList.add(course2);

        System.out.println(courseList);
    }
}
