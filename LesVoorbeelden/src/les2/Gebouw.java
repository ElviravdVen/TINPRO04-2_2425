/* *****************************
 * Author: Elvira van der Ven  *
 * Date:   22/11/2024          *                                                                                          *
 *******************************/

package les2;

public class Gebouw {
    public int aantalVerdiepingen;
    public String kleur;
    public String typeDak;

    public int pasGebouwKleurAan(String kleur){
        //to do
        return 0;
    }

    @Override
    public String toString() {
        return "Gebouw{" +
                "\n\taantalVerdiepingen=" + aantalVerdiepingen +
                ", \n\tkleur='" + kleur + '\'' +
                ", \n\ttypeDak='" + typeDak + '\'' +
                '}';
    }
}