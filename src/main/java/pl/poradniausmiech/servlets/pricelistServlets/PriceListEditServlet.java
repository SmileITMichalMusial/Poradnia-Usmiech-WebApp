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

@WebServlet("/PriceListEditServlet")


public class PriceListEditServlet extends HttpServlet {

    @Inject
    PriceListDao priceListDao;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");


        String idl1 = request.getParameter("idl1");
        String idl2 = request.getParameter("idl2");
        String page = request.getParameter("page");
        String action = request.getParameter("action");

        System.out.println("id1: " + idl1);
        System.out.println("id2: " + idl2);
        System.out.println("page: " + page);
        System.out.println("action: " + action);

        if (idl1 != null && idl2 == null && page.equals("adm") && action.equals("delete")) {
            System.out.println("delete layer 1");
            PricelistLayer1 pricelistLayer1 = priceListDao.getSinglePriceLayer1(Integer.valueOf(idl1));
            priceListDao.deletePriceListLayer1(pricelistLayer1);
            System.out.println("Wpis warstwy pierwszej, id: " + idl1 + " usunięty");
        }
        if (idl1 != null && idl2 != null && page.equals("adm") && action.equals("delete")) {
            System.out.println("delete layer 2");
            PriceListLayer2 priceListLayer2 = priceListDao.getSinglePriceLayer2(Integer.valueOf(idl2));
            priceListDao.deletePriceListLayer2(priceListLayer2);
            System.out.println("Wpis warstwy drugiej, id: " + idl2 + " usunięty");
        }
        if (idl1 != null && idl2 == null && page.equals("adm") && action.equals("edit")) {
            System.out.println("edit layer 1");
        }
        if (idl1 != null && idl2 != null && page.equals("adm") && action.equals("edit")) {
            System.out.println("edit layer 2");
        }


        RequestDispatcher rd = request.getRequestDispatcher("../jsp/01_admin_pages/23_1_pricelist_view.jsp");

        rd.forward(request, response);

    }

    public PriceListEditServlet() {
    }
}
