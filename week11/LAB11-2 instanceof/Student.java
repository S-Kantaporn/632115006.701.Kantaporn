//Name: Kantaporn Sriwichai
//Student ID: 632115006
//LAB11-2

package Lab_equal;

public class Student {
    String name;
    double gpa;
    int age;

    public String name() {
        return name;
    }

    public void name(String name) {
        this.name = name;

    }
    public int age() {
        return age;
    }

    public void age(int age) {
        this.age = age;
    } 

    public double gpa() {
        return gpa;
    }

    public void gpa(double gpa) {
        this.gpa = gpa;
    }

    public Student(String name,int age,double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    public boolean equals_name(Object obj) {
        if(obj == null) {
            return false;
        }
        if(obj == this) {
            return true;
        }
        return this.name() == ((Student) obj).name();
    }

    public boolean equals_age(Object obj) {
        if(obj == null) {
            return false;
        }
        if(obj == this) {
            return true;
        }
        return this.age() == ((Student) obj).age();
    }


    public boolean equal_gpa(Object obj) {
        if(obj == null) {
            return false;
        }
        if(obj == this) {
            return true;
        }
        return this.gpa() == ((Student) obj).gpa();
    }
}


