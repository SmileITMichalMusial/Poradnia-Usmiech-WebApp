<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% request.getAttribute("contactList"); %>
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
                </h1>
                <ol class="breadcrumb">
                    <li><a href="index.jsp">Strona główna</a></li>
                    <li class="active">Kontakt</li>
                </ol>
            </div>
        </div>
        <!-- /.row -->

        <!-- Content Row -->
        <div class="row">
            <!-- Map Column -->
            <div class="col-md-8">
                <!-- Embedded Google Map -->
                <iframe width="100%" height="400px" frameborder="0" scrolling="no" marginheight="0" marginwidth="0" src="https://www.google.com/maps/embed?pb=!1m14!1m8!1m3!1d9762.540979635496!2d20.953060000000004!3d52.286323700000004!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x471ecbd021209305%3A0xce79010b1ed898b2!2sMarymoncka+105%2C+01-813+Warszawa%2C+Polska!5e0!3m2!1spl!2s!4v1416094940122"></iframe>
								
								
								        <!-- Contact Form -->
        <!-- In order to set the email address and subject line for the contact form go to the bin/contact_me.php file. -->
								
								<!-- <h3>Napisz do nas</h3>
                <form name="sentMessage" id="contactForm" novalidate>
                    <div class="control-group form-group">
                        <div class="controls">
                            <label>Imie i nazwisko:</label>
                            <input type="text" class="form-control" id="name" required data-validation-required-message="Proszę podaj Imię i Nazwisko">
                            <p class="help-block"></p>
                        </div>
                    </div>
										
                    <div class="control-group form-group">
                        <div class="controls">
                            <label>Telefon:</label>
                            <input type="tel" class="form-control" id="phone" required data-validation-required-message="Proszę podaj numer telefonu abyśmy mogli się z Tobą skontaktować">
                        </div>
                    </div>
										
										
										
                    <div class="control-group form-group">
                        <div class="controls">
                            <label>Email:</label>
                            <input type="email" class="form-control" id="email">
                        </div>
                    </div>
                    <div class="control-group form-group">
                        <div class="controls">
                            <label>Wiadomość:</label>
                            <textarea rows="10" cols="100" class="form-control" id="message" required data-validation-required-message="Proszę napisz wiadomość" maxlength="999" style="resize:none"></textarea>
                        </div>
                    </div>
                    <div id="success"></div>
                    <!-- For success/fail messages -->
                   <!-- <button type="submit" class="btn btn-primary">Wyślij</button>
                </form>-->
								
								
								
            </div>
            <!-- Contact Details Column -->
            <div class="col-md-4">
                <h4>Adres</h4>

                ${contactList.get(0).getStreet()}<br>
                        ${contactList.get(0).getPostcode()} ${contactList.get(0).getCity()}
                <hr>
                
								 <h4>Telefon</h4> 
										<h3><b><i class="fa fa-phone"></i> 606-663-683</b></h3>
										<hr>
										
 										<h4>Email</h4> 
										<p><i class="fa fa-envelope-o"></i> 
                    </abbr> <a href="mailto:biuro@poradniausmiech.com.pl">biuro@poradniausmiech.com.pl</a>
										<hr>
										
										<p><i class="fa fa-clock-o"></i> 
                    Godziny otwarcia: </abbr>ustalane indywidualnie</p>
                <ul class="list-unstyled list-inline list-social-icons">
                    <li>
                        <a href="https://www.facebook.com/poradniausmiech/" target="_blank">
												<i class="fa fa-facebook-square fa-2x" ></i> Znajdź nas na Facebook</a>
                    </li>
										
                <hr>
										
										<h4>Dyrektor Poradni Psychologicznej "Uśmiech"</h4>
										<i class="fa fa-phone"></i> 
										Agnieszka Adamczyk-Musiał <br>
										</abbr>693-087-939</p>

										
										<hr>
										Akceptujemy płatności kartą i zbliżeniowe:
										<center><img border="0" width=100% src="graphics/07_01_platnosc_zblizeniowa.JPG" alt=""> </center>
										
										<!-- <i class="fa fa-phone"></i> 
										Aleksandra Szalla  <br> pedagog specjalny, terapeuta ręki<br>
										</abbr>572-629-455</p>
										
										<i class="fa fa-phone"></i> 
										Aneta Suchecka <br> logopeda<br>
										</abbr>506-067-103</p>
										
										<i class="fa fa-phone"></i> 
										Karolina Witak <br> dietetyczka<br>
										</abbr>668-683-222</p>
										
										<i class="fa fa-phone"></i> 
										Radosław Jerzy Utnik <br> psycholog, seksuolog<br>
										</abbr>606-663-683</p>
										
										<i class="fa fa-phone"></i> 
										Michał Musiał <br> korepetycje matematyka<br>
										</abbr>519-514-867</p>
										
										<i class="fa fa-phone"></i> 
										Karina Choroś-Wrzeszcz <br> mediator, terapeuta<br>
										</abbr>602-799-777</p>
										
										<i class="fa fa-phone"></i> 
										Piotr Rujner <br> doradca rodzinny<br>
										</abbr>661-615-100</p> -->
										

										
										
										

                
										<!--
                    <li>
                        <a href="#"><i class="fa fa-linkedin-square fa-2x"></i></a>
                    </li>
                    <li>
                        <a href="#"><i class="fa fa-twitter-square fa-2x"></i></a>
                    </li>
                    <li>
                        <a href="#"><i class="fa fa-google-plus-square fa-2x"></i></a>
                    </li>
										-->
                </ul>
            </div>
        </div>






        <hr>

        <!-- Footer -->
        <%@include file="WEB-INF/01_headers_footers/001_footer.jsp" %>

    </div>
    <!-- /.container -->

    <!-- jQuery -->
    <script src="js/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="js/bootstrap.min.js"></script>

    <!-- Contact Form JavaScript -->
    <!-- Do not edit these files! In order to set the email address and subject line for the contact form go to the bin/contact_me.php file. -->
    <script src="js/jqBootstrapValidation.js"></script>
    <script src="js/contact_me.js"></script>

</body>

</html>
