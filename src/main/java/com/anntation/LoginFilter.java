package com.anntation;
import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet Filter implementation class LoginFilter
 */
public class LoginFilter implements Filter {

	@Override
    public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("xxxxxxxxxxxxx");
    }

	@Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException,
                    ServletException {
		System.out.println("doFilter");
		   // 强制类型转换   
        HttpServletRequest request1 = (HttpServletRequest)request;   
        HttpServletResponse response1 = (HttpServletResponse)response;   
        // 获取web.xm设置的编码集，设置到Request、Response中         request.setCharacterEncoding(config.getInitParameter("charset"));          response.setContentType(config.getInitParameter("contentType"));          response.setCharacterEncoding(config.getInitParameter("charset"));            
       // 将请求转发到目的地   
        chain.doFilter(request1, response1);   
    }

	@Override
    public void destroy() {
    }

   

}
