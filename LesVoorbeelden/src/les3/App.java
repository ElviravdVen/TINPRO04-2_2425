/* *****************************
 * Author: Elvira van der Ven  *
 * Date:   22/11/2024          *                                                                                          *
 *******************************/

package les3;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String koekje = "koekje";
        Scanner input = new Scanner(System.in);
        Snoeppot pot = new Snoeppot();
        System.out.println("Voer de naam van de  te voeren docent in:");
        Docent docent = new Docent(input.nextLine());
        System.out.println("Docent is " + docent.naam);
        Student s1 = new Student();
        Student[] studenten = {
                new Student("Scott", docent),
                new Student("Berkin", docent),
                new Student("Hai Lam", docent),
                new Student("Noah", docent),
        };
        StudentenDieDeSjaakZijn ti1a = new StudentenDieDeSjaakZijn(studenten);
//elv ira



        while(pot.aantalSnoepjes > 0) {
            System.out.println("Voer de sjaak in:");
            Student deSjaak = new Student(input.nextLine(), docent);
            deSjaak.geefSnoep(pot);
        }

        System.out.println("Snoep is op");
    }
}