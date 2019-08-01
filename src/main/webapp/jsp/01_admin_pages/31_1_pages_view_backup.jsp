<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% request.getSession().getAttribute("pagesLayer1List"); %>
<% request.getSession().getAttribute("pagesLayer2List"); %>
<% request.getSession().getAttribute("edit_active"); %>
<% request.getSession().getAttribute("pageID_l1"); %>


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


            <a href="/PagesAddServlet?PageLayerNumber=1" class="btn btn-default">Dodaj stronę (warstwa 1) <i
                    class="fa fa-plus-circle"></i></a>

            <!-- <a href="/jsp/01_admin_pages/23_3_add_pricelist.jsp" -->
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
                    <th>Nazwa strony</th>
                    <th>Adres strony</th>
                    <th>Usuń</th>
                    <th>Edytuj zawartość</th>
                </tr>
                </thead>
                <tbody id="myTable">


                <c:forEach items="${pagesLayer1List}" var="pagesLayer1List">

                    <tr>

                        <c:choose>
                            <c:when test="${edit_active eq 'YES' and pagesLayer1List.getId() == pageID_l1}">


                                <form class="form-wrapper" method="post" action="/PagesEditServlet">

                                    <td style="width:1px;white-space:nowrap">
                                        <button type="submit" name="save"><em
                                                class="fa fa-save color-aqua"></em></button>
                                        <a href=/PagesEditServlet?action=edit&mode=edit_inactive class=""><em
                                                class="fa fa-backward"></em></a>
                                    </td>

                                    <td style="background-color: #33CC66">

                                        <input type="text" class="form-control" name="OrderId" placeholder="kolejność"
                                               value="${pagesLayer1List.getOrderId()}" required>

                                    </td>

                                    <td style=""></td>
                                    <td style="background-color: #33CC66">

                                        <input type="text" class="form-control" name="PageName"
                                               placeholder="nazwa strony"
                                               value="${pagesLayer1List.getPageName()}" required>

                                    </td>
                                    <td style="background-color: #33CC66">

                                        <input type="text" class="form-control" name="PageAddress"
                                               placeholder="adres strony"
                                               value="${pagesLayer1List.getPageAddress()}" required>

                                    </td>


                                </form>

                                <td>
                                    <a><em
                                            class="fa fa-trash" style="color: grey"></em></a>
                                </td>
                                <td>
                                    <a><em
                                            class="fa fa-pencil" style="color: grey"></em></a></td>
                            </c:when>
                            <c:otherwise>
                                <td style="width:1px;white-space:nowrap">
                                    <a href="/PagesEditServlet?pageID_l1=${pagesLayer1List.getId()}&page=adm&action=edit&mode=edit_active"><em
                                            class="fa fa-pencil color-aqua"></em></a>
                                </td>
                                <td style="width:1px;white-space:nowrap">${pagesLayer1List.getOrderId()}</td>
                                <td style="width:1px;white-space:nowrap"></td>
                                <td style="width:1px;white-space:nowrap">${pagesLayer1List.getPageName()}</td>
                                <td style="width:1px;white-space:nowrap">${pagesLayer1List.getPageAddress()}</td>
                                <td>
                                    <a href="/PriceListEditServlet?idl1=${priceListLayer1Loop.getIdLayer1()}&page=adm&action=delete"><em
                                            class="fa fa-trash color-aqua"></em></a>
                                </td>
                                <td style="width:1px;white-space:nowrap">
                                    <a href="/PriceListEditServlet?idl1=${priceListLayer1Loop.getIdLayer1()}&page=adm&action=edit"><em
                                            class="fa fa-pencil color-aqua"></em></a></td>
                            </c:otherwise>
                        </c:choose>


                    </tr>
                    <c:forEach items="${pagesLayer2List}" var="pagesLayer2List">
                        <c:if test="${pagesLayer1List.getId() == pagesLayer2List.getFk_pages_layer_1_id()}">
                            <tr>
                                <td style="width:1px;white-space:nowrap">
                                    <a href="/PriceListEditServlet?idl1=${priceListLayer1Loop.getIdLayer1()}&idl2=${priceListLayer2Loop.getIdLayer2()}&page=adm&action=edit"><em
                                            class="fa fa-pencil color-aqua"></em></a>
                                </td>
                                <td style="width:1px;white-space:nowrap"></td>
                                <td style="width:1px;white-space:nowrap">${pagesLayer2List.getOrderId()}</td>
                                <td style="width:1px;white-space:nowrap">${pagesLayer2List.getPageName()}</td>
                                <td style="width:1px;white-space:nowrap">${pagesLayer2List.getPageAddress()}</td>

                                <td>
                                    <a href="/PriceListEditServlet?idl1=${priceListLayer1Loop.getIdLayer1()}&idl2=${priceListLayer2Loop.getIdLayer2()}&page=adm&action=delete"><em
                                            class="fa fa-trash color-aqua"></em></a>
                                </td>
                                <td style="width:1px;white-space:nowrap">
                                    <a href="/PriceListEditServlet?idl1=${priceListLayer1Loop.getIdLayer1()}&page=adm&action=edit"><em
                                            class="fa fa-pencil color-aqua"></em></a></td>

                            </tr>
                        </c:if>
                    </c:forEach>

                    <tr>
                        <td colspan="7"><p align="right">
                            <a href="/PriceListAddServlet?layerID=2&idl1=${priceListLayer1Loop.getIdLayer1()}&idl1Description=${priceListLayer1Loop.getDescription()}">dodaj
                                podstronę <em
                                        class="fa fa-plus-circle"></em>
                        </p></td>

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
