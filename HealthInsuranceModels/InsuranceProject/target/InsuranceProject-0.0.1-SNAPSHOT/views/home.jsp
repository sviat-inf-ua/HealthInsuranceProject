<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<<<<<<< HEAD
=======
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
>>>>>>> a1ee89d9040a9695346f0b0680388f889afde9a2
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<<<<<<< HEAD
	${customer }
=======
	<a href="showall.spring">show All Customers</a>
	
	
	
	<a href="viewDetails.spring">View Details</a>
	<a href="apply.spring">Apply</a>
	
	<c:forEach items="${msg }" var="cus">
		${cus.getFname() }
	
	</c:forEach>
>>>>>>> a1ee89d9040a9695346f0b0680388f889afde9a2
</body>
</html>