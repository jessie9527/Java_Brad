package tw.brad.ok;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Brad13")
public class Brad13 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		// 呼叫14
		RequestDispatcher dispatcher = 
			request.getRequestDispatcher("Brad14");
		
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.print("<h1>Brad Big Company</h1>");
		
		// 這裡的request是把13的東西交給14接收，response是把14的東西回傳給13
		dispatcher.include(request, response);
		
		out.print("<hr /> ");
		out.print("Hello, World");
	}

}
