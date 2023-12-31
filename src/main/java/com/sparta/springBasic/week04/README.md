# [스파르타코딩클럽] 웹개발의 봄, Spring - 4주차

## 01. [4주차] 이번 주 배울 것
- 기본기
  - 3계층 숙달, API handling
    1. 3계층 숙달
        - 스프링, 아니 개발의 핵심 중 하나가 분업과 느슨한 결합이다. 각자가 맡은 바 책임을 다하면 기능이 온전히 작동하고, 느슨히 결합함으로써 유연성과 확장성을 가지기 때문이다.
        - 3계층은 분업과 느슨한 결합의 대표적인 예시이자, **스프링이 돌아가게 만드는 척추**이다.
        - 깊게 파자면 끝없는 이론이 있지만, 지금은 그것보다 우선 **손에 익게 하는데 집중**해라.
    2. Api handling
       - 혼자 하는 개발은 없다. 그리고 세상에는 다양한 API가 있다. API를 잘 다루면 재미있는 **나만의 서비스를 더 많이, 더 빠르게**만들 수 있고 그럼으로써 개발자로 한 단계 성장할 수 있다.
       - 또한, 느슨한 결합의 대표적인 예시가 바로 API이다. 우리가 이용할 네이버 검색 API의 내부 로직이 어떻게 되든 상관없이, 우리는 정해진 약속대로 요구하면 정해진 결과를 받을 수 있다.
       - API가 아무리 많아도 쓸 줄 모르면 무용지물이다. 그런데 JSON으로 주고받는 데이터를 어떻게 자바로 요청하고, 그 결과를 다룰 수 있는지 모르는 분들이 생각보다 많다. 이번에는 그 기초를 확실하게 배운다.
- 프로젝트 모습과 기능
  - 요구 기능
    - 상품명에 따른 검색
    - 관심 상품 등록 & 조회
    - 관심 상품에 대한 최저가 등록하기
- 자바에서 API를 요청하고 그 결과를 어떻게 다룰 수 있을까?
  - 모든 코드를 이해하기보다, 요점을 정확히 파악하고 데이터를 주고받을 수만 있으면 된다.
  - ARC를 이용해서 네이버에 검색을 요청하고, 응답을 자바 코드로 변환한 뒤 DB에 저장한다.
  - 더해서, 자동으로 정보를 수집하고 업데이트하는 스케줄러까지 만들어 보자.
- Controller - Service - Repository 3계층 레이어, 손에 붙어야 한다.
  - Controller는 제일 바깥 쪽에서 요청을 받고, 응답을 되돌려주는 역할을 한다.
  - Service는 중간에서 구체적인 작업 순서를 결정한다.
  - Repository는 DB와 직접 소통함으로써 자료를 생성하고, 조회하고, 변경하고, 삭제한다.
  - 그리고 각 레이어 간에는 절대 Entity를 직접 사용하지 않고,DTO라는 택배상자를 만들어 사용한다.
  - 각 계층 만드는 과정을 한층 심화해서 연습하자.
- HTML, CSS, jQuery 도 최소한은 할 줄 알아야 한다.
  - 뼈대만 완성된 HTML, CSS, jQuery 소스를 드린다.
  - 함께 해볼 부분은, 여기에 데이터를 끼워서 직접 화면에 띄워보는 것이다.
  
## 02. [4주차] 네이버 쇼핑 API 이용 신청하기
- 네이버 API란?
  - 네이버 서비스를 코드로 이용할 수 있는 서비스이다.
  - 네이버 API 목록 살펴보기
    - https://developers.naver.com/products/intro/plan/
- 제공하는 API
  - 상당히 많네, 이중에서 검색 API 쓰자
- 사용할 API 살펴보기
  - https://developers.naver.com/products/service-api/datalab/datalab.md
- API 이용 신청하기
  - 상당히 재밋게 신청완료

## 03. [4주차] 네이버 쇼핑 API 바로 사용해보기
- ARC로 검색해보기
  1. ARC를 실행하세요
  2. 네이버 쇼핑 API 설명 문서
     - https://developers.naver.com/docs/serviceapi/search/shopping/shopping.md
  3. <API 기본 정보>에서 출력포맷이 JSON인 녀석의 요청 URL을 복사해서 ARC의 URL에 붙여 넣어준다.
  4. Headers에서 "Add Header"를 두 번 클릭하고, 첫 번째 header의 name에 "X-Naver-Client-Id", value에 지난 시간에 만든 Client ID를 복사해서 넣어주세요. 두 번째 header에 "X-Naver-Client-Secret" 와 Client Secret을 각각 넣어주세요.
  5. 주소 제일 마지막에 "?query=adidas"라고 적은 뒤 SEND 버튼을 누르세요.
     - GET 요청에서 필요한 정보를 같이 보내는 방법! ? 과 & 를 사용한다.
  6. 아디다스 검색 성공
- 검색 결과 살펴보기
  - 문서 설명
  - 실제 결과
    - 특히 중요한 정보는 title, link, image, Iprice
- 검색 기준 바꿔보기
  - GET 요청에서 필요한 정보를 같이 보내는 방법! ? 과 & 를 사용한다.
    1. 검색어 바꿔보기
    2. display 30 넣어보기
    3. start 30 넣어보기
    4. sort asc 넣어보기
  - 다해봄


## 04. [4주차] 자바로 네이버 쇼핑 API 이용하기
- 자바 코드 확인하기
  - ARC를 이용해서 코딩 없이 바로 자바 코드를 얻을 수 있따.
  - 앞으로 어떤 API를 사용하건 정말 잘 되는지, 결과는 어떻게 되는지 확인한 뒤 바로 코드를 얻을 수 있으니 적극적으로 사용해라
  1. 성공적으로 API가 응답하는 것을 확인한 뒤, CODE 탭을 누른다.
  2. JAVA 탭을 클릭한다.
  3. SPRING 탭을 클릭하면 아래처럼 바로 코드로 바꿔줌을 확인할 수 있다. 그럼 정말 작동하는지 확인하자.
- 스프링 프로젝트 준비하기
- 검색 실행하고 결과 확인하기
  1. src > main > java > com.sparta.week04 에 utils 패키지를 만든다.
  2. NaverShopSearch.java 파일을 생성한다.
  3. NaverShopSearch 클래스
  4. search 함수 안에 ARC에서 복사한 코드를 붙여넣는다.
  5. 정상 작동을 확인한다.


## 05. [4주차] 프로젝트 설계하기
- 필요한 기능 확인하기
  1. 키워드로 상품 검색하고 그 결과를 목록으로 보여주기
  2. 관심 상품 등록하기
  3. 관심 상품 조회하기
  4. 관심 상품에 원하는 가격 등록하고, 그 가격보다 낮은 경우 표시하기 (숙제!)
- 연습퀴즈 - API 설계하기
  - 5분 동안 각 기능의 API를 설계해라
  - EX) 관심 상품 등록하기 -> POST /api/product
- API 설계하기
  - |                    기능                    | Method |          URL           |      반환       |
    |:----------------------------------------:|:------:|:----------------------:|:-------------:|
    |     키워드로 상품 검색하고<br/>그 결과를 목록으로 보여주기     |  GET   | /api/search?query=검색어  | List<ItemDto> |
    |                관심 상품 등록하기                |  POST  |            /api/products        |    Product    | 
    |                관심 상품 조회하기                |  GET   |     /api/products      | List<Product> |
     | 관심 상품에 관심 가격 등록하고,<br/>그 가격보다 낮은 경우 표시하기 |  PUT   |   /api/products/{id}   |      id       |

- 3계층 설계하기
  1. Controller
     - ProductRestController: 관심 상품 관련 컨트롤러
     - SearchRequestController: 검색 관련 컨트롤러
  2. Service
     - ProductService: 관심 상품 가격 변경
  3. Repository
     - 여기서 DB에 저장되는 녀석은 Product 뿐이라는 점
     - Product: 관심 상품 테이블
     - ProductRepository: 관심 상품 조회, 저장
     - ProductRequestDto: 관심 상품 등록하기
     - ProductMypriceRequestDto: 관심 가격 변경하기
     - ItemDto: 검색 결과 주고받기
  


## 06. [4주차] 관심 상품 조회하기
- 요구조건 살펴보기
  - 모아보기 탭을 눌렀을 때 아래와 같이 등록된 관심 상품을 조회할 수 있다.
- Timestamped 클래스 만들기
  - Timestamped
  - Application
- Product 클래스 만들기
  - 요구조건 살펴보기
    - title, image, link, lprice, myprice 정보가 필요함을 알 수 있다.
  - Product 클래스
- ProductRepository 만들기
- ProductRestController 만들기
- 확인해보기
  - ARC로 정상 작동함을 확인한다.


## 07. [4주차] 관심 상품 등록하기
- 요구조건 살펴보기
  - 상품을 검색한 후, 등록 버튼을 눌렀을 때 관심 상품이 생성되어야 한다.
  - 검색 결과에서 제목, 이미지, 링크, 최저가를 가져오면 된다.
- Dto 클래스 만들기
  - ProductRequestDto
  - ProductMypriceRequestDto
- Product 클래스 개선하기
- ProductService 만들기
- ProductRestController 개선하기


## 08. [4주차] 키워드로 상품 검색하기 - NaverShopSearch 발전시키기
- 요구 조건 살펴보기
  - 이전에 만들어 둔 NaverShopSearch 클래스를, 웹서비스에 이용할 수 있도록 발전시키자
    1. 검색어를 요구에 따라 바꿀 수 있어야 한다.
    2. 검색 결과를 문자열에서 DTO로 바꿔야 한다.
- 검색어 바꾸기
  - 검색어를 아이맥으로 바꾸자
  - search 메소드 바꾸기
- 검색 결과를 문자열에서 DTO로 바꾸기
  - org.json 패키지 설치하기
    - JSON을 자바에서 다루기 위해, JSONObject, JSONArray 클래스가 필요하다.
    - 우리가 만드는 대신, 다른 사람이 만든 훌륭한 라이브러리를 바로 가져와서 사용하자.
    - 이번 시간에는 **다른 사람이 만든 라이브러리 가져오는 방법(임포트)** 에 대해 배우자.
      1. 구글에 maven central 검색 후 첫 번째 결과 클릭
      2. 검색창에 json 입력 후 엔터
      3. JSON In Java 클릭
      4. 숫자 가장 높은 버전 클릭
      5. Gradle 탭 클릭
      6. 내용 복사하여 build.gradle > dependencies 안에 붙여넣기
      7. dependencies 옆에 Run 버튼 클릭
      8. 임포트 완료!
  - JSONObject, JSONArray 연습하기
    1. 문자열 정보를 JSONObject로 바꾸기
       ```java
       JSONObject rjson = new JSONObject(result);
       ```
    2. JSONObject에서 items 배열 꺼내기
       ```java
       JSONArray items = rjson.getJSONArray("items");
       ```
    3. JSONArray 로 for 문 돌기
       ```java
       for(int i=0; i<items.length(); i++) {
            JSONObject itemJson = (JSONObject) items.get(i);
            System.out.println(itemJson);
       }
       ```
    4. JSONObject 에서 String, int 데이터 뽑기
       ```java
       String title = itemJson.getString("title");
       int lprice = itemJson.getInt("lprice");
       ```
  - ItemDto 생성하기
  - fromJSONtoItems 메소드 만들기


## 09. [4주차] 키워드로 상품 검색하기 - 네이버 API와 서비스 연결하기
- 요구 조건 살펴보기
  1. 사용자가 검색어를 입력하면, 컨트롤러가 그것을 전달받는다.
  2. 전달받은 검색어로 네이버 API에 요청하고, 그 결과를 사용자에게 응답한다.
- NaverShopSearch 컴포넌트 등록하기
  - 더 이상 검색을 main 메소드에서 진행하는게 아니라, Controller 에서 가져다 써야한다.
  - 스프링이 자동으로 필요한 클래스를 필요한 곳에 생성하려면, "아, **사용자가 요구하면 자동으로 생성할 클래스 목록**이 이것이구나"라고 확인할 수 있어야 하겠죠?
  - 그 목록에 등록하는 간단한 방법이 바로 컴포넌트 등록이다.
  - NaverShopSearch 컴포넌트 등록
- SearchRequestController 만들기
  - 키워드로 상품 검색하고 그 결과를 목록으로 보여주기  :  GET  :  /api/search?query=검색어
- ARC로 기능 확인하기


## 10. [4주차] HTML, 이미지 파일 준비하기
- 파일 분리
  - 파일분리는, HTML 파일이 CSS와 Javascript 때문에 지나치게 길어지는 것을 방지하고 가독성을 높이기 위한 방법이다.
    1. .css와 .js로 끝나는 파일을 만들고,
    2. link 와 script 태그로 각 파일을 불러온다.
- 파일 준비
  - 미리 준비한 HTML, CSS, Javascript 팡리과 이미지 아이콘을 다운받는다.
  - src > main > resources > static에 index.html, basic.js, style.css 파일을 생성하고 아래 코드를 붙여넣는다.
  - src > main > resources > static에 images 폴더를 만들고 아래 파일을 저장한다.
- 제대로 저장하였는지 확인하기


## 11. [4주차] 상품 검색 기능 만들기
- execSearch, addHTML 함수 만들기
  - 검색창 입력값 가져오기
    ```javascript
    let query = $('#query').val();
    ```
  - 검색창 입력값을 검사하고, 입력하지 않았을 경우 focus
    ```javascript
    if (query == '') {
        alert('검색어를 입력해주세요');
        $('#query').focus();
        return;
    }
    ```
  - GET /api/search?query=${query} 요청
    ```javascript
    $.ajax({
        type: 'GET',
        url: `/api/search?query=${query}`,
        success: function (response) {
            $('#search-result-box').empty();
        }
    })
    ```
  - for 문마다 itemDto를 꺼내서 HTML 만들고 검색결과 목록에 붙이기
    ```javascript
    for(let i = 0; i < response.length; i++) {
        let itemDto = response[i];
        let tempHtml = addHTML(itemDto);
        $('#search-result-box').append(tempHtml);
    }
    ```
  - addHTML 완성하기

  
## 12. [4주차] 관심 상품 등록하기
- addProduct 함수 만들기
  - 관심 상품 생성 요청
    ```javascript
    function addProduct(itemDto) {
      $.ajax({
          type: "POST",
          url: '/api/products',
          contentType: "application/json",
          data: JSON.stringify(itemDto),
          success: function (response) {
        
          }
      })
    }
    ```
  - model 뜨게 하기
    ```javascript
    $('#container').addClass('active');
    ```
  - targetId = response.id
    ```javascript
    targetId = response.id;
    ```
  
## 13. [4주차] 관심 상품 보여주기
- $(document).ready 함수의 의미
  - 페이지가 모두 로드된 직후 실행할 자바스크립트 코드를 넣는 곳이다.
  - 일단 접속하면 관심 상품을 보여주어야하기 때문에 showProduct 함수를 호출하고 있다.
- showProduct, addProductItem 만들기
  - GET /api/products 요청
    ```javascript
    $.ajax({
        type: 'GET',
        url: '/api/products',
        success: function (response) {
    
        }
    })
    ```.
  - 관심상품 목록, 검색결과 목록 비우기
    ```javascript
    $('#product-container').empty();
    $('#search-result-box').empty();
    ```
  - for 문마다 관심 상품 HTML 만들어서 관심상품 목록에 붙이기
    ```javascript
    for (let i = 0; i< response.length; i++) {
        let product = response[i];
        let tempHtml = addProductItem(product);
        $('#product-container'.append(tempHtml);
    }
    ```
  - link, image, title, lprice, myprice 변수 활용하기
    ```javascript
    // link, image, title, lprice, myprice 변수 활용하기
    return `<div class="product-card" onclick="window.location.href='${product.link}'">
                <div class="card-header">
                    <img src="${product.image}"
                         alt="">
                </div>
                <div class="card-body">
                    <div class="title">
                         ${product.title}
                    </div>
                    <div class="lprice">
                        <span>${numberWithCommas(product.lprice)}</span>원
                    </div>
                    <div class="isgood ${product.lprice > product.myprice ? 'none' : ''}">
                         최저가
                    </div>
                </div>
    </div>`;
    ```
- 완성


## 14. [4주차] 스케줄러 만들기
- 요구 기능
  - 매일 새벽 1시에 관심 상품 목록 제목으로 검색해서, 최저가 정보를 업데이트하는 스케줄러를 만들자.
- Scheduler 만들기
  - src > main > java > com.sparta.week04 > utils 에 Scheduler.java 파일을 만들어라.
  - Scheduler 클래스
  - ProductService 클래스
  - Application 클래스
- 확인
## 15. [4주차] 끝 & 숙제설명
