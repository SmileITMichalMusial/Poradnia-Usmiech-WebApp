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
import java.util.logging.Logger;

@WebServlet("/UserDeleteServlet")
class UserDeleteServlet extends HttpServlet
{
    
    final Logger logger = Logger.getLogger(getClass().getName());
    
    @Inject
    UsersDao usersDao;
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        
        String id = req.getParameter("id");
        
        User user = usersDao.read(Integer.parseInt(id));
        
        if(user.getActive())
        {
            usersDao.markUserAsInactiveInDb(Integer.parseInt(id));
            logger.info("User login: " + user.getLogin() + " marked as inactive in DB.");
        }
        else
        {
            usersDao.markUserAsActiveInDb(Integer.parseInt(id));
            logger.info("User login: " + user.getLogin() + " marked as active in DB.");
        }
        
        RequestDispatcher rd = req.getRequestDispatcher("ListAllUsersAdminServlet");
        rd.forward(req, resp);
    }
    
}