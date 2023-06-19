package com.sparta.springBasic.week02.domain;

import com.sparta.springBasic.week02.models.CourseRequestDto;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Getter // Lombok 사용
@NoArgsConstructor // 기본생성자를 대신 생성해준다.
@Entity // 테이블임을 나타낸다.
public class Course extends Timestamped {

    @Id // ID 값, Primary Key로 사용하겟다는 의미이다.
    @GeneratedValue(strategy = GenerationType.AUTO) // 자동 증가 명령이다.
    private Long id;

    @Column(nullable = false) // 컬럼 값이고 반드시 값이 존재해야 함을 나타낸다.
    private String title;

    @Column(nullable = false)
    private String tutor;

//    public Long getId() {
//        return this.id;
//    }
//
//    public String getTitle() {
//        return this.title;
//    }
//
//    public String getTutor() {
//        return this.tutor;
//    }

    public Course(String title, String tutor) {
        this.title = title;
        this.tutor = tutor;
    }

    public Course(CourseRequestDto requestDto) {
        this.title = requestDto.getTitle();
        this.tutor = requestDto.getTutor();
    }

    public void update(CourseRequestDto requestDto) {
        this.title = requestDto.getTitle();
        this.tutor = requestDto.getTutor();
    }
}


