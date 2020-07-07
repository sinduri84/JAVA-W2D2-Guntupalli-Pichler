package Sinduri;

public class Triangle extends Shape {

    int sideA;
    int sideB;
    int sideC;

    //Sum of any two sides of a traingle must be greater than the 3rd side.

    public Triangle(int sideA, int sideB, int sideC) {
        if (((sideA + sideB) <= sideC) || ((sideB + sideC) <= sideA) || ((sideC + sideA) <= sideB)) {
            System.out.printf("\nThe sides %d, %d and %d do not form a Triangle.%n", sideA, sideB, sideC);
        } else  {
            this.sideA = sideA;
            this.sideB = sideB;
            this.sideC = sideC;
        }

    }


    public double calculateArea() {
        double perimeterTri = (double) ((this.sideA + this.sideB + this.sideC)/2);
        double areaTriangle = Math.sqrt(perimeterTri * (perimeterTri - this.sideA) * (perimeterTri - this.sideB) * (perimeterTri - this.sideC));
        return areaTriangle;
    }

    public double calculatePerimeter() {
        double perimeterTriangle = (this.sideA + this.sideB + this.sideC)/2;
        return perimeterTriangle;
    }

    @Override
    void displayResult() {
        if (this.sideA != 0 && this.sideB != 0 && this.sideC != 0) {
            System.out.printf("%nA triangle  %d cm, %d cm, %d cm sides :%n" +
                    "The area is %.2f sqcm.%n" +
                    "The perimeter is %.2f cm.%n", this.sideA, this.sideB, this.sideC, calculateArea(), calculatePerimeter());
        }

    }
}
