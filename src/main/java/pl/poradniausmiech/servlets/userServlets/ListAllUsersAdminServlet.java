package pl.poradniausmiech.servlets.userServlets;


import pl.poradniausmiech.dao.UsersDao;
import pl.poradniausmiech.domain.User;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet("/ListAllUsersAdminServlet")


public class ListAllUsersAdminServlet extends HttpServlet {

    @Inject
    UsersDao usersDao;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        request.getSession().getAttribute("listOfUsers");
        response.setContentType("text/html;charset=UTF-8");
        List<User> listOfUsers = usersDao.getUsersListFromDB();
        request.setAttribute("listOfUsers", listOfUsers);
        request.getSession().setAttribute("listOfUsers", listOfUsers);
        RequestDispatcher rd = request.getRequestDispatcher("../jsp/01_admin_pages/21_1_users_view.jsp");
        rd.forward(request, response);

    }

    public ListAllUsersAdminServlet() {
    }
}
