package pl.poradniausmiech.servlets.pagesServlets;

import pl.poradniausmiech.Utils.Dates;
import pl.poradniausmiech.dao.PagesDao;
import pl.poradniausmiech.domain.pages.PagesLayer1;

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

@WebServlet("/PagesAddServlet")
public class PagesAddServlet extends HttpServlet {

    private static final Logger logger = LogManager.getLogger(PagesAddServlet.class);

    private Integer PageLayerNumber;
    @Inject
    PagesDao pagesDao;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");
        PageLayerNumber = Integer.valueOf(request.getParameter("PageLayerNumber"));

        if (PageLayerNumber == 1) {
            Integer orderId = Integer.valueOf(request.getParameter("OrderIDLayer1"));
            String pageName = request.getParameter("pageName");
            String pageAddress = request.getParameter("pageAddress");

            PagesLayer1 pagesLayer1 = new PagesLayer1();
            pagesLayer1.setOrderId(orderId);
            pagesLayer1.setPageName(pageName);
            pagesLayer1.setPageAddress(pageAddress);
            pagesLayer1.setActive(false);
            pagesLayer1.setDateCreated(Dates.getCurrentDateForDbModifications());
            pagesDao.savePagesLayer1ToDb(pagesLayer1);

            logger.info("Strona dodana: Id strony: " + orderId + " | Nazwa strony: " + pageName + " | Adres strony: " + pageAddress);
            List<PagesLayer1> pagesLayer1List = pagesDao.getPagesLayer1FromDbSortedByOrderId();
            request.getSession().setAttribute("pagesLayer1List", pagesLayer1List);

            RequestDispatcher rd = request.getRequestDispatcher("../jsp/01_admin_pages/31_1_pages_view.jsp");
            rd.forward(request, response);
        }

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");

        PageLayerNumber = Integer.valueOf(request.getParameter("PageLayerNumber"));

        request.setAttribute("PageLayerNumber", PageLayerNumber);

        RequestDispatcher rd = request.getRequestDispatcher("../jsp/01_admin_pages/31_2_add_pages.jsp");
        rd.forward(request, response);
        return;

    }
}
