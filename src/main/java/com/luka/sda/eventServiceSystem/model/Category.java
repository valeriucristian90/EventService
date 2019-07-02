package com.luka.sda.eventServiceSystem.model;

import javax.persistence.*;

@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "category_seq_gen")
    @SequenceGenerator(name = "category_seq_gen",
            sequenceName = "category_seq", allocationSize = 1)
    private long id;

    @Column(name = "social_event")
    private String socialEvent;

    @Column(name = "life_event")
    private String lifeEvent;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSocialEvent() {
        return socialEvent;
    }

    public void setSocialEvent(String socialEvent) {
        this.socialEvent = socialEvent;
    }

    public String getLifeEvent() {
        return lifeEvent;
    }

    public void setLifeEvent(String lifeEvent) {
        this.lifeEvent = lifeEvent;
    }
}
