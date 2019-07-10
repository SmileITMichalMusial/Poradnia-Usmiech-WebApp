package pl.poradniausmiech.dao;

import pl.poradniausmiech.domain.Contact;
import pl.poradniausmiech.domain.Employee;

import javax.ejb.Local;
import java.util.List;

@Local
public interface ContactDao {

    List<Contact>  getContactListFromDB();

    Contact read(int id);

    void modifyContactDb(Contact contact);

    void markContactAsInactiveInDb(int id);

    void markContactAsActiveInDb(int id);

    void saveContactToDb(Contact contact);
}
