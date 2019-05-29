package pl.poradniausmiech.servlets.contactServlets;


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
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@WebServlet("/ListAllContactsAdminServlet")


public class ListAllContactsAdminServlet extends HttpServlet {

    @Inject
    ContactDao contactDao;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        request.getSession().getAttribute("listOfContacts");
        response.setContentType("text/html;charset=UTF-8");
        List<Contact> listOfContacts = contactDao.getContactListFromDB();

        listOfContacts = listOfContacts
                .stream()
                .sorted(Comparator.comparing(Contact::getActive).reversed()
                        .thenComparing(Contact::getId))
                .collect(Collectors.toList());

        request.setAttribute("listOfContacts", listOfContacts);
        request.getSession().setAttribute(String.valueOf(listOfContacts), listOfContacts);
        RequestDispatcher rd = request.getRequestDispatcher("../jsp/01_admin_pages/24_1_contacts_view.jsp");
        rd.forward(request, response);

    }

    public ListAllContactsAdminServlet() {
    }
}
