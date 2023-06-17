package com.sparta.springBasic;

import com.sparta.springBasic.week02.domain.CourseRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class SpringBasicApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBasicApplication.class, args);

	}

	// APPlication.java 의 main 함수 아래에 붙인다.
	@Bean
	public CommandLineRunner demo(CourseRepository repository) {
		return (args) -> {

		};
	}

}
