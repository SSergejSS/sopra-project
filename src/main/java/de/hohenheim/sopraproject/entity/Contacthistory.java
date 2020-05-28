package de.hohenheim.sopraproject.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Contacthistory {

    @Id
    @GeneratedValue
    private Integer contacthistoryId;

    private String date;

    private String text;

    public Integer getKontakthistoryId() {
        return contacthistoryId;
    }

    public void setKontakthistoryId(Integer kontakthistoryId) {
        this.contacthistoryId = kontakthistoryId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Contacthistory() {
        //empty constructor for Hibernate
    }
}
