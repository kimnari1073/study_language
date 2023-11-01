# Page Directive 페이지 지시어
## contentType
페이지에서 생성할 MIME 타입을 지정한다.
```
<%@ contentType="text/html; charset=UTF-8" %>
```
## import
java.lang 패키지에 속하지 않은 클래스를 JSP문서에서 사용하기 위해 자바 패키지와 클래스를 지정한다.
```
// Date객체를 사용하기 위해 스크립트릿에 객체를 생성하면 오류가 난다.
<% new Date(); %>
// 방법1 페이지 지시어 import를 사용하여 Date객체 클래스를 불러온다.
<%@ import ="java.util.*"%>
// 방법2 직접 지정한다.
<% new java.util.Date(); %>
```
## errorPage
해당 페이지에서 에러가 발생했을 때 에러 발생 여부를 보여줄 페이지를 지정한다.
```
<%@ errorPage="isErrorPage.jsp" %>
// 단, isErrorPage.jsp 파일에도 지시어에 isErrorPage 속성에 true를 지정해야 한다.
<%@ isErrorPage="true" %>
```
## Buffer
응답 결과를 웹 브라우저로 즉시 전송하지 않고, 출력할 내용을 버퍼에 저장했다가 일정량이 되었을 때 전송한다.
출력 버퍼의 크기를 지정한다. 기본값은 8KB

## autoFlush
출력 버퍼가 모두 채워졌을 때 자동으로 비울지 결정한다. 기본값은 true
