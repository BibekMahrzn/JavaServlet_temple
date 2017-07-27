/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.temple.controller;

import com.temple.dao.EventDao;
import com.temple.dao.WorshipDao;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Just me
 */
@WebServlet({"/index1","/event/view/","/worship/view/"})
public class FrontController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("haha");
        if(request.getRequestURI().equals(request.getContextPath()+"/index1")){
            request.setAttribute("worshipdata", WorshipDao.select());
            request.setAttribute("eventdata", EventDao.select());
            RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
            rd.forward(request, response);
        }
        if(request.getRequestURI().equals(request.getContextPath()+"/event/view/")){
            System.out.println("zz");
            int id = Integer.parseInt(request.getParameter("id"));
            request.setAttribute("data", EventDao.selectById(id));
            RequestDispatcher rd = request.getRequestDispatcher("/front-event.jsp");
            rd.forward(request, response);
        }
        if(request.getRequestURI().equals(request.getContextPath()+"/worship/view/")){
            System.out.println("zz");
            int id = Integer.parseInt(request.getParameter("id"));
            request.setAttribute("data", WorshipDao.selectById(id));
            RequestDispatcher rd = request.getRequestDispatcher("/front-worship.jsp");
            rd.forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }
}
