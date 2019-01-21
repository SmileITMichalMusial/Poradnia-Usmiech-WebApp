package pl.poradniausmiech.dao;

import pl.poradniausmiech.domain.pricelist.PriceListLayer1;
import pl.poradniausmiech.domain.pricelist.PriceListLayer2;

import javax.ejb.Local;
import java.util.List;

@Local
public interface PriceListDao {

    List getPriceListFromDb();

    List<PriceListLayer1> getPriceListLayer1FromDb();

    List<PriceListLayer2> getPriceListLayer2FromDb();

    PriceListLayer1 getSinglePriceLayer1 (int id1);

    PriceListLayer2 getSinglePriceLayer2 (int id2);

    void modifyPriceListLayer1(PriceListLayer1 pricelistLayer1);

    void modifyPriceListLayer2(PriceListLayer2 priceListLayer2);

    void deletePriceListLayer1 (PriceListLayer1 pricelistLayer1);

    void deletePriceListLayer2 (PriceListLayer2 pricelistLayer2);

    void savePricelistLayer1ToDb(PriceListLayer1 pricelistLayer1);

    void savePricelistLayer2ToDb(PriceListLayer2 priceListLayer1);
}
