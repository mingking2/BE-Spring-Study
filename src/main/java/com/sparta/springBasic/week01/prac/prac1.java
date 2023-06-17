package com.sparta.springBasic.week01.prac;

import java.util.ArrayList;
import java.util.List;

public class prac1 {

    public static void main(String[] args) {

        System.out.println("안녕, 스파르타!");
        String myName = "주민기";

        int a = 1;
        float b = 1.2f;

        System.out.println("a: " + a);
        System.out.println("b: " + b);

//      1 + 1.2의 결과는 소수니까 float으로 지정한다.
        float c = a + b;
        System.out.println("c: " + c);

//      int = int + float 은 오류
        //int d = a + b;

        String e = "자바 스프링, 1주 안에 끝낸다.";

        int age1 = 20;
        boolean isAdult = age1 > 19;
        boolean isKid = age1 <= 19;

        boolean isEq = 20 == 20;
        boolean isDiff = 20 != 20;

        List<String> newList = new ArrayList<>();
        newList.add("웹개발의 봄 Spring");
        newList.add("프론트엔드의 꽃 React");
        System.out.println(newList);
        System.out.println(newList.get(0));
        System.out.println(newList.get(1));
        newList.remove(0);
        System.out.println(newList);


        String title = "웹개발의 봄 Spring";
        String tutor = "주민기";
        int weeks = 5;
        float ratings = 5.0f;

        System.out.println("제목: " + title);
        System.out.println("튜터: " + tutor);
        System.out.println("주차: " + weeks);
        System.out.println("별점: " + ratings);



//      [ex] 과일 목록 준비하기
        List<String> fruits = new ArrayList<>();
        fruits.add("감");
        fruits.add("배");
        fruits.add("감");
        fruits.add("딸기");
        fruits.add("수박");
        fruits.add("메론");
        fruits.add("수박");
        fruits.add("딸기");
        fruits.add("수박");
        fruits.add("메론");
        System.out.println(fruits);


//      [ex] 과일 목록 차례대로 인쇄하기 - 반복문 없이
        System.out.println(fruits.get(0));
        System.out.println(fruits.get(1));
        System.out.println(fruits.get(2));
        System.out.println(fruits.get(3));
        System.out.println(fruits.get(4));
        System.out.println(fruits.get(5));
        System.out.println(fruits.get(6));
        System.out.println(fruits.get(7));
        System.out.println(fruits.get(8));
        System.out.println(fruits.get(9));


//      [ex] 과일 목록 차례대로 인쇄하기 - 반복문과 함께
        for (int i = 0; i < 10; i++) {
            String fruit = fruits.get(i);
            System.out.println(fruit);
        }



//      [ex] 미성년자 여부 판별하기
        int age = 20;
        if (age > 19) {
            System.out.println("성인입니다.");
        } else {
            System.out.println("미성년자입니다.");
        }


//      [ex] "감" 개수 세는 반복문 만들기
        int count = 0;
        for (int i = 0; i < fruits.size(); i++) {
            String fruit = fruits.get(i);
            if (fruit == "감") {
                count += 1;
            }
        }
        System.out.println(count);

    }



    public static void printInfo() {
        String title = "웹개발의 봄 Spring";
        String tutor = "주민기";
        int weeks = 5;
        float ratings = 5.0f;

        System.out.println("제목: " + title);
        System.out.println("튜터: " + tutor);
        System.out.println("주차: " + weeks);
        System.out.println("별점: " + ratings);
    }


    // 피라미터 X, 반환값 X
    public void simplePrint() {
        System.out.println("피라미터도 없고, 반환값도 없어요!");
    }

    // 피라미터 O, 반환값 X
    public void simpleSum(int num1, int num2) {
        System.out.println("num1 :" + num1 + ", num2: " + num2);
    }

    // 피라미터 X, 반환값 O
    public int simpleReturn() {
        return 3;
    }

    // 피라미터 O, 반환값 O
    public int sum(int num1, int num2) {
        return num1 + num2;
    }

}
