package com.dj.common.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class CheckLoginFilter implements Filter {
	public void destroy() {
	}

	/**
	 * 控制用户重复登录 将登录用户信息保存到context和session中，进行比对context和session的登录时间是否一致
	 * 一致继续执行，不一致返回
	 */
	public void doFilter(ServletRequest req, ServletResponse res,
			FilterChain chain) throws IOException, ServletException {

		HttpServletRequest request = (HttpServletRequest) req;

		HttpServletResponse response = (HttpServletResponse) res;
		String currentUrl = request.getRequestURI();
		String targetUrl = currentUrl.substring(currentUrl.lastIndexOf("/"));

		HttpSession session = request.getSession(false);

		if (!"/login.do".equals(targetUrl)) {
			System.out.println(targetUrl);
			if (session == null || session.getAttribute("optid") == null) {
				
				String ajaxSubmit = request.getHeader("X-Requested-With");
				if (ajaxSubmit != null && ajaxSubmit.equals("XMLHttpRequest")) {
					response.getWriter().print("{\"success\":false,\"errorType\":\"session\"}");
				} else {
					System.out.println("request.getContextPath()="
							+ request.getContextPath());
					response.sendRedirect(request.getContextPath()
							+ "/index.jsp");
				}
				return;
			}
		}
		chain.doFilter(req, res);
	}

	public void init(FilterConfig filterConfig) throws ServletException {

	}

}
