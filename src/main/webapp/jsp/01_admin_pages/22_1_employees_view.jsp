<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% request.getSession().getAttribute("listOfEmployees"); %>

<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
    <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <title>Poradnia Psychologiczna "Uśmiech"</title>

    <!-- Bootstrap Core CSS -->
    <link href="../../css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="../../css/modern-business.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="../../font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
    <script>
        (function (i, s, o, g, r, a, m) {
            i['GoogleAnalyticsObject'] = r;
            i[r] = i[r] || function () {
                (i[r].q = i[r].q || []).push(arguments)
            }, i[r].l = 1 * new Date();
            a = s.createElement(o),
                m = s.getElementsByTagName(o)[0];
            a.async = 1;
            a.src = g;
            m.parentNode.insertBefore(a, m)
        })(window, document, 'script', 'https://www.google-analytics.com/analytics.js', 'ga');

        ga('create', 'UA-87283178-1', 'auto');
        ga('send', 'pageview');

    </script>
</head>

<body>

<!-- Navigation -->
<%@include file="../../WEB-INF/01_headers_footers/000_header.jsp" %>

<!-- Page Content -->
<div class="container">

    <!-- Page Heading/Breadcrumbs -->
    <div class="row">
        <div class="col-lg-12">
            <h1 class="page-header">
                <img width=100% border="5" src="../../graphics/baner.jpg" alt=""/>

            </h1>
            <ol class="breadcrumb">
                <li><a href="../../index.jsp">Strona główna</a></li>

                <li class="active">Pracownicy</li>
            </ol>
        </div>
    </div>
    <!-- /.row

        <!-- Content Row -->
    <div class="row">
        <!-- Sidebar Column -->
        <div class="col-lg-2 col-md-2 col-sm-2">
            <%@include file="../../WEB-INF/01_headers_footers/002_admin_left_menu.jsp" %>
        </div>
        <!-- Content Column -->
        <div class="col-lg-10 col-md-10 col-sm-10">


            <a href="/jsp/01_admin_pages/22_3_add_employee.jsp" class="btn btn-default">Dodaj pracownika <i
                    class="fa fa-plus-circle"></i></a>
            <br><br>
            <!-- Tabela userów-->

            <div class="table-responsive table-bordered table-striped table-hover table-condensed">
                <table class="table-responsive table-bordered table-striped table-hover table-condensed">
                    <thead>
                    <tr>

                        <th>Edycja</th>
                        <th>ID</th>
                        <th>Imię</th>
                        <th>Nazwisko</th>
                        <th>Rola</th>
                        <th>Telefon</th>
                        <th>Konto</th>
                        <th>Aktywny?</th>
                        <th><em class="fa fa-cog"></em></th>
                        <!--<th><em class="fa fa-remove"></em><em class="fa fa-plus"></em></th>-->
                    </tr>
                    </thead>


                    <tbody>

                    <c:forEach items="${listOfEmployees}" var="employeeLoop">
                        <tr>

                            <td>
                                <a href="/EmployeeEditServlet?id=${employeeLoop.getId()}"><em
                                        class="fa fa-pencil color-aqua"></em></a>
                            </td>
                            <td>
                                    ${employeeLoop.getId()}
                            </td>
                            <td>
                                    ${employeeLoop.getName()}
                            </td>
                            <td>
                                    ${employeeLoop.getSurname()}
                            </td>
                            <td>
                                    ${employeeLoop.getRoleShort()}
                            </td>

                            <td>
                                    ${employeeLoop.getPhoneNumber()}
                            </td>
                            <td>
                                    ${employeeLoop.getBankAccountNumber()}
                            </td>
                            <td>

                                <c:if test="${employeeLoop.getActive()}">Tak</c:if>
                                <c:if test="${!employeeLoop.getActive()}">Nie</c:if>

                            </td>


                            <td>
                                <c:set var="active" scope="session"
                                       value="${employeeLoop.getActive()}"/>
                                <c:if test="${active}">
                                    <a href="/EmployeeDeleteServlet?id=${employeeLoop.getId()}"><em
                                            class="fa fa-trash color-green"></em></a>
                                </c:if>
                                <c:if test="${!active}">
                                    <a href="/EmployeeDeleteServlet?id=${employeeLoop.getId()}"><em
                                            class="fa fa-plus color-red"></em></a>
                                </c:if>


                            </td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>

    </div>


    <!-- koniec tabeli userow -->


    <!-- /.row -->

    <hr>

    <!-- Footer -->
    <%@include file="../../WEB-INF/01_headers_footers/001_footer.jsp" %>

</div>
<!-- /.container -->

<!-- jQuery -->
<script src="../../js/jquery.js"></script>

<!-- Bootstrap Core JavaScript -->
<script src="../../js/bootstrap.min.js"></script>

</body>

</html>
