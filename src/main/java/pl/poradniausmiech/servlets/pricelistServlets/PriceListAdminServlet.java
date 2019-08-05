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

@WebServlet("/PriceListAdminServlet")


public class PriceListAdminServlet extends HttpServlet {

    @Inject
    PriceListDao priceListDao;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        List<PriceListLayer1> priceListLayer1List = priceListDao.getPriceListLayer1FromDb();
        List<PriceListLayer2> priceListLayer2List = priceListDao.getPriceListLayer2FromDb();
        request.getSession().setAttribute("priceListLayer1List", priceListLayer1List);
        request.getSession().setAttribute("priceListLayer2List", priceListLayer2List);

        RequestDispatcher rd = request.getRequestDispatcher("../jsp/01_admin_pages/23_1_pricelist_view.jsp");
        rd.forward(request, response);

    }

    public PriceListAdminServlet() {
    }
}
