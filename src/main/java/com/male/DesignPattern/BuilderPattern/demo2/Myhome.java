package com.male.DesignPattern.BuilderPattern.demo2;

public class Myhome {

    private String gate;
    private String kitchen;
    private String toilet;
    private String bathroom;

    public String getGate() {
        return gate;
    }

    public void setGate(String gate) {
        this.gate = gate;
    }

    public String getKitchen() {
        return kitchen;
    }

    public void setKitchen(String kitchen) {
        this.kitchen = kitchen;
    }

    public String getToilet() {
        return toilet;
    }

    public void setToilet(String toilet) {
        this.toilet = toilet;
    }

    public String getBathroom() {
        return bathroom;
    }

    public void setBathroom(String bathroom) {
        this.bathroom = bathroom;
    }

    @Override
    public String toString() {
        return "Myhome{" +
                "gate='" + gate + '\'' +
                ", kitchen='" + kitchen + '\'' +
                ", toilet='" + toilet + '\'' +
                ", bathroom='" + bathroom + '\'' +
                '}';
    }
}
