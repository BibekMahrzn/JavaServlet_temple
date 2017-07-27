<%-- 
    Document   : front-event
    Created on : Jun 4, 2017, 5:53:42 PM
    Author     : Just me
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE HTML>

<jsp:include page="front-header.jsp"/>

<!-- Featured -->
<div id="featured">
    <section class="container">
        <header>
            <h2><br>Services we offer</h2>
            <span class="byline"> We offer a Community hall to perform various puja and other Social Activities. </span>
        </header>
    </section>
</div>

<!-- Main -->
<div id="main">
    <section class="container">					
        <h2>${data.getEventName()}</h2>
        <h6>
            <span class="glyphicon glyphicon-time">${data.getEventTime()}</span>
        </h6>
            <p><span >${data.getHallName()}</span></p>
<!--            ${event.getEventOrganizer()}<br>
            ${event.getEventDescription()}</p>-->
    </section>
</div>

<jsp:include page="front-footer.jsp"/>


