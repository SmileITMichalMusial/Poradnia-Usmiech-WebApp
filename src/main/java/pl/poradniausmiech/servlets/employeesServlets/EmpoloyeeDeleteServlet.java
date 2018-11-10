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

@WebServlet("/EmployeeDeleteServlet")
class EmpoloyeeDeleteServlet extends HttpServlet {

    final Logger logger = Logger.getLogger(getClass().getName());

    @Inject
    EmployeesDao employeesDao;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String id = req.getParameter("id");

        Employee employee = employeesDao.read(Integer.parseInt(id));

        if (employee.getActive()) {
            employeesDao.markEmployeeAsInactiveInDb(Integer.parseInt(id));
            logger.info("Pracownik: " + employee.getName() + " " + employee.getSurname() + " oznaczony jako nieaktywny w bazie danych");
        } else {
            employeesDao.markEmployeeAsActiveInDb(Integer.parseInt(id));
            logger.info("Pracownik: " + employee.getName() + " " + employee.getSurname() + " oznaczony jako aktywny w bazie danych");
        }

        RequestDispatcher rd = req.getRequestDispatcher("ListAllEmployeesAdminServlet");
        rd.forward(req, resp);
    }

}