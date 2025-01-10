/* *****************************
 * Author: Elvira van der Ven  *
 * Date:   10/12/2024          *                                                                                          *
 *******************************/

package PietsIjzerwaren_deel1_en_deel2;

public class Wood extends Material{
    private Boolean sawd;
    private Boolean chiseled;
    private Boolean polished;

    public Wood() {
        super();
        this.sawd = false;
        this.chiseled = false;
        this.polished = false;
    }
    public Boolean isSawd() {
        return sawd;
    }
    public Boolean isChiseled() {
        return this.chiseled;
    }
    public Boolean isPolished() {
        return this.polished;
    }

    public void setSawd(Boolean sawd) {
        this.sawd = sawd;
    }

    public void setChiseled(Boolean chiseled) {
        this.chiseled = chiseled;
    }
    public void setPolished(Boolean polished) {
        this.polished = polished;
    }
    public void print(){
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n\t\tType - Wood{" +
                "\n\t\t\tsawd = " + sawd +
                ", \n\t\t\tchiseled = " + chiseled +
                ", \n\t\t\tpolished = " + polished +
                "\n\t}";
    }
}