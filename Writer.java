//Name: Kantaporn Sriwichai
//Student ID: 632115006

package week6;

public class Writer extends Person {
    
    public Writer(String name, int age,String genre) {
        this.age = age;
        this.name = name;
        this.genre = genre;
    }

    public void fiction(){
        System.out.println(name+ " is a writer who specializes in writing "+ genre);
    }
}
