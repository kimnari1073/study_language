1. contentType<br>
페이지에서 생성할 MIME 타입을 지정한다.
```
<%@ contentType="text/html; charset=UTF-8" %>
```
2. import<br>
페이지에서 사용할 자바 패키지와 클래스를 지정한다.
```
// Date객체를 사용하기 위해 스크립트릿에 객체를 생성하면 오류가 난다.
<% new Date(); %>
// 방법1 페이지 지시어 import를 사용하여 Date객체 클래스를 불러온다.
<%@ import ="java.util.*"%>
// 방법2 직접 지정한다.
<% new java.util.Date(); %>
```
3. errorPage
해당 페이지에서 에러가 발생했을 때 에러 발생 여부를 보여줄 페이지를 지정한다.
```
<%@ errorPage="isErrorPage.jsp" %>
// 단, isErrorPage.jsp 파일에도 지시어에 isErrorPage 속성에 true를 지정해야 한다.
<%@ isErrorPage="true" %>
```
