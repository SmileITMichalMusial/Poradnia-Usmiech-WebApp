<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
                <img width=100% border="5" src="graphics/baner.jpg" alt=""/>

            </h1>
            <ol class="breadcrumb">
                <li><a href="index.jsp">Strona główna</a></li>

                <li class="active">Cennik</li>
            </ol>
        </div>
    </div>
    <!-- /.row -->


    <table align=center cellspacing="0" id="cennik">
        <thead>

        <tr id="test">
            <td colspan="3" class="noborder_up"><input id="myInput" type="text" placeholder="Wyszukaj usługę">
            </td>
        </tr>
        <tr>
            <td id="column-1"><b>nazwa usługi</b></td>
            <td><b>czas trwania [min</b>]</td>
            <td><b>kwota [PLN]</b></td>

        </tr>
        </thead>
        <tfoot>
        </tfoot>
        <tbody id="myTable">


        <tr bgcolor=#33CC66>
            <td><b>psycholog</b>
            </td>
            <td></td>
            <td></td>
        </tr>
        <tr class="hover">
            <td>diagnoza psychologiczna</td>
            <td></td>
            <td>250</td>
        </tr>
        <tr class="hover">
            <td>konsultacja psychologiczna (dziecko)</td>
            <td>50</td>
            <td>130</td>
        </tr>
        <tr class="hover">
            <td>sesja terapii psychologicznej (dziecko)
            </td>
            <td>50</td>
            <td>110</td>
        </tr>
        <tr class="hover">
            <td>konsultacja psychologiczna (dorośli)
            </td>
            <td>50</td>
            <td>130</td>
        </tr>
        <tr class="hover">
            <td>sesja terapii indywidualnej z psychologiem (dorośli)
            </td>
            <td>50</td>
            <td>130</td>
        </tr>
        <tr class="hover">
            <td>pierwsza konsultacja diagnostyczna w kierunku uzależnień
            </td>
            <td>50</td>
            <td>170</td>
        </tr>
        <tr class="hover">
            <td>sesja terapii uzależnień
            </td>
            <td>50</td>
            <td>130</td>
        </tr>
        <tr class="hover">
            <td>wizyty domowe w obrębie Warszawy
            </td>
            <td>50</td>
            <td>260</td>
        </tr>
        <tr class="hover">
            <td>konsultacje psychologiczne online - Skype
            </td>
            <td>50</td>
            <td>130</td>
        </tr>
        <tr class="hover">
            <td>konsultacje w języku angielskim
            </td>
            <td>50</td>
            <td>cena standardowa + 50zł</td>
        </tr>
        <!-- 	pusty wiersz -->
        <tr>
            <td colspan="3">&nbsp</td>
        </tr>


        <tr bgcolor=#33CC66>
            <td colspan="3"><b>mediacje / terapie: par i rodzin</b>
            </td>
        </tr>
        <tr class="hover">
            <td>konsultacja</td>
            <td>90</td>
            <td>200</td>
        </tr>
        <tr class="hover">
            <td>terapia</td>
            <td>90</td>
            <td>180</td>
        </tr>
        <tr class="hover">
            <td>mediacje
            </td>
            <td>60</td>
            <td>180</td>
        </tr>
        <tr class="hover">
            <td>porada wychowawcza / doradztwo rodzinne
            </td>
            <td>50</td>
            <td>150</td>
        </tr>
        <!-- 	pusty wiersz -->
        <tr>
            <td colspan="3">&nbsp</td>
        </tr>


        <tr bgcolor=#33CC66>
            <td colspan="3"><b>logopeda</b></td>
        </tr>
        <tr class="hover">
            <td>diagnoza logopedyczna (1-2 spotkania)
            </td>
            <td>50 (1 spotkanie)</td>
            <td>120</td>
        </tr>
        <tr class="hover">
            <td>konsultacja logopedyczna
            </td>
            <td>45</td>
            <td>80</td>
        </tr>
        <tr class="hover">
            <td>sesja terapii logopedycznej
            </td>
            <td>30 / 45</td>
            <td>60 / 80</td>
        </tr>

        <tr>
            <!-- 	pusty wiersz -->
        <tr>
            <td colspan="3">&nbsp</td>
        </tr>
        <!-- 	pusty wiersz koniec -->


        <tr bgcolor=#33CC66>
            <td colspan="3"><b>pedagog</b>
            </td>
        </tr>
        <tr class="hover">
            <td>diagnoza pedagogiczna</td>
            <td></td>
            <td>230</td>
        </tr>
        <tr class="hover">
            <td>konsultacja pedagogiczna</td>
            <td>50</td>
            <td>100</td>
        </tr>
        <tr class="hover">
            <td>sesja terapii pedagogicznej (reedukacja) / rewalidacja
            </td>
            <td>45 / 60</td>
            <td>80 / 100</td>
        </tr>
        <td colspan="3">&nbsp</td>
        </tr>
        <tr bgcolor=#33CC66>


        <tr bgcolor=#33CC66>
            <td colspan="3"><b>terapia ręki</b>
            </td>
        </tr>
        <tr class="hover">
            <td>diagnoza</td>
            <td>50</td>
            <td>100</td>
        </tr>
        <tr class="hover">
            <td>konsultacja</td>
            <td>45</td>
            <td>80</td>
        </tr>
        <tr class="hover">
            <td>zajecia indywidualne
            </td>
            <td>45</td>
            <td>80</td>
        </tr>
        <!-- 	pusty wiersz -->
        <tr>
            <td colspan="3">&nbsp</td>
        </tr>
        <!-- 	pusty wiersz koniec -->
        <tr>
        <tr>
            <!-- 	pusty wiersz koniec -->


        <tr bgcolor=#33CC66>
            <td colspan="3"><b>integracja sensoryczna</b>
            </td>
        </tr>
        <tr class="hover">
            <td>diagnoza (3 spotkania)</td>
            <td>3 x 50</td>
            <td>320</td>
        </tr>
        <tr class="hover">
            <td>terapia</td>
            <td>50</td>
            <td>80</td>
        </tr>
        <!-- 	pusty wiersz -->
        <tr>
            <td colspan="3">&nbsp</td>
        </tr>
        <!-- 	pusty wiersz koniec -->
        <tr>
        <tr>
            <!-- 	pusty wiersz koniec -->


        <tr bgcolor=#33CC66>

            <td><b>diagnoza gotowości szkolnej</b></td>
            <td></td>
            <td></td>
        </tr>
        <tr class="hover">
            <td>diagnoza szkolna
            </td>
            <td>3 spotkania<br>
                (psycholog, logopeda, pedagog)
            </td>
            <td>350</td>
        </tr>

        <tr class="hover">
            <td>diagnoza trudności szkolnych
            </td>
            <td>
            </td>
            <td>280</td>
        </tr>

        <tr class="hover">
            <td>badanie ryzyka dysleksji, dysgrafii, dyskalkulii
            </td>
            <td>
            </td>
            <td>150</td>
        </tr>


        <!-- 	pusty wiersz -->
        <tr>
            <td colspan="3">&nbsp</td>
        </tr>
        <!-- 	pusty wiersz koniec -->


        <tr bgcolor=#33CC66>

            <td><b>oferta warsztatowa</b></td>
            <td></td>
            <td></td>
        </tr>
        <tr class="hover">
            <td>trening umiejętności społecznych
            </td>
            <td>45
            </td>
            <td>50 / dziecko</td>
        </tr>

        <tr class="hover">
            <td>warsztaty inteligencji emocjonalnej
            </td>
            <td>45
            </td>
            <td>50 / dziecko</td>
        </tr>

        <tr class="hover">
            <td>warsztaty dla rodziców
            </td>
            <td>90
            </td>
            <td>70 / osoba</td>
        </tr>


        <!-- 	pusty wiersz -->
        <tr>
            <td colspan="3">&nbsp</td>
        </tr>
        <!-- 	pusty wiersz koniec -->


        <tr bgcolor=#33CC66>

            <td><b>inne</b></td>
            <td></td>
            <td></td>
        </tr>
        <tr class="hover">
            <td>wydanie zaświadczenia
            </td>
            <td>-
            </td>
            <td>70</td>
        </tr>

        <tr class="hover">
            <td>wydanie opinii / diagnozy
            </td>
            <td>-
            </td>
            <td>120</td>
        </tr>


        <tr>
            <td class="noborder_left" colspan="3">&nbsp</td>
        </tr>

        <tr>
            <td class="noborder_left" colspan="3"><a href="./pliki/poradnia_psychologiczna_USMIECH_cennik_uslug.pdf"
                                                     target="_blank">
                Pobierz cennik w formacie PDF
            </a></td>
        </tr>


        <tr>
            <td class="noborder_left" colspan="3">&nbsp</td>
        </tr>

        <tr>
            <td class="noborder_left" colspan="3">

                <p style="text-align:justify">
                    <i>W przypadku nieodwołania umówionej wizyty do dnia poprzedzającego spotkanie do godziny 19:00
                        uprzejmie prosimy o wpłacenie 50% kwoty cennikowej tytułem wynagrodzenia dla specjalisty za czas
                        poświęcony oczekiwaniu na pacjenta.
                        <br><br>
                        Wyjątek stanowią opłaty za wizyty kupowane w miesięcznym pakiecie. W takim przypadku, jeśli
                        wizyta zostanie odwołana w terminie czyli do dnia poprzedzającego spotkanie, kwota przechodzi na
                        następny miesiąc lub wyznaczony jest nowy termin w zależności od dostępności specjalisty. W
                        sytuacji gdy pacjent nie odwoła wizyty lub się nie pojawi, wpłacona kwota nie podlega zwrotowi.
                    </i></p>

            </td>
        </tr>

        <tr>
            <td class="noborder_left" colspan="3">&nbsp</td>
        </tr>

        <tr>
            <td class="noborder_left" colspan="3">Numer konta bankowego do opłat za zajęcia:<br><br>
                Bank ING<br>
                Pracownia Psychologiczna "Uśmiech"<br>
                ul. Nocznickiego 9/42<br>
                01-948 Warszawa<br>
                <b>55 1050 1025 1000 0091 4466 8861</b>

            </td>
        </tr>


        <tr>
            <td class="noborder_left" colspan="3">
                <br><br>
                Akceptujemy płatności kartą i zbliżeniowe:<p>
                <img border="0" width="80%" src="graphics/00_08_platnosc_zblizeniowa_podluzne.jpg" alt="">


            </td>
        </tr>

        </tbody>
    </table>

    <br>


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
<script src="js/search_table.js"></script>


</body>

</html>
