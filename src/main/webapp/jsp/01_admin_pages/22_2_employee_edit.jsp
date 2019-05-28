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
        <div class="col-lg-2 col-md-2 col-sm-10">
            <%@include file="../../WEB-INF/01_headers_footers/002_admin_left_menu.jsp" %>
        </div>
        <!-- Content Column -->
        <div class="col-lg-10 col-md-10 col-sm-10">
            <h4>Edycja pracownika</h4>
            <br>
            <img src="../../graphics/employees_photos/${employee.getPhotoURL()}" width="20%" height="20%" alt="foto">
            <br>


            <form class="form-wrapper" method="post" action="/EmployeeEditServlet" enctype="multipart/form-data">

                Imię: <input type="text" class="form-control" name="name" placeholder="imię"
                             value="${employee.getName()}" required>
                Nazwisko: <input type="text" class="form-control" name="surname" placeholder="nazwisko"
                                 value="${employee.getSurname()}" required>
                Rola (krótka): <input type="text" class="form-control" name="roleShort" placeholder="rola (krótka)"
                                      value="${employee.getRoleShort()}" required>
                Rola (długa): <input type="text" class="form-control" name="roleLong" placeholder="rola (długa)"
                                     value="${employee.getRoleLong()}" required>
                Opis: <textarea id="textBox1" class="form-control" name="description" placeholder="opis"
                                TextMode="Multiline" onkeyup="setHeight('textBox1');" onkeydown="setHeight('textBox1');"
                                required>${employee.getDescription()}</textarea>
                Email: <input type="email" class="form-control" name="email" placeholder="email"
                              value="${employee.getEmail()}" required>
                Telefon: <input type="tel" class="form-control" name="phoneNumber" placeholder="telefon"
                                value="${employee.getPhoneNumber()}">
                Kolejność: <input type="number" class="form-control" name="orderId" placeholder="kolejność"
                                  value="${employee.getOrderId()}">
                Numer konta: <input type="text" class="form-control" name="bankAccountNumber" placeholder="numer konta"
                                    value="${employee.getBankAccountNumber()}">
                <div class="input-group image-preview">

                    Wybierz zdjęcie:<br>
                    <!-- don't give a name === doesn't send on POST/GET -->
                    <span class="input-group-append">
    <!-- image-preview-clear button -->

                        <!-- image-preview-input -->
    <div type="button" class="btn btn-default image-preview-input">
    <span class="glyphicon glyphicon-folder-open"></span>
    <span class="image-preview-input-title">Wybierz</span>
    <input type="file" accept="image/png, image/jpeg, image/gif"
           name="image" id="file"/> <!-- rename it -->
    </div>
    </span>
                </div>


                <button type="submit" name="save" class="btn btn-default">Zaktualizuj <i
                        class="fa fa-save"></i></button>
                <a href="/jsp/01_admin_pages/22_1_employees_view.jsp" class="btn btn-default">Anuluj<i
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

<!--JAVASCRIPT-->
<script type="text/javascript">
    function setHeight(fieldId) {
        document.getElementById(fieldId).style.height = document.getElementById(fieldId).scrollHeight + 3 + 'px';
    }

    setHeight('textBox1');
</script>

</body>

</html>
