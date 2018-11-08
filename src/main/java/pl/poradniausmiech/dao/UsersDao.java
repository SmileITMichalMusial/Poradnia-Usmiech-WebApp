package pl.poradniausmiech.dao;

import pl.poradniausmiech.domain.User;

import javax.ejb.Local;
import java.util.List;

@Local
public interface UsersDao {

    List<User> getUsersListFromDB();

    User read(int id);

    void modifyUserDb(User user);

    void markUserAsInactiveInDb(int id);

    void markUserAsActiveInDb(int id);

    boolean isUniqueLogin(String login);

    void saveUserToDb(User user);
}
