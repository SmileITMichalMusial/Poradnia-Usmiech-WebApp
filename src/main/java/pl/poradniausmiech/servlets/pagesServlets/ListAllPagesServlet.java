package pl.poradniausmiech.servlets.pagesServlets;

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
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@WebServlet("/ListAllPagesServlet")
public class ListAllPagesServlet extends HttpServlet {

    @Inject
    PagesDao pagesDao;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<PagesLayer1> pagesLayer1List = pagesDao.getPagesLayer1FromDbSortedByOrderId();
        List<PagesLayer2> pagesLayer2List = pagesDao.getPagesLayer2FromDbSortedByOrderId();

        request.getSession().setAttribute("pagesLayer1List", pagesLayer1List);
        request.getSession().setAttribute("pagesLayer2List", pagesLayer2List);

        RequestDispatcher rd = request.getRequestDispatcher("../jsp/01_admin_pages/31_1_pages_view.jsp");
        rd.forward(request, response);
    }

    public ListAllPagesServlet() {

    }
}
