package pl.poradniausmiech.dao;

import pl.poradniausmiech.domain.pricelist.PriceListLayer1;
import pl.poradniausmiech.domain.pricelist.PriceListLayer2;

import javax.ejb.Stateless;
import javax.persistence.*;
import java.util.List;

@Stateless
public class PriceListDaoBean implements PriceListDao {

    private static final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("primary");

    @Override
    public List getPriceListFromDb() {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        Query query = entityManager.createNativeQuery("select p1.id_layer_1, p2.id_layer_2, p1.order_id_layer_1, p2.order_id_layer_2, p1.description, p2.name, p2.duration, p2.price from price_list_layer_1 p1, price_list_layer_2 p2\n" +
                "where p1.id_layer_1 = p2.fk_id_layer_1");

        List fullPriceList = query.getResultList();
        return fullPriceList;
    }

    @Override
    public List<PriceListLayer1> getPriceListLayer1FromDb() {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        List<PriceListLayer1> priceListLayer1List = entityManager.createQuery("FROM PriceListLayer1 ").getResultList();
        return priceListLayer1List;
    }

    @Override
    public List<PriceListLayer2> getPriceListLayer2FromDb() {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        List<PriceListLayer2> priceListLayer2List = entityManager.createQuery("FROM PriceListLayer2 ").getResultList();
        return priceListLayer2List;
    }

    @Override
    public PriceListLayer1 getSinglePriceLayer1(int id1) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        PriceListLayer1 priceListLayer1 = entityManager.find(PriceListLayer1.class, id1);
        return priceListLayer1;
    }

    @Override
    public PriceListLayer2 getSinglePriceLayer2(int id2) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        PriceListLayer2 pricelistLayer2 = entityManager.find(PriceListLayer2.class, id2);
        return pricelistLayer2;
    }

    @Override
    public void modifyPriceListLayer1(PriceListLayer1 priceListLayer1) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        entityManager.merge(priceListLayer1);
        entityTransaction.commit();
        entityManager.close();
    }

    @Override
    public void modifyPriceListLayer2(PriceListLayer2 pricelistLayer2) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        entityManager.merge(pricelistLayer2);
        entityTransaction.commit();
        entityManager.close();
    }

    @Override
    public void deletePriceListLayer1(PriceListLayer1 priceListLayer1) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        entityManager.remove(entityManager.contains(priceListLayer1) ? priceListLayer1 : entityManager.merge(priceListLayer1));
        entityTransaction.commit();
        entityManager.close();
    }

    public void deletePriceListLayer2(PriceListLayer2 pricelistLayer2) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        entityManager.remove(entityManager.contains(pricelistLayer2) ? pricelistLayer2 : entityManager.merge(pricelistLayer2));
        entityTransaction.commit();
        entityManager.close();
    }

    @Override
    public void savePricelistLayer1ToDb(PriceListLayer1 priceListLayer1) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(priceListLayer1);
        transaction.commit();
        entityManager.close();
    }

    @Override
    public void savePricelistLayer2ToDb(PriceListLayer2 priceListLayer2) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(priceListLayer2);
        transaction.commit();
        entityManager.close();
    }
}
