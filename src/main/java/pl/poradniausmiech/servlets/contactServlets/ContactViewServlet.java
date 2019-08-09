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

@WebServlet("/ContactViewServlet")
public class ContactViewServlet extends HttpServlet {

    @Inject
    ContactDao contactDao;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");
        String id = request.getParameter("id");

        Contact contact = contactDao.read(Integer.parseInt(id));
        request.setAttribute("contact", contact);

        RequestDispatcher rd = request.getRequestDispatcher("../jsp/01_admin_pages/24_4_contact_details.jsp");
        rd.forward(request, response);
        return;
    }


}

