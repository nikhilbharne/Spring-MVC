<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"% >
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h1 style="color: red; text-align: center">MED PLUS STORE MEDICINE
	REPORT</h1>

<c:choose>
	<c:when test="${!empty listMed}">
		<table border="1" bgcolor="pink">
			<tr>
				<th>MID</th>
				<th>MEDNAME</th>
				<th>PRICE</th>
				<th>MFGDATE</th>
				<th>EXPDATE</th>

				<c:forEach var="dto" items="${listMed}">
					<tr>
						<td>${dto.mid}</td>
						<td>${dto.medName}</td>
						<td>${dto.price}</td>
						<td>${dto.mfgDate}</td>
						<td>${dto.expDate}</td>
					</tr>
				</c:forEach>
		</table>
	</c:when>
	<c:otherwise>
		<h1 style="color: red; text-align: center">No Records found</h1>
	</c:otherwise>
</c:choose>
<br>
<br>
<a href="home.htm">home</a>
