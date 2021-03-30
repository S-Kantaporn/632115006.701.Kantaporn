//Name: Kantaporn Sriwichai
//Student ID: 632115006

package week6;

public class Chef extends Person {
    
    public Chef(String name, int age,String genre) {
        this.age = age;
        this.name = name;
        this.genre = genre;
    }

    public void cookRole(){
        System.out.println(name+ " is cooking " + genre+ " dishes  ");
    }
}
