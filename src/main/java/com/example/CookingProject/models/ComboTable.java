package com.example.CookingProject.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ComboTable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String comboText, name_combo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getComboText() {
        return comboText;
    }

    public void setComboText(String comboText) {
        this.comboText = comboText;
    }

    public String getName_combo() {
        return name_combo;
    }

    public void setName_combo(String name_combo) {
        this.name_combo = name_combo;
    }
}
