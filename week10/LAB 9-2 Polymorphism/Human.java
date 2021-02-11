//Kantaporn Sriwichai
//Student ID: 632115006
//Sec 702 //LAB9.2

package Week10;

public class Human {
    public void hit(Animal animal) {
        System.out.println(animal.roar());
    }

    public static void main(String[] args) {
        Animal dog = new Dog(); //Question1
        Human human = new Human();
        System.out.println("The first calling hit(Animal)");
        human.hit(dog); //Question2

        dog = new Cat();
        System.out.println("The second calling hit(Animal)");
        human.hit(dog); //Question3

        dog = new Fish();
        System.out.println("The third calling hit(Animal)");
        human.hit(dog);
    }
}
