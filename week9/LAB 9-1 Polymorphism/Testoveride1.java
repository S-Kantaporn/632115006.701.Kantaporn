//Kantaporn Sriwichai
//632115006
//LAB 9-1 Polymorphism

package Week9;
public class Testoveride1 {
    public static void main(String[] args) {
        Person person1, person2, person3, person4, person5, person6;
        person1 = new Person("Mark", 2001);
        person2 = new Sheriff("Mateo", 1988, "California");
        person3 = new Teacher("Ball", 1977, "CMU");
        person4 = new Minister("Tu", 1954, "Thailand");
        person5 = new Football("Messi", 1987, "Barcelona");
        person6 = new Business("Elon Musk", 1995, "Tesla and SpaceX");

        person1.introduce();
        System.out.println();

        person2.introduce();
        System.out.println();

        person3.introduce();
        System.out.println();

        person4.introduce();
        System.out.println();
        
        person5.introduce();
        System.out.println();
        
        person6.introduce();
    }
}

