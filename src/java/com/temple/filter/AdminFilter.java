/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.temple.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Just me
 */
@WebFilter("/admin/*")
public class AdminFilter implements Filter{

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest hr = (HttpServletRequest) request;
        HttpServletResponse hs = (HttpServletResponse) response;
        HttpSession hse = hr.getSession(false);
        if(hse != null && hse.getAttribute("user") != null)
            chain.doFilter(request, response);
        else
            hs.sendRedirect(hr.getContextPath()+"/login");
    }

    @Override
    public void destroy() {
    }
    
}
