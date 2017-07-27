<%-- 
    Document   : admin-event
    Created on : May 18, 2017, 12:05:49 PM
    Author     : Dell PC
--%>



<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="admin-header.jsp"></jsp:include>
<jsp:include page="admin-nav.jsp"></jsp:include>

    <div id="page-wrapper">

        <div class="container-fluid">

            <!-- Page Heading -->
            <div class="row">
                <div class="col-lg-12">
                    <h1 class="page-header">
                        Event
                    </h1>
                    <ol class="breadcrumb">
                        <li>
                            <i class="fa fa-dashboard"></i>  <a href="index.jsp.html">Dashboard</a>
                        </li>
                        <li class="active">
                            <i class="fa fa-edit"></i> Forms
                        </li>
                    </ol>
                </div>
            </div>
            <!-- /.row -->

            <div class="row">
                <div class="col-lg-6">

                    <form role="form" action="${pageContext.request.contextPath}/admin/event/add" method="POST">
                    <input type="hidden" name="id" value="${eventvalue.eid}"/>

                    <div class="form-group">
                        <label>Event Name</label>
                        <input class="form-control" value="${eventvalue.eventName}" name="eventname" placeholder="Enter name of event">
                    </div>

                    <div class="form-group">
                        <label>Event Time</label>
                        <input class="form-control" value="${eventvalue.eventTime}" name="eventtime" placeholder="Enter the time">
                    </div>

                    <div class="form-group">
                        <label>Hall Name</label>
                        <select class="form-control"  value="${eventvalue.hallName}" name="hallname">
                            <option> Hall 1</option>
                            <option>Hall 2</option>
                            <option>Hall 3</option>
                            <option>Hall 4</option>
                            <option>Hall 5</option>
                        </select>
                    </div>


                    <div class="form-group">
                        <label>Event Organizer</label>
                        <input class="form-control" value="${eventvalue.eventOrganizer}" name="eventorganizer" placeholder="Enter the name of organizer">
                    </div>

                    <div class="form-group">
                        <label>Event Description</label>
                        <textarea class="form-control" value="${eventvalue.eventDescription}" name="eventdescription" rows="3"></textarea>
                    </div>


                    <button type="submit" class="btn btn-success">Submit Button</button>
                    <button type="reset" class="btn btn-default">Reset Button</button>

                </form>
            </div>
        </div>

        <div class="row">
            <div class="col-lg-6">
                <h2>Event</h2>
                <div class="table-responsive">
                    <table class="table table-bordered table-hover">
                        <thead>
                            <tr>
                                <th>Eid</td>
                                <th>Event Name</th>
                                <th>Event Time</th>
                                <th>Hall Name</th>
                                <th>Event Organizer</th>
                                <th>Event Description</th>
                                <th>Edit</th>

                                <th>Delete</th>

                            </tr>


                        </thead> 
                        <tbody>
                            <c:forEach items="${eventdata}" var="event">
                                <tr>
                                    <td>${event.eid}</td>
                                    <td>${event.eventName}</td>
                                    <td>${event.eventTime}</td>
                                    <td>${event.hallName}</td>
                                    <td>${event.eventOrganizer}</td>
                                    <td>${event.eventDescription}</td>   

                                    <td>
                                        <a href="${pageContext.request.contextPath}/admin/event/edit/?id=${event.eid}">
                                            <span class="glyphicon glyphicon-edit"></span>
                                        </a>
                                    </td>

                                    <td>
                                        <a href="${pageContext.request.contextPath}/admin/event/delete/?id=${event.eid}">
                                            <span class="glyphicon glyphicon-remove"></span>
                                        </a>
                                    </td>
                                </tr>
                            </c:forEach>

                        </tbody>
                    </table>
                </div
            </div>

        </div>

    </div>
</div>
</div>

<jsp:include page="admin-footer.jsp"></jsp:include>
