package pl.poradniausmiech.servlets.pricelistServlets;

import pl.poradniausmiech.dao.EmployeesDao;
import pl.poradniausmiech.dao.PriceListDao;
import pl.poradniausmiech.domain.Employee;
import pl.poradniausmiech.domain.pricelist.PricelistLayer1;

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

    @Inject
    PriceListDao priceListDao;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html;charset=UTF-8");
        req.setCharacterEncoding("UTF-8");

        String idl1 = req.getParameter("idl1");
        // FIX ME
        // REDIRECT TO NEW PAGE TO ADD USluga

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("UTF-8");



        Integer OrderIDLayer1 = Integer.valueOf(req.getParameter("OrderIDLayer1"));
        String Description = req.getParameter("Description");

        PricelistLayer1 pricelistLayer1 = new PricelistLayer1();
        pricelistLayer1.setOrderIDLayer1(OrderIDLayer1);
        pricelistLayer1.setDescription(Description);

        Date date = new Date();
        long time = date.getTime();
        Timestamp ts = new Timestamp(time);
        pricelistLayer1.setDateCreated(ts);

        priceListDao.savePricelistLayer1ToDb(pricelistLayer1);

        List<PricelistLayer1> pricelistLayer1List = priceListDao.getPriceListLayer1FromDb();
        req.getSession().setAttribute("pricelistLayer1List", pricelistLayer1List);

        logger.info("Usługa: " + Description + ", kolejność " +OrderIDLayer1  + " dodana do bazy danych");

        RequestDispatcher rd = req.getRequestDispatcher("../jsp/01_admin_pages/23_1_pricelist_view.jsp");
        rd.forward(req, resp);

    }
}