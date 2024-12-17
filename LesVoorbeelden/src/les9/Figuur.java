/* *****************************
 * Author: Elvira van der Ven  *
 * Date:   11/12/2023          *                                                                                          *
 *******************************/

package les9;

public class Figuur {
    protected int lengte;
    protected int breedte;
    protected double oppervlakte;
    protected double omtrek;

    protected double berekenOppervlakte(){
        return (this.lengte * this.breedte);
    }

    protected double berekenOmtrek(){
        return (2 * (this.breedte + this.lengte));
    }
}