//Kantaporn Sriwichai
//632115006

public class Main {
    public static void main(String[] args) {
        Circle[] circle;
        circle = new Circle[10];

        //create the circle1
        for (int i=1; i<=6; i++) {
            circle[i] = new Circle();
        }

        //assign the data for circle1
        circle[1].setRadius(2.0);

        //assign the data for circle1
        circle[2].setRadius(3.0);
        
        //assign the data for circle1
        circle[3].setRadius(1.0);
        
        //assign the data for circle1
        circle[4].setRadius(-1.0);

        //check cir1 and 2
        circle[5].setOrigin(0.0,0.0,1.0,2.0);
        circle[5].sumOfRad(2.0,3.0);
        
        //check cir1 and 3
        circle[6].setOrigin(0.0,0.0,3.0,5.0);
        circle[6].sumOfRad(2.0,1.0);

        //show the output
        for (int i=1; i<=4; i++){ 
            System.out.println("Area of cir" + i +" = "+ circle[i].getArea());
            System.out.println("Circumferrence of cir" + i +" = "+ circle[i].getCircumferrence());
        }

        System.out.print("Is circle 1 intersec circle 2: ");
        circle[5].display();

        System.out.print("Is circle 1 intersec circle 3: ");
        circle[6].display();

    }
   
}
