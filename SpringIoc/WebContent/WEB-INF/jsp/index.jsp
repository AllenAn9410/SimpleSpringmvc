<%@ page language="java" contentType="text/html; charset=utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="login-action.form">
       <p>user:<input type="text" name ="user"/></p>
       <p>password:<input type="password" name="password"/></p>
       <input type="submit" value="login"/>
       <h6>${message}</h6>
     </form>
</body>
</html>