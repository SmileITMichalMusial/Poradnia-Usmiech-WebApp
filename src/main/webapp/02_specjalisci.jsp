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
                <center><img border="5" width=100% src="./graphics/baner.jpg" alt=""></center>

            </h1>
            <ol class="breadcrumb">
                <li><a href="index.jsp">Strona główna</a>
                </li>
                <li class="active">Specjaliści</li>
            </ol>
        </div>
    </div>
    <!-- /.row -->

    <!-- Projects Row -->
    <!-- Specjalisci rzad 1 - 4 osoby -->
    <div class="row">

        <div class="col-md-3 img-portfolio">
            <a href="02_01_specjalisci_agnieszka_adamczyk_musial.jsp">
                <img class="img-responsive img-hover" src="graphics/02_01_agnieszka_adamczyk_musial_wys_250.jpg"
                     alt="">
            </a>
            <h3>
                <a href="02_01_specjalisci_agnieszka_adamczyk_musial.jsp">Agnieszka Adamczyk-Musiał</a>
            </h3>
            <p>pedagog specjalny, psycholog, logopeda - założycielka Poradni <a
                    href="02_01_specjalisci_agnieszka_adamczyk_musial.jsp">(więcej)</a></p>
        </div>

        <div class="col-md-3 img-portfolio">
            <a href="02_10_specjalisci_aleksandra_szalla.jsp">
                <img class="img-responsive img-hover" src="./graphics/02_10_aleksandra_szalla_wys_250.jpg" alt="">
            </a>
            <h3>
                <a href="02_10_specjalisci_aleksandra_szalla.jsp">Aleksandra Szalla</a>
            </h3>
            <p>dyrektor pedagogiczny, pedagog specjalny, terapeuta, trener umiejętności społecznych <a
                    href="02_10_specjalisci_aleksandra_szalla.jsp">(więcej)</a></p>
        </div>

        <div class="col-md-3 img-portfolio">
            <a href="02_06_marta_chroscicka.jsp">
                <img class="img-responsive img-hover" src="./graphics/02_06_marta_chroscicka_wys_250.jpg" alt="">
            </a>
            <h3>
                <a href="02_06_marta_chroscicka.jsp">Marta Chrościcka</a>
            </h3>
            <p>psycholog <a href="02_06_marta_chroscicka.jsp">(więcej)</a></p>
        </div>


        <div class="col-md-3 img-portfolio">
            <a href="02_03_karina_choros_wrzeszcz.jsp">
                <img class="img-responsive img-hover" src="./graphics/02_03_karina_choros_wrzeszcz_wys_250.jpg" alt="">
            </a>
            <h3>
                <a href="02_03_karina_choros_wrzeszcz.jsp">Karina Choroś-Wrzeszcz</a>
            </h3>
            <p>mediator, terapeuta <a href="02_03_karina_choros_wrzeszcz.jsp">(więcej)</a></p>
        </div>


    </div>

    <!-- Projects Row -->
    <!-- Specjalisci rzad 2 - 4 osoby -->
    <div class="row">

        <div class="col-md-3 img-portfolio">
            <a href="02_09_katarzyna_andrusikiewicz.jsp">
                <img class="img-responsive img-hover" src="./graphics/02_09_katarzyna_andrusikiewicz_wys_250.jpg"
                     alt="">
            </a>
            <h3>
                <a href="02_09_katarzyna_andrusikiewicz.jsp">Katarzyna Andrusikiewicz</a>
            </h3>
            <p>psycholog, terapeuta uzależnień <a href="02_09_katarzyna_andrusikiewicz.jsp">(więcej)</a></p>
        </div>

        <div class="col-md-3 img-portfolio">
            <a href="02_12_miroslaw_dudzinski.jsp">
                <img class="img-responsive img-hover" src="./graphics/02_12_miroslaw_dudzinski_wys_250.jpg" alt="">
            </a>
            <h3>
                <a href="02_12_miroslaw_dudzinski.jsp">Mirosław Dudziński</a>
            </h3>
            <p>psycholog, psychoterapeuta – dorośli i pary, coaching <a
                    href="02_12_miroslaw_dudzinski.jsp">(więcej)</a></p>
        </div>

        <div class="col-md-3 img-portfolio">
            <a href="02_05_anna_suchecka.jsp">
                <img class="img-responsive img-hover" src="./graphics/02_05_anna_suchecka_wys_250.jpg" alt="">
            </a>
            <h3>
                <a href="02_05_anna_suchecka.jsp">Aneta Suchecka</a>
            </h3>
            <p>logopeda <a href="02_05_anna_suchecka.jsp">(więcej)</a></p>
        </div>


        <div class="col-md-3 img-portfolio">
            <a href="02_13_paulina_staluszka.jsp">
                <img class="img-responsive img-hover" src="./graphics/02_13_paulina_staluszka_wys_250.jpg" alt="">
            </a>
            <h3>
                <a href="02_13_paulina_staluszka.jsp">Paulina Staluszka</a>
            </h3>
            <p>pedagog, trener TUS <a href="02_13_paulina_staluszka.jsp">(więcej)</a></p>
        </div>


    </div>
    <div class="row">

        <!-- Projects Row -->
        <!-- Specjalisci rzad 3 - 1 osoba -->


        <div class="col-md-3 img-portfolio">
            <a href="02_14_katarzyna_wojcieszynska.jsp">
                <img class="img-responsive img-hover" src="./graphics/02_14_katarzyna_wojcieszynska_wys_250.jpg" alt="">
            </a>
            <h3>
                <a href="02_14_katarzyna_wojcieszynska.jsp">Katarzyna Wojcieszyńska</a>
            </h3>
            <p>fizjoterapeuta, pedagog specjalny, terapeuta SI (Integracji Sensorycznej)<a
                    href="02_14_katarzyna_wojcieszynska.jsp">(więcej)</a></p>
        </div>


    </div>


    <!-- </div> -->


    <hr>


    <!-- Footer -->
    <%@include file="WEB-INF/01_headers_footers/001_footer.jsp" %>


</div>
<!-- /.container -->


<!-- /.container -->

<!-- jQuery -->
<script src="js/jquery.js"></script>

<!-- Bootstrap Core JavaScript -->
<script src="js/bootstrap.min.js"></script>

</body>

</html>
