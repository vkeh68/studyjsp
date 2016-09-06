<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="color.jspf" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="<%=bodyback_c%>">
	<form action="">
		<dl>
			<dd>
				<label for="name">이름</label>
				<input id="name" type="text" placeholder="홍길동" required>
			</dd>
			
			<dd>
				<label for="pass">비밀번호</label>
				<input id="id" type="text" placeholder="비밀번호" required>
			</dd>
			
			<dd>
				<input type="submit" value="등록">
			
			</dd>
		
		</dl>
	</form>

</body>
</html>