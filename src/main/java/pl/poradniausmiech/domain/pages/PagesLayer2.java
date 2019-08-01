package pl.poradniausmiech.domain.pages;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "pages_layer_2")
public class PagesLayer2 {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name = "fk_pages_layer_1_id")
    private Integer fk_pages_layer_1_id;

    @Column(name = "orderId")
    private Integer orderId;

    @Column(name = "pageName")
    private String pageName;

    @Column(name = "pageAddress")
    private String pageAddress;

    @Column(name = "pageDescription")
    private String pageDescription;

    @Column(name = "isActive")
    private Boolean isActive;

    @Column(name = "dateCreated")
    private Date dateCreated;

    @Column(name = "dateModified")
    private Date dateModified;

    public PagesLayer2() {}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFk_pages_layer_1_id() {
        return fk_pages_layer_1_id;
    }

    public void setFk_pages_layer_1_id(Integer fk_pages_layer_1_id) {
        this.fk_pages_layer_1_id = fk_pages_layer_1_id;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getPageName() {
        return pageName;
    }

    public void setPageName(String pageName) {
        this.pageName = pageName;
    }

    public String getPageAddress() {
        return pageAddress;
    }

    public void setPageAddress(String pageAddress) {
        this.pageAddress = pageAddress;
    }

    public String getPageDescription() {
        return pageDescription;
    }

    public void setPageDescription(String pageDescription) {
        this.pageDescription = pageDescription;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
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
