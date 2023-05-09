package tw.brad.ok;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Brad06")
public class Brad06 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Enumeration<String> params = request.getParameterNames();
		// 網址http://localhost:8080/BradWeb/Brad06 加上 ?key=value&x=1&y=6
		// console會回傳key=value、x=1、y=6
		while (params.hasMoreElements()) {
			String param =params.nextElement();
			String value =request.getParameter(param);
			System.out.printf("%s : %s\n", param, value);
		}
	}



}
