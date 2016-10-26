<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html>
<html>
<head>
<title>List All Customers</title>
 <spring:url value="/resources/style.css" var="styleCSS" />
 <link href="${styleCSS}" rel="stylesheet" />
</head>
<body>
	<div id = 'wrapper'>
		<div id='header'>
			<h1>
				Listing Customers
			</h1>
		</div>
	</div>
	<div id='container'>
		<div id='content'>
			<table>
				<tr>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Email</th>
				</tr>
				<c:forEach items="${customers}" var="tempCustomer">
					<tr>
						<td>${tempCustomer.firstName}</td>
						<td>${tempCustomer.lastName}</td>
						<td>${tempCustomer.email}</td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</div>

</body>
</html>

