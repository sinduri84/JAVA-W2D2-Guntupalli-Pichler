package Sinduri;

public class Bicycle implements Vehicle, TwoWheeler {

    int speedVehicle;

    @Override
    public void move(int moveUpVehicle) {
        speedVehicle += moveUpVehicle;
    }

    @Override
    public void applyBrakes(int slowDownVehicle) {
        speedVehicle -= slowDownVehicle;
    }

    public void finalSpeed() {
        System.out.println("Speed of Bicycle is " + speedVehicle + " kmph.");
    }
}

