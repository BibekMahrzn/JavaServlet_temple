/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.temple.controller;

import com.temple.dao.EventDao;
import com.temple.model.Event;
import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({"/admin/event", "/admin/event/add", "/admin/event/delete/", "/admin/event/edit/"})
public class EventController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String contextpath = request.getContextPath();
        //String contextPath = null;
        System.out.println(request.getRequestURI());
        if (request.getRequestURI().equals(contextpath + "/admin/event")) {

            //1. to get the value from dao and return to jsp
            List<Event> al = EventDao.select();
            request.setAttribute("eventdata", al);//worshipdata=al;
            //2. request.setAttribute("worshipdata",worshipdao.select());
            RequestDispatcher rd = request.getRequestDispatcher("/admin-event.jsp");
            rd.forward(request, response);
        } else if (request.getRequestURI().equals(contextpath + "/admin/event/delete/")) {
            System.out.println("haha");
            int id = Integer.parseInt(request.getParameter("id"));
            EventDao.delete(id);
            response.sendRedirect(contextpath + "/admin/event");

        } else if (request.getRequestURI().equals(contextpath + "/admin/event/edit/")) {
            int id = Integer.parseInt(request.getParameter("id"));
            request.setAttribute("eventvalue", EventDao.selectById(id));
            RequestDispatcher rd = request.getRequestDispatcher("/admin-event.jsp");
            rd.forward(request, response);
//response.sendRedirect(contextpath + "/admin/event");
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int eid = 0;
        String contextpath = request.getContextPath();
        if (request.getRequestURI().equals(contextpath + "/admin/event/add")) {

            String eventName = request.getParameter("eventname");
            String eventTime = request.getParameter("eventtime");
            String hallName = request.getParameter("hallname");
            String eventOrganizer = request.getParameter("eventorganizer");
            String eventDescription = request.getParameter("eventdescription");

            Event e = new Event();
            e.setEventName(eventName);
            e.setEventTime(eventTime);
            e.setHallName(hallName);
            e.setEventOrganizer(eventOrganizer);
            e.setEventDescription(eventDescription);

            try {
                eid = Integer.parseInt(request.getParameter("id"));
            } catch (Exception ex) {

            }

            if (eid == 0) {
                EventDao.insert(e);
            } else {
                e.setEid(eid);
                EventDao.update(e);
            }
            response.sendRedirect(contextpath + "/admin/event");
        }
    }
}
