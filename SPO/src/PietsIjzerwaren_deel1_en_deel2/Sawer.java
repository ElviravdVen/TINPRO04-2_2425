/* *****************************
 * Author: Elvira van der Ven  *
 * Date:   10/12/2024          *                                                                                          *
 *******************************/

package PietsIjzerwaren_deel1_en_deel2;

public class Sawer extends Machine{
    @Override
    public Material process(Material mat) {
        System.out.print("Sawer: ");
        super.process(mat);
        if(super.getOn()){
            if(mat instanceof Wood){
                System.out.println("processing ...");
                ((Wood) mat).setSawd(true);
                mat.print();
            } else{
                System.out.println("Nothing to do for the sawer.");
            }
            System.out.println("Sawer: done.\n");
        }
        return mat;
    }
}