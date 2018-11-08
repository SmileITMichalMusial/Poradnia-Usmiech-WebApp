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
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;

@WebServlet("/User")
class UserAddServlet extends HttpServlet {

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
            RequestDispatcher rd = req.getRequestDispatcher("../jsp/01_admin_pages/99_error_admin_panel.jsp");
            rd.forward(req, resp);
            return;
        }

        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();

        User user = new User();
        user.setLogin(login);
        user.setPassword(password);
        user.setName(name);
        user.setSurname(surname);
        user.setEmail(email);
        user.setPhoneNumber(phone);
        user.setUserType(UserType.valueOf(type));
        user.setActive(true);
        user.setDateCreated(date);

        usersDao.saveUserToDb(user);
        logger.info("Użytkownik: " + login + " dodany do bazy danych");

        RequestDispatcher rd = req.getRequestDispatcher("../jsp/01_admin_pages/21_1_users_view.jsp");
        resp.sendRedirect(req.getContextPath() + "/ListAllUsersAdminServlet");
        rd.forward(req, resp);

    }
}