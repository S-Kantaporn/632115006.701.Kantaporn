//Name:Kantaporn Sriwichai
//632115006

package week4;

public class Person {
    //person attribute
    private String name;
    private int age;
    private char gender;
    private int salary;
    private double gpa;

    //constructor
    public Person() {
        name = "Unassigned";
        age = 0;
        gender = 'M';
        salary = 0; 
        gpa = 0.00;
    }
    //return name of person
    public String getName() {
        return name;
    }
    //return age of person
    public int getAge() {
        return age;
    }
    //return gender of person
    public char getGender() {
        return gender;
    }
    //return salary of person
    public int getSalary() {
        return salary;
    }
    //return GPA of person
    public double getGpa() {
        return gpa;
    }
   
    //Assign name of person
    public void setName(String personName) {
        name = personName;
    }
    //Assign age of person 
    public void setAge(int personAge) {
        age = personAge;
    }
    //Assign gender of person
    public void setGender(char personGender) {
        gender = personGender;
    }
    //Assign salary of person
    public void setSalary(int personSalary) {
        salary = personSalary;
    }
    //Assign gpa of person 
    public void setGpa(double personGpa) {
        gpa = personGpa;
    }

    //wrote average mothod 

   
}
