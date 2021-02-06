//Kantaporn Sriwichai
//632115006
//LAB 9-1 Polymorphism

package Week9;

public class Shape {
    //overidng toString()
    public String toString() {
        return "This is a shape";
    }

    public static void main(String[] args) {
        Shape p, p1, p2;
        p = new Shape();
        p1 = new Rectangle(2,3);
        p2 = new Cube(2, 2, 2);

        System.out.println(p.toString());
        System.out.println(p1.toString());
        System.out.println(p2.toString());

    }
}

class Rectangle extends Shape {
    private int width;
    private int height;
    
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
        
    }
    //overidng toString()
    public String toString() {
        return "This is a rectangle with width as " + width + " and height as " + height + ".";
    }
}
class Cube extends Rectangle {
    private int length;

    public Cube(int width, int height, int length) {
        super(width, height);
        this.length = length;
    }
    //overidng toString()
    public String toString() {
        return "This is a cube with the side of " + length;
    }
}

