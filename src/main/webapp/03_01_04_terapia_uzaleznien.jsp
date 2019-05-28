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
                 <div style="text-align: center;"><img border="5" width=100% src="./graphics/baner.jpg" alt=""></div>
             </h1>
             <ol class="breadcrumb">
                 <li><a href="index.jsp">Strona główna</a>
                 </li>
                 <li><a href="03_01_oferta_dorosli.jsp">Oferta dorośli</a>
                 </li>
                 <li class="active">Terapia uzależnień</li>
             </ol>
         </div>
     </div>
     <!-- /.row -->

     <!-- Portfolio Item Row -->
     <div class="row">

         <div class="col-md-obrazek">
             <div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
                 <img class="img-responsive"
                      src="./graphics/fotolia/03_01_04_terapia_uzaleznien_450_257.jpg"
                      alt="">

             </div>
         </div>

         <div class="col-md-tekst">
             <h3>Terapia uzależnień</h3>

             <p align="justify">
                 Jedynym skutecznym i właściwym sposobem na zatrzymanie uzależnienia jest psychoterapia. Powinna się ona
                 rozpocząć od zaprzestania picia alkoholu, zażywania narkotyków (i/lub innych substancji) czy
                 zaprzestaniu grania - w przypadku patologicznego hazardu.
                 <br><br>
                 Abstynencja jest warunkiem koniecznym do rozpoczęcia procesu leczenia uzależnień.
                 <br><br>
                 W trakcie procesu terapii pacjent powinien dokonać szeregu zmian w różnych obszarach swojego życia. Nie
                 wystarczy sama abstynencja.
                 <br><br>
                 Terapia daje możliwość zdobycia wiedzy na temat uzależnienia, podłoża problemu, objawów, przebiegu i
                 konsekwencji, a także odnośnie zapobiegania nawrotom choroby.
                 <br><br>
                 Psychoterapia pozwala na uporządkowanie i wypracowanie radzenia sobie we wszystkich obszarach życia.
             </p>


         </div>

     </div>
     <!-- /.row -->
     <hr>
     <!-- Related Projects Row -->


     <hr>

     <!-- Footer -->
     <footer>
         <div class="row">
             <div class="col-lg-12">
                 <p>2014-2019 &copy; Poradnia psychologiczna "Uśmiech". Wszelkie prawa zastrzeżone.</p>
             </div>
         </div>
     </footer>

 </div>
    <!-- /.container -->

    <!-- jQuery -->
    <script src="js/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="js/bootstrap.min.js"></script>

</body>

</html>
