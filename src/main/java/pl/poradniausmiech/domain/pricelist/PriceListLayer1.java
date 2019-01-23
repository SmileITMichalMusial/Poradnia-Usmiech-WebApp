package pl.poradniausmiech.domain.pricelist;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "price_list_layer_1")
public class PriceListLayer1 {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_layer_1", unique = true, nullable = false)

    private Integer idLayer1;

    @Column(name = "order_id_layer_1")
    private Integer orderIDLayer1;

    @Column(name = "description")
    private String description;

    @Column(name = "dateCreated")
    private Date dateCreated;

    @Column(name = "dateModified")
    private Date dateModified;


    public PriceListLayer1() {
    }


    public Integer getIdLayer1() {
        return idLayer1;
    }

    public void setIdLayer1(Integer idLayer1) {
        this.idLayer1 = idLayer1;
    }

    public Integer getOrderIDLayer1() {
        return orderIDLayer1;
    }

    public void setOrderIDLayer1(Integer orderIDLayer1) {
        this.orderIDLayer1 = orderIDLayer1;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getDateModified() {
        return dateModified;
    }

    public void setDateModified(Date dateModified) {
        this.dateModified = dateModified;
    }

    private String id;


}
