package com.male.DesignPattern.BuilderPattern.demo4;

public class MyHome {

    private String myDoor;
    private String myGate;
    private String myCourtyard;
    private String myBackyard;

    public String getMyDoor() {
        return myDoor;
    }

    public String getMyGate() {
        return myGate;
    }

    public String getMyCourtyard() {
        return myCourtyard;
    }

    public String getMyBackyard() {
        return myBackyard;
    }

    public void setMyDoor(String myDoor) {
        this.myDoor = myDoor;
    }

    public void setMyGate(String myGate) {
        this.myGate = myGate;
    }

    public void setMyCourtyard(String myCourtyard) {
        this.myCourtyard = myCourtyard;
    }

    public void setMyBackyard(String myBackyard) {
        this.myBackyard = myBackyard;
    }

    @Override
    public String toString() {
        return "MyHome{" +
                "myDoor='" + myDoor + '\'' +
                ", myGate='" + myGate + '\'' +
                ", myCourtyard='" + myCourtyard + '\'' +
                ", myBackyard='" + myBackyard + '\'' +
                '}';
    }
}
