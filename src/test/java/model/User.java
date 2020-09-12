package model;

import java.util.Objects;

public class User {

    String name;
    String lastname;
    String day;
    String month;
    int year;
    String sex;
    String country;
    String city;

    public String getName() {
        return name;
    }

    public User withName(String name) {
        this.name = name;
        return this;
    }

    public String getLastname() {
        return lastname;
    }

    public User withLastname(String lastname) {
        this.lastname = lastname;
        return this;
    }

    public String getDay() {
        return day;
    }

    public User withDay(String day) {
        this.day = day;
        return this;
    }

    public int getYear() {
        return year;
    }

    public User withYear(int year) {
        this.year = year;
        return this;
    }

    public String getCity() {
        return city;
    }

    public User withCity(String city) {
        this.city = city;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return year == user.year &&
                Objects.equals(name, user.name) &&
                Objects.equals(lastname, user.lastname) &&
                Objects.equals(day, user.day) &&
                Objects.equals(month, user.month) &&
                Objects.equals(sex, user.sex) &&
                Objects.equals(country, user.country) &&
                Objects.equals(city, user.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastname, day, month, year, sex, country, city);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", day='" + day + '\'' +
                ", month='" + month + '\'' +
                ", year=" + year +
                ", sex='" + sex + '\'' +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
