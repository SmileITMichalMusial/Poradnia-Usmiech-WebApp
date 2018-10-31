<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<c:set var="login" scope="session" value="${login}"/>


<!-- Navigation -->
<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
    <!--<center>Warszawa Bielany, Marymoncka 105/29, Tel: 693-087-939</center>-->
    <div class="container">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse"
                    data-target="#bs-example-navbar-collapse-1">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="../../index.jsp">Poradnia Psychologiczna "Uśmiech"</a>

            <!--<img  src="./graphics/mm_sredni.jpg" alt="">-->

        </div>
        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav navbar-right">
                <li>
                    <a href="../../01_o_nas.jsp">O Nas</a>
                </li>
                <li>
                    <a href="../../02_specjalisci.jsp">Specjaliści</a>
                </li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">Oferta <b class="caret"></b></a>
                    <ul class="dropdown-menu">
                        <li>
                            <a href="../../03_02_oferta_dzieci.jsp">Dzieci</a>
                        </li>
                        <li>
                            <a href="../../03_01_oferta_dorosli.jsp">Dorośli</a>
                        </li>
                        <li>
                            <a href="../../03_03_warsztaty_grupowe.jsp">Warsztaty grupowe</a>
                        </li>

                    </ul>
                </li>

                </li>
                <li>
                    <a href="../../04_wspolpraca_kariera.jsp">Kariera / Współpraca</a>
                </li>

                <li>
                    <a href="../../05_galeria.jsp">Galeria</a>
                </li>
                <li>
                    <a href="../../06_cennik.jsp">Cennik</a>
                </li>
                <li>
                    <a href="../../07_kontakt.jsp">Kontakt</a>
                </li>
                <li>
                    <c:if test="${empty login}">
                        <a href="../../08_login.jsp">Zaloguj</a>
                    </c:if>
                    <c:if test="${not empty login}">
                        <a href="../../08_login.jsp">Witaj: ${login}</a>
                    </c:if>


                </li>

                <c:if test="${not empty login}">
                    <li>
                        <a href="/LogoutServlet">Wyloguj się</a>
                    </li>
                </c:if>

            </ul>
        </div>
        <!--<img  src="./graphics/mm_sredni.jpg" alt="">
        Warszawa Bielany, Marymoncka 105/29, Tel: 693-087-939-->

        <!-- /.navbar-collapse -->
    </div>
    <!-- /.container -->
</nav>