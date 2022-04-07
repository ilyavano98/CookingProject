package com.example.CookingProject.models;

import javax.persistence.*;

@Entity
@Table(name = "reiting")
public class RetingTable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long position, count_combo;
    private String user_name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPosition() {
        return position;
    }

    public void setPosition(Long position) {
        this.position = position;
    }

    public Long getCount_combo() {
        return count_combo;
    }

    public void setCount_combo(Long count_combo) {
        this.count_combo = count_combo;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }
}
