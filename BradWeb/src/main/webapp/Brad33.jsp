<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<table>
			<tr>
				<td>
					<%
						for ( int i=0 ; i< 9; i++){
							int j = 2;
							int r = j*i;
							out.print("%d x %d = %d \n", j, i, r);
							
						}
					%>
				</td>
				<td></td>
				<td></td>
				<td></td>
			</tr>
		</table>
	</body>
</html>