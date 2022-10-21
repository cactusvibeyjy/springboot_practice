<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<script src="http://code.jquery.com/jquery-3.6.0.min.js"></script>
<body>
<h3>상세보기</h3>
아이디:${member.id}<br/>
이름:${member.name}<br/>
주소:${member.addr}<br/>
이메일:${member.email}<br/>
내용:${member.memo}<br/>
<a href="/update/${member.id}">수정 폼으로 가기</a>


<br/><br/>

</body>
</html>