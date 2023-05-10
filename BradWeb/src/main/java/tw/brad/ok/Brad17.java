package tw.brad.ok;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tw.brad.classes.Brad18;

@WebServlet("/Brad17")
public class Brad17 extends HttpServlet {
	// Controller
	// 主程式
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		// 1.接收參數:畫面取得x,y跟view
		String x = request.getParameter("x");
		String y = request.getParameter("y");
		String view = request.getParameter("view");
		
		// 2.演算法
		RequestDispatcher dispatcher;
		dispatcher = request.getRequestDispatcher("Brad19");
		try {
			// new Brad18物件(做數學運算)
			Brad18 brad18 = new Brad18(x, y);
			int result = brad18.plus();		// 運算結果在這裡做接收
			
			request.setAttribute("view", view==null?"view1":view);
			request.setAttribute("x", x);
			request.setAttribute("y", y);
			request.setAttribute("result", result+"");
			
		} catch (Exception e) {
			// 參數不對(包含null、非數字)
			// 抓到錯誤訊息全部給空值(畫面不見這裡處理)
			request.setAttribute("view", view==null?"view1":view);
			request.setAttribute("x", "");
			request.setAttribute("y", "");
			request.setAttribute("result", "");
			
		}
		// 3.呈現View
		dispatcher.forward(request, response);
				
	}

}
