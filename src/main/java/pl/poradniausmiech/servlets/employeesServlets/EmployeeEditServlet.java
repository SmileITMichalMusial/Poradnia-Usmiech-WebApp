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
import java.util.logging.Level;
import java.util.logging.Logger;

@WebServlet("/EmployeeEditServlet")
@MultipartConfig
class EmployeeEditServlet extends HttpServlet {

    final Logger logger = Logger.getLogger(getClass().getName());

    @Inject
    EmployeesDao employeesDao;

    @Inject
    ImageUpload imageUpload;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String id = req.getParameter("id");
        req.setAttribute("id", id);
        req.getSession().setAttribute("id", id);

        Employee employee = employeesDao.read(Integer.parseInt(id));

        req.setAttribute("employee", employee);
        req.getSession().setAttribute("employee", employee);

        RequestDispatcher rd = req.getRequestDispatcher("../jsp/01_admin_pages/22_2_employee_edit.jsp");
        rd.forward(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("UTF-8");

        String idEmployee = String.valueOf(req.getSession().getAttribute("id"));

        String name = req.getParameter("name");
        String surname = req.getParameter("surname");
        String roleShort = req.getParameter("roleShort");
        String roleLong = req.getParameter("roleLong");
        String description = req.getParameter("description");
        String email = req.getParameter("email");
        String phoneNumber = req.getParameter("phoneNumber");
        Integer orderId = Integer.valueOf(req.getParameter("orderId"));
        String bankAccountNumber = req.getParameter("bankAccountNumber");

        req.getSession().setAttribute("name", name);
        req.getSession().setAttribute("surname", surname);
        req.getSession().setAttribute("roleShort", roleShort);
        req.getSession().setAttribute("roleLong", roleLong);
        req.getSession().setAttribute("email", email);
        req.getSession().setAttribute("phoneNumber", phoneNumber);
        req.getSession().setAttribute("orderId",orderId);
        req.getSession().setAttribute("bankAccountNumber", bankAccountNumber);

        Employee employee = employeesDao.read(Integer.parseInt(idEmployee));
        employee.setName(name);
        employee.setSurname(surname);
        employee.setRoleShort(roleShort);
        employee.setRoleLong(roleLong);
        employee.setDescription(description);
        employee.setEmail(email);
        employee.setPhoneNumber(phoneNumber);
        employee.setOrderId(orderId);
        employee.setBankAccountNumber(bankAccountNumber);
        employee.setDateModified(Dates.getCurrentDateForDbModifications());

        Part filePart = req.getPart("image");
        File file;
        try {
            file = imageUpload.uploadImageFile(filePart);
            employee.setPhotoURL(file.getName());
        } catch (UserImageNotFoundException userImageNotFound) {
            logger.log(Level.SEVERE, userImageNotFound.getMessage());
        }

        employeesDao.modifyEmployeeDb(employee);
        logger.info("Pracownik: " + idEmployee + " zaktualizowany: ");
        logger.info("Nowe imię: " + name +
                " | Nowe nazwisko: " + surname +
                " | Nowa rola (krótka): " + roleShort +
                " | Nowa rola (długa): " + roleLong +
                " | Nowy opis: " + description +
                " | Nowy email: " + email +
                " | Nowy telefon: " + phoneNumber +
                " | Nowa kolejność: " + phoneNumber +
                " | Nowy numer konta: " + bankAccountNumber
        );

        RequestDispatcher rd = req.getRequestDispatcher("../jsp/01_admin_pages/22_1_employees_view.jsp");
        resp.sendRedirect(req.getContextPath() + "/ListAllEmployeesAdminServlet");
        rd.forward(req, resp);

    }
}