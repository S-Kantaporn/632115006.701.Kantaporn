//Kantaporn Sriwichai
//632115006


package week7;

public class Bird extends Pet {
    String country = "Thailand";
    String can_fly = "Yes";
    String size = "medium";

    public Bird(String name,String species,String color, int age) {
        this.name = name;
        this.age = age;
        this.species = species;
        this.color = color;

    }
    public void Speak() {
        System.out.println(name + "can speak the easy word because I teach her");

    }

    public void Check_country() {
        if (country == "Thailand") {
            System.out.println(size + " " + name + " come from Thailand");
        } else {
            System.out.println(size + " " + name + " isn't come from Thailand");
        }
        
    }

    public void Is_can_fly() {
        if(can_fly == "Yes") {
            System.out.println("Can fly: true");
        } else {
            System.out.println("Can fly: false");
        }
    }
}
