//Kantaporn Sriwichai
//Student ID: 632115006
//Lab12: Abstract

package Lab12;

public class MainArbitrary {
    public static void main(String[] args) {
        ArbitraryShape circle = new Circle(1.0);
        ArbitraryShape rectangle = new Rectangle(2.0,4.0);
        ArbitraryShape triangle = new Triangle(4.0,5.0);

        System.out.println(circle.toString());
        System.out.println(rectangle.toString());
        System.out.println(triangle.toString());
        
    }
}
