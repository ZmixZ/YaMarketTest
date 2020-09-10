package model;


public class NintendoSpecification {
    private String color;
    private String type;
    private String screen;
    private String memory;
    private String capacity;
    private String weight;
    private String controller;
    private String accessories;

    public String getColor() {
        return color;
    }

    public NintendoSpecification withColor(String color) {
        this.color = color;
        return this;
    }

    public String getType() {
        return type;
    }

    public NintendoSpecification withType(String type) {
        this.type = type;
        return this;
    }

    public String getScreen() {
        return screen;
    }

    public NintendoSpecification withScreen(String screen) {
        this.screen = screen;
        return this;
    }

    public String getMemory() {
        return memory;
    }

    public NintendoSpecification withMemory(String memory) {
        this.memory = memory;
        return this;
    }

    public String getCapacity() {
        return capacity;
    }

    public NintendoSpecification withCapacity(String capacity) {
        this.capacity = capacity;
        return this;
    }

    public String getWeight() {
        return weight;
    }

    public NintendoSpecification withWeight(String weight) {
        this.weight = weight;
        return this;
    }

    public String getController() {
        return controller;
    }

    public NintendoSpecification withController(String controller) {
        this.controller = controller;
        return this;
    }

    public String getAccessories() {
        return accessories;
    }

    public NintendoSpecification withAccessories(String accessories) {
        this.accessories = accessories;
        return this;
    }

    @Override
    public String toString() {
        return "NintendoSpecification{" +
                "color='" + color + '\'' +
                ", type='" + type + '\'' +
                ", screen='" + screen + '\'' +
                ", memory='" + memory + '\'' +
                ", capacity='" + capacity + '\'' +
                ", weight='" + weight + '\'' +
                ", controller='" + controller + '\'' +
                ", accessories='" + accessories + '\'' +
                '}';
    }
}
