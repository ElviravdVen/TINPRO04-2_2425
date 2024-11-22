/* *****************************
 * Author: ELvira van der Ven  *
 * Date:   13/11/2023          *                                                                                          *
 *******************************/

package les2;

import java.util.random.RandomGenerator;

public class App {
    public static void main(String[] args) {
        /*
        Persoon persoon1 = new Persoon();
        persoon1.setLeeftijd(RandomGenerator.getDefault().nextInt(5, 99));
        System.out.println(persoon1.toString());

        System.out.println("Persoon haalt drankje op: ");
        System.out.println(persoon1.haalDrankje().toString());
         */

        Gebouw flat = new Gebouw();
        flat.aantalVerdiepingen = 7;
        flat.kleur="Roze";
        flat.typeDak = "Plat";

        System.out.println(flat.toString());

        Gebouw kantoorgebouw = new Gebouw();
        kantoorgebouw.aantalVerdiepingen = 2;
        kantoorgebouw.kleur="Grijz";
        kantoorgebouw.typeDak = "Puntdak";
        System.out.println(kantoorgebouw.toString());


    }
}