package com.sparta.springBasic;

import com.sparta.springBasic.week02.domain.Course;
import com.sparta.springBasic.week02.domain.CourseRepository;
import com.sparta.springBasic.week02.models.CourseRequestDto;
import com.sparta.springBasic.week02.service.CourseService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.util.List;

@EnableJpaAuditing
@SpringBootApplication
public class SpringBasicApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBasicApplication.class, args);

    }

    // APPlication.java 의 main 함수 아래에 붙인다.
    @Bean
    public CommandLineRunner demo(CourseRepository courseRepository, CourseService courseService) {
        return (args) -> {
            // 데이터 저장하기
            courseRepository.save(new Course("프론트엔드의 꽃, 리액트", "강병준"));

            System.out.println("데이터 인쇄");
            // 데이터 전부 조회하기
            List<Course> courseList = courseRepository.findAll();
            for (int i = 0; i < courseList.size(); i++) {
                Course course = courseList.get(i);
                System.out.println(course.getId());
                System.out.println(course.getTitle());
                System.out.println(course.getTutor());
            }

            CourseRequestDto requestDto = new CourseRequestDto("웹개발의 봄, Spring", "주민기");
            courseService.update(1L, requestDto);
            courseList = courseRepository.findAll();
            for (int i = 0; i < courseList.size(); i++) {
                Course course = courseList.get(i);
                System.out.println(course.getId());
                System.out.println(course.getTitle());
                System.out.println(course.getTutor());
            }

//            // 데이터 하나 조회하기
//            Course course = courseRepository.findById(1L).orElseThrow(
//                    () -> new IllegalArgumentException("해당 아이디가 존재하지 않습니다.")
//            );

            courseRepository.deleteAll();
        };
    }

}
