package pl.poradniausmiech.servlets.contactServlets;

import pl.poradniausmiech.dao.ContactDao;
import pl.poradniausmiech.domain.Contact;

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


@WebServlet("/ContactDeleteServlet")
class ContactDeleteServlet extends HttpServlet {

    private static final Logger logger = LogManager.getLogger(ContactDeleteServlet.class);

    @Inject
    ContactDao contactDao;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String id = req.getParameter("id");

        Contact contact = contactDao.read(Integer.parseInt(id));

        if (contact.getActive()) {
            contactDao.markContactAsInactiveInDb(Integer.parseInt(id));
            logger.info("Kontakt ID: " + contact.getId() + " | Ulica: " + contact.getStreet() + " | Kod pocztowy " + contact.getPostcode() + " | Miasto: " + contact.getCity() + " oznaczony jako nieaktywny w bazie danych");
        } else {
            contactDao.markContactAsActiveInDb(Integer.parseInt(id));
            logger.info("Kontakt ID: " + contact.getId() + " | Ulica: " + contact.getStreet() + " | Kod pocztowy " + contact.getPostcode() + " | Miasto: " + contact.getCity() + " oznaczony jako aktywny w bazie danych");
        }

        RequestDispatcher rd = req.getRequestDispatcher("ListAllContactsAdminServlet");
        rd.forward(req, resp);
    }

}