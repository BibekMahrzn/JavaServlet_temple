<%-- 
    Document   : front-worship
    Created on : Jun 5, 2017, 8:54:10 AM
    Author     : Just me
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
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
        <h2>${data.getPujaName()}</h2>
        <h6>
            <span class="glyphicon glyphicon-time">${data.getPujaTime()}</span>
        </h6>
            <p>This puja is performed by <span >${data.getPujaBy()}</span></p>
    </section>
</div>

<jsp:include page="front-footer.jsp"/>
