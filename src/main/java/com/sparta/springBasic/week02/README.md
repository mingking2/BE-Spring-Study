# [스파르타코딩클럽] 웹개발의 봄, Spring - 2주차
## [2주차] RDBMS

- 배울 부분
  - MySQL, H2
- RDBMS
  - RDBMS란?
    - RDBMS(Relational DataBase Management System)은 컴퓨터에 정보를 저장하고 관리하는 기술이다.
    - 성능/관리 면에서 매우 고도화된 엑셀이라고 생각해도 된다.
  - RDBMS의 종류
    - 각 제품 간 차이가 크지 않아 어떤 걸 사용하든 상관없다. 유료인 Oracle을 제외하고 보통 MySQL, PostgreSQL 중에서 많이 고르는 편인데, 우리는 실제 배포 시 MySQL을 사용한다.
      - MySQL
      - PostgreSQL
      - Oracle Database
- 우리가 사용할 RDBMS
  - H2
    - In-memory DB의 대표 주자인 H2를, 4주차까지 사용한다. 
    - 인메모리 DB란 서버가 작동하는 동안에만 내용을 저장하고, 서버가 작동을 멈추면 데이터가 모두 삭제되는 데이터베이스이다.
  - MySQL
    - MySQL은 우리가 서비스를 배포할 때 사용할 데이터베이스이다.
    - AWS RDS 라는 서비스를 사용해 붙여볼 예정이다.
    - 스프링과 궁합이 좋아서 많은 회사에 사용한다.
- H2 웹콘솔 띄워보기
  - src > main > resources > application.properties 파일을 연다.
  - H2 웹콘솔 설정을 복사한다.
    ```
    spring.h2.console.enabled=true
    spring.datasource.url=jdbc:h2:mem:testdb 
    ```
  - SpringBasicApplication.java 파일을 Run한다.


## [2주차] SQL 연습하기
- SQL 연습하기
  - H2 웹콘솔 사용해보기
    - 기본 개념
      ```
      [EX] 데이터베이스는 매우 고도화된 엑셀이다.
        
        엑셀 파일 하나가 "데이터베이스"라면,
        엑셀 시트 하나는 "테이블"이라고 부르고,
        엑셀 행 하나는 "데이터"라고 부른다.
      ```
      - 따라서 지금부터 우리가 할 것은
        - 테이블을 생성하고,
        - 테이블에 데이터를 삽입하고,
        - 삽입된 데이터를 조회해보는 것이다.
    - 테이블 생성하기
      ```SQL
      CREATE TABLE IF NOT EXISTS courses (
       id bigint NOT NULL AUTO_INCREMENT,
       title varchar(255) NOT NULL,
       tutor varchar(255) NOT NULL,
       PRIMARY KEY (id)
      );
      ``` 
    - 테이블 삽입하기
      ```SQL
      INSERT INTO courses (title, tutor) VALUES
          ('웹개발의 봄', '남병관'), ('웹개발 종합반', '주민기');
      ```
    - 데이터 조회하기
      - ```SELECT * FROM courses```
      
  - 잠깐, 이게 뭐지?
    - 위에서 사용한 생성, 삽입, 조회 명령문을 SQL(Structured Query Language)이라고 한다.
    - 그럼, 웹서비스를 만들기 위해 SQL을 모두 배워야할까? ㄴㄴ
      - 우리가 명령을 내린 Java 명령어를 SQL로 번역해주는 **Spring Data JPA**라고 한다.
  - 연습퀴즈 - SQL
    - name,age 라는 열을 가진 tutors 라는 테이블을 만들고,
    - 나의 이름과 나이 데이터를 삽입하세요.
    - 그 다음에 tutors 테이블을 조회해보세요.
    - 정답
      ```
      CREATE TABLE IF NOT EXISTS tutors (
        id bigint NOT NULL AUTO_INCREMENT,
        name varchar(255) NOT NULL,
        age int NOT NULL,
        PRIMARY KEY (id)
      );
      ```
      ```
      INSERT INTO tutors (name, age) VALUES ('주민기', 23);
      ```
      ```
      SELECT * FROM tutors;
      ```


## [2주차] JPA 시작하기
- 배울 부분
  - Repository, JPA, Model
- JPA
  - JPA란?
    - JPA는, SQL을 쓰지 않고 데이터를 생성, 조회, 수정, 삭제할 수 있도록 해주는 번역기이다.
  - JPA가 없다면?
    - 자바 짜다가 갑자기 SQL 짜고, 그걸 잘 맞추어 넣어야 한다. 복잡함!
  - JPA가 있다면?
    - 설정은 아래 한 줄로 끝
      - ``` implementation 'org.springframework.boot:spring-boot-starter-data-jpa' ```
    - 명령도 그냥 자바로 만들면 된다. 
      - ``` 
        respository.save(new Customer("Jack", "Bauer"))
        respository.save(new Customer("Chloe", "O'Brian"))
        ```
- JPA 시작하기
  - Domain, Repository 소개
  
  | Spring     | MySQL  |
  |------------|--------|
  | Domain     | Table  |
  | Repository | SQL    |
  
  - 자바 DB를 사용하도록 도와주는 것이 JPA
    - DB를 이용하는데 핵심이었던 "테이블"과 "SQL"과 동일한 개념의 자바 용도가 있겠죠?
    - "테이블"은 Domain, "SQL"은 Repository이다.
    
  - Domain, Repository 도입하기
    1. src > main > java > com.sparta.week02에 domain이라는 패키지를 만든다.
    2. Course.java, CourseRepository.java 파일을 만든다.
    3. Course.java 클래스
    4. CourseRepository.java 클래스
    - Interface 란?
      - JPA는 Repository를 통해서만 사용가능
      - 인터페이스는 클래스에서 멤버가 빠진, 메소드 모음집이다.


## [2주차] JPA 사용해보기
- SQL이 보이도록 application.properties 세팅
  ```
    spring.jpa.show-sql=true
    spring.datasource.url=jdbc:h2:mem:testdb;MODE=MYSQL
  ```
- JPA 사용해보기
  - JPA 실행 코드
  - 웹콘솔 접속해서 확인해보기
