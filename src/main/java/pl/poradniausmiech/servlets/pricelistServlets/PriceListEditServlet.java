package pl.poradniausmiech.servlets.pricelistServlets;

import pl.poradniausmiech.Utils.Dates;
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
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@WebServlet("/PriceListEditServlet")

public class PriceListEditServlet extends HttpServlet {

    private static final Logger logger = LogManager.getLogger(PriceListEditServlet.class);

    @Inject
    PriceListDao priceListDao;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");

        String idl1 = (String) request.getSession().getAttribute("idl1");
        String idl2 = (String) request.getSession().getAttribute("idl2");


        if (idl1 != null && idl2 == null) {
            Integer OrderIDLayer1 = Integer.valueOf(request.getParameter("OrderIDLayer1"));
            String Description = request.getParameter("Description");

            PriceListLayer1 priceListLayer1 = priceListDao.getSinglePriceLayer1(Integer.valueOf(idl1));
            priceListLayer1.setOrderIDLayer1(OrderIDLayer1);
            priceListLayer1.setDescription(Description);
            priceListLayer1.setDateModified(Dates.getCurrentDateForDbModifications());

            priceListDao.modifyPriceListLayer1(priceListLayer1);
            logger.info("Cennik warstwy pierwszej zmodyfikowany: Kolejność: " + OrderIDLayer1 + " | Opis: " + Description);
            List<PriceListLayer1> priceListLayer1List = priceListDao.getPriceListLayer1FromDb();
            request.getSession().setAttribute("priceListLayer1List", priceListLayer1List);

            RequestDispatcher rd = request.getRequestDispatcher("../jsp/01_admin_pages/23_1_pricelist_view.jsp");
            rd.forward(request, response);
            return;
        }

        if (idl1 != null && idl2 != null) {
            Integer OrderIdLayer2 = Integer.valueOf(request.getParameter("OrderIdLayer2"));
            String Name = request.getParameter("Name");
            String Duration = request.getParameter("Duration");
            String Price = request.getParameter("Price");

            PriceListLayer2 priceListLayer2 = priceListDao.getSinglePriceLayer2(Integer.valueOf(idl2));
            priceListLayer2.setOrderIdLayer2(OrderIdLayer2);
            priceListLayer2.setName(Name);
            priceListLayer2.setDuration(Duration);
            priceListLayer2.setPrice(Price);
            priceListLayer2.setDateModified(Dates.getCurrentDateForDbModifications());

            priceListDao.modifyPriceListLayer2(priceListLayer2);
            logger.info("Cennik warstwy drugiej zmodyfikowany: Kolejność: " + OrderIdLayer2 + " | Nazwa: " + Name + " | Długość: " + Duration + " | Cena: " + Price);
            List<PriceListLayer2> priceListLayer2List = priceListDao.getPriceListLayer2FromDb();
            request.getSession().setAttribute("priceListLayer2List", priceListLayer2List);

            RequestDispatcher rd = request.getRequestDispatcher("../jsp/01_admin_pages/23_1_pricelist_view.jsp");
            rd.forward(request, response);
            return;
        }


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");

        String idl1 = request.getParameter("idl1");
        String idl2 = request.getParameter("idl2");
        String page = request.getParameter("page");
        String action = request.getParameter("action");

        if (idl1 != null && idl2 == null && page.equals("adm") && action.equals("delete")) {
            PriceListLayer1 priceListLayer1 = priceListDao.getSinglePriceLayer1(Integer.valueOf(idl1));
            priceListDao.deletePriceListLayer1(priceListLayer1);
            List<PriceListLayer1> priceListLayer1List = priceListDao.getPriceListLayer1FromDb();
            request.getSession().setAttribute("priceListLayer1List", priceListLayer1List);
            logger.info("Usługa warstwy pierwszej usunięta:" +
                    " Id: " + idl1 +
                    " | Kolejność: " + priceListLayer1.getIdLayer1() +
                    " | Opis: " + priceListLayer1.getDescription()
            );
        }
        if (idl1 != null && idl2 != null && page.equals("adm") && action.equals("delete")) {
            System.out.println("delete layer 2");
            PriceListLayer2 priceListLayer2 = priceListDao.getSinglePriceLayer2(Integer.valueOf(idl2));
            priceListDao.deletePriceListLayer2(priceListLayer2);
            List<PriceListLayer2> priceListLayer2List = priceListDao.getPriceListLayer2FromDb();
            request.getSession().setAttribute("priceListLayer2List", priceListLayer2List);
            logger.info("Usługa warstwy drugiej usunięta:" +
                    " Id: " + idl2 +
                    " | Kolejność: " + priceListLayer2.getIdLayer2() +
                    " | Nazwa: " + priceListLayer2.getName() +
                    " | Długość: " + priceListLayer2.getDuration() +
                    " | Cena: " + priceListLayer2.getPrice()
            );
        }
        String layerXEdit;
        if (idl1 != null && idl2 == null && page.equals("adm") && action.equals("edit")) {
            request.getSession().setAttribute("idl1", idl1);
            request.getSession().setAttribute("idl2", idl2);
            layerXEdit = "1";
            request.setAttribute("LayerXEdit", layerXEdit);
            PriceListLayer1 priceListLayer1 = priceListDao.getSinglePriceLayer1(Integer.valueOf(idl1));
            request.getSession().setAttribute("priceListLayer1", priceListLayer1);
            RequestDispatcher rd = request.getRequestDispatcher("../jsp/01_admin_pages/23_2_pricelist_layer1_edit.jsp");
            rd.forward(request, response);
            return;

        }
        if (idl1 != null && idl2 != null && page.equals("adm") && action.equals("edit")) {
            request.getSession().setAttribute("idl1", idl1);
            request.getSession().setAttribute("idl2", idl2);
            layerXEdit = "2";
            request.setAttribute("LayerXEdit", layerXEdit);
            PriceListLayer2 priceListLayer2 = priceListDao.getSinglePriceLayer2(Integer.valueOf(idl2));
            request.getSession().setAttribute("priceListLayer2", priceListLayer2);
            RequestDispatcher rd = request.getRequestDispatcher("../jsp/01_admin_pages/23_2_pricelist_layer1_edit.jsp");
            rd.forward(request, response);
            return;
        }


        RequestDispatcher rd = request.getRequestDispatcher("../jsp/01_admin_pages/23_1_pricelist_view.jsp");

        rd.forward(request, response);

    }

    public PriceListEditServlet() {
    }
}
