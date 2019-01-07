package pl.poradniausmiech.dao;

import pl.poradniausmiech.domain.Employee;
import pl.poradniausmiech.domain.pricelist.PriceListLayer2;
import pl.poradniausmiech.domain.pricelist.PricelistLayer1;

import javax.ejb.Stateless;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Stateless
public class PriceListDaoBean implements PriceListDao {

    private List fullPriceList = new ArrayList<>();
    private List<PricelistLayer1> pricelistLayer1List = new ArrayList<PricelistLayer1>();
    private List<PriceListLayer2> priceListLayer2List = new ArrayList<PriceListLayer2>();

    private static final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("primary");

    @Override
    public List getPriceListFromDb() {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        Query query = entityManager.createNativeQuery("select p1.id_layer_1, p2.id_layer_2, p1.order_id_layer_1, p2.order_id_layer_2, p1.description, p2.name, p2.duration, p2.price from price_list_layer_1 p1, price_list_layer_2 p2\n" +
                "where p1.id_layer_1 = p2.fk_id_layer_1");

        fullPriceList = query.getResultList();
        System.out.println(fullPriceList.get(0).toString());
        return fullPriceList;
    }

    @Override
    public List<PricelistLayer1> getPriceListLayer1FromDb() {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        pricelistLayer1List = entityManager.createQuery("FROM PricelistLayer1 ").getResultList();
        return pricelistLayer1List;
    }

    @Override
    public List<PriceListLayer2> getPriceListLayer2FromDb() {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        priceListLayer2List = entityManager.createQuery("FROM PriceListLayer2 ").getResultList();
        return priceListLayer2List;
    }

    @Override
    public PricelistLayer1 getSinglePriceLayer1(int id1) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        PricelistLayer1 pricelistLayer1 = entityManager.find(PricelistLayer1.class, id1);
        return pricelistLayer1;
    }

    @Override
    public PriceListLayer2 getSinglePriceLayer2(int id2) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        PriceListLayer2 pricelistLayer2 = entityManager.find(PriceListLayer2.class, id2);
        return pricelistLayer2;
    }

    @Override
    public void modifyPriceListLayer1(PricelistLayer1 pricelistLayer1) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        entityManager.merge(pricelistLayer1);
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
    public void deletePriceListLayer1(PricelistLayer1 pricelistLayer1) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        entityManager.remove(entityManager.contains(pricelistLayer1) ? pricelistLayer1 : entityManager.merge(pricelistLayer1));
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
    public void savePricelistLayer1ToDb(PricelistLayer1 pricelistLayer1) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(pricelistLayer1);
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
