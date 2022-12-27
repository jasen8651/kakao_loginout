<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<a href="https://kauth.kakao.com/oauth/authorize?client_id=cc8867607cc17b887b9393ecd59ce096&redirect_uri=http://localhost:8090/myapp/kakaologin.do&response_type=code">
	<!-- REST_API키 및 REDIRECT_URI는 본인걸로 수정하세요 -->
	<!-- 본인걸로 수정 시 띄어쓰기 절대 하지 마세요. 오류납니다. -->
		<img src='./images/kakao_login_medium_narrow.png' alt='kakaologin'/>
	</a>
	
	
	<a href="https://kauth.kakao.com/oauth/logout?client_id=cc8867607cc17b887b9393ecd59ce096&logout_redirect_uri=http://localhost:8090/myapp/kakaologin.do">로그아웃
	</a>
	</br>
	<a href="https://kapi.kakao.com/v1/user/unlink?client_id=cc8867607cc17b887b9393ecd59ce096&logout_redirect_uri=http://localhost:8090/myapp/kakaologin.do">회원탈퇴</a>
</body>
</html>