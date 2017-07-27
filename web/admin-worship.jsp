<%-- 
    Document   : admin-worship
    Created on : May 16, 2017, 7:18:43 AM
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
                        Worship
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

                    <form role="form" action="${pageContext.request.contextPath}/admin/worship/add" method="POST">
                    <input type="hidden" name="id" value="${worshipvalue.get(0).wid}"/>


                    <div class="form-group">
                        <label>Name of puja</label>
                        <input class="form-control"  value="${worshipvalue.get(0).pujaName}"  name="pujaname" placeholder="Enter name of puja">
                    </div>
                    <div class="form-group">
                        <label>Puja By:</label>
                        <input class="form-control"  value="${worshipvalue.get(0).pujaBy}" name="pujaby" placeholder="Enter who will do puja">
                    </div>
                    <div class="form-group">
                        <label>Puja time</label>
                        <input class="form-control"  value="${worshipvalue.get(0).pujaTime}" name="pujatime" placeholder="Enter time for puja">
                    </div>

                    <button type="submit" class="btn btn-success">Submit Button</button>
                    <button type="reset" class="btn btn">Reset Button</button>

                </form>
            </div>
        </div>

        <div class="row">
            <div class="col-lg-6">
                <h2>Worship</h2>
                <div class="table-responsive">
                    <table class="table table-bordered table-hover">
                        <thead>
                            <tr>
                                <th>wid</th>
                                <th>Puja Name</th>
                                <th>Puja By</th>
                                <th>Puja Time</th>
                                <th>Edit</th>
                                <th>Delete</th>
                            </tr>
                        </thead> 
                        <tbody>
                            <c:forEach items="${worshipdata}" var="worship">
                                <tr>
                                    <td>${worship.wid}</td>
                                    <td>${worship.pujaName}</td>
                                    <td>${worship.pujaBy}</td>
                                    <td>${worship.pujaTime}</td>
                                    <td>
                                        <a href="${pageContext.request.contextPath}/admin/worship/edit/?id=${worship.wid}">

                                            <span class="glyphicon glyphicon-edit"></span>
                                        </a>
                                    </td>

                                    <td>
                                        <a href="${pageContext.request.contextPath}/admin/worship/delete/?id=${worship.wid}">
                                            <span class="glyphicon glyphicon-remove"></span>
                                        </a>
                                    </td>
                                </tr>
                            </c:forEach>

                        </tbody>
                    </table>
                </div>
            </div>

        </div>

    </div>
</div>
</div>

<jsp:include page="admin-footer.jsp"></jsp:include>
