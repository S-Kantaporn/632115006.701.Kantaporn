//Kantaporn Sriwichai
//632115006
//LAB 9-1 Polymorphism

package Week9;

public class Student {
    private String firstname = "Hello";
    private String lastname = "World";


    public Student(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }
    //overidng toString()
    public String toString() {
        return "My first name " + firstname + " last name " + lastname;
    }

    public static void main(String[] args) {
        Student p = new Student("Kantaporn", "Sriwichai");
        System.out.println(p.toString());
    }
}
