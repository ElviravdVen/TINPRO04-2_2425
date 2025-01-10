/* *****************************
 * Author: Elvira van der Ven  *
 * Date:   10/12/2024          *                                                                                          *
 *******************************/

package PietsIjzerwaren_deel1_en_deel2;

public class Chiseler extends Machine{
    @Override
    public Material process(Material mat) {
        System.out.print("Chiseler: ");
        super.process(mat);
        if(super.getOn()){
            if(mat instanceof Wood){
                System.out.println("processing ...");
                if(((Wood) mat).isSawd()) {
                    ((Wood) mat).setChiseled(true);
                    mat.print();
                } else {
                    System.out.println("Wood is not ready for the chiseler yet, it must me sawd first.");
                }
            } else{
                System.out.println("Nothing to do for the sawer.");
            }
            System.out.println("Chiseler: done.\n");
        }
        return mat;
    }
}