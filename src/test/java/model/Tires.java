package model;

public class Tires {

    String name;

    public String getName() {
        return name;
    }

    public Tires withName(String name) {
        this.name = name;
        return this;
    }
}