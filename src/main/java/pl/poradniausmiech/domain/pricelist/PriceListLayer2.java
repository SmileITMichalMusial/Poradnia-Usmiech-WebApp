package pl.poradniausmiech.domain.pricelist;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "price_list_layer_2")
public class PriceListLayer2 {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_layer_2")
    private Integer idLayer2;

    @Column(name = "fk_id_layer_1")
    private Integer fkIdLayer1;

    @Column(name = "order_id_layer_2")
    private Integer orderIdLayer2;

    @Column(name = "name")
    private String name;

    @Column(name = "duration")
    private String duration;

    @Column(name = "price")
    private String price;

    @Column(name = "dateCreated")
    private Date dateCreated;

    @Column(name = "dateModified")
    private Date dateModified;

    public PriceListLayer2() {
    }


    public Integer getIdLayer2() {
        return idLayer2;
    }

    public void setIdLayer2(Integer idLayer2) {
        this.idLayer2 = idLayer2;
    }

    public Integer getFkIdLayer1() {
        return fkIdLayer1;
    }

    public void setFkIdLayer1(Integer fkIdLayer1) {
        this.fkIdLayer1 = fkIdLayer1;
    }

    public Integer getOrderIdLayer2() {
        return orderIdLayer2;
    }

    public void setOrderIdLayer2(Integer orderIdLayer2) {
        this.orderIdLayer2 = orderIdLayer2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
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
}
