package week4;
public class MainPerson {
    public static void main(String[] args) {
        //declar the person array
        Person[]  person;
        person = new Person[10];

        //create the person[0] object
        person[0] = new Person();
        person[1] = new Person();
        person[2] = new Person();
        person[3] = new Person();
        person[4] = new Person();

        //Assign the data for person[0]
        person[0].setName("Peter Parker");
        person[0].setAge(20);
        person[0].setGender('M');
        person[0].setSalary(10000);
        person[0].setGpa(2.30);

        //Assign the data for person[1]
        person[1].setName("Mary Jane");
        person[1].setAge(19);
        person[1].setGender('F');
        person[1].setSalary(13000);
        person[1].setGpa(3.71);

        //Assign the data for person[2]
        person[2].setName("Miles Morales");
        person[2].setAge(16);
        person[2].setGender('M');
        person[2].setSalary(4000);
        person[2].setGpa(2.57);

        //Assign the data for person[3]
        person[3].setName("Tony Stark");
        person[3].setAge(46);
        person[3].setGender('M');
        person[3].setSalary(7000000);
        person[3].setGpa(4.00);

        //Assign the data for person[3]
        person[4].setName("Kantaporn Sriwichai");
        person[4].setAge(19);
        person[4].setGender('F');
        person[4].setSalary(1000);
        person[4].setGpa(3.00);

        //show person[0] data
        for(int i=0; i<5; i++) {
            System.out.println("Name of person " + i + " is " + person[i].getName());
            System.out.println("Age of person " + i + " is " + person[i].getAge());
            System.out.println("Gender of person " + i + " is " + person[i].getGender());
            System.out.println("Salary of person " + i + " is " + person[i].getSalary());
            System.out.println("GPA of person " + i + " is " + person[i].getGpa());
            System.out.println("-----------------------------------------------");
        }
        
        //create array to store score for 100 people by using math random and then find show and find the average by using method
        

        

    }
}
