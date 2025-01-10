/* *****************************
 * Author: Elvira van der Ven  *
 * Date:   10/12/2024          *                                                                                          *
 *******************************/

package PietsIjzerwaren_deel1_en_deel2;

public class Shaper extends Machine {
    @Override
    public Material process(Material mat) {
        System.out.print("Shaper: ");
        super.process(mat);
        if(super.getOn()) {
            if(!(mat instanceof Wood)){
                if (mat.isMolten()) {
                    System.out.print("processing...\n");
                    if (mat instanceof Iron) {
                        mat.setShape("Plaat");
                    } else if (mat instanceof Plastic) {
                        mat.setShape("Kubus");
                    } else if (mat instanceof Rubber){
                        mat.setShape("Bal");
                    }
                    mat.print();
                } else {
                    System.out.println("Material is not ready for the shaper, it must be molted first.");
                }
                System.out.println("Shaper: done.\n");
            }
            else {
                System.out.println("Nothing to do for the shaper.");
            }
        }
        return mat;
    }
}