/* *****************************
 * Author: Elvira van der Ven  *
 * Date:   06/12/2024          *                                                                                          *
 *******************************/

package les6.AutoExample;

public class App {
    public static void main(String[] args) {

        Auto[] container;
        container = new Auto[]{new Mazda(), new BMW(), new Peugeot()};

        for (Auto currentAuto : container){
            currentAuto.printInfo();
        }



    }
}