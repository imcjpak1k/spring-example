<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<form name="" method="post" action="/example/board/tiles/regExecute">
<table border="1">
	<tr>
		<td>title</td>
		<td><input type="text" name="title" /></td>
	</tr>
	<tr>
		<td>content</td>
		<td><textarea name="content" cols="100" rows="10"></textarea></td>
	</tr>
</table>
<input type="submit" value="전송" />
</form>