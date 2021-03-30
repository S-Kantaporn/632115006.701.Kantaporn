//Kantaporn Sriwichai
//632115006


package week7;

public class Main {
    public static void main(String[] args) {
        Dog puppy = new Dog("Lucky","Pooddle","Brown",2);

        System.out.println("My dog");
        puppy.Show_pet_data();
        puppy.Run();
        puppy.Bark();
        puppy.Is_short_hair();
        System.out.println("");

        Fish wangJu = new Fish("Wangju","Nemo","Orange,White and Black",1);

        System.out.println("My Fish");
        wangJu.Show_pet_data();
        wangJu.Swim_fast();
        wangJu.Is_swim_to_the_sea();
        System.out.println("");

        Bird miyu = new Bird("Miyu","Jungle Crow","Black",2);

        System.out.println("My Bird");
        miyu.Show_pet_data();
        miyu.Speak();
        miyu.Check_country();
        miyu.Is_can_fly();
    }
}
