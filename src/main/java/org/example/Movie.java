package org.example;

import java.util.List;
import java.util.ArrayList;
import java.util.UUID;

public class Movie {

    private UUID id;
    private String name;
    private List<MovieCategory> categorires;
    private Integer rate;

    public boolean isInCategoryList(List<MovieCategory> mc) {
        for(MovieCategory c: mc) {
            if (categorires.contains(c)) {
                return true;
            }
        }
        return false;
    }


    public Integer getRate() {
        return rate;
    }

    public void setRate(Integer rate) {
        this.rate = rate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("name não pode ser null");
        }
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public List<MovieCategory> getCategorires() {
        return categorires;
    }

    public void setCategorires(List<MovieCategory> categorires) {
        this.categorires = categorires;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", categorires=" + categorires +
                ", rate=" + rate +
                '}';
    }
}
