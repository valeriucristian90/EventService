package com.luka.sda.eventServiceSystem.model;

import javax.persistence.*;

@Entity
public class Service {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "Service_seq_gen")
    @SequenceGenerator(name = "Service_seq_gen",
            sequenceName = "Service_seq", allocationSize = 1)
    private long id;

    @Column(name = "type")
    private String type;

    @Column(name = "details")
    private String details;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }



}
