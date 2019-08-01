package pl.poradniausmiech.dao;

import pl.poradniausmiech.Utils.Dates;
import pl.poradniausmiech.domain.pages.PagesLayer1;
import pl.poradniausmiech.domain.pages.PagesLayer2;
import pl.poradniausmiech.domain.pricelist.PriceListLayer1;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Stateless
public class PagesDaoBean implements PagesDao {
    private final static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("primary");

    @Override
    public List<PagesLayer1> getPagesLayer1FromDb() {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        List<PagesLayer1> pagesLayer1 = entityManager.createQuery("FROM PagesLayer1 ").getResultList();
        return pagesLayer1;
    }

    @Override
    public List<PagesLayer1> getPagesLayer1FromDbSortedByOrderId() {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        List<PagesLayer1> pagesLayer1 = entityManager.createQuery("FROM PagesLayer1 ").getResultList();
        pagesLayer1 = pagesLayer1
                .stream()
                .sorted(Comparator.comparing(PagesLayer1::getOrderId))
                .collect(Collectors.toList());
        return pagesLayer1;
    }



    @Override
    public List<PagesLayer2> getPagesLayer2FromDb() {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        List<PagesLayer2> pagesLayer2 = entityManager.createQuery("FROM PagesLayer2 ").getResultList();
        return pagesLayer2;
    }

    @Override
    public List<PagesLayer2> getPagesLayer2FromDbSortedByOrderId() {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        List<PagesLayer2> pagesLayer2 = entityManager.createQuery("FROM PagesLayer2 ").getResultList();
        pagesLayer2 = pagesLayer2
                .stream()
                .sorted(Comparator.comparing(PagesLayer2::getOrderId))
                .collect(Collectors.toList());
        return pagesLayer2;
    }



    @Override
    public void savePagesLayer1ToDb(PagesLayer1 pagesLayer1) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(pagesLayer1);
        transaction.commit();
        entityManager.close();
    }

    @Override
    public PagesLayer1 getSinglePageLayer1(int pageID_l1) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        PagesLayer1 pagesLayer1 = entityManager.find(PagesLayer1.class, pageID_l1);
        return pagesLayer1;
    }

    @Override
    public PagesLayer2 getSinglePageLayer2(int pageID_l2) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        PagesLayer2 pagesLayer2 = entityManager.find(PagesLayer2.class, pageID_l2);
        return pagesLayer2;
    }

    @Override
    public void modifyPagesLayer1(PagesLayer1 pagesLayer1) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        entityManager.merge(pagesLayer1);
        entityTransaction.commit();
        entityManager.close();
    }

    @Override
    public void modifyPagesLayer2(PagesLayer2 pagesLayer2) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        entityManager.merge(pagesLayer2);
        entityTransaction.commit();
        entityManager.close();
    }

    @Override
    public void markPageLayer1AsInactiveInDb(int pageID_l1) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        PagesLayer1 pagesLayer1 = getSinglePageLayer1(pageID_l1);
        pagesLayer1.setActive(false);
        pagesLayer1.setDateModified(Dates.getCurrentDateForDbModifications());
        entityManager.merge(pagesLayer1);
        entityTransaction.commit();
        entityManager.close();
    }

    @Override
    public void markPageLayer1AsActiveInDb(int pageID_l1) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        PagesLayer1 pagesLayer1 = getSinglePageLayer1(pageID_l1);
        pagesLayer1.setActive(true);
        pagesLayer1.setDateModified(Dates.getCurrentDateForDbModifications());
        entityManager.merge(pagesLayer1);
        entityTransaction.commit();
        entityManager.close();
    }

    @Override
    public void markPageLayer2AsInactiveInDb(int pageID_l2) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        PagesLayer2 pagesLayer2 = getSinglePageLayer2(pageID_l2);
        pagesLayer2.setActive(false);
        pagesLayer2.setDateModified(Dates.getCurrentDateForDbModifications());
        entityManager.merge(pagesLayer2);
        entityTransaction.commit();
        entityManager.close();
    }

    @Override
    public void markPageLayer2AsActiveInDb(int pageID_l2) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        PagesLayer2 pagesLayer2 = getSinglePageLayer2(pageID_l2);
        pagesLayer2.setActive(true);
        pagesLayer2.setDateModified(Dates.getCurrentDateForDbModifications());
        entityManager.merge(pagesLayer2);
        entityTransaction.commit();
        entityManager.close();
    }
}
