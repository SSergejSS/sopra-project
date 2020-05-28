package de.hohenheim.sopraproject.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Event {

    @Id
    @GeneratedValue
    private Integer eventId;

    private String date ;

    private String place;

    private String eventName;

    private String time;

    private String text;

    public Event() {
        //empty constructor for Hibernate
    }

    public Integer getEventid() {
        return eventId;
    }

    public void setEventid(Integer eventid) {
        this.eventId = eventid;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
