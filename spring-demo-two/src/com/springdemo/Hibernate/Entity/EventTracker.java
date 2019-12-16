package com.springdemo.Hibernate.Entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EventTracker")
public class EventTracker {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="EventLocation")
	private String EventLocation;
	
	@Column(name="EventMethod")
	private String EventMethod;
	
	@Column(name="EventUser")
	private String EventUser;
	
	@Column(name="EventTime")
	private Date EventTime;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEventLocation() {
		return EventLocation;
	}

	public void setEventLocation(String eventLocation) {
		EventLocation = eventLocation;
	}

	public String getEventMethod() {
		return EventMethod;
	}

	public void setEventMethod(String eventMethod) {
		EventMethod = eventMethod;
	}

	public String getEventUser() {
		return EventUser;
	}

	public void setEventUser(String eventUser) {
		EventUser = eventUser;
	}

	public Date getEventTime() {
		return EventTime;
	}

	public void setEventTime(Date eventTime) {
		EventTime = eventTime;
	}

	@Override
	public String toString() {
		return "EventTracker [id=" + id + ", EventLocation=" + EventLocation + ", EventMethod=" + EventMethod
				+ ", EventUser=" + EventUser + ", EventTime=" + EventTime + "]";
	}
	
	

}
