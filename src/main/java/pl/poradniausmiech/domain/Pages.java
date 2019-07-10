package pl.poradniausmiech.domain;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table (name="Pages")
public class Pages {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true, nullable = false)
    private Integer id;

    @Column(name = "pageLayer", nullable = false)
    private Integer pageLayer;

    @Column(name = "pageLayerOrderId", nullable = false)
    private Integer pageLayerOrderId;

    @Column(name = "pageName", nullable = false)
    private String pageName;

    @Column(name = "pageAddress", nullable = false)
    private String pageAddress;

    @Column(name = "pageDescription", nullable = true)
    private String pageDescription;

    @Column(name = "isactive", nullable = false)
    private Boolean isActive;

    @Column(name = "dateCreated", nullable = false)
    private Date dateCreated;

    @Column(name = "dateModified", nullable = false)
    private Date dateModified;

    public Pages() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPageLayer() {
        return pageLayer;
    }

    public void setPageLayer(Integer pageLayer) {
        this.pageLayer = pageLayer;
    }

    public Integer getPageLayerOrderId() {
        return pageLayerOrderId;
    }

    public void setPageLayerOrderId(Integer pageLayerOrderId) {
        this.pageLayerOrderId = pageLayerOrderId;
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
