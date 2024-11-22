/* *****************************
 * Author: Elvira van der Ven  *
 * Date:   22/11/2024          *                                                                                          *
 *******************************/

package les3;

public class Docent {
    String naam;
    int hoeveelheidSnoep;

    public Docent(String naam) {
        this.naam = naam;
        this.hoeveelheidSnoep = 0;
    }
    public void omNomNom(String snoep){
            System.out.println("Lekker, een " + snoep + "!");
            this.hoeveelheidSnoep++;

    }
}