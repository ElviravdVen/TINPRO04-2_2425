/* *****************************
 * Author: Elvira van der Ven  *
 * Date:   17/12/2024          *                                                                                          *
 *******************************/

package les9;

public class Driehoek extends Figuur{
    protected int schuineZijde;
    @Override
    protected double berekenOppervlakte() {
        return super.berekenOppervlakte() / 2;
    }

    @Override
    protected double berekenOmtrek() {
        return super.berekenOmtrek() / 2 +
                (Math.sqrt(Math.pow(this.breedte, 2) + Math.pow(this.lengte, 2)));
    }
}