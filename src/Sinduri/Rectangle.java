package Sinduri;

public class Rectangle extends Shape {

    int sideA;
    int sideB;

    public Rectangle(int sideA, int sideB) {
        if((sideA > 0) && (sideB >0)) {
            this.sideA = sideA;
            this.sideB = sideB;
        } else {
            System.out.printf("%nThe sides %d and %d do not form a Rectangle!%n", sideA, sideB);
        }

    }

    public double calculateArea() {
        double areaRectangle = this.sideA * this.sideB;
        return areaRectangle;
    }

    public double calculatePerimeter() {
        double perimeterRectangle = 2*(this.sideA + this.sideB);
        return perimeterRectangle;
    }

    @Override
    void displayResult() {
        if (this.sideA != 0 && this.sideB != 0) {
            if (this.sideA == this.sideB) {
                System.out.printf("%nThe two sides, %d cm and %d cm are equal and form a square.%n" +
                        "The area is %.2f sqcm.%n" +
                        "The perimeter is %.2f cm.%n", this.sideA, this.sideB, calculateArea(), calculatePerimeter());
            } else {
                System.out.printf("%nA rectangle  %d cm, %d cm sides :%n" +
                        "The area is %.2f sqcm.%n" +
                        "The perimeter is %.2f cm.%n", this.sideA, this.sideB, calculateArea(), calculatePerimeter());
            }

        }

    }
}
