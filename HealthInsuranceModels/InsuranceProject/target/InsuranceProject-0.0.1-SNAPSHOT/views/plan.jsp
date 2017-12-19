<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="createPlan.spring" method="post">
		<input type="text" name="name">
		<input type="text" name="price">
		<input type="text" name="amountCovered">
		<input type="submit" name ="submit" value="Create Plan">
	</form>
</body>
</html>