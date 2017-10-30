package lifecycle;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * Lifecycle 메소드 - Web Container가 서블릿 객체 생성 ~ 소멸 시점까지 
 * 					  특정 시점에 호출 하는 메소드.
 *  - init() : instance생성 직후 호출
 *  - service() : 사용자 요청시마다 호출.=> doGet(), doPost();
 *  - destroy() : instance 소멸 직전에 호출
 *  
 *  서블릿 객체가 생성되는 시점
 *  	- 사용자가 첫 요청을 했을때.(기본)
 *  	- web.xml에 설정시 application이 시작하는 시점에 생성되도록 할수있다.
 * 	서블릿 객체가 소멸되는 시점
 * 		- Application이 종료
 */
public class LifecycleServlet extends HttpServlet{
	//서블릿에서 System.out.println() 출력은 console(명령프롬프트)에 출력된다.
	public LifecycleServlet() {
		System.out.println("LifecycleServlet생성자 실행");
	}
	public void init() {
		System.out.println("LifecycleServlet.init() 실행");
	}
	public void destroy() {
		System.out.println("LifecycleServlet.destroy() 실행");
	}
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException{
		System.out.println("LifecycleServlet.doGet() 실행");
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException{
		System.out.println("LifecycleServlet.doPost() 실행");
	}
}
















