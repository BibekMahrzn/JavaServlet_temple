<%-- 
    Document   : front-header
    Created on : Jun 4, 2017, 5:43:23 PM
    Author     : Just me
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!-- Header -->
<html>
    <head>
        <title>Temple Website</title>

        <meta charset="utf-8" />

        <meta name="viewport" content="width=device-width, initial-scale=1" />

        <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/main.css" />

    </head>
    <body class="homepage">
        <div id="page-wrapper">
            <div id="header">
                <div class="container">

                    <!-- Logo -->
                    <div id="logo">
                        <a class="pennant"><img src="${pageContext.request.contextPath}/images/ohm.png" alt="logo" /></a>
                        <h1><a href="index.html">Temple Website</a></h1>
                    </div>

                    <jsp:include page="front_nav.jsp"/>

                </div>
            </div>
