//Name: Kantaporn Sriwichai
//Student ID: 632115006

package week7;

public class Bicycle {
    double speed = 10.0;
    double brake = 5.0;
    double speedUp = 5.0;
    String nameBicycle;
    
    public Bicycle() {
        
    }

    public Bicycle(String nameBicycle) {
        this.nameBicycle = nameBicycle;
    }

    public void DisplayName() {
        System.out.println("Name of bicycle: " + nameBicycle);
    }

    public void DisplayCurrentSpeed() {
        System.out.println("The current speed: " + speed +" km/h");
    }

    public void applied_speedUp() {
        System.out.println("applied the speed up: "+ (speed + speedUp) + " km/h");
    }

    public void applied_brake() {
        System.out.println("applied the brake: "+ (speed - brake) + " km/h");
    }

    
}
