package com.luka.sda.eventServiceSystem.dto;

public class CategoryDto {

    private long id;
    private String socialEvent;
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
