//Kantaporn Sriwichai
//632115006


package week7;

public class Pet {
    String name;
    String species;
    String color;
    int age;

    public Pet() {

    }

    public Pet(String name,String species,String color, int age) {
        this.name = name;
        this.age = age;
        this.species = species;
        this.color = color;

    }

    public void Show_pet_data() {
        System.out.println("Name: " + name + " " + "species: " + species + " " + "Color: " + color + " " + "Age: " + age);
    }
}