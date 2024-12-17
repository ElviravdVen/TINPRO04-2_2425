/* *****************************
 * Author: Elvira van der Ven  *
 * Date:   17/12/2024          *                                                                                          *
 *******************************/

package les9;

public class Trapezium extends Figuur{
    protected int lengteHoog;
    protected int lengteLaag;
    @Override
    protected double berekenOppervlakte() {
        this.lengte = (lengteHoog + lengteHoog)/2;
        return super.berekenOppervlakte();
    }

    @Override
    protected double berekenOmtrek() {
        return super.berekenOmtrek();
    }
}