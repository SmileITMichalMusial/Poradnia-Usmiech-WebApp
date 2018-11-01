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
                <h1 class="page-header">
								<center><img border="5" width=100% src="graphics/baner.jpg" alt=""> </center>
                </h1>
                <ol class="breadcrumb">
                    <li><a href="index.jsp">Strona główna</a>
                    </li>
										<li><a href="02_specjalisci.jsp">Specjaliści</a>
                    </li>
                    <li class="active">Katarzyna Wojcieszyńska</li>
                </ol>
            </div>
        </div>
        <!-- /.row -->

        <!-- Portfolio Item Row -->
        <div class="row">

            <div class="col-md-obrazek">
                <div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
								<img class="img-responsive" src="graphics/katarzyna_wojcieszynska_szer_450.jpg"
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

            <div class="col-md-tekst">
                <h3>Katarzyna Wojcieszyńska</h3>
<p style="text-align:justify">
Tytuł magistra uzyskała na Wydziale Nauk Pedagogicznych, Akademii Pedagogiki Specjalnej im. Marii Grzegorzewskiej w Warszawie na kierunku pedagogika specjalna, specjalność rehabilitacja społeczna i zawodowa. 
<br><br>
Pracuje na stanowisku fizjoterapeuta w ZZOZ Caritas AW, po studiach pracowała w SPZOZ Centrum Rehabilitacji Medycznej i Ośrodek Osób Niepełnosprawnych prowadząc gimnastykę korekcyjną z dziećmi.
<br><br>

Dzięki odbytym kursom i szkoleniom podnosi poziom swoich kwalifikacji i uprawnień.
<br><br>
Jest terapeutą, diagnostą Integracji Sensorycznej oraz instruktorką fitness II°. Posiada uprawnienia do Basic Kinesiology Taping.
<br><br>
W życiu prywatnym mama trójki dzieci.
</p>

        </div>
				</div>
<hr>
        <!-- /.row -->

        <!-- Related Projects Row -->
        <!-- <div class="row">

            <div class="col-lg-12">
                <h3 class="pozostali_specjalisci">Pozostali specjaliści</h3>
				</div>

						
				<div class="row">

						<!--
            <div class="col-md-2">
                <a href="02_01_specjalisci_agnieszka_adamczyk_musial.jsp">
                    <img class="img-responsive img-hover img-related" src="./graphics/agnieszka_adamczyk_musial_wys_150.jpg" alt="">Agnieszka Adamczyk-Musiał<br>psycholog
                </a>
            </div>
						
                
						<div class="col-md-2">
                <a href="02_02_aleksandra_mazur.html">
                    <img class="img-responsive img-hover img-related" src="./graphics/aleksandra_mazur_wys_150.jpg" alt="">Aleksandra Mazur-Kyć<br>psycholog
                </a>
            </div>

            <div class="col-md-2">
                <a href="02_03_karina_choros_wrzeszcz.jsp">
                    <img class="img-responsive img-hover img-related" src="./graphics/karina_choros_wrzeszcz_wys_150.jpg" alt="">Karina Choroś-Wrzeszcz<br>mediator, terapeuta
                </a>
            </div>

            <div class="col-md-2">
                <a href="02_04_karolina_witak.html">
                    <img class="img-responsive img-hover img-related" src="./graphics/karolina_witak_wys_150.jpg" alt="">Karolina Witak<br>dietetyczka
                </a>
            </div>		
						
						<div class="col-md-2">
                <a href="02_05_anna_suchecka.jsp">
                    <img class="img-responsive img-hover img-related" src="./graphics/anna_suchecka_wys_150.jpg" alt="">Aneta Suchecka<br>logopeda
                </a>
            </div>	
						
						<div class="col-md-2">
                <a href="02_06_radoslaw_jerzy_utnik.html">
                    <img class="img-responsive img-hover img-related" src="./graphics/radoslaw_jerzy_utnik_wys_150.jpg" alt="">Radosław Jerzy Utnik<br>psycholog, seksuolog, mediator w sprawach cywilnych
                </a>
            </div>	
						
						<div class="col-md-2">
                <a href="02_07_marta_jagiello.html">
                    <img class="img-responsive img-hover img-related" src="./graphics/marta_jagiello_wys_150.jpg" alt="">Marta Jagiełło<br>psycholog
                </a>
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
