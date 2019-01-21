package pl.poradniausmiech.dao;

import pl.poradniausmiech.domain.User;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

@Stateless
public class UsersDaoBean implements UsersDao {


    private static final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("primary");

    @Override
    public List<User> getUsersListFromDB() {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        List<User> userList = entityManager.createQuery("FROM User ").getResultList();

        return userList;
    }

    @Override
    public User read(int id) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        User user = entityManager.find(User.class, id);
        return user;
    }

    @Override
    public void modifyUserDb(User user) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        entityManager.merge(user);
        entityTransaction.commit();
        entityManager.close();
    }

    @Override
    public void markUserAsInactiveInDb(int id) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        User user = read(id);
        System.out.println("User id: " + id);
        System.out.println("User status: " + user.getActive());
        System.out.println("Setting up as inactive...");
        user.setActive(false);
        System.out.println("USer status: " + user.getActive());
        entityManager.merge(user);
        entityTransaction.commit();
        entityManager.close();


    }

    @Override
    public void markUserAsActiveInDb(int id) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        User user = read(id);
        System.out.println("User id: " + id);
        System.out.println("User status: " + user.getActive());
        System.out.println("Setting up as inactive...");
        user.setActive(true);
        System.out.println("USer status: " + user.getActive());
        entityManager.merge(user);
        entityTransaction.commit();
        entityManager.close();


    }

    @Override
    public boolean isUniqueLogin(String login) {

        return this.getUsersListFromDB()
                .stream()
                .anyMatch(t -> t.getLogin().equals(login));

    }

    @Override
    public void saveUserToDb(User user) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(user);
        transaction.commit();
        entityManager.close();
    }


}
