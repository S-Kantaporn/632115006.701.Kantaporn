//Kantaporn Sriwichai
//Student ID: 632115006
//Lab12: Abstract

package Lab12;

public class Circle extends ArbitraryShape {

    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
    
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String toString() {
        return "Circle with radius: " + radius + " area = " +getArea();
    }
}
