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
        System.out.println("\nTriangles - Shape");
        Triangle[] newTriangle = new Triangle[5];
        newTriangle[0] = new Triangle(10, 40, 50);
        newTriangle[1] = new Triangle(20, 50, 60);
        newTriangle[2] = new Triangle(10, 10, 10);
        newTriangle[3] = new Triangle(10, 20, 30);
        newTriangle[4] = new Triangle(13, 53, 60);

        for(int i = 0; i < newTriangle.length; i++) {
            newTriangle[i].displayResult();
        }

        System.out.println("\nRectangles - Shape");
        Rectangle[] newRectangle = new Rectangle[5];
        newRectangle[0] = new Rectangle(20, 0);
        newRectangle[1] = new Rectangle(20, 1900);
        newRectangle[2] = new Rectangle(20, 30);
        newRectangle[3] = new Rectangle(0, 20);
        newRectangle[4] = new Rectangle(15, 15);

        for(int i = 0; i < newRectangle.length; i++) {
            newRectangle[i].displayResult();
        }






    }
}
