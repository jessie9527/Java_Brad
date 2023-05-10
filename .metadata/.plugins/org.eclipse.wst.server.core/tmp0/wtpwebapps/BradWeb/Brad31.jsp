<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<%
			for (int i=0; i<10 ; i++){
				out.print(i+"<br />");
			}
		%>
		<hr />
		<%
			HashSet<Integer> set = new HashSet<>();
			while (set.size() < 6){
				set.add((int)(Math.random()*49));
			}
			out.print(set);
		%>
	</body>
</html>