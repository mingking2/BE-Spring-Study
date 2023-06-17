package com.sparta.springBasic.week01.prac;

//      - [1주차 자바 기초 문법 - 3] 연습 퀴즈
//        두 정수를 받아서, 뺀 값을 반환하는 메소드를 만들고, 그 값을 인쇄하세요

public class quiz2 {
    public static void main(String[] args) {
        int result = sub(1,2);
        System.out.println(result);
    }

    public static int sub (int a, int b) {
        return a - b;
    }

}


