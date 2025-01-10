/* *****************************
 * Author: Elvira van der Ven  *
 * Date:   10/12/2024          *                                                                                          *
 *******************************/

package PietsIjzerwaren_deel1_en_deel2;

public class Rivetter extends Machine {
    @Override
    public Material process(Material mat) {
        System.out.print("Rivitter: ");
        super.process(mat);
        if(super.getOn()){
            if(mat instanceof Iron){
                System.out.println("processing...");
                if(mat.getShape().equalsIgnoreCase("Plaat")){
                    ((Iron) mat).setRivited(true);
                    mat.setToyFinished(true);
                    mat.print();
                } else {
                    System.out.println("Iron is not ready for the rivitter yet, it must me shaped to a plaat first.");
                }
            } else{
                System.out.println("Nothing to do for the rivitted.");
            }
            System.out.println("Rivitter: done.\n");
        }
        return mat;
    }
}