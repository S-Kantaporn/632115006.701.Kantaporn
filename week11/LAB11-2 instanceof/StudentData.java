//Name: Kantaporn Sriwichai
//Student ID: 632115006
//LAB11-2

package Lab_equal;
public class StudentData {
    public static void main(String[] args) {
        //Student object include name,age,gpa
        Student std01 = new Student("Mark",18,4.00);
        Student std02 = new Student("Jane",18,2.20);
        Student std03 = new Student("Peter",19,4.00);
        Student std04 = new Student("Mark",22,1.75);


        //write the equal statement to test the objects below
        //name
        System.out.println("Test name of std01 and std02: " + std01.equals_name(std02));
        System.out.println("Test name of std01 and std03: " + std01.equals_name(std03));
        System.out.println("Test name of std02 and std04: " + std02.equals_name(std04));
        System.out.println("Test name of std01 and std04: " + std01.equals_name(std04));
        System.out.println("------------------------------------------");

        //age
        System.out.println("Test age of std01 and std02: " + std01.equals_age(std02));
        System.out.println("Test age of std03 and std04: " + std03.equals_age(std04));
        System.out.println("Test age of std01 and std03: " + std01.equals_age(std03));
        System.out.println("------------------------------------------");

        //gpa
        System.out.println("Test gpa of std01 and std03: " + std01.equal_gpa(std03));
        System.out.println("Test gpa of std02 and std04: " + std02.equal_gpa(std04));
        System.out.println("Test gpa of std02 and std03: " + std02.equal_gpa(std03));
        System.out.println("------------------------------------------");


    }
}
