/* *****************************
 * Author: Elvira van der Ven  *
 * Date:   10/12/2024          *                                                                                          *
 *******************************/

package PietsIjzerwaren_deel1_en_deel2;

public class Painter extends Machine {
    private String paintColor;
    public Painter(String color) {
        super();
        this.paintColor = color;
    }

    @Override
    public Material process(Material mat) {
        System.out.print("Painter: ");
        super.process(mat);
        if (super.getOn()){
            if(!(mat instanceof Iron)) {
                if(mat.getShape().equalsIgnoreCase("Kubus")
                        || mat.getShape().equalsIgnoreCase("Bal")
                        || ((Wood)mat).isPolished()){
                    mat.setColor("blue");
                    mat.setToyFinished(true);
                    System.out.println("Painter: done.\n");
                } else {
                    System.out.println("Material is not ready for the painter yet, it must me shaped (plastic to a kubus, rubber to a bal) or polished (wood) first.");
                }
            } else {
                System.out.println("Nothing to do for the painter.");
            }
        }
        return mat;
    }
}