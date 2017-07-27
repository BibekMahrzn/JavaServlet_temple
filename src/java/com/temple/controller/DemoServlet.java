/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.temple.controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Dell PC
 */
@WebServlet({"/index","/contact-us","/personal-info"})
public class DemoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //gives the name of the project
       String contextPath=request.getContextPath();
       //gives us the requested url
       String reqUrl=request.getRequestURI();
       //gives us the ip address of the client connected to the server
       String ipAddress=request.getRemoteAddr();
       
       if(request.getRequestURI().equals(contextPath+"/index")){
        RequestDispatcher rd= request.getRequestDispatcher("index.html");
        rd.forward(request,response);
       }
       else if (request.getRequestURI().equals(contextPath+"/contact-us")){
           RequestDispatcher rd= request.getRequestDispatcher("contact.jsp");
           rd.forward(request,response);
       }
     
       else if(request.getRequestURI().equals(contextPath+"/personal-info")){
           RequestDispatcher rd=request.getRequestDispatcher("personal.jsp");
           rd.forward(request, response);
       }
    }

   
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }   

}
