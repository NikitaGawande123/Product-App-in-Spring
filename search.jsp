<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="./base.jsp"%>
</head>
<body>
<table>
<tbody>
<h2>Results for ${searchTerm}:</h2>
<c:forEach items="${searchResult}" var="result">
    <li>${result}</li>
</c:forEach>
</tbody>
</table>
</body>