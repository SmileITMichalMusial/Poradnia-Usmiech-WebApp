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

@WebServlet("/ListAllEmployeesAdminServlet")


public class ListAllEmployeesAdminServlet extends HttpServlet {

    @Inject
    EmployeesDao employeesDao;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        request.getSession().getAttribute("listOfEmployees");
        response.setContentType("text/html;charset=UTF-8");
        List<Employee> listOfEmployees = employeesDao.getEmployeesListFromDB();
        request.setAttribute("listOfEmployees", listOfEmployees);
        request.getSession().setAttribute("listOfEmployees", listOfEmployees);
        RequestDispatcher rd = request.getRequestDispatcher("../jsp/01_admin_pages/22_1_employees_view.jsp");
        rd.forward(request, response);

    }

    public ListAllEmployeesAdminServlet() {
    }
}
