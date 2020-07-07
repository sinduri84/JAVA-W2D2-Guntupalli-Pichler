package Sinduri;

public class Main {

    public static void main(String[] args) {

        System.out.println("\nBicycle!");

        Bicycle newBicycle = new Bicycle();
        newBicycle.printWheels();
        newBicycle.speedVehicle = 10;
        newBicycle.move(5);
        newBicycle.finalSpeed();
        newBicycle.applyBrakes(10);
        newBicycle.finalSpeed();

        System.out.println("\nCar!");

        Car newCar = new Car();
        newCar.speedVehicle = 50;
        newCar.move(5);
        newCar.finalSpeed();
        newCar.applyBrakes(10);
        newCar.finalSpeed();

        //Shape Abstract Class





    }
}
