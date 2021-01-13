//Name: Kantaporn Sriwichai
//Student ID: 632115006

package week6;

public class Interpreter extends Person {
    
    public Interpreter(String name, int age,String genre) {
        this.age = age;
        this.name = name;
        this.genre = genre;
    }

    public void language(){
        System.out.println(name+ " is good at "+ genre + " language");
    }
}
