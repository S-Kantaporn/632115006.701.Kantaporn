//Kantaporn Sriwichai
//632115006
//LAB 9-1 Polymorphism

package Week9;
public class Person {
    String name;
    int bornYear;

    public Person(String name, int bornYear) {
        this.name = name;
        this.bornYear = bornYear;
    }

    public void introduce() {
        System.out.print("My name is " + name + ", ");
        System.out.println("I was born in " + bornYear + ".");
    }

}

class Sheriff extends Person {
    String workState;
    
    public Sheriff(String name, int bornYear, String workState) {
        super(name, bornYear);
        this.workState = workState;
    }
    
    // overiding method
    public void introduce() {
        super.introduce();
        System.out.println("I'm a sheriff and work in " + workState + ".");
    }
    
}

class Teacher extends Person {
    String school;

    public Teacher(String name, int bornYear, String school) {
        super(name, bornYear);
        this.school = school;
    }

    //overiding method
    public void introduce() {
        super.introduce();
        System.out.println("I'm a teacher and tech the students in " + school + "." );
    }

}

class Minister extends Person {
    String country;

    public Minister(String name, int bornYear, String country) {
        super(name, bornYear);
        this.country = country;
    }

    public void introduce() {
        super.introduce();
        System.out.println("I'm prime minister and work in " + country + ".");
    }
}

class Football extends Person {
    String team;

    public Football(String name, int bornYear, String team) {
        super(name, bornYear);
        this.team = team;
    }

    public void introduce() {
        super.introduce();
        System.out.println("I'm a football player and work in " + team + " football club.");
    }
}

class Business extends Person {
    String company;

    public Business(String name, int bornYear, String company) {
        super(name, bornYear);
        this.company = company;
    }

    public void introduce() {
        super.introduce();
        System.out.println("I'm an owner of "+ company + " company.");
    }

}
