/* *****************************
 * Author: Elvira van der Ven  *
 * Date:   10/12/2024          *                                                                                          *
 *******************************/

package PietsIjzerwaren_deel1_en_deel2;

public class Plastic extends Material {

    public Plastic(int meltingPoint) {
        super(meltingPoint);
    }

    public void print(){
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n\t\tmelting point = " + super.getMeltingPoint() +
                ", \n\t\tmolten = " + super.isMolten() +
                "\n\t\tType - Plastic" +
                "\n\t}";
    }
}