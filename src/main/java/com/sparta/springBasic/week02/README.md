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
      ```sql
      CREATE TABLE IF NOT EXISTS courses (
       id bigint NOT NULL AUTO_INCREMENT,
       title varchar(255) NOT NULL,
       tutor varchar(255) NOT NULL,
       PRIMARY KEY (id)
      );
      ``` 
    - 테이블 삽입하기
      ```sql
      INSERT INTO courses (title, tutor) VALUES
          ('웹개발의 봄', '남병관'), ('웹개발 종합반', '주민기');
      ```
    - 데이터 조회하기
      ```sql
      SELECT * FROM courses
      ```
      
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
      ```
      implementation 'org.springframework.boot:spring-boot-starter-data-jpa' 
      ```
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


## [2주차] 생성일자, 수정일자
- 상속의 개념
  - "클래스의 상속 -> 이미 만들어둔거 가져다 쓰자! 라고 선언하는 것"
  
  - Tutor extends Person과 같이 사용가능
    ```java
    class Person {
        private String name;
        private String getName() {
            return this.name;
        }
    }
    
    class Tutor extends Person {
        private String address;
        // Person 클래스를 상속했기 때문에,
        // name 멤버변수와 getName() 메소드를 가지고 있따.
    }
    ```
    
- 상속 연습해보기 - Timestamped
  - DB 기본 중의 기본, "생성일자"와 "수정일자"를 필드로 가지는 것이다.
  - course 클래스가 course 테이블이 되는 것
  - Course 클래스에 생성일자/수정일자 멤버를 추가하자
  - **Timestamped.java**
    ```java
    @MappedSuperclass // 상속했을 때, 컬럼으로 인식하게 된다.
    @EntityListeners(AuditingEntityListener.class) // 생성/수정 시간을 자동으로 반영하도록 설정
    public class Timestamped {
      
        @CreatedDate // 생성일자임을 나타낸다.
        private LocalDateTime createdAt;
    
        @LastModifiedDate // 마지막 수정일자임을 나타낸다.
        private LocalDateTime modifiedAt;
    }
    ```
  - Course 클래스에 아래와 같이 붉은색 글자를 추가한다.
    ```java
    class Course extends Timestamped { }
    ```
  - Application 클래스에 다음과 같이 붉은색 글자를 추가한다.
    ```
    @EnableJpaAuditing
    ```
    
- http://localhost:8080/h2-console 접속해서 확인해보기


## [2주차] JPA 심화
- CRUD
  ```
  CRUD란? 정보관리의 기본 기능
  → 생성 (Create)
  → 조회 (Read)
  → 변경 (Update)
  → 삭제 (Delete)

  JPA로 위의 기능을 하는 방법을 익혀보겠습니다.
  ```
  
- 데이터 저장하기 (Create) & 조회하기 (Read)
  - Repository의 save와 findAll 등을 이용한다.
  - create & read 해보기
    - application.java 파일에 입력
- Service 의 개념
  - update, delete 로 넘어가기 전에, 다루어야 하는 개념에 바로 Service이다.
  - 스프링의 구조는 3가지 영역으로 나눌 수 있다.
    1. Controller: 가장 바깥 부분, 요청/응답을 처리함. -> 2주차 후반에 배움
    2. Service: 중간 부분, 실제 중요한 작동이 많이 일어나는 부분 -> 지금 배움
    3. Repo: 가장 안쪽 부분, DB와 맞닿아 있음. -> 여태 배움(Repository, Entity)
    - Update는 Service 부분에 작성한다.
- Service 만들기
  1. Course 클래스에 update 메소드 추가
  2. src > main > java > com.sparta.week02 > service 패키지 생성
  3. CourseService.java 만들기
- 데이터 변경하기 (Update)
  - application.java 파일에 입력
- 데이터 삭제하기 (Delete)
  - application.java 파일에 입력



## [2주차] Lombok, DTO
- 배울 부분
  - API, ( Controller, Service, DTO )
- Lombok 소개
  - 코드 절약하기
    - Lombok(이하 롬복)은, 자바 프로젝트를 진행하는데 거의 필수적으로 필요한 메소드/생성자 등을 자동생성해줌으로써 코드를 절약할 수 있도록 도와주는 라이브러리이다.
  - 설치
  - 사용
    - Course.java
      - Course 클래스 Getter, NoArgsConstructor 적용
    - CourseService 클래스 RequiredArgsConstructor 적용
- DTO
  ```
  테이블을 막 건드려도 될까?
  = read, update할 때 Course 클래스를 막 써도 될까?
  = 내가 아닌 다른 사람이 변경이라도 한다면??
  
  완충재로 활용하는 것이
  DTO(Data Transfer Object)이다.
  ```
  - 생성하기
    1. src > main > java > com.sparta.week02 > models 에 CourseRequestDto 파일 생성
    2. CourseRequestDto.java
  - 적용하기
    - CourseService 변경하기
    - Course 변경하기
    - Application 변경하기


## [2주차] API - GET
- API
  ```
  클라이언트 - 서버 간의 약속이다.
  
  클라이언트가 정한대로 서버에게 요청(Request)을 보내면,
  서버가 요구사항을 처리하여 응답(Response)을 반환한다.
  ```
- REST
  - REST란, 주소에 명사, 요쳥 방식에 동사를 사용함으로써 의도를 명확히 드러냄을 의미한다.
  - 여기에 쓰이는 동사는 우리가 JPA 시간에 배운 CRUD를 지칭한다.
  - 즉 A에 대해 생성(POST)/조회(GET)/수정(PUT)/삭제(DELETE) 오청을 하는 것이다.
  - 예시
    - GET /courses
      - 강의 전체 목록 조회 요청
    - GET /courses/1
      - ID가 1번인 녀석 조회 요청
    - POST /courses
      - 강의 생성 요청
    - PUT /courses/3
      - ID가 3번인 녀석 수정 요청
    - DELETE /courses/2
      - ID가 2번인 녀석 삭제 요청
  - 주의사항
    - 주소에 들어가는 명사들은 복수형을 사용한다.
      - /course
    - 주소에 동사는 가급적 사용하지 않는다.
      - /accounts/edit
- Get
  - 데이터 조회 API부터 만들자
  1. src > main > java > com.sparta.week02 아래에 controller 패키지를 만든다.
  2. CourseController.java 파일을 생성한다.
  3. CourseController.java
  4. Application.java 수정
  5. http://localhost:8080/api/courses 접속하여 확인
- ARC(Advanced REST Client) 소개
  - 현업에서 API를 만들고 나면 각종 툴로 테스트 및 기능 확인을 정말 많이 한다.
  - 그 중에서도 유용한 툴인 ARC를 함께 사용해보자
  1. 사전과제에서 설치한 ARC를 실행한다.
  2. Method는 GET, Request URL에는 http://localhost:8080/api/courses 를 입력한다.
  3. 결과 화면을 확인한다.



## [2주차] API - POST,PUT,DELETE
- Post
  - Post 는 생성 요청이다.
  - CourseController > POST
  - Course 클래스 생성자 추가
  - 10초 복습
    ```
    주소: /api/courses                          -> GET 전체 강의 조회
    방식: POST             ->   /api/courses  <
                                               -> POST 신규 강의 생성
                                                  강의 데이터는 @RequestBody로 표시
    ```
  - 작동 확인
    1. 스프링을 재시작한다.
    2. ARC를 키고, 다음과 같이 입력
       - Method : POST
       - URL: http://localhost:8080/api/courses
    3. 하단의 Headers를 클릭하고 아래처럼 입력
       - name : Content-Type
       - value : application/json
    4. BODY 탭을 클릭하고, 아래와 같이 입력
       ```JSON
       "title": "앱개발 종합반",
       "tutor": "주민기"    
       ```
    5. SEND 버튼을 누르고, 결과를 확인
    
- Put
  - CourseController > PUT
  - 작동확인
    1. 스프링을 재시작한다.
    2. ARC를 키고, 다음과 같이 입력
      - Method : POST
      - URL: http://localhost:8080/api/courses/1
    3. 하단의 Headers를 클릭하고 아래처럼 입력
      - name : Content-Type
      - value : application/json
    4. BODY 탭을 클릭하고, 아래와 같이 입력
       ```JSON
       "title": "앱개발 종합반",
       "tutor": "강병준"    
       ```
    5. SEND 버튼을 누르고, 결과를 확인
    
- 연습퀴즈 - API
  - ID 가 1인 강의를 삭제하는 API를 만들어보세요.
  - 성공!
