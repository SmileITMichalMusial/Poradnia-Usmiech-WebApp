package pl.poradniausmiech.servlets.contactServlets;

import pl.poradniausmiech.Utils.Dates;
import pl.poradniausmiech.dao.ContactDao;
import pl.poradniausmiech.domain.Contact;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@WebServlet("/ContactEditServlet")
@MultipartConfig
class ContactEditServlet extends HttpServlet {

    private static final Logger logger = LogManager.getLogger(ContactEditServlet.class);

    @Inject
    ContactDao contactDao;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String id = req.getParameter("id");
        req.setAttribute("id", id);
        req.getSession().setAttribute("id", id);

        Contact contact = contactDao.read(Integer.parseInt(id));

        req.setAttribute("contact", contact);
        req.getSession().setAttribute("contact", contact);

        RequestDispatcher rd = req.getRequestDispatcher("../jsp/01_admin_pages/24_2_contact_edit.jsp");
        rd.forward(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("UTF-8");

        String idContact = String.valueOf(req.getSession().getAttribute("id"));

        String street = req.getParameter("street");
        String city = req.getParameter("city");
        String postcode = req.getParameter("postcode");
        String phone = req.getParameter("phone");
        String email = req.getParameter("email");

        req.getSession().setAttribute("street", street);
        req.getSession().setAttribute("city", city);
        req.getSession().setAttribute("postcode", postcode);
        req.getSession().setAttribute("phone", phone);
        req.getSession().setAttribute("email", email);


        Contact contact = contactDao.read(Integer.parseInt(idContact));
        contact.setStreet(street);
        contact.setCity(city);
        contact.setPostcode(postcode);
        contact.setPhone(phone);
        contact.setDateModified(Dates.getCurrentDateForDbModifications());


        contactDao.modifyContactDb(contact);
        logger.info("Kontakt ID: " + idContact + " zaktualizowany:" +
                " Ulica: " + street +
                " | Miasto: " + city +
                " | Kod pocztowy: " + postcode +
                " | Email: " + email +
                " | Telefon: " + phone
        );

        RequestDispatcher rd = req.getRequestDispatcher("../jsp/01_admin_pages/24_1_contact_view.jsp");
        resp.sendRedirect(req.getContextPath() + "/ListAllContactsAdminServlet");
        rd.forward(req, resp);

    }
}