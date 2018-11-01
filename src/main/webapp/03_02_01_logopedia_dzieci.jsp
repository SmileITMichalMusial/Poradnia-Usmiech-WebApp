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
  (function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){
  (i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),
  m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
  })(window,document,'script','https://www.google-analytics.com/analytics.js','ga');

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
                <h1 class="page-header"><center><img border="5" width=100% src="graphics/baner.jpg" alt=""> </center>
                </h1>
                <ol class="breadcrumb">
                    <li><a href="index.jsp">Strona główna</a>
                    </li>
										<li><a href="03_02_oferta_dzieci.jsp">Oferta dzieci</a>
                    </li>
                    <li class="active">Logopedia</li>
                </ol>
            </div>
        </div>
        <!-- /.row -->

        <!-- Portfolio Item Row -->
        <div class="row">

            <div class="col-md-6">
                <div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
								<img class="img-responsive" src="graphics/fotolia/03_02_01_logopedia_dzieci_563_375.jpg"
														alt="">
                    <!-- Indicators 
                    <ol class="carousel-indicators">
                        <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
                        <li data-target="#carousel-example-generic" data-slide-to="1"></li>
                        <li data-target="#carousel-example-generic" data-slide-to="2"></li>
                    </ol>-->

                    <!-- Wrapper for slides 
                    <div class="carousel-inner">
                        <div class="item active">
                            <img class="img-responsive" src="./graphics/agnieszka_adamczyk_musial_1.jpg" 
														alt="" >
                        </div>
                        <div class="item">
                            <img class="img-responsive" src="./graphics/agnieszka_adamczyk_musial_750.jpg" alt="">
                        </div>
                        <div class="item">
                            <img class="img-responsive" src="http://placehold.it/750x500" alt="">
                        </div>
                    </div>-->

                    <!-- Controls 
                    <a class="left carousel-control" href="#carousel-example-generic" data-slide="prev">
                        <span class="glyphicon glyphicon-chevron-left"></span>
                    </a>
                    <a class="right carousel-control" href="#carousel-example-generic" data-slide="next">
                        <span class="glyphicon glyphicon-chevron-right"></span>
                    </a>-->
                </div>
            </div>

            <div class="col-md-6">
                <h3>Diagnoza</h3>

								
								
<p style="text-align:justify">
Terapia poprzedzona jest diagnozą logopedyczną.
Diagnoza składa sie miedzy innymi z wywiadu z rodzicami, obserwacji dziecka i 
sposobu komunikowania sie oraz badaniu mowy dziecka.<br /><br />
Badanie mowy jest najbardziej złożonym elementem i moze trwać nawet do dwóch spotkań z logopedą.
Po ustaleniu diagnozy ustalany jest indywidualny program terapii dostosowany do problemu dziecka.<br /><br />
Czas trwania: w zależnosci od zaburzeń diagnoza zajmuje jedno lub dwa spotkania po 50 minut.<br /><br />

<h3>Terapia</h3>

Celem terapii logopedycznej jest:
<ul>
  <li>usuwanie zaburzeń mowy (wady, jąkanie itp)</li>
  <li>stymulowanie rozwoju mowy</li>
  <li>doskonalenie mowy juz ukształtownej przez dziecko</li>
  <li>przywracaniem mowy w przypadku utraty</li>
</ul>

<br />
Czas trwania: 45 min - 1 spotkanie<br />
Cennik znajduje się <a href="06_cennik.jsp">tutaj</a>.
</p>

            </div>

        </div>
        <!-- /.row -->
<hr>
 <!-- Our Customers -->
        <div class="row">
            <div class="col-lg-12">
                <h2 class="page-header">Oferta dzieci</h2>
            </div>
            <div class="col-md-2 col-sm-4 col-xs-6">
                <a href="03_02_01_logopedia_dzieci.jsp">
								<img class="img-responsive customer-img"
                                     src="graphics/fotolia/03_02_01_logopedia_dzieci_500_300.jpg" alt="">
								<center>Logopedia</center></a>
            </div>
            <div class="col-md-2 col-sm-4 col-xs-6">
							<a href="03_02_02_pedagogika_dzieci.jsp">
                <img class="img-responsive customer-img"
                     src="graphics/fotolia/03_02_02_pedagogika_dzieci_500_300.jpg" alt="">
								<center>Terapia pedagogiczna</center></a>
            </div>
            <div class="col-md-2 col-sm-4 col-xs-6">
                <a href="03_02_03_psychologia_dzieci.jsp">
								<img class="img-responsive customer-img"
                                     src="graphics/fotolia/03_02_03_psychologia_dzieci_500_300.jpg" alt="">
								<center>Psychologia</center></a>
            </div>
            <div class="col-md-2 col-sm-4 col-xs-6">
                <a href="03_02_04_terapia_reki_dzieci.jsp">
								<img class="img-responsive customer-img"
                                     src="graphics/fotolia/03_02_04_terapia_reki_dzieci_500_300.jpg" alt="">
								<center>Terapia ręki</center></a>
            </div>
            <div class="col-md-2 col-sm-4 col-xs-6">
                <a href="03_02_05_gotowosc_szkolna_dzieci.jsp">
								<img class="img-responsive customer-img"
                                     src="graphics/fotolia/03_02_05_gotowosc_szkolna_dzieci_500_300.jpg" alt="">
								<center>Gotowość szkolna</center></a>
            </div>
            <div class="col-md-2 col-sm-4 col-xs-6">
                <a href="03_02_06_diagnoza_trudnosci_szkolnych.jsp">
								<img class="img-responsive customer-img"
                                     src="graphics/fotolia/03_02_06_diagnoza_trudnosci_szkolnych_500_300.jpg" alt="">
								<center>Diagnoza trudności szkolnych i dysleksji</center></a>
            </div>
        </div>
        <!-- /.row -->


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
