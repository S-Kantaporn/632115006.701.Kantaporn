//Kantaporn Sriwichai
//632115006


package week7;

public class Fish extends Pet {
    String size = "small";
    String water = "fresh water";
    int swim_speed = 23; //centimeters per second //the maximum of nemo

    public Fish(String name,String species,String color, int age) {
        this.name = name;
        this.age = age;
        this.species = species;
        this.color = color;

    }

    public void Is_swim_to_the_sea() {
        if(water == "salt water") {
            System.out.println("Swim to the sea: true");
        } else {
            System.out.println("Swim to the sea: false");
        }
    }

    public void Swim_fast() {
        System.out.println(size+ " The maximum speed that "+name +" can swim is "+ swim_speed +"cm/second!!! ");
    }

}
