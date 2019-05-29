package pl.poradniausmiech.servlets.contactServlets;

import pl.poradniausmiech.Utils.Dates;
import pl.poradniausmiech.dao.ContactDao;
import pl.poradniausmiech.dao.EmployeesDao;
import pl.poradniausmiech.domain.Contact;
import pl.poradniausmiech.domain.Employee;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;
import java.util.logging.Logger;

@WebServlet("/ContactDeleteServlet")
class ContactDeleteServlet extends HttpServlet {

    final Logger logger = Logger.getLogger(getClass().getName());

    @Inject
    ContactDao contactDao;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String id = req.getParameter("id");

        Contact contact = contactDao.read(Integer.parseInt(id));

        if (contact.getActive()) {
            contactDao.markContactAsInactiveInDb(Integer.parseInt(id));
            logger.info("Kontakt: " + contact.getStreet() + " " + contact.getPostcode() + " " + contact.getCity() +" oznaczony jako nieaktywny w bazie danych");
        } else {
            contactDao.markContactAsActiveInDb(Integer.parseInt(id));
            logger.info("Kontakt: " + contact.getStreet() + " " + contact.getPostcode() + " " + contact.getCity() +" oznaczony jako nieaktywny w bazie danych");
        }

        RequestDispatcher rd = req.getRequestDispatcher("ListAllContactsAdminServlet");
        rd.forward(req, resp);
    }

}