<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html>
<html>
<head><meta charset="UTF-8"><title>Emp Management</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"></head>
<body>
<h1 align="center">Emp Management</h1>
<div class="text-center"><a class="btn btn-danger" href="home">Home</a></div><hr/>
<h2 class="text-center">Employee Details</h2>
	<table class ="col-md-8 table table-striped mx-auto">
		<tr>
			<td>id</td>
			<td>name</td>
			<td>sal</td>
			<td>dept</td>
			<td>DOJ</td>
		</tr>
		<c:forEach items="${elist}" var="e">
		   <tr>
			<td>${e.empId}</td>
			<td>${e.empName}</td>
			<td>${e.empSal}</td>
			<td>${e.dept.deptName}</td>
			<td>${e.doj} ${e.strDoj}</td>
			
		</tr>
		</c:forEach>
	</table>
</body>
</html>