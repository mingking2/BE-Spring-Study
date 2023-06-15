package com.sparta.week01.Prac;


// [1주차] 자바클래스 + Getter, Setter 연습 퀴즈
//  1. Tutor 클래스를 만들고, 이름(name)과, 경력(bio) 멤버 변수를 추가하세요.
//  2. 그리고 각 변수를 private 으로 선언하고, Getter와 Setter 를 만들어보세요.
//  3. 마지막으로, 기본 생성자와, name/bio 입력받는 생성자 두 개를 만들어보세요.


public class quiz4 {
    public static void main(String[] arg) {

    }

    public static class Tutor {
        private String name;
        private int bio;

        public String getName() {
            return this.name;
        }

        public int getBio() {
            return this.bio;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setBio(int bio) {
            this.bio = bio;
        }

        Tutor() {

        }

        Tutor(String name, int bio) {
            this.name =name;
            this.bio = bio;
        }


    }
}
