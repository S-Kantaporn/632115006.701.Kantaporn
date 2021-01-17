//Kantaporn Sriwichai
//632115006


package week7;

public class Dog extends Pet {
    String hair  ="short";
    String size = "small";

    public Dog(String name,String species,String color, int age) {
        this.name = name;
        this.age = age;
        this.species = species;
        this.color = color;

    }

    public void Run() {
        System.out.println("My dog " + name + " is run to the jungle");

    }
 
    public void Bark() {
        System.out.println(size +" bark Box Box!!");
    }

    public void Is_short_hair() {
        if(hair == "short") {
            System.out.println("Short hair: true");
        } else {
            System.out.println("short hair: false");
        }
    }
}
