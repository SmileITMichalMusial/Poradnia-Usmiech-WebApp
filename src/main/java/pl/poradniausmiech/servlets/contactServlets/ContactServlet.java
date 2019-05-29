package pl.poradniausmiech.servlets.contactServlets;

import pl.poradniausmiech.dao.ContactDao;
import pl.poradniausmiech.dao.ContactDaoBean;
import pl.poradniausmiech.domain.Contact;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/ContactServlet")


public class ContactServlet extends HttpServlet {

    @Inject
    ContactDao contactDao;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<Contact>  contactList = contactDao.getContactListFromDB();
        // FIXME sortowanie aby wybrac jeden wiersz
        request.setAttribute("contactList", contactList);

        RequestDispatcher rd = request.getRequestDispatcher("07_kontakt.jsp");
        rd.forward(request, response);

    }
}
