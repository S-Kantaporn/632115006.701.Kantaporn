//Name: Kantaporn Sriwichai
//Student ID: 632115006

package week6;

public class Teacher extends Person {
    
    public Teacher(String name, int age,String genre) {
        this.age = age;
        this.name = name;
        this.genre = genre;
    }

    public void subject(){
        System.out.println(name+ " is teaching "+ genre + " subject");
    }
}
