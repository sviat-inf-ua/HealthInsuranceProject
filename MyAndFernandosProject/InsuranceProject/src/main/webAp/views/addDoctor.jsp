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
		<form action="saveDoctor.spring" method="POST">

			<tr>
				<td><input type="text" name="firstName"
					placeholder="First Name"></td>
			</tr>

			<tr>
				<td><input type="text" name="lastName" placeholder="Last Name ">
				</td>
			</tr>

			<tr>
				<td><input type="text" name="cellPhone"
					placeholder="cellPhone "></td>
			</tr>

			<tr>
				<td><input type="text" name="isActive" placeholder="isActive">
				</td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" name="submit" value="Save"></td>
			</tr>
		</form>
	</table>
</body>
</html>