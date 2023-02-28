package com.academy.filter;

import com.academy.model.entity.user.User;
import lombok.var;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@WebFilter("/*")
public class AuthFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        var httpServletRequest = (HttpServletRequest) servletRequest;

        var url = httpServletRequest.getRequestURL().toString();

        var session = httpServletRequest.getSession();

        var user = (User) session.getAttribute("user");

        if ((user != null) || url.contains("/login") || url.contains("/loginForm")) {
            filterChain.doFilter(servletRequest, servletResponse);
        } else {
            servletRequest.getRequestDispatcher("/loginForm").forward(servletRequest, servletResponse);
        }
    }

}
