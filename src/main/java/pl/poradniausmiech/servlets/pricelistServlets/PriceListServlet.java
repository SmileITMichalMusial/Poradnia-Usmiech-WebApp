package pl.poradniausmiech.servlets.pricelistServlets;


import pl.poradniausmiech.dao.PriceListDao;
import pl.poradniausmiech.domain.pricelist.PriceListLayer1;
import pl.poradniausmiech.domain.pricelist.PriceListLayer2;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/PriceListServlet")


public class PriceListServlet extends HttpServlet {

    @Inject
    PriceListDao priceListDao;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        List<PriceListLayer1> priceListLayer1List = priceListDao.getPriceListLayer1FromDb();
        List<PriceListLayer2> pricelistLayer2List = priceListDao.getPriceListLayer2FromDb();
        request.setAttribute("priceListLayer1List", priceListLayer1List);
        request.setAttribute("pricelistLayer2List", pricelistLayer2List);

        RequestDispatcher rd = request.getRequestDispatcher("06_cennik_new.jsp");
        rd.forward(request, response);

    }

    public PriceListServlet() {
    }
}
