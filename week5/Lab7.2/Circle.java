//Kantaporn Sriwichai
//632115006

public class Circle {
    // Circle attribute
    private double radius;
    private double origin;
    private double area;
    private double circumferrence;
    private double sumOfRad;
    private double difOfRad;

    public Circle() {
        radius = 0.0;
        origin = 0.0;
        area = 0.0;
        circumferrence = 0.0;
    }

    public double getRadius() {
        return radius;
    }

    public double getOrigin() {
        return origin;
    }

    public double  getArea() {
        if (radius <0) {
            radius = 0;
        } 
        return area =  radius * radius * Math.PI;
    }

    public double getCircumferrence() {
        if (radius <0) {
            radius = 0;
        } 
        return circumferrence = 2 * radius * Math.PI;
    }
  
    //assign
    public void setRadius(double newRadius) {
        radius = newRadius;
    }

    public void setOrigin(double x1,double y1, double x2,double y2) {
        origin = Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
    }

    public void sumOfRad(double r1, double r2) {
       sumOfRad = r1+r2;
       difOfRad = r1-r2;
    } 

    public void display() {
        if (difOfRad< origin && origin < sumOfRad) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    } 	
}
