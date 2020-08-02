package pl.poradniausmiech.domain;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "logs")
public class Logs {

    @Id
    @Column(name = "user_id")
    private String id;

    @Column(name = "dateCreated")
    private Date dateCreated;

    @Column(name = "logger")
    private String logger;

    @Column(name = "level")
    private String level;

    @Column(name = "message")
    private String message;


    public Logs() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getLogger() {
        return logger;
    }

    public void setLogger(String logger) {
        this.logger = logger;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
