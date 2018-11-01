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
                    <li class="active">Galeria</li>
                </ol>
            </div>
        </div>
        <!-- /.row -->

       <!--  <Content Row -->
         <div class="row">
           <div class="col-lg-12"> 
                <p>
											
	<!--START SIMPLEVIEWER EMBED -->
	<script type="text/javascript" src="svcore/js/simpleviewer.js"></script>
	<script type="text/javascript">
	simpleviewer.ready(function () {
		simpleviewer.load('sv-container', '100%', '100%', 'transparent', true);
	});
	</script>
	<div id="sv-container"></div>
	<!--END SIMPLEVIEWER EMBED -->
								<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>			<br><br><br><br><br>
								</p>
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
