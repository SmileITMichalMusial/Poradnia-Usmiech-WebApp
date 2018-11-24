package pl.poradniausmiech.servlets.pricelistServlets;


import pl.poradniausmiech.dao.PriceListDao;
import pl.poradniausmiech.domain.pricelist.PriceListLayer2;
import pl.poradniausmiech.domain.pricelist.PricelistLayer1;

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

        List<PricelistLayer1> pricelistLayer1List = priceListDao.getPriceListLayer1FromDb();
        List<PriceListLayer2> pricelistLayer2List = priceListDao.getPriceListLayer2FromDb();
        System.out.println( "desc zero"+ pricelistLayer1List.get(0).getDescription());
        System.out.println( "dwa zero"+ pricelistLayer2List.get(0).getName());
        request.getSession().setAttribute("pricelistLayer1List", pricelistLayer1List);
        request.getSession().setAttribute("pricelistLayer2List", pricelistLayer2List);

        RequestDispatcher rd = request.getRequestDispatcher("../jsp/01_admin_pages/23_1_pricelist_view.jsp");
        rd.forward(request, response);

    }

    public PriceListAdminServlet() {
    }
}
