<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
</head>
<body>
로그인페이지

<input type="hidden" id="signin-flag" value="${empty signinRespDto.signinFlag? '' : signinRespDto.signinFlag }" >

<form action="/study/signin" method="post">
	아이디: <input type="text" name="username" value="${signinRespDto.username }" required="required"></br>
	비밀번호: <input type="password" name="password" value="${signinRespDto.password }" required="required"></br>
	<button>로그인</button>
</form>
<button type="button" onclick="location.href='/study/signup'">회원가입</button>
<script type="text/javascript">
	const signinFlag = document.querySelector('#signin-flag');
	if(signinFlag.value==0){
		alert('존재하지 않는 아이디입니다.');
	}else if(signinFlag.value==1){
		alert('비밀번호가 틀렸습니다.');
	
	}else{
	
	}
</script>

</body>
</html>