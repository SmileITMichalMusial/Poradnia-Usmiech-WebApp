package pl.poradniausmiech.servlets.employeesServlets;

import pl.poradniausmiech.dao.EmployeesDao;
import pl.poradniausmiech.dao.UsersDao;
import pl.poradniausmiech.domain.Employee;
import pl.poradniausmiech.domain.User;
import pl.poradniausmiech.domain.UserType;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;

@WebServlet("/EmployeeAddServletAdmin")
class EmployeeAddServletAdmin extends HttpServlet {

    final Logger logger = Logger.getLogger(getClass().getName());

    @Inject
    EmployeesDao employeesDao;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("UTF-8");
        RequestDispatcher rd = req.getRequestDispatcher("/user.jsp");
        rd.forward(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("UTF-8");


        String name = req.getParameter("name");
        String surname = req.getParameter("surname");
        Integer orderId = Integer.valueOf(req.getParameter("orderId"));
        String roleShort = req.getParameter("roleShort");
        String roleLong = req.getParameter("roleLong");
        String description = req.getParameter("description");
        String email = req.getParameter("email");
        String phoneNumber = req.getParameter("phoneNumber");
        String bankAccountNumber = req.getParameter("bankAccountNumber");

        Employee employee = new Employee();
        employee.setName(name);
        employee.setSurname(surname);
        employee.setOrderId(orderId);
        employee.setRoleShort(roleShort);
        employee.setRoleLong(roleLong);
        employee.setDescription(description);

        employee.setEmail(email);
        employee.setPhoneNumber(phoneNumber);
        employee.setBankAccountNumber(bankAccountNumber);
        employee.setActive(true);
        Date date = new Date();
        long time = date.getTime();
        Timestamp ts = new Timestamp(time);
        employee.setDateCreated(ts);

        employeesDao.saveEmployeeToDb(employee);
        logger.info("Pracownik: " + name + " " + surname + " dodany do bazy danych");

        RequestDispatcher rd = req.getRequestDispatcher("../jsp/01_admin_pages/22_1_employees_view.jsp");
        resp.sendRedirect(req.getContextPath() + "/ListAllEmployeesAdminServlet");
        rd.forward(req, resp);

    }
}