package pl.poradniausmiech.dao;

import pl.poradniausmiech.domain.User;

import javax.ejb.Local;
import java.util.List;

@Local
public interface UsersDao {

    List<User> getUsersListFromDB();
}
