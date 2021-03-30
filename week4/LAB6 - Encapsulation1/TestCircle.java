package week4;

public class TestCircle {
    public static void main(String[] args) {
        Circle myCircle = new Circle(5.0);
        
        System.out.println("The area of the circle of radius " + myCircle.getRadius() + " is " + myCircle.getArea());
        myCircle.setRadius(myCircle.getRadius() *1.1);
        System.out.println("The area of the circle of radius "+ myCircle.getRadius() + " is " + myCircle.getArea());
        
        //test#1
        System.out.println(myCircle.getRadius());
        //test#2
        System.out.println(Circle.numberOfObjects);
        //test#3
        System.out.println("The number of object is " + myCircle.getNumberOfObjects());
        //test#4
        Circle.setNumberOfObjects(10);
        System.out.println("The number of object is " + myCircle.getNumberOfObjects());
    }
}
