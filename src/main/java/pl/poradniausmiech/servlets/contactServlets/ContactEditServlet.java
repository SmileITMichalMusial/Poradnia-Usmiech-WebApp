package pl.poradniausmiech.servlets.contactServlets;

import pl.poradniausmiech.Utils.UserImageNotFoundException;
import pl.poradniausmiech.dao.ContactDao;
import pl.poradniausmiech.dao.EmployeesDao;
import pl.poradniausmiech.dao.ImageUpload;
import pl.poradniausmiech.domain.Contact;
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
import java.sql.Timestamp;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

@WebServlet("/ContactEditServlet")
@MultipartConfig
class ContactEditServlet extends HttpServlet {

    final Logger logger = Logger.getLogger(getClass().getName());

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
        contact.setEmail(email);
        Date date= new Date();
        long time = date.getTime();
        Timestamp ts = new Timestamp(time);
        contact.setDateModified(ts);


        contactDao.modifyContactDb(contact);
        logger.info("Contact id: " + idContact + " zaktualizowany");
        logger.info("Nowa ulica: " + street +
                " | Nowe miasto: " + city +
                " | Nowy kod pocztowy: " + postcode +
                " | Nowy email: " + email +
                " | Nowy telefon: " + phone
        );

        RequestDispatcher rd = req.getRequestDispatcher("../jsp/01_admin_pages/24_1_contact_view.jsp");
        resp.sendRedirect(req.getContextPath() + "/ListAllContactsAdminServlet");
        rd.forward(req, resp);

    }
}