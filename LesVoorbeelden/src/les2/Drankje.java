/* *****************************
 * Author: ELvira van der Ven  *
 * Date:   13/11/2023          *                                                                                          *
 *******************************/

package les2;

public class Drankje {
    public Drankje() {
        this.naam = "geen drankje nog :(";
    }

    private String naam;

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String toString() {
        return "Drankje: " + naam;
    }
}