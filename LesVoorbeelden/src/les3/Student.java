/* *****************************
 * Author: Elvira van der Ven  *
 * Date:   22/11/2024          *                                                                                          *
 *******************************/

package les3;

public class Student {
    String naam;
    Docent docent;

    public Student(String naam, Docent docent) {
        this.naam = naam;
        this.docent = docent;
    }

    public void geefSnoep(Snoeppot pot) {
        System.out.println("Student " + this.naam + " geeft een snoepje aan " + docent.naam + ".");
        docent.omNomNom(pot.getSnoepje());

    }
}