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
                <li class="active">Oferta dorośli</li>
            </ol>
        </div>
    </div>
    <!-- /.row -->

    <!-- Projects Row -->
    <div class="row">
        <div class="col-md-4 img-portfolio">
            <a href="03_01_01_psychologia_dorosli.jsp">
                <img class="img-responsive img-hover"
                     src="./graphics/fotolia/03_01_01_psychologia_dorosli_700_400.jpg" alt="">
            </a>
            <h3>
                <a href="03_01_01_psychologia_dorosli.jsp">Psychologia</a>
            </h3>
            <p>Konsultacje i terapie <a href="03_01_01_psychologia_dorosli.jsp">(więcej)</a></p>
        </div>

        <div class="col-md-4 img-portfolio">
            <a href="03_01_02_mediacje_dorosli.jsp">
                <img class="img-responsive img-hover"
                     src="./graphics/fotolia/03_01_02_mediacje_dorosli_700_400.jpg" alt="">
            </a>
            <h3>
                <a href="03_01_02_mediacje_dorosli.jsp">Mediacje / terapie par i rodzin</a>
            </h3>
            <p><a href="03_01_02_mediacje_dorosli.jsp">(więcej)</a></p>
        </div>


    </div>
    <!-- /.row -->

    <!-- Drugi rząd -->


    <!--         <div class="row">
                <div class="col-md-4 img-portfolio">
                    <a href="03_01_04_muzykoterapia.html">
                        <img class="img-responsive img-hover"
                                            src="./graphics/fotolia/03_01_04_muzykoterapia_700_400.jpg" alt="">
                    </a>
                    <h3>
                        <a href="03_01_04_muzykoterapia.html">Muzykoterapia </a>
                    </h3>
                    <p>Muzykoterapia indywidualna i grupowa <a href="03_01_04_muzykoterapia.html">(więcej)</a></p>
                </div>
                            <!--
                <div class="col-md-4 img-portfolio">
                    <a href="03_01_02_mediacje_dorosli.jsp">
                        <img class="img-responsive img-hover"
                                            src="./graphics/fotolia/03_01_02_mediacje_dorosli_700_400.jpg" alt="">
                    </a>
                    <h3>
                        <a href="03_01_02_mediacje_dorosli.jsp">Mediacje / terapie par i rodzin</a>
                    </h3>
                    <p><a href="03_01_02_mediacje_dorosli.jsp">(więcej)</a></p>
                </div>

                <div class="col-md-4 img-portfolio">
                    <a href="03_01_03_dietetyk_dorosli.jsp">
                        <img class="img-responsive img-hover"
                                            src="./graphics/fotolia/03_01_03_dietetyk_dorosli_700_400.jpg" alt="">
                    </a>
                    <h3>
                        <a href="03_01_03_dietetyk_dorosli.jsp">Dietetyk</a>
                    </h3>
                    <p>Poradnictwo dla osób dorosłych, dzieci, kobiet w ciąży i osób starszych <a href="03_01_03_dietetyk_dorosli.jsp">(więcej)</a></p>-->
    <!-- </div>
</div>  -->
    <!-- /.row -->


    <!-- Projects Row
    <div class="row">
        <div class="col-md-4 img-portfolio">
            <a href="portfolio-item.html">
                <img class="img-responsive img-hover" src="http://placehold.it/700x400" alt="">
            </a>
            <h3>
                <a href="portfolio-item.html">...1...</a>
            </h3>
            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam viverra euismod odio, gravida pellentesque urna varius vitae.</p>
        </div>
        <div class="col-md-4 img-portfolio">
            <a href="portfolio-item.html">
                <img class="img-responsive img-hover" src="http://placehold.it/700x400" alt="">
            </a>
            <h3>
                <a href="portfolio-item.html">...2...</a>
            </h3>
            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam viverra euismod odio, gravida pellentesque urna varius vitae.</p>
        </div>
        <div class="col-md-4 img-portfolio">
            <a href="portfolio-item.html">
                <img class="img-responsive img-hover" src="http://placehold.it/700x400" alt="">
            </a>
            <h3>
                <a href="portfolio-item.html">...3...</a>
            </h3>
            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam viverra euismod odio, gravida pellentesque urna varius vitae.</p>
        </div>
    </div> -->

    <!-- Projects Row
    <div class="row">
        <div class="col-md-4 img-portfolio">
            <a href="portfolio-item.html">
                <img class="img-responsive img-hover" src="http://placehold.it/700x400" alt="">
            </a>
            <h3>
                <a href="portfolio-item.html">Project Name</a>
            </h3>
            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam viverra euismod odio, gravida pellentesque urna varius vitae.</p>
        </div>
        <div class="col-md-4 img-portfolio">
            <a href="portfolio-item.html">
                <img class="img-responsive img-hover" src="http://placehold.it/700x400" alt="">
            </a>
            <h3>
                <a href="portfolio-item.html">Project Name</a>
            </h3>
            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam viverra euismod odio, gravida pellentesque urna varius vitae.</p>
        </div>
        <div class="col-md-4 img-portfolio">
            <a href="portfolio-item.html">
                <img class="img-responsive img-hover" src="http://placehold.it/700x400" alt="">
            </a>
            <h3>
                <a href="portfolio-item.html">Project Name</a>
            </h3>
            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam viverra euismod odio, gravida pellentesque urna varius vitae.</p>
        </div>
    </div>
    <!-- /.row -->

    <!--<hr>

     Pagination
    <div class="row text-center">
        <div class="col-lg-12">
            <ul class="pagination">
                <li>
                    <a href="#">&laquo;</a>
                </li>
                <li class="active">
                    <a href="#">1</a>
                </li>
                <li>
                    <a href="#">2</a>
                </li>
                <li>
                    <a href="#">3</a>
                </li>
                <li>
                    <a href="#">4</a>
                </li>
                <li>
                    <a href="#">5</a>
                </li>
                <li>
                    <a href="#">&raquo;</a>
                </li>
            </ul>
        </div>
    </div>
    <!-- /.row -->

    <hr>

    <!-- Footer -->
    <%@include file="WEB-INF/01_headers_footers/001_footer.jsp" %>

</div>
<!-- /.container -->

<!-- jQuery -->
<script src="js/jquery.js"></script>

<!-- Bootstrap Core JavaScript -->
<script src="js/bootstrap.min.js"></script>

</body>

</html>
