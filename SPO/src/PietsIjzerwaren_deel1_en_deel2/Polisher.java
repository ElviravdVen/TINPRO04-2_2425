/* *****************************
 * Author: Elvira van der Ven  *
 * Date:   10/12/2024          *                                                                                          *
 *******************************/

package PietsIjzerwaren_deel1_en_deel2;

public class Polisher extends Machine {
    @Override
    public Material process(Material mat) {
        System.out.print("Polisher: ");
        super.process(mat);
        if(super.getOn()){
            if(mat instanceof Iron){
                System.out.print("processing...\n");
                if(mat.getShape().equalsIgnoreCase("Plaat")){
                    ((Iron) mat).setPolished(true);
                    mat.print();
                } else {
                    System.out.println("Iront is not ready for polisher yet, it must be shaped first.");
                }
            } else if (mat instanceof Wood){
                System.out.print("processing...\n");
                if(((Wood) mat).isChiseled()) {
                    ((Wood) mat).setPolished(true);
                    mat.print();
                }
                else {
                    System.out.println("Wood is not ready for the polisher yet, it must be chiseled first.");
                }
            }
            else{
                System.out.println("Nothing to do for the polisher.");
            }
            System.out.println("Polisher: done.\n");
        }
        return mat;
    }
}