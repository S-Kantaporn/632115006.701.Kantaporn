//Kantaporn Sriwichai
//Student ID: 632115006
//Lab12: Abstract

package Lab12;

public class Triangle extends ArbitraryShape {
    double base;
    double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getArea() {
        return 0.5 * base * height;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String toString() {
        return "Triangle with base: " + base + " and height: " + height + " area = " + getArea();
    }
}
