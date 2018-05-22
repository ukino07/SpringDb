package com.research.lunchSelector.model;

import java.time.LocalDateTime;

/**
 * Created by u_kino07 on 2018. 5. 22..
 */
public class Restaurant {
    private int id;
    private String name;
    private LocalDateTime openAt;
    private LocalDateTime closeAt;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getOpenAt() {
        return openAt;
    }

    public void setOpenAt(LocalDateTime openAt) {
        this.openAt = openAt;
    }

    public LocalDateTime getCloseAt() {
        return closeAt;
    }

    public void setCloseAt(LocalDateTime closeAt) {
        this.closeAt = closeAt;
    }
}
