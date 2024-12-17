/* *****************************
 * Author: Elvira van der Ven  *
 * Date:   11/12/2023          *                                                                                          *
 *******************************/

package les9;

public class Cirkel extends Figuur{
    protected double diameter;
    protected double berekenOppervlakte() {
        double radius = this.diameter / 2;
        return (Math.pow(radius, 2) * Math.PI);
    }
    protected double berekenOmtrek() {
        return (this.diameter * Math.PI);
    }
}