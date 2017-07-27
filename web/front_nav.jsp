<%-- 
    Document   : front_nav
    Created on : Jun 4, 2017, 5:42:50 PM
    Author     : Just me
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!-- Nav -->
<nav id="nav">
    <ul>
        <li class="active"><a href="index.html">Home</a></li>
        <li>
            <a href="#" class="icon fa-caret-down">About</a>
            <ul>
                <li><a href="Introduction.html">Introduction</a></li>
                <li><a href="Mission.html">Mission</a></li>
                <li><a href="Vision.html">Visison</a></li>
                <li><a href="etc.html">etc.</a></li>
            </ul>
        </li>
        <li>
            <a href="#" class="icon fa-caret-down">Services</a>
            <ul>
                <li><a href="CommunityHall.html">Community halls</a></li>
                <li>
                    <a href="#" class="icon fa-caret-right">Worship</a>
                    <ul>
                        <c:forEach items="${worshipdata}" var="worship">
                            <li>
                                <a href="${pageContext.request.contextPath}/worship/view/?id=${worship.getWid()}">${worship.getPujaName()}</a>
                            </li>
                        </c:forEach>
                     </ul>
                </li>
                <li>
                    <a href="#" class="icon fa-caret-right">Events</a>
                    <ul>
                        <c:forEach items="${eventdata}" var="event">
                            <li>
                                <a href="${pageContext.request.contextPath}/event/view/?id=${event.getEid()}">${event.getEventName()}</a>
                            </li>
                        </c:forEach>
                    </ul>
                </li>
                <li><a href="etc.html">etc.</a></li>
            </ul>
        </li>
        <li><a href="Contact.html">Contact</a></li>
        <li>
            <a href="#" class="icon fa-caret-down">Media</a>
            <ul>
                <li><a href="photoes.html">Photoes</a></li>
                <li><a href="videos.html">Videos</a></li>
            </ul>
        </li>
        <li>
            <a href="#" class="icon fa-caret-down">Donate</a>
            <ul>
                <li><a href="#">Donation page</a></li>
                <li><a href="#">Donar list</a></li>
            </ul>
        </li>
        <li><a href="Contact.html">Register</a></li>
        <li><a href="Contact.html">Sin-In</a></li>

    </ul>
</nav>
