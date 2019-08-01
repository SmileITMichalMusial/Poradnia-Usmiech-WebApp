package pl.poradniausmiech.servlets.pagesServlets;

import pl.poradniausmiech.Utils.Dates;
import pl.poradniausmiech.dao.PagesDao;
import pl.poradniausmiech.domain.pages.PagesLayer1;
import pl.poradniausmiech.domain.pages.PagesLayer2;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;

@WebServlet("/PagesEditServlet")

public class PagesEditServlet extends HttpServlet {

    final Logger logger = Logger.getLogger(getClass().getName());

    @Inject
    PagesDao pagesDao;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");

        String pageID_l1 = (String) request.getSession().getAttribute("pageID_l1");
        String pageID_l2 = (String) request.getSession().getAttribute("pageID_l2");


        if (pageID_l1 != null && pageID_l2 == null) {

            Integer OrderId = Integer.valueOf(request.getParameter("OrderId"));
            String PageName = request.getParameter("PageName");
            String PageAddress = request.getParameter("PageAddress");

            PagesLayer1 pagesLayer1 = pagesDao.getSinglePageLayer1(Integer.valueOf(pageID_l1));
            pagesLayer1.setOrderId(OrderId);
            pagesLayer1.setPageName(PageName);
            pagesLayer1.setPageAddress(PageAddress);
            pagesLayer1.setDateModified(Dates.getCurrentDateForDbModifications());

            pagesDao.modifyPagesLayer1(pagesLayer1);

            logger.info("Zaktualizowano strone warstwy pierwszej o id= " + pageID_l1 + ": OrderID = " + OrderId + "; PageName = " + PageName + "; PageAddress = " + PageAddress + ";");

            List<PagesLayer1> pagesLayer1List = pagesDao.getPagesLayer1FromDbSortedByOrderId();
            request.getSession().setAttribute("pagesLayer1List", pagesLayer1List);
            List<PagesLayer2> pagesLayer2List = pagesDao.getPagesLayer2FromDbSortedByOrderId();
            request.setAttribute("pagesLayer2List", pagesLayer2List);

            request.getSession().setAttribute("edit_active", "NO");
            request.getSession().setAttribute("pageID_l1", null);
            request.getSession().setAttribute("pageID_l2", null);
            RequestDispatcher rd = request.getRequestDispatcher("../jsp/01_admin_pages/31_1_pages_view.jsp");
            rd.forward(request, response);
            return;
        }

        if (pageID_l1 != null && pageID_l2 != null) {
            Integer OrderId = Integer.valueOf(request.getParameter("OrderId"));
            String PageName = request.getParameter("PageName");
            String PageAddress = request.getParameter("PageAddress");

            PagesLayer2 pagesLayer2 = pagesDao.getSinglePageLayer2(Integer.valueOf(pageID_l2));
            pagesLayer2.setOrderId(OrderId);
            pagesLayer2.setPageName(PageName);
            pagesLayer2.setDateModified(Dates.getCurrentDateForDbModifications());
            pagesLayer2.setPageAddress(PageAddress);

            pagesDao.modifyPagesLayer2(pagesLayer2);

            logger.info("Zaktualizowano strone warstwy drugiej o id= " + pageID_l2 + ": OrderID = " + OrderId + "; PageName = " + PageName + "; PageAddress = " + PageAddress + ";");

            List<PagesLayer1> pagesLayer1List = pagesDao.getPagesLayer1FromDbSortedByOrderId();
            request.setAttribute("pagesLayer1List", pagesLayer1List);
            List<PagesLayer2> pagesLayer2List = pagesDao.getPagesLayer2FromDbSortedByOrderId();
            request.setAttribute("pagesLayer2List", pagesLayer2List);

            request.getSession().setAttribute("edit_active", "NO");
            request.getSession().setAttribute("pageID_l1", null);
            request.getSession().setAttribute("pageID_l2", null);

            RequestDispatcher rd = request.getRequestDispatcher("../jsp/01_admin_pages/31_1_pages_view.jsp");
            rd.forward(request, response);
            return;
        }


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");

        String pageID_l1 = request.getParameter("pageID_l1");
        String pageID_l2 = request.getParameter("pageID_l2");
        String action = request.getParameter("action");
        String mode = request.getParameter("mode");

        if(action.equals("edit") && mode.equals("edit_inactive")) {
            request.getSession().setAttribute("edit_active", "NO");
            request.getSession().setAttribute("pageID_l1", null);
            request.getSession().setAttribute("pageID_l2", null);
            List<PagesLayer1> pagesLayer1List = pagesDao.getPagesLayer1FromDbSortedByOrderId();
            request.setAttribute("pagesLayer1List", pagesLayer1List);
            List<PagesLayer2> pagesLayer2List = pagesDao.getPagesLayer2FromDbSortedByOrderId();
            request.setAttribute("pagesLayer2List", pagesLayer2List);
            RequestDispatcher rd = request.getRequestDispatcher("../jsp/01_admin_pages/31_1_pages_view.jsp");
            rd.forward(request, response);
            return;
        }


        if (pageID_l1 != null && pageID_l2 == null && action.equals("edit") && mode.equals("edit_active")) {
            request.getSession().setAttribute("edit_active", "YES");
            request.getSession().setAttribute("pageID_l1", pageID_l1);
            List<PagesLayer1> pagesLayer1List = pagesDao.getPagesLayer1FromDbSortedByOrderId();
            request.setAttribute("pagesLayer1List", pagesLayer1List);
            List<PagesLayer2> pagesLayer2List = pagesDao.getPagesLayer2FromDbSortedByOrderId();
            request.setAttribute("pagesLayer2List", pagesLayer2List);
            RequestDispatcher rd = request.getRequestDispatcher("../jsp/01_admin_pages/31_1_pages_view.jsp");
            rd.forward(request, response);
            return;
        }

        if (pageID_l1 != null && pageID_l2 != null && action.equals("edit") && mode.equals("edit_active")) {
            request.getSession().setAttribute("edit_active", "YES");
            request.getSession().setAttribute("pageID_l1", pageID_l1);
            request.getSession().setAttribute("pageID_l2", pageID_l2);
            List<PagesLayer1> pagesLayer1List = pagesDao.getPagesLayer1FromDbSortedByOrderId();
            request.setAttribute("pagesLayer1List", pagesLayer1List);
            List<PagesLayer2> pagesLayer2List = pagesDao.getPagesLayer2FromDbSortedByOrderId();
            request.setAttribute("pagesLayer2List", pagesLayer2List);
            RequestDispatcher rd = request.getRequestDispatcher("../jsp/01_admin_pages/31_1_pages_view.jsp");
            rd.forward(request, response);
            return;
        }

        if (pageID_l1 != null && action.equals("delete")) {

            PagesLayer1 pagesLayer1 = pagesDao.getSinglePageLayer1(Integer.parseInt(pageID_l1));
            if (pagesLayer1.getActive()) {
                pagesDao.markPageLayer1AsInactiveInDb(Integer.parseInt(pageID_l1));
                logger.info("PageID: " + pagesLayer1.getId() + "; PageName: " + pagesLayer1.getPageName() + "; PageAddress: " + pagesLayer1.getPageName() + " marked as inactive in DB.");
            } else {
                pagesDao.markPageLayer1AsActiveInDb(Integer.parseInt(pageID_l1));
                logger.info("PageID: " + pagesLayer1.getId() + "; PageName: " + pagesLayer1.getPageName() + "; PageAddress: " + pagesLayer1.getPageName() + " marked as active in DB.");
            }

            List<PagesLayer1> pagesLayer1List = pagesDao.getPagesLayer1FromDbSortedByOrderId();
            request.getSession().setAttribute("pagesLayer1List", pagesLayer1List);
            List<PagesLayer2> pagesLayer2List = pagesDao.getPagesLayer2FromDbSortedByOrderId();
            request.getSession().setAttribute("pagesLayer2List", pagesLayer2List);
            RequestDispatcher rd = request.getRequestDispatcher("../jsp/01_admin_pages/31_1_pages_view.jsp");
            rd.forward(request, response);
            return;

        }

        RequestDispatcher rd = request.getRequestDispatcher("../jsp/01_admin_pages/31_1_pages_view.jsp");
        rd.forward(request, response);

    }

    public PagesEditServlet() {
    }
}
