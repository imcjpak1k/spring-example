<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<a href="/example/board/tiles/reg">[등록]</a>
<table border="1">
	<tr>
		<td>index</td>
		<td>count</td>
		<td>title</td>
		<td>content</td>
	</tr>
	<c:forEach items="${resultList}" var="item" varStatus="status">
		<tr>
			<td>${status.index}</td>
			<td>${status.count}</td>
			<td>${item.title}</td>
			<td>${item.content}</td>
		</tr>
	</c:forEach>
</table>
