<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
</head>
<body>
	로그인 페이지

	<form action="/study/signin" method="post">
		아이디 : <input type="text" name="username"></br> 
		비밀번호 : <input 	type="password" name="password"></br>
		<button>로그인</button>
		</br>
	</form>
	<button type="button" onclick="location.href='/study/signup'">회원가입</button>



</body>
</html>