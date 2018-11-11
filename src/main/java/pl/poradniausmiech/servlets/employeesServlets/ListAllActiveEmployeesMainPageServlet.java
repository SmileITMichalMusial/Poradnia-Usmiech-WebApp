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
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet("/ListAllActiveEmployeesMainPageServlet")


public class ListAllActiveEmployeesMainPageServlet extends HttpServlet {

    @Inject
    EmployeesDao employeesDao;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getSession().getAttribute("listOfActiveEmployees");
        response.setContentType("text/html;charset=UTF-8");
        List<Employee> listOfActiveEmployees = employeesDao.getActiveEmployeesListFromDB();
        request.setAttribute("listOfActiveEmployees", listOfActiveEmployees);
        request.getSession().setAttribute("listOfActiveEmployees", listOfActiveEmployees);
        RequestDispatcher rd = request.getRequestDispatcher("02_specjalisci_loop.jsp");
        rd.forward(request, response);

    }

    public ListAllActiveEmployeesMainPageServlet() {
    }
}
