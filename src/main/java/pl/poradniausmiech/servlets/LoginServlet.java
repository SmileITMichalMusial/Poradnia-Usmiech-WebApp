package pl.poradniausmiech.servlets;


import pl.poradniausmiech.dao.UsersDao;
import pl.poradniausmiech.domain.User;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;

import static java.util.stream.Collectors.toList;

@WebServlet("/LoginServlet")
class LoginServlet extends HttpServlet {

    final Logger logger = Logger.getLogger(getClass().getName());

    @Inject
    UsersDao usersDao;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("UTF-8");

        String redirect;
        String login = req.getParameter("login");
        String password = req.getParameter("password");

        List<User> dbUser = usersDao
                .getUsersListFromDB()
                .stream()
                .filter(d -> d.getLogin().equals(login))
                .collect(toList());

        if (!dbUser.isEmpty()) {
            User loggedUser = dbUser.get(0);

            if (!dbUser.get(0).getActive()) {
                logger.info("Nieaktywny użytkownik: " + login);
                req.setAttribute("errorTitle", "Błąd logowania");
                req.setAttribute("errorDecscription", "Nieaktywny użytkownik");
                RequestDispatcher rd = req.getRequestDispatcher("999_error.jsp");
                rd.forward(req, resp);
                return;
            }
            if (dbUser.get(0).getLogin().equals(login) && dbUser.get(0).getPassword().equals(password)) {
                logger.info("Użytkownik " + login + " zalogowany z sukcesem");
                req.getSession().setAttribute("login", login);
                req.getSession().setAttribute("id", loggedUser.getId());
                req.getSession().setAttribute("userType", loggedUser.getUserType());
                logger.info("Zalogowany użytkownik typu: " + loggedUser.getUserType());
                redirect = "../jsp/01_admin_pages/10_admin_menu.jsp";
                RequestDispatcher rd = req.getRequestDispatcher(redirect);
                rd.forward(req, resp);
                return;

            } else {
                logger.info("Login failure for user: " + login);
                req.setAttribute("errorTitle", "Błąd logowania");
                req.setAttribute("errorDecscription", "Niepoprawny użytkownik albo hasło");
                RequestDispatcher rd = req.getRequestDispatcher("999_error.jsp");
                rd.forward(req, resp);
                return;
            }

        } else {
            logger.info("Nie ma takiego użytkownika: " + login);
            req.setAttribute("errorTitle", "Błąd logowania");
            req.setAttribute("errorDecscription", "Brak użytkownika");
            RequestDispatcher rd = req.getRequestDispatcher("999_error.jsp");
            rd.forward(req, resp);
            return;
        }


    }
}
