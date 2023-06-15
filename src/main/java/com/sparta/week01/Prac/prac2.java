package com.sparta.week01.Prac;

public class prac2 {
    public static void main(String[] args) {

//      [1주차] 자바 클래스
//        - 클래스란?
//          - 클래스는 정보를 묶는 것이다.


//        - 객체지향 프로그래밍
//          - 조건문, 반복문, 메소드만으로 무질서한 코드에 규칙이 생겼던 것
//          - 조금 더 프로그래밍을 현실 세계에 빗대어 체계적으로 해보자는 발상이, 객체지향 프로그래밍의 핵심이다.


//        - 클래스
//          - 현실과 비슷한 개념(객체)을 나타내기 위한 자바의 도구를 클래스라고 부른다.
//          - 클래스 내 정보를 멤버 변수라고 한다.

//        ` - [ex] 클래스 연습 Course.java
//        public class Course {
//            // title, tutor, days 가 Course 라는 맥락 아래에서 의도가 분명히 드러난다.
//            public String title;
//            public String tutor;
//            public int days;
//        }

//          - [ex] 클래스 연습 Prac.java
//        Course course = new Course();
//        course.title = "웹개발의 봄, Spring";
//        System.out.println(course.title);
//        System.out.println(course.tutor);

//          - 변수 course는 실제 빵, Course 클래스는 빵들



//        - 생성자(Constructor)
//          - Course 생성자
//        public class Course {
//            public String title;
//            public String tutor;
//            public int days;
//
//            // 피라미터가 없는 생성자를 기본생성자라고 한다.
//            public Course() {
//
//            }
//
//            public Course(String title, String tutor, int days) {
//                // this는 클래스 변수를 가리킨다.
//                this.title = title;
//                this.tutor = tutor;
//                this.days = days;
//            }
//        }


//          - 클래스명과 똑같은 이름을 가진 메소드를 "생성자"라고 한다.
//          - 클래스 변수를 새롭게 만들 때 사용한다.


//          - this
//             - ex) 우리가 바꾸고 싶은 건 빵틀의 값이 아니라 실제 빵의 값이다.
//             - this 라고 표시함으로써, 빵틀 전체의 값을 바꾸는게 아니라 빵 하나의 값만 바꾸는 것이다.


//          - 생성자 사용해보기
    }
}
