//Kantaporn Sriwichai
//Student ID: 632115006
//Lab12: Abstract

package Lab12;

public class Rectangle extends ArbitraryShape {
    double length;
    double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }

    public double getL() {
        return length;
    }

    public double getW() {
        return width;
    }

    public void setL(double length) {
        this.length = length;
    }

    public void setW(double width) {
        this.width = width;
    }

    public String toString() {
        return "Rectangle with length: " + length + " and width: " + width + " area = " + getArea();
    } 
}
