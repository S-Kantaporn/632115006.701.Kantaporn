//Name: Kantaporn Sriwichai
//Student ID: 632115006

package week6;

public class InheritanceExample {
    public static void main(String[] args) {
        Artist art = new Artist("Ball", 20,"hip hop");
        Chef cooking = new Chef("Lily",24,"meat");
        Writer write = new Writer("Jacob",40,"fiction");
        Engineer chem = new Engineer("Jessy",21,"Chemistry");
        Teacher teach = new Teacher("Josh",48,"Math");
        Interpreter lang = new Interpreter("Pang-ko",48,"Chinese");

        art.introduce();
        art.playMusic();

        System.out.println();

        cooking.introduce();
        cooking.cookRole();

        System.out.println();

        write.introduce();
        write.fiction();

        System.out.println();

        chem.introduce();
        chem.major();

        System.out.println();

        teach.introduce();
        teach.subject();

        System.out.println();

        lang.introduce();
        lang.language();

       
    }
}
