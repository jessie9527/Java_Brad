package tw.brad.ok;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Brad09")
public class Brad09 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 網址會出現value，使用這個密碼就公開了
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 網址不會出現value
		System.out.println("dopost()");
		String account = request.getParameter("account");
		String passwd = request.getParameter("passwd");
		String gender = request.getParameter("gender");
		
		// 表單有多個value用getParameterValues轉字串陣列接收
		String[] hs = request.getParameterValues("hobbies");
		// 有多個value用foreach去尋訪
		if (hs != null) {
			for (String h: hs) {
				System.out.println(h);
			}			
		}
		
		System.out.printf("%s : %s ", account, passwd);
	}

}
