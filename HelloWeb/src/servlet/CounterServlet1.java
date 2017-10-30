package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CounterServlet1 extends HttpServlet{

	//사용자 방문 횟수를 저장할 Instance 변수
	private int count;
	
	public void init() {
		//저장시킨 count값을 읽어서 변수 count에 저장
	}
	
	public void destroy() {
		//변수 count값을 영구적으로 저장.(파일, DB)
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		
		//1. 요청받기
		//2. 업무처리 - count를 증가
		count++;
		//3. 결과 응답처리
		response.setContentType("text/html;charset=utf-8");
		//출력 Stream 조회
		PrintWriter out = response.getWriter();
		out.println("<!doctype html>");
		out.println("<html><head><title>방문횟수</title></head>");
		out.println("<body>");
		out.printf("당신은 <b>%d번째</b> 방문자입니다.", count);
		out.println("</body></html>");		
	}
}
