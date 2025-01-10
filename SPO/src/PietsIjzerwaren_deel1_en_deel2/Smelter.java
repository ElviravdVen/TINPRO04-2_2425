/* *****************************
 * Author: Elvira van der Ven  *
 * Date:   10/12/2024          *                                                                                          *
 *******************************/

package PietsIjzerwaren_deel1_en_deel2;

public class Smelter extends Machine {
    private int temperature;
    public Smelter(int i) {
        super();
        this.temperature = i;
    }
    public Material process(Material mat){
        System.out.print("Smelter: ");
        super.process(mat);
        if (super.getOn()){
            if(!(mat instanceof Wood)) {
                System.out.print("processing...\n");
                if (this.temperature > mat.getMeltingPoint()) {
                    mat.setMolten(true);
                    mat.print();
                    System.out.println("Smelter: done.\n");
                } else {
                    System.out.println("Temperature to low, must be at least " + mat.getMeltingPoint() + " degree.");
                }
            }
            else {
                System.out.println("Nothing to do for the smelter.");
            }
        }
        return mat;
    }
}