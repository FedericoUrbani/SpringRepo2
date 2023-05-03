package com.develhope.springrepo.entites;

import jakarta.persistence.*;

import java.time.Year;


@Entity
@Table
public class ProgrammingLanguage {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


    @Column(nullable = false)
    private String  name;


    @Column
    private Year firstAppearence;

    @Column(nullable = false)
    private String currentPrice;

    public ProgrammingLanguage(){

    }
    public ProgrammingLanguage(long id, String name, Year firstAppearence, String currentPrice) {
        this.id = id;
        this.name = name;
        this.firstAppearence = firstAppearence;
        this.currentPrice = currentPrice;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Year getFirstAppearence() {
        return firstAppearence;
    }

    public void setFirstAppearence(Year firstAppearence) {
        this.firstAppearence = firstAppearence;
    }

    public String getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(String currentPrice) {
        this.currentPrice = currentPrice;
    }
}
