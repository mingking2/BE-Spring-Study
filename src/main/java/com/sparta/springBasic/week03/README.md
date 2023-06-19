# [스파르타코딩클럽] 웹개발의 봄, Spring - 3주차
## [3주차] 프로젝트 만들고 API 설계하기
- 전체 그림 다시보기
  - Controller - Service - Repository 3계층이 존재한다.
  - 우리는 안에서 바깥으로, 즉 Repository 쪽부터 Service, Controller 방향으로 만들어나간다.
- 프로젝트 새로 만들기
- API 설계하기 (CRUD)
  - 타임라인 API
    - 메모 생성하기  POST     /api/memos       Memo
    - 메모 조회하기  GET      /api/memos       List<Memo>
    - 메모 변경하기  PUT      /api/memos/{id}  Long
    - 메모 삭제하기  DELETE   /api/memos/{id}  Long


## [3주차] Repository 만들기
- Memo 클래스 만들기
  - 메모는 1) 익명의 작성자 이름(username), 2) 메모 내용 (contents)으로 이루어져 있다.
  - domain 패키지를 만든다.
  - Memo.java
  - Timestamped.java
- MemoRepository 인터페이스 만들기
  - ID가 Long 타입이다. Repository는 어떻게 생겼을까?
  - MemoRepository.java
  - JPA 공식 홈페이지 살펴보기
- 연습퀴즈 - MemoRequestDto 클래스 만들기
  - Memo.java에 뜨는 에러를 해결하려면 MemoRequestDto.java를 만들어야 한다. 만들어라!



## [3주차] Service 만들기
- MemoService 클래스 만들기
  1. src > main > java > com.sparta.week03 에 service 패키지를 만든다.
  2. 해당 페키지 아래에 MemoService.java 파일을 만든다.
  3. MemoService.java
- update 기능 만들기
  - Memo.java에 update 메소드 추가하기



## [3주차] Controller 만들기
- API 완성하기
  - MemoController.java 만들기
    1. src > main > java > com.sparta.week03 에 controller 패키지 만들기
    2. MemoController.java 시작
  - Create
    - MemoController.java > create
  - Read
    - MemoController.java > read
  - Delete
    - MemoController.java > delete
- ARC로 기능 확인하기
  - (조회) 빈 목록 반환
  - (생성) 신규 메모 생성
  - (조회) 신규 메모 조회
  - (삭제) 신규 메모 삭제
  - (조회) 빈 목록 반환
- 연습퀴즈 : Update API 만들기
  - 메모의 정보를 받아 DB의 데이터를 변경하는 메소드를 만들어보세요.
  - Create 와 유사하다.