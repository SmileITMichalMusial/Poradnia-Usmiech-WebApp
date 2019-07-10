package pl.poradniausmiech.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "contact")

public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name = "id", unique = true, nullable = false)
    private Integer id;

    @Column(name = "street", unique = true, nullable = false)
    private String street;

    @Column(name = "city", unique = true, nullable = false)
    private String city;

    @Column(name = "postcode", unique = true, nullable = false)
    private String postcode;

    @Column(name = "phone", unique = true, nullable = false)
    private String phone;

    @Column(name = "email", unique = true, nullable = false)
    private String email;

    @Column(name = "isactive", unique = true, nullable = false)
    private Boolean isActive;

    @Column(name = "dateCreated", unique = true, nullable = false)
    private Date dateCreated;

    @Column(name = "dateModified", unique = true, nullable = false)
    private Date dateModified;

    public Contact() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
