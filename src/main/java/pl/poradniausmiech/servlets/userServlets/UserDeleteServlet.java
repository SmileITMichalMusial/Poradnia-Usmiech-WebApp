package pl.poradniausmiech.servlets.userServlets;

import pl.poradniausmiech.domain.User;
import pl.poradniausmiech.dao.UsersDao;

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

@WebServlet("/UserDeleteServlet")
class UserDeleteServlet extends HttpServlet {

    private static final Logger logger = LogManager.getLogger(UserDeleteServlet.class);

    @Inject
    UsersDao usersDao;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String id = req.getParameter("id");

        User user = usersDao.read(Integer.parseInt(id));

        if (user.getActive()) {
            usersDao.markUserAsInactiveInDb(Integer.parseInt(id));
            logger.info("Użytkownik oznaczony jako nieaktywny w bazie danych:" +
                    " Login: " + user.getLogin() +
                    " | Imię: " + user.getName() +
                    " | Nazwisko: " + user.getSurname() +
                    " | Email: " + user.getEmail() +
                    " | Numee telefonu: " + user.getPhoneNumber() +
                    " | Typ: " + user.getUserType()
            );
        } else {
            usersDao.markUserAsActiveInDb(Integer.parseInt(id));
            logger.info("Użytkownik oznaczony jako aktywny w bazie danych:" +
                    " Login: " + user.getLogin() +
                    " | Imię: " + user.getName() +
                    " | Nazwisko: " + user.getSurname() +
                    " | Email: " + user.getEmail() +
                    " | Numee telefonu: " + user.getPhoneNumber() +
                    " | Typ: " + user.getUserType()
            );
        }
// FIX_ME
// odswieaznie parametru sesji aby miec biezaca liste
        RequestDispatcher rd = req.getRequestDispatcher("ListAllUsersAdminServlet");
        rd.forward(req, resp);
    }

}