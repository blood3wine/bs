package interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import beans.User;

public class MyInterceptor extends HandlerInterceptorAdapter {
	
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response,Object handler) throws Exception{
		String url = request.getRequestURI();//http://localhost:8080/bs/login?name=bjy&pw=111
		if(url.indexOf("/tologin")>=0||url.indexOf("/login")>=0||url.indexOf("/regist")>=0||url.indexOf("/toregist")>=0){
			return true;
		}
		HttpSession session = request.getSession();
		User user = (User)session.getAttribute("USER_SESSION");
		if(user != null){
			return true;
		}
		request.setAttribute("msg", "ÇëÏÈµÇÂ¼");
		request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request, response);
		return false;
	}

}
