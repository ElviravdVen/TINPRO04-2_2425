/* *****************************
 * Author: Elvira van der Ven  *
 * Date:   13/12/2024          *                                                                                          *
 *******************************/

package les8.deel2;

public class GrandChild extends Child{
    @Override
    public void makeNoice() {
        //make your ouwn noice
        super.makeNoice();
        System.out.println("gc");
        super.makeNoice();
    }
}