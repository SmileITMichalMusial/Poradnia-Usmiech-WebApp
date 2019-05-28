package pl.poradniausmiech.servlets.employeesServlets;

import pl.poradniausmiech.dao.EmployeesDao;
import pl.poradniausmiech.domain.Employee;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.logging.Logger;

@WebServlet("/EmployeeUserViewServlet")
public class EmployeeUserViewServlet extends HttpServlet {

    final Logger logger = Logger.getLogger(getClass().getName());
    @Inject
    EmployeesDao employeesDao;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");
        String id = request.getParameter("id");
        String pageID = request.getParameter("page");
        Employee employee = employeesDao.read(Integer.parseInt(id));
        request.setAttribute("employee", employee);
        request.getSession().getAttribute("login");
        System.out.println("Login to: " + request.getSession().getAttribute("login"));

        String login = (String) request.getSession().getAttribute("login");

        if (pageID.equals("spec")) {
            RequestDispatcher rd = request.getRequestDispatcher("02_01_specjalisci_loop.jsp");
            rd.forward(request, response);
            return;
        }
        if (pageID.equals("adm")) {

            if (login.equals("null") || login.isEmpty() || login.equals("") || login == "null") {
                RequestDispatcher rd = request.getRequestDispatcher("08_login.jsp");
                rd.forward(request, response);
                return;
            }

            RequestDispatcher rd = request.getRequestDispatcher("../jsp/01_admin_pages/22_4_employees_details.jsp");
            rd.forward(request, response);
            return;
        }


    }
}
