package pl.poradniausmiech.dao;

import pl.poradniausmiech.domain.pages.PagesLayer1;
import pl.poradniausmiech.domain.pages.PagesLayer2;
import pl.poradniausmiech.domain.pricelist.PriceListLayer1;

import javax.ejb.Local;
import java.util.List;

@Local
public interface PagesDao {

    List<PagesLayer1> getPagesLayer1FromDb();
    List<PagesLayer1> getPagesLayer1FromDbSortedByOrderId();
    List<PagesLayer2> getPagesLayer2FromDb();
    List<PagesLayer2> getPagesLayer2FromDbSortedByOrderId();
    void savePagesLayer1ToDb (PagesLayer1 pagesLayer1);
    PagesLayer1 getSinglePageLayer1 (int pageID_l1);
    PagesLayer2 getSinglePageLayer2 (int pageID_l2);
    void modifyPagesLayer1(PagesLayer1 pagesLayer1);
    void modifyPagesLayer2(PagesLayer2 pagesLayer2);
    void markPageLayer1AsActiveInDb (int pageID_l1);
    void markPageLayer1AsInactiveInDb (int pageID_l1);


}
