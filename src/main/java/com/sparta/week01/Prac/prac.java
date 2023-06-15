package com.sparta.week01.Prac;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;

public class prac {

    public static void main(String[] args) {
//      [1주차] 자바 기초 문법 - 1
//        - 화면에 나타내기
        System.out.println("안녕, 스파르타!");


//        - 변수 & 기초 문법
//          - 변수는 값을 담는 상자이다.
//          - 변수를 선언할 때는 (자료의 종류) (변수명) = (값) 의 순서를 따른다.
//          - 변수명은 일반적으로 1)영어, 2)소문자 시작, 3)구분은 대문자로 한다.
//          - 자바는 항상 코드를 작성하고 제일 마지막에 세미콜론;을 넣는다.
        String myName = "주민기";


//        - 숫자 : int, float, Long
//          - int : 정수
//          - float : 소수점 포함
//          - Long : 정수 범위가 훨씬 넓음, 나머지는 int와 동일
        int a = 1;
        float b = 1.2f;

        System.out.println("a: " + a);
        System.out.println("b: " + b);

//      1 + 1.2의 결과는 소수니까 float으로 지정한다.
        float c = a + b;
        System.out.println("c: " + c);

//      int = int + float 은 오류
        //int d = a + b;


//        - 문자 : String
//          - 문자열은 대문자 S로 시작한다. 반드시 쌍따옴표(")를 써야한다.
        String e = "자바 스프링, 1주 안에 끝낸다.";



//      [1주차] 자바 기초 문법 - 2
//        - 참거짓 : boolean
//            - 참거짓 타입은 boolean 으로 표시한다.
            int age1 = 20;
            boolean isAdult = age1 > 19;
            boolean isKid = age1 <= 19;

            // 같은지는 == 으로 확인, 다른지는 != 으로 확인
            boolean isEq = 20 == 20;
            boolean isDiff = 20 != 20;


//        - 배열 : List
//          1. 순서가 중요하다.
//          2. 같은 자료형만 넣을 수 있다.
//          3. 넣을 때는 add, 조회할 때는 get, 제거할 때는 remove를 사용한다.
        List<String> newList = new ArrayList<>();
        newList.add("웹개발의 봄 Spring");
        newList.add("프론트엔드의 꽃 React");
        System.out.println(newList);
        System.out.println(newList.get(0));
        System.out.println(newList.get(1));
        newList.remove(0);
        System.out.println(newList);


//        - 임포트
//          - List 처럼, 미리 작성된 코드를 불러오는 것을 "임포트(import)"라고 한다.
//          - 자바는 기본적인 임포트 파일들이 있다.
//              - 임포트 단축키 윈도우: Alt + Enter


//        - 주석, 정렬 단축키
//          - 개발자들끼리 소통하거나, 내가 개발하다가 메모를 남기고 싶을 때 주석을 사용한다.
//              - 윈도우: Ctrl + /
//          - 코드를 작성하거나 복붙할 때, 정렬을 해주지 않으면 가독성이 떨어진다.
//              - 윈도우: Ctrl + Alt + L



//      [1주차] 자바 기초 문법 - 3
//        - 메소드
//          - 반복적인 행동을 줄여서 어디든 갖다쓸 수 있는 명령 모음이다.


//          - [ex 강의 정보 인쇄하기] : 메소드가 없을때
        String title = "웹개발의 봄 Spring";
        String tutor = "주민기";
        int weeks = 5;
        float ratings = 5.0f;

        System.out.println("제목: " + title);
        System.out.println("튜터: " + tutor);
        System.out.println("주차: " + weeks);
        System.out.println("별점: " + ratings);


//          - [ex 강의 정보 인쇄하기] : 메소드가 없을때
//        public static void printInfo() {
//            String title = "웹개발의 봄 Spring";
//            String tutor = "주민기";
//            int weeks = 5;
//            float ratings = 5.0f;
//
//            System.out.println("제목: " + title);
//            System.out.println("튜터: " + tutor);
//            System.out.println("주차: " + weeks);
//            System.out.println("별점: " + ratings);
//        }


//          - 실행하는 방법
//            - 메소드명();


//          - 메소드의 구조
//        public (반환타입) 메소드명(피라미터) {
//            // 명령 내용
//            return; (반환값)
//        }
//          - 메소드명은 변수명과 규칙(영어사용,소문자시작,공백없음,대문자구분)이 같다.


//          - 컴퓨터에게 명령을 하려면 세 가지 요소가 필요하다.
//              1. 재료 = 피라미터 (없을 수도 있음)
//              2. 명령 = 실행코드
//              3. 결과 = 반환값 (없을 수도 있음)


//          - 피라미터와 반환값이 없을 수도 있다.

//        // 피라미터 X, 반환값 X
//        public void simplePrint() {
//            System.out.println("피라미터도 없고, 반환값도 없어요!");
//        }
//
//        // 피라미터 O, 반환값 X
//        public void simpleSum(int num1, int num2) {
//            System.out.println("num1 :" + num1 + ", num2: " + num2);
//        }
//
//        // 피라미터 X, 반환값 O
//        public int simpleReturn() {
//            return 3;
//        }
//
//        // 피라미터 O, 반환값 O
//        public int sum(int num1, int num2) {
//            return num1 + num2;
//        }



//     [1주차] 자바 기초 문법 - 4
//        - 반복문
//          [ex] 과일 목록 준비하기
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


//          [ex] 과일 목록 차례대로 인쇄하기 - 반복문 없이
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


//          [ex] 과일 목록 차례대로 인쇄하기 - 반복문과 함께
        for(int i=0; i<10; i++) {
            String fruit = fruits.get(i);
            System.out.println(fruit);
        }


//          - 반목문의 구조
//        for (시작조건; 계속하는조건; 더하기) {
//            명령
//        }


//        - 조건문
//          [ex] 미성년자 여부 판별하기
        int age = 20;
        if (age > 19) {
            System.out.println("성인입니다.");
        } else {
            System.out.println("미성년자입니다.");
        }


//          [ex] "감" 개수 세는 반복문 만들기
        int count = 0;
        for (int i=0;i<fruits.size();i++) {
            String fruit = fruits.get(i);
            if(fruit == "감") {
                count+=1;
            }
        }
        System.out.println(count);

    }

}
