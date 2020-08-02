package pl.poradniausmiech.servlets.employeesServlets;

import pl.poradniausmiech.Utils.Dates;
import pl.poradniausmiech.Utils.UserImageNotFoundException;
import pl.poradniausmiech.dao.EmployeesDao;
import pl.poradniausmiech.dao.ImageUpload;
import pl.poradniausmiech.domain.Employee;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.File;
import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@WebServlet("/EmployeeAddServletAdmin")
@MultipartConfig
class EmployeeAddServletAdmin extends HttpServlet {

    private static final Logger logger = LogManager.getLogger(EmployeeAddServletAdmin.class);

    @Inject
    EmployeesDao employeesDao;

    @Inject
    ImageUpload imageUpload;

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
        employee.setDateCreated(Dates.getCurrentDateForDbModifications());

        Part filePart = req.getPart("image");
        File file;
        try {
            file = imageUpload.uploadImageFile(filePart);
            employee.setPhotoURL(file.getName());
        } catch (UserImageNotFoundException userImageNotFound) {
            logger.fatal(userImageNotFound.getMessage());
        }


        employeesDao.saveEmployeeToDb(employee);
        logger.info("Pracownik dodany: Imię " + name + " | Nazwisko: " + surname + " | Rola krótka " + roleShort);

        RequestDispatcher rd = req.getRequestDispatcher("../jsp/01_admin_pages/22_1_employees_view.jsp");
        resp.sendRedirect(req.getContextPath() + "/ListAllEmployeesAdminServlet");
        rd.forward(req, resp);

    }
}