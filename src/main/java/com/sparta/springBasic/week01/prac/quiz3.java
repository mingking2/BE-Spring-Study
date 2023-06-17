package com.sparta.springBasic.week01.prac;

import java.util.ArrayList;
import java.util.List;

//      - [1주차 자바 기초 문법 - 4] 연습 퀴즈
//        1. 주어진 연예인 목록을 차례대로 하나씩 인쇄하는 반복문을 작성하세요.
//        2. 주어진 과일의 개수를 세고 그 수를 반환하는 메소드를 만드세요.

public class quiz3 {
    public static void main(String[] args) {
        // 1번 문제
        List<String> celebs = new ArrayList<>();
        celebs.add("아이유");
        celebs.add("린다G");
        celebs.add("은비");
        celebs.add("금비");
        celebs.add("비");
        celebs.add("차은우");
        celebs.add("남주혁");
        celebs.add("수지");
        celebs.add("정우성");
        celebs.add("제니");
        celebs.add("정국");

        for(int i=0;i<celebs.size();i++) {
            String celeb = celebs.get(i);
            System.out.println(celeb);
        }

        System.out.println(countFruit("감"));
    }
    
    public static int countFruit(String given) {
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
        
        int count = 0;
        for(int i=0;i<fruits.size();i++) {
            String fruit = fruits.get(i);
            if(given == fruit) {
                count += 1;    
            }
        }
        return count;
    }

}
