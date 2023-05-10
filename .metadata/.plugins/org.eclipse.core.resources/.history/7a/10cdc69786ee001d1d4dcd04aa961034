package tw.brad.ok;

import java.io.IOException;
import java.util.Collection;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@WebServlet("/Brad10")
//處理檔案上傳的類別
@MultipartConfig(
		location = "C:\\Users\\user\\eclipse-workspace\\BradWeb\\src\\main\\webapp\\upload\\" 
		)
public class Brad10 extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Part upload = request.getPart("upload");
		System.out.println("Size: " + upload.getSize());
		System.out.println("Type: " + upload.getContentType());
		System.out.println("fname: " + upload.getSubmittedFileName());
		
		// 把網頁使用者提交的檔案放到java專案裡的upload檔裡
		upload.write(upload.getSubmittedFileName());
		
		
	}
}
