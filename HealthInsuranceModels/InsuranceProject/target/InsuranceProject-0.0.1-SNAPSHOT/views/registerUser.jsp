<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<table>
	<%-- <form action="create.spring" method="POST"> --%>
	<form:form action="create.spring" method="POST"  modelAttribute="customer">
	<tr>
	<td>
		<!-- <input type="text" name="fname" placeholder="First Name"> -->
		<form:input path="fname" placeholder="First Name"/>
	</td>
	<td>
		<form:errors path="fname" cssStyle="color: red"></form:errors>
	</td>
	</tr>
	<tr>
	<td>
		<!-- <input type="text" name="lname" placeholder="Last Name"> -->
		<form:input path="lname" placeholder="Last Name"/>
	</td>
	<td>
		<form:errors path="lname" cssStyle="color: red"/> 
	</td>
	</tr>
	<tr>
	<td>
		<!-- <input type="text" name="mname" placeholder="Middle Name"> -->
		<form:input path="mname" placeholder="Middle Name"/>
	</td>
	<td>
<<<<<<< HEAD
		<form:errors path="dob" cssStyle="color: red"></form:errors>
=======
		<%-- <form:errors path="dob" cssStyle="color: red"></form:errors> --%>
>>>>>>> a1ee89d9040a9695346f0b0680388f889afde9a2
	</td>
</tr>
	<tr>
	<td>
		<!-- <input type="email" name="email" placeholder="Email Address"> -->
		<form:input path="email" placeholder="Email Address"/>
	</td>
	<td>
		<form:errors path="email" cssStyle="color: red" />
	</td>
	</tr>
	<tr>
	<td>
		<!-- <input type="date" name="dob" placeholder="Date Of Birth"> -->
		<form:input path="dob" placeholder="Date of Birth"/>
	</td>
	<td>
		<form:errors path="dob" cssStyle="color: red"></form:errors>
	</td>
	</tr>
	<tr>
	<td>
		<!-- <input type="text" name="phone" placeholder="Phone Numeber"> -->
		<form:input path="phone" placeholder="Phone Number"/>
	</td>
	<td>
		<form:errors path="phone" cssStyle="color: red"></form:errors>
	</td>
</tr>
<tr>
	<td>
		<!-- <input type="text" name="ssn" placeholder="SSN"> -->
		<form:input path="ssn" placeholder="SSN"/>
	</td>
	<td>
		<form:errors path="ssn" cssStyle="color: red"></form:errors>
	</td>
</tr>
<tr>
	<td>
		<!-- <input type="password" name="pswd" placeholder="Password"> -->
		<form:input path="pswd" placeholder="Password"/>
	</td>
	<td>
		<form:errors path="pswd" cssStyle="color: red"></form:errors> 
	</td>
</tr>
<tr>
	<td>
		<input type="text" name="confirmPswd" placeholder="Confirm Password">
	</td>
</tr>
<tr>
	<td colspan="2"><input type="submit" name="submit" value="Register"></td>
</tr>
</form:form>
<%-- </form> --%>
</table>
</body>
</html>