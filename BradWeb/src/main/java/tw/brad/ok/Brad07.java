package tw.brad.ok;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Brad07")
public class Brad07 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 連接bard07.html
		// 收到key值做回傳
		String x = request.getParameter("x");
		String y = request.getParameter("y");
//		System.out.println(x + ";" + y);
		int result = Integer.parseInt(x) + Integer.parseInt(y);
		
		response.setContentType("text/html; charset=UTF-8");
		// java.io
		PrintWriter out = response.getWriter();
		out.printf("%s + %s = %d", x, y, result);
//		out.flush();
//		out.close();
	}

}
