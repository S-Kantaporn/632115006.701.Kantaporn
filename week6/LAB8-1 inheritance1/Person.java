//Name: Kantaporn Sriwichai
//Student ID: 632115006

package week6;

public class Person {
    String name;
    int age;
    String genre;

    public Person() {

    }

    public Person(String name, int age, String genre) {
        this.name = name;
        this.age = age;
        this.genre = genre;
    }

    public void introduce() {
        System.out.println("My name is "+ name);
        System.out.println("I'm " + age + " years old");
        System.out.println("genre: " + genre);
    }
}