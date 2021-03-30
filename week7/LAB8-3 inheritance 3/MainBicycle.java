//Name: Kantaporn Sriwichai
//Student ID: 632115006

package week7;

public class MainBicycle {
    public static void main(String[] args) {
        Bicycle number1 = new Bicycle("Normal Bike");
        number1.DisplayName();
        number1.DisplayCurrentSpeed();
        number1.applied_speedUp();
        number1.applied_brake();

        System.out.println();

        MountainBike mt_bike = new MountainBike("Mountain Bike");
        mt_bike.DisplayName();
        mt_bike.DisplayCurrentSpeed();
        mt_bike.gear(2);
        mt_bike.applied_brake();

    }
}
