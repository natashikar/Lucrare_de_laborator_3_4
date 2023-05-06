package dev.hacker.avesome.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Book {
    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String gen_produs;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public String getGen_produs() {
        return gen_produs;
    }
    public void setName(String name) {
        this.name = name;
    }
}

