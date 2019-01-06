package pl.poradniausmiech.dao;

import org.omg.CORBA.PRIVATE_MEMBER;
import pl.poradniausmiech.domain.Employee;
import pl.poradniausmiech.domain.pricelist.PriceListLayer2;
import pl.poradniausmiech.domain.pricelist.PricelistLayer1;

import javax.ejb.Local;
import java.util.List;

@Local
public interface PriceListDao {

    List getPriceListFromDb();

    List<PricelistLayer1> getPriceListLayer1FromDb();

    List<PriceListLayer2> getPriceListLayer2FromDb();

    PricelistLayer1 getSinglePriceLayer1 (int id1);

    PriceListLayer2 getSinglePriceLayer2 (int id2);

    void modifyPriceListLayer1(PricelistLayer1 pricelistLayer1);

    void modifyPriceListLayer2(PriceListLayer2 priceListLayer2);

    void deletePriceListLayer1 (PricelistLayer1 pricelistLayer1);

    void deletePriceListLayer2 (PriceListLayer2 pricelistLayer2);

    void savePricelistLayer1ToDb(PricelistLayer1 pricelistLayer1);
}
