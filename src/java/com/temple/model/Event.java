/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.temple.model;

/**
 *
 * @author Dell PC
 */
public class Event {
    private int eid;
    private String eventName;
    private String eventTime;
    private String hallName;
    private String eventOrganizer;
    private String eventDescription;

    public Event() {
    }

    public Event(int eid, String eventName, String eventTime, String hallName, String eventOrganizer, String eventDescription) {
        this.eid=eid;
        this.eventName = eventName;
        this.eventTime = eventTime;
        this.hallName = hallName;
        this.eventOrganizer = eventOrganizer;
        this.eventDescription = eventDescription;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }
    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventTime() {
        return eventTime;
    }

    public void setEventTime(String eventTime) {
        this.eventTime = eventTime;
    }

    public String getHallName() {
        return hallName;
    }

    public void setHallName(String hallName) {
        this.hallName = hallName;
    }

    public String getEventOrganizer() {
        return eventOrganizer;
    }

    public void setEventOrganizer(String eventOrganizer) {
        this.eventOrganizer = eventOrganizer;
    }

    public String getEventDescription() {
        return eventDescription;
    }

    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }
    
    
    

}