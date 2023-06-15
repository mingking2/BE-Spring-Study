package com.sparta.week01.Prac;

public class prac2 {
    public static void main(String[] args) {

//      변수 course는 실제 빵, Course 클래스는 빵들

        Course course1 = new Course();
        System.out.println(course1.title);
        System.out.println(course1.tutor);
        System.out.println(course1.days);

        Course course2 = new Course("웹개발의 봄 스프링", "주민기", 23);
        System.out.println(course2.title);
        System.out.println(course2.tutor);
        System.out.println(course2.days);

        Course course = new Course();

        System.out.println(course.getTitle());
        System.out.println(course.getTutor());
        System.out.println(course.getDays());

        course.setTitle("웹개발의 봄 스프링");
        course.setTutor("주민기");
        course.setDays(23);

        System.out.println(course.getTitle());
        System.out.println(course.getTutor());
        System.out.println(course.getDays());

    }


//    public class Course {
//        // title, tutor, days 가 Course 라는 맥락 아래에서 의도가 분명히 드러난다.
//        public String title;
//        public String tutor;
//        public int days;
//    }

    public static class Course {
        public String title;
        public String tutor;
        public int days;

        // 피라미터가 없는 생성자를 기본생성자라고 한다.
        public Course() {

        }

        public Course(String title, String tutor, int days) {
            // this는 클래스 변수를 가리킨다.
            this.title = title;
            this.tutor = tutor;
            this.days = days;
        }

        // Getter
        public String getTitle() {
            return this.title;
        }

        public String getTutor() {
            return this.tutor;
        }

        public int getDays() {
            return this.days;
        }

        // Setter
        public void setTitle(String title) {
            this.title = title;
        }

        public void setTutor(String tutor) {
            this.tutor = tutor;
        }

        public void setDays(int days) {
            this.days = days;
        }


    }


}
