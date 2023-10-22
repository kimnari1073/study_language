1. 지시어 directive
```
<%@ page language="jaba" contentType="txex/htlm; charse=UTF-8" page Encoding="UTF-8" %>
```
필수 구성 요소<br>
현재의 jsp 파일과 관련된 환경 설정 내용을 지시어에 작성한다.<br>
JSP 페이지를 자바(서블릿) 코드로 벼노한하는데 필요한 정보를 JSp엔진에 알려주며, 주로 스크립트 언어나 인코딩 방식 등을 설정한다.<br>
2. 스크립트 Script
  - 선언부 Declaration
    - ```
      <%! String str1 ="JSP"; %>
      ```
      변수 선언, 메서드 선언
      선언된 변수는 java파일로 변환될 때 class파일의 필드로 변환된다.
  - 표현식 Expression
    - ```
      <%= str1 %>
      ```
      변수 이름, 객체, 메서드 호출<br>
      세미콜론 작성 시 에러
  - 스크립트릿 Scriptlet
    - ```
      <% out.println("hello,"+str1); %>
      ```
      선언된 변수는 java파일로 변환될 때 메서드의 로컬변수로 선언된다.
      
3. 기본 객체
4. 액션 태그
5. 표현 언어
6. 커스텀 태그
7. 주석
