/* *****************************
 * Author: Elvira van der Ven  *
 * Date:   17/12/2024          *                                                                                          *
 *******************************/

package les9;

public class Trapezium extends Figuur{
    protected int lengteHoog;
    protected int lengteLaag;

    public Trapezium(int lengteHoog, int lengteLaag) {
        this.lengteHoog = lengteHoog;
        this.lengteLaag = lengteLaag;
        this.lengte = (this.lengteHoog + this.lengteLaag) / 2;
    }
    @Override
    protected double berekenOmtrek() {
        return super.berekenOmtrek();
    }
}