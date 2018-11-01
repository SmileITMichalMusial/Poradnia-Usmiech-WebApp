<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Poradnia Psychologiczna "Uśmiech"</title>

    <!-- Bootstrap Core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="css/modern-business.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">

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
<%@include file="WEB-INF/01_headers_footers/000_header.jsp" %>
<!-- Page Content -->
<div class="container">

    <!-- Page Heading/Breadcrumbs -->
    <div class="row">
        <div class="col-lg-12">
            <h1 class="page-header">
                <center><img border="5" width=100% src="graphics/baner.jpg" alt=""></center>
            </h1>
            <ol class="breadcrumb">
                <li><a href="index.jsp">Strona główna</a>
                </li>
                <li class="active">Oferta dzieci</li>
            </ol>
        </div>
    </div>
    <!-- /.row -->

    <!-- Projects Row -->
    <div class="row">
        <div class="col-md-4 img-portfolio">
            <a href="03_02_01_logopedia_dzieci.jsp">
                <img class="img-responsive img-hover"
                     src="graphics/fotolia/03_02_01_logopedia_dzieci_700_400.jpg" alt="">
            </a>
            <h3>
                <a href="03_02_01_logopedia_dzieci.jsp">Logopedia</a>
            </h3>
            <p>Diagnoza i terapia <a href="03_02_01_logopedia_dzieci.jsp">(więcej)</a></p>
        </div>

        <div class="col-md-4 img-portfolio">
            <a href="03_02_02_pedagogika_dzieci.jsp">
                <img class="img-responsive img-hover"
                     src="graphics/fotolia/03_02_02_pedagogika_dzieci_700_400.jpg" alt="">
            </a>
            <h3>
                <a href="03_02_02_pedagogika_dzieci.jsp">Terapia pedagogiczna</a>
            </h3>
            <p>Diagnoza i terapia <a href="03_02_02_pedagogika_dzieci.jsp">(więcej)</a></p>
        </div>

        <div class="col-md-4 img-portfolio">
            <a href="03_02_03_psychologia_dzieci.jsp">
                <img class="img-responsive img-hover"
                     src="graphics/fotolia/03_02_03_psychologia_dzieci_700_400.jpg" alt="">
            </a>
            <h3>
                <a href="03_02_03_psychologia_dzieci.jsp">Psychologia</a>
            </h3>
            <p>Diagnoza i terapia <a href="03_02_03_psychologia_dzieci.jsp">(więcej)</a></p>
        </div>
    </div>
    <!-- /.row -->

    <!-- Projects Row -->
    <div class="row">
        <div class="col-md-4 img-portfolio">
            <a href="03_02_04_terapia_reki_dzieci.jsp">
                <img class="img-responsive img-hover"
                     src="graphics/fotolia/03_02_04_terapia_reki_dzieci_700_400.jpg" alt="">
            </a>
            <h3>
                <a href="03_02_04_terapia_reki_dzieci.jsp">Terapia ręki</a>
            </h3>
            <p>Usprawnienie małej motoryki <a href="03_02_04_terapia_reki_dzieci.jsp">(więcej)</a></p>
        </div>
        <div class="col-md-4 img-portfolio">
            <a href="03_02_05_gotowosc_szkolna_dzieci.jsp">
                <img class="img-responsive img-hover"
                     src="graphics/fotolia/03_02_05_gotowosc_szkolna_dzieci_700_400.jpg" alt="">
            </a>
            <h3>
                <a href="03_02_05_gotowosc_szkolna_dzieci.jsp">Gotowość szkolna</a>
            </h3>
            <p>Czy Twoje dziecki jest gotowe? <a href="03_02_05_gotowosc_szkolna_dzieci.jsp">(więcej)</a></p>
        </div>
        <div class="col-md-4 img-portfolio">
            <a href="03_02_06_diagnoza_trudnosci_szkolnych.jsp">
                <img class="img-responsive img-hover"
                     src="graphics/fotolia/03_02_06_diagnoza_trudnosci_szkolnych_700_400.jpg" alt="">
            </a>
            <h3>
                <a href="03_02_06_diagnoza_trudnosci_szkolnych.jsp">Diagnoza trudności szkolnych i dysleksji </a>
            </h3>
            <p><a href="03_02_06_diagnoza_trudnosci_szkolnych.jsp">(więcej)</a></p>
        </div>
    </div>

    <!-- Projects Row -->
    <div class="row">


        <div class="col-md-4 img-portfolio">
            <a href="03_02_07_porada_wychowawcza.jsp">
                <img class="img-responsive img-hover"
                     src="graphics/old/03_02_07_porada_wychowawcza_700_400.jpg" alt="">
            </a>
            <h3>
                <a href="03_02_07_porada_wychowawcza.jsp">Porada wychowawcza</a>
            </h3>
            <p>Porada wychowawcza <a href="03_02_07_porada_wychowawcza.jsp">(więcej)</a></p>
        </div>

    </div>


    <!-- Footer -->
    <%@include file="WEB-INF/01_headers_footers/001_footer.jsp" %>


    <!-- /.container -->

    <!-- jQuery -->
    <script src="js/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="js/bootstrap.min.js"></script>

</body>

</html>
