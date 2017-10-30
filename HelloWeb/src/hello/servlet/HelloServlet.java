package hello.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//사용자 요청을 받으면 간단한 인사말과 현재시간을 알려주는 서비스제공.
/*
 * 1. extends HttpServlet
 * 2. doGet() 메소드를 오버라이딩.
 * 3. (서블릿 객체를) 웹컨테이너-톰켓-에 등록
 * 	- web.xml 설정파일에 등록 
 *  - Annotation을 이용해 등록
 */
public class HelloServlet extends HttpServlet{

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException{
		String str = String.format("%tY-%<tm-%<td %<tH:%<tM:%<tS", new Date());
		
		//사용자에게 응답처리.
		/*System.out.println("안녕하세요");
		System.out.println(str);*/
		response.setContentType("text/html;charset=utf-8");//응답 content-type설정
		PrintWriter out = response.getWriter();//사용자와 연결된 출력 Stream
		out.println("<!doctype html>");
		out.println("<html><head><title>인사</title></head>");
		out.println("<body>");
		out.printf("%s<br>현재 일시 : %s%n", "안녕하세요.", str);
		for(int i = 0; i < 10; i++) {
			out.println("안녕");
		}
		out.println("</body></html>");
	}
}














