/* *****************************
 * Author: Elvira van der Ven  *
 * Date:   11/12/2023          *                                                                                          *
 *******************************/

package les9;

public class Rekenmachine {

    public double telOp(int a, int b){
        return (a+b);
    }

    public double telOp(String a, int b){
        int aa = Integer.parseInt(a);
        return (aa+b);
    }
    public double telOp(double a, int b){
        return (a+b);
    }

    public double telOp(double a, double b){
        return (a+b);
    }
}