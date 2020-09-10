package model;

import java.util.Objects;

public class Tires {

    String name;

    public String getName() {
        return name;
    }

    public Tires withName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return "Tires{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tires tires = (Tires) o;
        return Objects.equals(name, tires.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
