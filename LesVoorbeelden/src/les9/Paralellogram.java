/* *****************************
 * Author: Elvira van der Ven  *
 * Date:   17/12/2024          *                                                                                          *
 *******************************/

package les9;

public class Paralellogram extends Figuur{
    protected int pHoogte;

    @Override
    protected double berekenOppervlakte() {
        this.breedte = this.pHoogte;
        return super.berekenOppervlakte();
    }
}