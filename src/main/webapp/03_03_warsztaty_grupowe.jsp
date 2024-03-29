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
                <li class="active">Warsztaty grupowe</li>
            </ol>
        </div>
    </div>
    <!-- /.row -->

    <!-- Project Zero -->
    <div class="row">
        <div class="col-md-7">
            <a href="03_03_02_tus.jsp">
                <img class="img-responsive img-hover"
                     src="graphics/fotolia/04_01_02_tus_600_300.jpg" alt="">
            </a>
        </div>
        <div class="col-md-5">
            <h3>Trening umiejętności społecznych</h3>
            <h4>dla dzieci i młodzieży</h4>
            <p>Program treningowy przeznaczony jest dla dzieci w wieku 4-15 lat.
                Zajęcia grupowe skierowane są szczególnie do dzieci mających
                trudności w nawiązywaniu relacji z rówieśnikami, przestrzegania norm
                społecznych, a także do dzieci z rozpoznaniem zespołu Aspergera i
                ADHD.</p>
            <a class="btn btn-primary" href="03_03_02_tus.jsp">Szczegóły</i></a>
        </div>
    </div>
    <!-- /.row -->

    <hr>


    <!-- Project One -->
    <div class="row">
        <div class="col-md-7">
            <a href="03_03_01_wie.jsp">
                <img class="img-responsive img-hover"
                     src="graphics/fotolia/04_01_01_wie_600_300.jpg" alt="">
            </a>
        </div>
        <div class="col-md-5">
            <h3>Warsztaty inteligencji emocjonalnej</h3>
            <h4>dla dzieci</h4>
            <p>Program treningowy przeznaczony jest dla dzieci w wieku 4-15 lat. Zajęcia grupowe skierowane są
                szczególnie do dzieci które mają trudności z wyrażaniem, rozpoznawaniem i kontrolowaniem emocji. .
                <br><br>
                Ponadto polecamy nasze zajęcia dzieciom nieśmiałym, mało asertywnym i wrażliwym. </p>
            <a class="btn btn-primary" href="03_03_01_wie.jsp">Szczegóły</i></a>
        </div>
    </div>
    <!-- /.row -->




    <hr>
    <!-- Project Two -->
    <div class="row">
        <div class="col-md-7">
            <a href="03_03_03_wuw.jsp">
                <img class="img-responsive img-hover"
                     src="graphics/fotolia/04_02_01_wuw_600_300.jpg" alt="">
            </a>
        </div>
        <div class="col-md-5">
            <h3>Warsztaty umiejętności wychowawczych</h3>
            <h4>dla rodziców</h4>
            <p>Warsztaty skierowane są do rodziców/opiekunów dzieci i młodzieży. Przedstawiają one pomysły
                i ćwiczenia pomagające w radzeniu sobie z trudnymi zachowaniami naszych pociech, tak powszechnymi w
                dzieciństwie i okresie dojrzewania.
            </p><br>
            <a class="btn btn-primary" href="03_03_03_wuw.jsp">Szczegóły</i></a>
        </div>
    </div>

    <!-- /.row -->


    <!-- Project Three
    <div class="row">
        <div class="col-md-7">
            <a href="portfolio-item.html">
                <img class="img-responsive img-hover" src="http://placehold.it/700x300" alt="">
            </a>
        </div>
        <div class="col-md-5">
            <h3>Project Three</h3>
            <h4>Subheading</h4>
            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Omnis, temporibus, dolores, at, praesentium ut unde repudiandae voluptatum sit ab debitis suscipit fugiat natus velit excepturi amet commodi deleniti alias possimus!</p>
            <a class="btn btn-primary" href="portfolio-item.html">View Project</i></a>
        </div>
    </div>
    <!-- /.row -->


    <!-- Project Four
    <div class="row">

        <div class="col-md-7">
            <a href="portfolio-item.html">
                <img class="img-responsive img-hover" src="http://placehold.it/700x300" alt="">
            </a>
        </div>
        <div class="col-md-5">
            <h3>Project Four</h3>
            <h4>Subheading</h4>
            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Explicabo, quidem, consectetur, officia rem officiis illum aliquam perspiciatis aspernatur quod modi hic nemo qui soluta aut eius fugit quam in suscipit?</p>
            <a class="btn btn-primary" href="portfolio-item.html">View Project</i></a>
        </div>
    </div>
    <!-- /.row -->


    <!-- Project Five
    <div class="row">
        <div class="col-md-7">
            <a href="#">
                <img class="img-responsive img-hover" src="http://placehold.it/700x300" alt="">
            </a>
        </div>
        <div class="col-md-5">
            <h3>Project Five</h3>
            <h4>Subheading</h4>
            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Aliquid, quo, minima, inventore voluptatum saepe quos nostrum provident ex quisquam hic odio repellendus atque porro distinctio quae id laboriosam facilis dolorum.</p>
            <a class="btn btn-primary" href="#">View Project</i></a>
        </div>
    </div>
    <!-- /.row -->


    <!-- Pagination
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
