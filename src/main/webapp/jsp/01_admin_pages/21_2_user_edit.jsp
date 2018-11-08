<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% request.getSession().getAttribute("listOfUsers"); %>

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

                <li class="active">Użytkownicy</li>
            </ol>
        </div>
    </div>
    <!-- /.row

        <!-- Content Row -->
    <div class="row">
        <!-- Sidebar Column -->
        <div class="col-lg-2 col-md-2 col-sm-10">
            <%@include file="../../WEB-INF/01_headers_footers/002_admin_left_menu.jsp" %>
        </div>
        <!-- Content Column -->
        <div class="col-lg-10 col-md-10 col-sm-10">


            <form class="form-wrapper" method="post" action="/UserEditServlet">
                <h4>Edycja użytkownika</h4>
                Login (nieedytowalny): <input type="text" class="form-control" name="login" placeholder="login"
                                             value="${user.getLogin()}" disabled>
                Imię: <input type="text" class="form-control" name="name" placeholder="name"
                             value="${user.getName()}" required>
                Nazwisko: <input type="text" class="form-control" name="surname" placeholder="surname"
                                value="${user.getSurname()}" required>
                Email: <input type="email" class="form-control" name="email" placeholder="email"
                              value="${user.getEmail()}" required>
                Telefon: <input type="tel" class="form-control" name="phone" placeholder="phone"
                              value="${user.getPhoneNumber()}">
                Typ: <select required class="form-control" name="type" value="${user.getUserType()}">
                <option value="" selected disabled hidden>Typ użytkownika</option>
                <option>Klient</option>
                <option>Pracownik</option>
                <option>Admin</option>
            </select>


                <button type="submit" name="save" class="btn btn-default">Zaktualizuj <i
                        class="fa fa-save"></i></button>
                <a href="/jsp/01_admin_pages/21_1_users_view.jsp" class="btn btn-default">Anuluj<i
                        class="fa fa-backward"></i></a>
            </form>


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
