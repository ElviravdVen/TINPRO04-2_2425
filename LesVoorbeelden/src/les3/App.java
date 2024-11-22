/* *****************************
 * Author: Elvira van der Ven  *
 * Date:   22/11/2024          *                                                                                          *
 *******************************/

package les3;

public class App {
    public static void main(String[] args) {
        Docent elf = new Docent("Elvira");
        Snoeppot pot = new Snoeppot();
        Student deSjaak = new Student("Sjaak", elf);
        deSjaak.geefSnoep(pot);
        deSjaak.geefSnoep(pot);

    }
}