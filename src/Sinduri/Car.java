package Sinduri;

public class Car implements Vehicle {
    int speedVehicle;

    @Override
    public void move(int moveUpVehicle) {
        speedVehicle += moveUpVehicle;
    }

    @Override
    public void applyBrakes(int slowDownVehicle) {
        speedVehicle -= slowDownVehicle;
    }

    @Override
    public void finalSpeed() {
        System.out.println("Speed of Car is " + speedVehicle + " kmph.");
    }
}