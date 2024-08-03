package com.satsumaimo.dao;

public class PersonNameDao {
    public String getRandomManName() {
        return "John Doe";
    }

    public String getRandomWomanName() {
        return "Jane Doe";
    }

    public String getManNameFor(String womanName) {
        // perform some logic
        return "Keanu Reeves";
    }

    public String getWomanNameFor(String manName) {
        // perform some logic
        return "Sydney Sweeney";
    }
}
