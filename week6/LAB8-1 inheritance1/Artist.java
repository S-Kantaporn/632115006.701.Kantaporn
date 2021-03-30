//Name: Kantaporn Sriwichai
//Student ID: 632115006

package week6;

public class Artist extends Person {
    
    public Artist(String name, int age, String genre) {
        this.age = age;
        this.name = name;
        this.genre = genre;
    }

    public void playMusic(){
        System.out.println(name+ " is playing "+genre+" music ");
    }
}
