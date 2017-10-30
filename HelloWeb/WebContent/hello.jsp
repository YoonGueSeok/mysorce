<%@ page contentType="text/html;charset=utf-8"%>
<%@ page import="java.util.Date"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>

<body>
	안녕하세요.
	<br> 현재 시간 :
	<%=String.format("%tH:%<tM:%<tS", new Date())%>
</body>
</html>
