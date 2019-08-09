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
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@WebServlet("/EmployeeDeleteServlet")
class EmpoloyeeDeleteServlet extends HttpServlet {

    private static final Logger logger = LogManager.getLogger(EmpoloyeeDeleteServlet.class);

    @Inject
    EmployeesDao employeesDao;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String id = req.getParameter("id");

        Employee employee = employeesDao.read(Integer.parseInt(id));

        if (employee.getActive()) {
            employeesDao.markEmployeeAsInactiveInDb(Integer.parseInt(id));
            logger.info("Pracownik oznaczony jako nieaktywny w bazie danych: Imię: " + employee.getName() + " | Nazwisko: " + employee.getSurname());
        } else {
            employeesDao.markEmployeeAsActiveInDb(Integer.parseInt(id));
            logger.info("Pracownik oznaczony jako aktywny w bazie danych: Imię: " + employee.getName() + " | Nazwisko: " + employee.getSurname());
        }

        RequestDispatcher rd = req.getRequestDispatcher("ListAllEmployeesAdminServlet");
        rd.forward(req, resp);
    }

}