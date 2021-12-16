<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
</head>

<body>
	회원가입페이지

	<form action="/study/signup" method="post">
		아이디 : <input type="text" id="username" class="signup-ip" name="username" required="required">
		<button type="button" id="id-check">중복확인</button></br>
		비밀번호 : <input type="password" class="signup-ip" name="password" required="required"></br>
		이름 : <input type="text" class="signup-ip" name="name" required="required"></br>
		이메일 : <input type="email" class="signup-ip" name="email" required="required"></br>
		<button>가입하기</button>
		<button type="reset">재작성</button>
		</br>
	</form>
	<button type="button" onclick="location.href='/study/signin'">로그인</button>
	<div class="test-text">안녕하세요</div>
	<script type="text/javascript" src="/study/resources/signup.js"></script>


</body>
</html>