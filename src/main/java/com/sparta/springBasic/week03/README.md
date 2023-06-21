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


## [3주차] HTML, CSS 기초
- HTML, CSS, Javascript의 구분
  - HTML은 뼈대고, CSS는 꾸며주는 녀석이다.
- HTML의 기초
  - HTML의 특징
    - 여는 태그, 닫는 태그가 쌍으로 존재한다.
    - 교차가 불가능하다.
    - head, body 태그로 구분된다.
      - head 태그는 CSS, Javascript 코드를 포함하고,
      - body 태그는 뼈대 전체를 포함한다.
  - 대표적인 HTML 태그들
    - h1 ~ h6 : headline의 약자, 신문 제목 같은 녀석
    - div : divison, 나누는 녀석, 투명 비닐봉투
    - p : paragraph, 신문 기사 단락과 같은 텍스트 내용을 담는다.
    - ul, ol, li : (un)ordered list, list에 해당한다. bullet point
    - span : 글을 중간중간 잘라내서 색을 입혀준다든지 할 때 사용한다.
    - table, th, tr, td : 표, 엑셀 같은 표를 그릴 때 사용한다.
    - img : 이미지를 나타낼 때 사용한다.
- CSS의 기초
  - 문법
    - head > style 태그 안에 작성한다.
    - 세미콜론(;)으로 마무리한다.
    ```java
    .wrap {
        width: 538px;
        margin: 10px auto;
    }
    
    #contents {
        width: 538px;
    }
    
    .area-write {
        position: relative;
        width: 538px;
    }
    ```
  - 선택자(id, class)
    - 꾸미려면 가리켜야 하겠죠? 가리키는 방법은 두 가지가 있다.
    - id: HTML 파일을 통틀어 단 하나만 존재한다. #으로 표시한다. (#contents)
    - class: 중복 적용이 가능하다. .으로 표시한다. (.area-write)
- 타임라인 페이지를 미리 한 번 살펴보자
  1. src > main > resources > static 에 index.html 파일을 만든다.
  2. index.html 파일 완성
  3. static 폴더에 images 폴더를 만든다.
  4. 이미지를 다운받고, images 폴더에 넣는다.
     - delete 이미지
     - done 이미지
     - edit 이미지
     - send 이미지



## [3주차] Javascript 기초 - 1
- Javascript 란?
  - 브라우저를 살아 숨쉬게 만드는 친구이다.
  - 클릭, 마우스 오버 시 색 변화, 숨기기, 나타내기, 등등 수많은 일을 할 수 있다.
- 크롬 개발자 도구
  - Javascript 공부, 아니 웹서비스 개발을 하는데 필수적인 녀석이다.
  - F12 키를 누르면 개발자 도구가 뜬다. console 탭을 눌러보자.
  - Javascript 기초 문법
    - 변수
      ```JavaScript
        let a = 3; // 변수를 처음 선언할 때 let을 써준다. 자료형은 써주지 않아도 된다.
        let b = 2;
        console.log(a + b);  // System.out.println()과 같은 기능을 한다.
        b = 7;
        console.log(a + b);
      ```
    - 자료형 (문자, 숫자, boolean, 리스트, 딕셔너리)
      - 자바스크립트 문자, 숫자
        ```JavaScript
        let name = 'bknam';
        let course = "웹개발의 봄 Spring" // 자바와 다르게 홑/쌍따옴표 상관없습니다.
        let num = 10;
        console.log(num + name); // 문자 + 숫자 하면 둘 모두를 문자로 묶습니다.
        ```
      - 자바스크립트 boolean
        ```JavaScript
         let age1 = 18;
         let age2 = 20;
         let isAdult = age1 > 19;
         console.log(isAdult); // false
         isAdult = age2 > 19;
         console.log(isAdult); // true
        ```
      - 자바스크립트 리스트
        ```JavaScript
        let fruits = ['사과', '딸기', '수박']; // List 보다 편하게 사용할 수 있습니다.
        console.log(fruits[0]);
        console.log(fruits[1]);
        console.log(fruits[2]);
        ```
      - 자바스크립트 딕셔너리
        ```JavaScript
        let course = {
           'title': '웹개발의 봄, Spring',
           'tutor': '남병관'
        };

        console.log(course);
        ```
    - 반복문
      ```JavaScript
      let fruits = ['사과', '딸기', '수박']; // List 보다 편하게 사용할 수 있습니다.
      for (let i=0; i<fruits.length; i++) {
           let fruit = fruits[i];
           console.log(fruit);
      }
      ```


## [3주차] Javascript 기초 - 2
- Javascript 기초 문법
  - 조건문
    ```JavaScript
    let fruits = ['사과', '딸기', '수박']; // List 보다 편하게 사용할 수 있습니다.
    for (let i=0; i<fruits.length; i++) {
        let fruit = fruits[i];
        if(fruit === '수박')  console.log(fruit == '수박');
    }
    ```
  - 함수
    ```JavaScript
    function sample() {
	       alert('얼럿!');
    }
    ```
  - 백틱
    ```JavaScript
    let name = '내 이름';
    let text = `${name}님의 스프링 5주 완주를 축하합니다!`;
    console.log(text);
    ```
  - 연습 퀴즈 - 과일 개수 세기
    - Javascript 배열 안에서 과일이 몇 개인지 세는 함수를 만들어보겠습니다.
      다음 실행 결과를 만들 수 있으면 됩니다.
      - let count = countFruit('감'); 
      - console.log(count); // 배열에 들어있는 감의 개수 인쇄
    - 정답
      ```JavaScript
      let fruits = ['사과', '딸기', '수박'];
      function countFruit(fruit) {
        let count = 0;
        for(int i=0; i<fruits.length();i++) {
          if(fruit === fruits[i]) count++;
        }
        return count;
      }
      ```


## [3주차] jQuery 기초 - 1
- jQuery 란?
  - jQuery는, 미리 작성된 자바스크립트 함수 모음집이다.
  - 되게 많이들 쓰는 HTML, CSS 조작 함수를 미리 만들어서 제공해주는 것이다.
  - 우리는 다 스스로 만들 필요없이 사용법만 알면 된다.
  - https://www.w3schools.com/jquery/jquery_get_started.asp
- jQuery 임포트 (head 태그 사이에)
  ```JavaScript 
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  ```
- jQuery 사용법
  - $로 시작하고, 괄호 안에 선택자로 대상을 적으면 된다.
  ```JavaScript
  $('#contents').hide();
  ```
- 연습 장소로 들어가보기
  - 개발자 도구 > 콘솔 에서 jQuery 를 사용하려면 해당 웹사이트에 이미 임포트 되어 있어야 한다.
  - jQuery 놀이터 들어가기
    ```JavaScript http://spartacodingclub.shop```
- 숨기기 / 나타내기
  - HTML 나타내기
      ```JavaScript
      $('#post-box').show();
      ```
  - HTML 숨기기
    ```JavaScript
    $('#post-box').hide();
    ```


## [3주차] jQuery 기초 - 2
- input 값 가져오기, 넣기
  - input 값 가져오기
    ```JavaScript
    $('#post-url').val();
    ```
  - input 값 넣기
    ```JavaScript
    $('#post-url').val('new text');
    ```
- HTML 없애기, 추가하기
  - HTML 없애기
    ```JavaScript
    $('#cards-box').empty();
    ```
  - HTML 추가하기
    ```JavaScript
    $('#cards-box').append(`<div class="card">
    <img class="card-img-top"
       src="https://www.eurail.com/content/dam/images/eurail/Italy%20OCP%20Promo%20Block.adaptive.767.1535627244182.jpg"
       alt="Card image cap">
      <div class="card-body">
        <a href="#" class="card-title">여기 기사 제목이 들어가죠</a>
        <p class="card-text">기사의 요약 내용이 들어갑니다. 동해물과 백두산이 마르고 닳도록 하느님이 보우하사 우리나라만세 무궁화 삼천리 화려강산...</p>
        <p class="card-text comment">여기에 코멘트가 들어갑니다.</p>
      </div>
    </div>`);
    ```


## [3주차] 클라이언트 설계하기
- 필요한 기능 살펴보기
  1. 접속하자마자 메모 전체 목록 조회하기
     -  GET API 사용해서 메모 목록 불러오기
     - 메모 마다 HTML 만들고 붙이기
  2. 메모 생성하기
     - 사용자가 입력한 메모 내용 확인하기
     - POST API 사용해서 메모 신규 생성하기
     - 화면 새로고침하여 업데이트 된 메모 목록 확인하기
  3. 메모 변경하기
     - 사용자가 클릭한 메모가 어떤 것인지 확인
     - 변경한 메모 내용 확인
     - PUT API 사용해서 메모 내용 변경하기
     - 화면 새로고침하여 업데이트 된 메모 목록 확인하기
  4. 메모 삭제하기
     - 사용자가 클릭한 메모가 어떤 것인지 확인
     - DELETE API 사용해서 메모 삭제하기
     - 화면 새로고침하여 업데이트 된 메모 목록 확인하기
- 시작코드
  - src > main > resources > static 에 images 폴더를 만들고 이미지 4개 삽입
  - src > main > resources > static 에 만든 index.html에 내용 삽입


## [3주차] 메모 생성하기 - writePost 함수
- 개발 스펙 확인
  1. 사용자가 입력한 메모 내용 확인하기
  2. POST API 사용해서 메모 신규 생성하기
  3. 화면 새로고침하여 업데이트 된 메모 목록 확인하기
- 사용자가 입력한 메모 내용 확인하기
  ```JavaScript
  let contents = $('#contents').val();
  ```
- 작성 내용 확인하기
  ```JavaScript
  if (isValidContents(contents) == false) {
    return;
  }
  ```
- 랜덤한 username 만들기
  ```JavaScript
  let username = genRandomName(10);
  ```
- 전달한 data 를 JSON으로 만들기
  ```JavaScript
  let data = {'username': username, 'contents': contents};
  ```
- POST API 사용해서 메모 신규 생성하기
  ```JSON.stringify 란? JSON을 문자열로 만들어주는 것이다.```
  ```JavaScript
  $.ajax({
      type: "POST",
      url: "/api/memos",
      contentType: "application/json", // JSON 형식으로 전달함을 알리기
      data: JSON.stringify(data),
      success: function (response) {
          alert('메시지가 성공적으로 작성되었습니다.');
          window.location.reload();
      }
  });
  ```
- writePost 함수 완성


[3주차] 메모 조회하기 - getMessages 함수 - 1
- 개발 스펙 확인
  1. 기존 메모 제거하기
  2. GET API사용해서 메모 목록 불러오기
  3. 메모마다 HTML 만들고 붙이는 함수 만들기
- 메모 조회하기
  ```
  아래의 붉은 상자 영역이 div#cards-box이다. 메모 목록을 담는 div이다.
  이번 작업은 getMessages(), addHTML() 함수를 다루는 것이다.
  ```
- 기존 메모 제거하기
  ```JavaScript
   $('#cards-box').empty()
  ```
- GET API 사용해서 메모 목록 불러오기
  ```JavaScript
  $.ajax({
      type: 'GET',
      url: '/api/memos',
      success: function (response) {
          console.log(response);
      }
  })
  ```


[3주차] 메모 조회하기 - getMessages 함수 - 2
- 메모 마다 HTML 만들고 붙이는 함수 만들기
- Timestamped, Application 수정하기
  - 뭔가 이상하지 않나요? 왜 created_at, modified_at 데이터는 안 오는 걸까요?
  - 바로 Getter가 없기 때문이다.
  - 거기에 스프링에게 Auditing 기능을 사용하고 있다고 알려줘야 한다.
  - 이렇게 중간중간 어노테이션을 빼먹으면 작동이 의도대로 안될 때가 많다.
- 반복문 안에서 addHTML 호출
  ```JavaScript
  for ( let i = 0; i< response.length; i++) {
      let message = response[i];
      let id = message['id'];
      let username = message['username'];
      let contents = message['contents'];
      let modifiedAt = message['modifiedAt'];
      addHTML(id, username, contents, modifiedAt);
  ```
- getMessages, addHTML 완성


[3주차] 메모 변경하기 - submitEdit 함수
- 개발 스펙 확인
  1. 작성 대상 메모의 username과 contents 를 확인
  2. 작성한 메모가 올바른지 확인
  3. 전달할 data 를 JSON으로 바꾸기
  4. PUT /api/memos/{id} 에 data 전달
- addHtml 리뷰
- 작성 대상 메모의 username과 contents 를 확인
  ```JavaScript
  let username = $(`#${id}-username`).text().trim();
  let contents = $(`#${id}-textarea`).val().trim();
  ```
- 작성한 메모가 올바른지 확인
  ```JavaScript
  if ( isValidContents(contents) == false) {
      return;
  }
  ```
- 전달한 data 를 JSON으로 바꾸기
  ```JavaScript
  let data = {'username': username, 'contents': contents};
  ```
- PUT /api/memos/{id} 에 data를 전달
  ```JavaScript
  $.ajax({
      type: "PUT",
      url: `/api/memos/${id}`,
      contentType: "application/json",
      data: JSON.stringify(data),
      success: function (response) {
          alert('메세지 변경에 성공하였습니다.');
          window.location.reload();
      }
  });
  ```
- submitEdit 함수 완성



[3주차] 메모 삭제하기 - deleteOne 함수
- 개발 스펙 확인
- DELETE API 사용해서 메모 삭제하기
- 클라이언트 완성 코드


[3주차] 끝 & 숙제설명
- 잠깐 복습
  - REST API의 CRUD 전체 프로세스를, 다시 한 번 복습했다.
  - HTML, CSS, Javascript, jQuery를 통해 보이는 화면을 만들고 조작하는 방법에 대해 배웠다.
  - API를 먼저 설계하고, 그에 따라 클라이언트 코드를 작성하는 프로세스를 익혔다.
- 숙제 설명
  ```
  타임라인 서비스가 불러오는 메모 목록의 시간을, 조회 시간으로부터 24시간 이내로 바꿔보세요.
  힌트1) spring jpa localtime between 이라고 구글링해보세요.
  힌트2) 지금은 LocaDateTime.now(), 하루 전은 LocalDateTime.now().minusDays(1) 입니다.
  ```
  - 제출 파일
    - MemoRepository.java
    - MemoController.java
