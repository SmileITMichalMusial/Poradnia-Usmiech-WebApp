package pl.poradniausmiech.domain;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true, nullable = false)
    private Integer id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "surname", nullable = false)
    private String surname;

    @Column(name = "roleShort", nullable = false)
    private String roleShort;

    @Column(name = "roleLong", nullable = false)
    private String roleLong;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "phoneNumber")
    private String phoneNumber;

    @Column(name = "bankAccountNumber")
    private String bankAccountNumber;

    @Column(name = "orderId", nullable = false)
    private Integer orderId;

    @Column(name = "isactive", nullable = false)
    private Boolean isActive;

    @Column(name = "dateCreated", nullable = false)
    private Date dateCreated;

    @Column(name = "dateModified", nullable = false)
    private Date dateModified;


    public Employee() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getRoleShort() {
        return roleShort;
    }

    public void setRoleShort(String roleShort) {
        this.roleShort = roleShort;
    }

    public String getRoleLong() {
        return roleLong;
    }

    public void setRoleLong(String roleLong) {
        this.roleLong = roleLong;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
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
