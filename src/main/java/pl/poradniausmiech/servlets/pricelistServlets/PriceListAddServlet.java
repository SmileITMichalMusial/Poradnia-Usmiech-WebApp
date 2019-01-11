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
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

@WebServlet("/PriceListAddServlet")
class PriceListAddServlet extends HttpServlet {

    final Logger logger = Logger.getLogger(getClass().getName());
    private String LayerXAdd;
    @Inject
    PriceListDao priceListDao;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html;charset=UTF-8");
        req.setCharacterEncoding("UTF-8");

        LayerXAdd = req.getParameter("layerID");
        req.setAttribute("LayerXAdd", LayerXAdd);
        String idl1 = req.getParameter("idl1");
        req.setAttribute("idl1", idl1);
        String idl1Description = req.getParameter("idl1Description");
        req.setAttribute("idl1Description", idl1Description);

        RequestDispatcher rd = req.getRequestDispatcher("../jsp/01_admin_pages/23_3_add_pricelist.jsp");
        rd.forward(req, resp);
        return;


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("UTF-8");

        String layerSelect = req.getParameter("LayerNumber");

        if (layerSelect.equals("Layer1")) {

            Integer OrderIDLayer1 = Integer.valueOf(req.getParameter("OrderIDLayer1"));
            String Description = req.getParameter("Description");

            PriceListLayer1 priceListLayer1 = new PriceListLayer1();
            priceListLayer1.setOrderIDLayer1(OrderIDLayer1);
            priceListLayer1.setDescription(Description);

            Date date = new Date();
            long time = date.getTime();
            Timestamp ts = new Timestamp(time);
            priceListLayer1.setDateCreated(ts);

            priceListDao.savePricelistLayer1ToDb(priceListLayer1);

            List<PriceListLayer1> priceListLayer1List = priceListDao.getPriceListLayer1FromDb();
            req.getSession().setAttribute("priceListLayer1List", priceListLayer1List);

            logger.info("Usługa: " + Description + ", kolejność " + OrderIDLayer1 + " dodana do bazy danych");

            RequestDispatcher rd = req.getRequestDispatcher("../jsp/01_admin_pages/23_1_pricelist_view.jsp");
            rd.forward(req, resp);

        }

        if (layerSelect.equals("Layer2")) {


            Integer idl1 = Integer.valueOf(req.getParameter("idl1"));
            Integer OrderIDLayer2 = Integer.valueOf(req.getParameter("OrderIDLayer2"));
            String Name = req.getParameter("Name");
            String Duration = req.getParameter("Duration");
            String Price = req.getParameter("Price");

            PriceListLayer2 priceListLayer2 = new PriceListLayer2();

            priceListLayer2.setFkIdLayer1(idl1);
            priceListLayer2.setOrderIdLayer2(OrderIDLayer2);
            priceListLayer2.setName(Name);
            priceListLayer2.setDuration(Duration);
            priceListLayer2.setPrice(Price);

            Date date = new Date();
            long time = date.getTime();
            Timestamp ts = new Timestamp(time);
            priceListLayer2.setDateCreated(ts);

            priceListDao.savePricelistLayer2ToDb(priceListLayer2);

            List<PriceListLayer1> priceListLayer1List = priceListDao.getPriceListLayer1FromDb();
            req.getSession().setAttribute("priceListLayer1List", priceListLayer1List);

            List<PriceListLayer2> priceListLayer2List = priceListDao.getPriceListLayer2FromDb();
            req.getSession().setAttribute("priceListLayer2List", priceListLayer2List);

            logger.info("Usługa: " + Name + ", kolejność " + OrderIDLayer2 + " dodana do bazy danych");

            RequestDispatcher rd = req.getRequestDispatcher("../jsp/01_admin_pages/23_1_pricelist_view.jsp");
            rd.forward(req, resp);

        }

    }
}