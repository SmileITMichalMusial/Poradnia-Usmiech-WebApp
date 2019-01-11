package pl.poradniausmiech.servlets.userServlets;

import pl.poradniausmiech.dao.UsersDao;
import pl.poradniausmiech.domain.User;
import pl.poradniausmiech.domain.UserType;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;
import java.util.logging.Logger;

@WebServlet("/UserAddServletUser")
class UserAddServletUser extends HttpServlet {

    final Logger logger = Logger.getLogger(getClass().getName());

    @Inject
    UsersDao usersDao;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("UTF-8");
        RequestDispatcher rd = req.getRequestDispatcher("/user.jsp");
        rd.forward(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("UTF-8");

        String login = req.getParameter("login");
        String password = req.getParameter("password");
        String name = req.getParameter("name");
        String surname = req.getParameter("surname");
        String email = req.getParameter("email");
        String phone = req.getParameter("phone");
        String type = req.getParameter("type");

        if (usersDao.isUniqueLogin(login)) {
            logger.info("Użytkownik: " + login + " istnieje w bazie danych. Nie można stworzyć użytkownika z tym samym loginem");
            logger.info("Przekierowanie do strony głównej");
            req.setAttribute("errorTitle", "Nie można utworzyć konta");
            req.setAttribute("errorDecscription", "Taki login już istnieje. Wybierz inny.");
            req.setAttribute("infoText","Powrót");
            req.setAttribute("link","/jsp/01_admin_pages/21_4_user_add_user.jsp");
            RequestDispatcher rd = req.getRequestDispatcher("999_error.jsp");
            rd.forward(req, resp);
            return;
        }



        User user = new User();
        user.setLogin(login);
        user.setPassword(password);
        user.setName(name);
        user.setSurname(surname);
        user.setEmail(email);
        user.setPhoneNumber(phone);
        user.setUserType(UserType.valueOf(type));
        user.setActive(true);
        Date date = new Date();
        long time = date.getTime();
        Timestamp ts = new Timestamp(time);
        user.setDateCreated(ts);

        usersDao.saveUserToDb(user);
        logger.info("Użytkownik: " + login + " dodany do bazy danych");

        req.setAttribute("errorTitle", "Gratulacje");
        req.setAttribute("errorDecscription", "Użytkownik założony");
        req.setAttribute("link", "08_login.jsp");
        req.setAttribute("infoText", "Powrót na stronę logowania");

        RequestDispatcher rd = req.getRequestDispatcher("999_error.jsp");
        //resp.sendRedirect(req.getContextPath() + "/ListAllUsersAdminServlet");
        rd.forward(req, resp);

    }
}