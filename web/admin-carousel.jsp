
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="admin-header.jsp"></jsp:include>
<jsp:include page="admin-nav.jsp"></jsp:include>

    <div id="page-wrapper">

        <div class="container-fluid">

            <!-- Page Heading -->
            <div class="row">
                <div class="col-lg-12">
                    <h1 class="page-header">
                        Carousel
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

                    <form role="form" action="${pageContext.request.contextPath}/admin/carousel/add" method="POST" enctype="multipart/form-data">
                    <input type="hidden" name="id" value="${carouselvalue.id}"/>

                    <div class="form-group">
                        <label>Event Name</label>
                        <input class="form-control" value="${carouselvalue.id}" name="cid" placeholder="Enter name of event">
                    </div>

                    <div class="form-group">
                        <label >Status</label>
                        <div class="radio">
                            <label>
                                <input type="radio" name="status" id="optionsRadios1" value="option1" checked>Active
                            </label>
                            <label>
                                <input type="radio" name="status" id="optionsRadios2" value="option2">Inactive
                            </label>
                        </div>
                        <div class="form-group">
                            <label>Image</label>
                            <input  type="file" class="form-control" name="image" >
                        </div>
                        <button type="submit" class="btn btn-success">upload</button>
                    </div>
                </form>

            </div>
        </div>

        <div class="row">
            <div class="col-lg-6">
                <h2>Carousel</h2>
                <div class="table-responsive">
                    <table class="table table-bordered table-hover">
                        <thead>
                            <tr>
                                <th>Id</td>
                                <th>Status</th>
                                <th>File</th>
                                <th>Edit</th>
                                <th>Delete</th>
                            </tr>
                        </thead> 
                        <tbody>
                            <c:forEach items="${carouseldata}" var="carousel">
                                <tr>
                                    <td>${carousel.id}</td>
                                    <td>
                                        ${carousel.status}
                                    </td>
                                    <td>
        <!--                                <a href="${pageContext.request.contextPath}/images/${carousel.file}" target="_blank">-->
                                        <a href="#" download="${carousel.file}">
                                            <img height="30" width="30" src="${pageContext.request.contextPath}/images/${carousel.file}">
                                        </a>
                                    </td>
                                    <td>
                                        <a href="${pageContext.request.contextPath}/admin/carousel/edit/?id=${carousel.id}">
                                            <span class="glyphicon glyphicon-edit"></span>
                                        </a>
                                    </td>
                                    <td>
                                        <a href="${pageContext.request.contextPath}/admin/carousel/delete/?id=${carousel.id}">
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


