package pl.poradniausmiech.dao;

import pl.poradniausmiech.Utils.Dates;
import pl.poradniausmiech.domain.Contact;
import pl.poradniausmiech.domain.Employee;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

@Stateless
public class ContactDaoBean implements ContactDao {

    private List<Contact> contactList = new ArrayList<>();
    private static final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("primary");

    @Override
    public List<Contact> getContactListFromDB() {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        contactList = entityManager.createQuery("FROM Contact ").getResultList();

        return contactList;
    }

    @Override
    public Contact read(int id) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Contact contact = entityManager.find(Contact.class, id);
        return contact;
    }

    @Override
    public void modifyContactDb(Contact contact) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        entityManager.merge(contact);
        entityTransaction.commit();
        entityManager.close();
    }

    @Override
    public void markContactAsInactiveInDb(int id) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        Contact contact = read(id);
        contact.setActive(false);
        contact.setDateModified(Dates.getCurrentDateForDbModifications());
        entityManager.merge(contact);
        entityTransaction.commit();
        entityManager.close();
    }

    @Override
    public void markContactAsActiveInDb(int id) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        Contact contact = read(id);
        contact.setActive(true);
        contact.setDateModified(Dates.getCurrentDateForDbModifications());
        entityManager.merge(contact);
        entityTransaction.commit();
        entityManager.close();
    }

    @Override
    public void saveContactToDb(Contact contact) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(contact);
        transaction.commit();
        entityManager.close();
    }
}
