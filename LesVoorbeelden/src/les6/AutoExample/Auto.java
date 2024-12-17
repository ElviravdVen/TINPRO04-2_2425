/* *****************************
 * Author: Elvira van der Ven  *
 * Date:   06/12/2024          *                                                                                          *
 *******************************/

package les6.AutoExample;

public class Auto {
    private int prijs;
    private String model;

    public int getPrijs() {
        return prijs;
    }

    public void setPrijs(int prijs) {
        this.prijs = prijs;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "prijs=" + prijs +
                ", model='" + model + '\'' +
                '}';
    }

    public void printInfo(){
        System.out.println(this.toString());
    }
}