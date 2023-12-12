package lauragallace.entities;

import javax.persistence.*;

@Entity
@Table (name = "Event")
public class Event {
@Id
@Column (name= "event_code")
private long id;
    @Column (name= "event_title")

    private String title;
    @Column (name= "event_date")

    private String eventDate;
    @Column (name= "event_description")

    private String description;
    @Enumerated(EnumType.STRING)
    @Column (name= "event_type")

    private EventType eventType;
    @Column (name= "venue_capacity")

    private int maximumCapacity;
    public Event(){

    }

    public Event(String title, String eventDate, EventType eventType) {
        this.title = title;
        this.eventDate = eventDate;
        this.eventType = eventType;
    }

    public long getId() {
        return id;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEventDate() {
        return eventDate;
    }

    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public EventType getEventType() {
        return eventType;
    }

    public void setEventType(EventType eventType) {
        this.eventType = eventType;
    }

    public int getMaximumCapacity() {
        return maximumCapacity;
    }
    public void setMaximumCapacity(int maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
    }


    @Override
    public String toString() {
        return "Event{" +
                "title='" + title + '\'' +
                ", eventDate=" + eventDate +
                ", description='" + description + '\'' +
                ", eventType=" + eventType +
                ", maximumCapacity=" + maximumCapacity +
                '}';
    }
}

