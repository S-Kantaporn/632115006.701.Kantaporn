//Name: Kantaporn Sriwichai
//Student ID: 632115006

package week6;

public class Engineer extends Person {
    
    public Engineer(String name, int age,String genre) {
        this.age = age;
        this.name = name;
        this.genre = genre;
    }

    public void major(){
        System.out.println(name+ " is an engineering student who majoring in "+ genre );
    }
}
