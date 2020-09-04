package model;

import java.util.Objects;

public class RetroConsole {

    String formFactor;
    String form;
    String screenDiagonal;
    String screenResolution;
    String architecture;
    String mediaType;
    String memoryCardSlot;
    String preinstallGames;
    String battery;
    String batteryCapacity;
    String length;
    String width;
    String height;
    String weight;
    String anotherInformation;

    public String getFormFactor() {
        return formFactor;
    }

    public RetroConsole withFormFactor(String formFactor) {
        this.formFactor = formFactor;
        return this;
    }

    public String getForm() {
        return form;
    }

    public RetroConsole withForm(String form) {
        this.form = form;
        return this;
    }

    public String getScreenDiagonal() {
        return screenDiagonal;
    }

    public RetroConsole withScreenDiagonal(String screenDiagonal) {
        this.screenDiagonal = screenDiagonal;
        return this;
    }

    public String getScreenResolution() {
        return screenResolution;
    }

    public RetroConsole withScreenResolution(String screenResolution) {
        this.screenResolution = screenResolution;
        return this;
    }

    public String getArchitecture() {
        return architecture;
    }

    public RetroConsole withArchitecture(String architecture) {
        this.architecture = architecture;
        return this;
    }

    public String getMediaType() {
        return mediaType;
    }

    public RetroConsole withMediaType(String mediaType) {
        this.mediaType = mediaType;
        return this;
    }

    public String getMemoryCardSlot() {
        return memoryCardSlot;
    }

    public RetroConsole withMemoryCardSlot(String memoryCardSlot) {
        this.memoryCardSlot = memoryCardSlot;
        return this;
    }

    public String getPreinstallGames() {
        return preinstallGames;
    }

    public RetroConsole withPreinstallGames(String preinstallGames) {
        this.preinstallGames = preinstallGames;
        return this;
    }

    public String getBattery() {
        return battery;
    }

    public RetroConsole withBattery(String battery) {
        this.battery = battery;
        return this;
    }

    public String getBatteryCapacity() {
        return batteryCapacity;
    }

    public RetroConsole withBatteryCapacity(String batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
        return this;
    }

    public String getLength() {
        return length;
    }

    public RetroConsole withLength(String length) {
        this.length = length;
        return this;
    }

    public String getWidth() {
        return width;
    }

    public RetroConsole withWidth(String width) {
        this.width = width;
        return this;
    }

    public String getHeight() {
        return height;
    }

    public RetroConsole withHeight(String height) {
        this.height = height;
        return this;
    }

    public String getWeight() {
        return weight;
    }

    public RetroConsole withWeight(String weight) {
        this.weight = weight;
        return this;
    }

    public String getAnotherInformation() {
        return anotherInformation;
    }

    public RetroConsole withAnotherInformation(String anotherInformation) {
        this.anotherInformation = anotherInformation;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RetroConsole that = (RetroConsole) o;
        return Objects.equals(formFactor, that.formFactor) &&
                Objects.equals(form, that.form) &&
                Objects.equals(screenDiagonal, that.screenDiagonal) &&
                Objects.equals(screenResolution, that.screenResolution) &&
                Objects.equals(architecture, that.architecture) &&
                Objects.equals(mediaType, that.mediaType) &&
                Objects.equals(memoryCardSlot, that.memoryCardSlot) &&
                Objects.equals(preinstallGames, that.preinstallGames) &&
                Objects.equals(battery, that.battery) &&
                Objects.equals(batteryCapacity, that.batteryCapacity) &&
                Objects.equals(length, that.length) &&
                Objects.equals(width, that.width) &&
                Objects.equals(height, that.height) &&
                Objects.equals(weight, that.weight) &&
                Objects.equals(anotherInformation, that.anotherInformation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(formFactor, form, screenDiagonal, screenResolution, architecture, mediaType, memoryCardSlot, preinstallGames, battery, batteryCapacity, length, width, height, weight, anotherInformation);
    }
}
