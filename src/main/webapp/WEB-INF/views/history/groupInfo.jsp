<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<table class="pop-register-list">
	<thead>
		<tr style="text-align: center">
			<td>연차</td> 
			<td>인원</td>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="vo" items="${ careerGrouplist }">
			<tr>
				<td>${ vo.careerDate }년</td>
				<td>${ vo.careerCount }</td>
			</tr>
		</c:forEach>
	</tbody>
</table>



