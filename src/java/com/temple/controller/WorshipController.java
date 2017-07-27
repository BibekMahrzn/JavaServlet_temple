/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.temple.controller;

import com.temple.dao.WorshipDao;
import com.temple.model.Worship;
import java.io.IOException;
import java.util.List;
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
@WebServlet({"/admin/worship", "/admin/worship/add", "/admin/worship/delete/", "/admin/worship/edit/"})
public class WorshipController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String contextPath = request.getContextPath();
        System.out.println(request.getRequestURI());
        if (request.getRequestURI().equals(contextPath + "/admin/worship")) {
            //1. to get the value from dao and return to jsp
            List<Worship> al = WorshipDao.select();
            request.setAttribute("worshipdata", al);//worshipdata=al;
            //2. request.setAttribute("worshipdata",worshipdao.select());
            RequestDispatcher rd = request.getRequestDispatcher("/admin-worship.jsp");
            rd.forward(request, response);
        } 
        else if (request.getRequestURI().equals(contextPath + "/admin/worship/delete/")) {
            int id = Integer.parseInt(request.getParameter("id"));
            WorshipDao.delete(id);
            response.sendRedirect(contextPath + "/admin/worship");

        } else if (request.getRequestURI().equals(contextPath + "/admin/worship/edit/")) {
            int id = Integer.parseInt(request.getParameter("id"));
            request.setAttribute("worshipvalue", WorshipDao.selectById(id));
            RequestDispatcher rd = request.getRequestDispatcher("/admin-worship.jsp");
            rd.forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String contextPath = request.getContextPath();
        if (request.getRequestURI().equals(contextPath + "/admin/worship/add")) {
            int wid=0;
            try {
                wid=Integer.parseInt(request.getParameter("id"));
            } catch (Exception e) {
                System.out.println(e);
            }
           
            
            //taking the input from the form of html
            //request.getParameter checks the name in the form
            //and fetches the value             
            String pujaName = request.getParameter("pujaname");
            String pujaBy = request.getParameter("pujaby");
            String pujaTime = request.getParameter("pujatime");

            //encapsulating the values
            Worship w = new Worship();
            w.setPujaName(pujaName);
            w.setPujaBy(pujaBy);
            w.setPujaTime(pujaTime);

            //we have to insert the value in database table
            //controller generaally acts as routing mechanism only
            // so we have to create an extra layer called dao=data acess object layer
            //main function of dao layer is to work with database
            if(wid==0){
            WorshipDao.insert(w);
            }
            else{
                w.setWid(wid);
                WorshipDao.update(w);
           }
            //going back to form
            response.sendRedirect(contextPath + "/admin/worship");
        }
    }

}
