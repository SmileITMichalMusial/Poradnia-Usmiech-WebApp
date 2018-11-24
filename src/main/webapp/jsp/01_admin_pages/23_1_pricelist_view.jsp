<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% request.getSession().getAttribute("pricelistLayer1List"); %>
<% request.getSession().getAttribute("pricelistLayer2List"); %>

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

                <li class="active">Cennik</li>
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


            <a href="/jsp/01_admin_pages/23_3_add_pricelist.jsp" class="btn btn-default">Dodaj usługe (warstwa 1) <i
                    class="fa fa-plus-circle"></i></a>
            <br><br>
            <!-- Tabela userów-->

            <table align=center cellspacing="0"
                   class="table-responsive table-striped table-hover table-condensed">
                <thead>
                <tr id="test">
                    <td colspan="7" class="noborder_up"><input id="myInput" type="text" placeholder="Wyszukaj usługę">
                    </td>
                </tr>

                <tr>
                    <th>Edycja</th>
                    <th>Kol. 1</th>
                    <th>Kol. 2</th>
                    <th>Nazwa usługi</th>
                    <th>Czas trwania [min]</th>
                    <th>Kwota [PLN]</th>
                    <th>Usuń</th>
                </tr>
                </thead>
                <tbody id="myTable">


                <c:forEach items="${pricelistLayer1List}" var="pricelistLayer1Loop">

                    <tr>
                        <td style="width:1px;white-space:nowrap">
                            <a href="/PriceListEditServlet?idl1=${pricelistLayer1Loop.getIdLayer1()}&page=adm&action=edit"><em
                                    class="fa fa-pencil color-aqua"></em></a>
                        </td>
                        <td style="width:1px;white-space:nowrap">${pricelistLayer1Loop.getOrderIDLayer1()}</td>
                        <td style="width:1px;white-space:nowrap"></td>
                        <td colspan="3" bgcolor="#33CC66">${pricelistLayer1Loop.getDescription()}</td>
                        <td>
                            <a href="/PriceListEditServlet?idl1=${pricelistLayer1Loop.getIdLayer1()}&page=adm&action=delete"><em
                                    class="fa fa-trash color-aqua"></em></a>
                        </td>
                    </tr>
                    <c:forEach items="${pricelistLayer2List}" var="pricelistLayer2Loop">
                        <c:if test="${pricelistLayer1Loop.getIdLayer1() == pricelistLayer2Loop.getFkIdLayer1()}">
                            <tr>
                                <td style="width:1px;white-space:nowrap">
                                    <a href="/PriceListEditServlet?idl1=${pricelistLayer1Loop.getIdLayer1()}&idl2=${pricelistLayer2Loop.getIdLayer2()}&page=adm&action=edit"><em
                                            class="fa fa-pencil color-aqua"></em></a>
                                </td>
                                <td style="width:1px;white-space:nowrap"></td>
                                <td style="width:1px;white-space:nowrap">${pricelistLayer2Loop.getOrderIdLayer2()}</td>
                                <td>${pricelistLayer2Loop.getName()}</td>
                                <td>${pricelistLayer2Loop.getDuration()}</td>
                                <td>${pricelistLayer2Loop.getPrice()}</td>
                                <td>
                                    <a href="/PriceListEditServlet?idl1=${pricelistLayer1Loop.getIdLayer1()}&idl2=${pricelistLayer2Loop.getIdLayer2()}&page=adm&action=delete"><em
                                            class="fa fa-trash color-aqua"></em></a>
                                </td>
                            </tr>
                        </c:if>
                    </c:forEach>

                    <tr>
                        <td colspan="6"><p align="right">
                            <a href="/PriceListAddServlet?idl1=${pricelistLayer1Loop.getIdLayer1()}">dodaj
                                usługę <em
                                        class="fa fa-plus-circle"></em>
                        </p></td>
                        <td></td>
                    </tr>


                </c:forEach>


                </tbody>
            </table>


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
<script src="js/search_table.js"></script>

</body>

</html>
