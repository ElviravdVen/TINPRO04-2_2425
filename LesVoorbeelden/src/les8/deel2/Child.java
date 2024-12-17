/* *****************************
 * Author: Elvira van der Ven  *
 * Date:   13/12/2024          *                                                                                          *
 *******************************/

package les8.deel2;

public class Child extends Parent{
    @Override
    public void makeNoice() {
        //make your own noice
        System.out.println("child");
        this.makeNoice();
    }
}