package tw.brad.ok;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tw.brad.classes.BradUtils;

@WebServlet("/Brad19")
public class Brad19 extends HttpServlet {
	// 負責顯示View
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String x = (String)request.getAttribute("x");
		String y = (String)request.getAttribute("y");
		String result = (String)request.getAttribute("result");
		String view = (String)request.getAttribute("view");
		
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		// 讀View.html的資料
		try {
			// 載入畫面把view.html變字串
			String content = BradUtils.loadView(view);
			// 把變數塞入字串裡
			out.print(String.format(content, view, x, y, result));
		}catch(Exception e1) {
			try {
				String content = BradUtils.loadView("view1");
				out.print(String.format(content, view, x, y, result));
			}catch(Exception e2) {
				
			}
		}
		
		
	}
	
}
