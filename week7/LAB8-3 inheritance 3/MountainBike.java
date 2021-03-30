//Name: Kantaporn Sriwichai
//Student ID: 632115006

package week7;

public class MountainBike extends Bicycle {
    double gear;

    public MountainBike(String nameBicycle) {
        this.nameBicycle = nameBicycle;
    }

    public void gear(double gear) {
        System.out.println("applie the gear: "+ (speed +gear*speedUp) + " km/h");
    }

}
