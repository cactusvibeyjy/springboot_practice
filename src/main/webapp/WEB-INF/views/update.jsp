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
id 		:<input name="id" id="id"type="text" value="${member.id}" readonly="readonly"/><br/>
Name 	:<input name="name" id="name" type="text" value="${member.name}"/><br/>
Password:<input name="password" id="password" type="password"/><br/>
Email	:<input name="email" id="email" type="text"  value="${member.email}"/><br/>
Addr	:<input name="addr" id="addr" type="text" size="30"  value="${member.addr}"/><br/>
Memo	:<textarea rows = "5" cols="50" name ="memo" id="memo">${member.memo}</textarea><br/>
<button type="button" id="btnUpdate">수정하기</button>
<script src="/js/member.js"></script>
</body>
</html>