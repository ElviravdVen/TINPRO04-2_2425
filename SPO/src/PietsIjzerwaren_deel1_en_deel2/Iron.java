/* *****************************
 * Author: Elvira van der Ven  *
 * Date:   10/12/2024          *                                                                                          *
 *******************************/

package PietsIjzerwaren_deel1_en_deel2;

public class Iron extends Material {
    private Boolean rivited;
    private Boolean polished;

    public Iron(int meltingPoint) {
        super(meltingPoint);
        this.rivited = false;
        this.polished = false;
    }

    public void print(){
        System.out.println(this.toString());
    }
    @Override
    public String toString() {
        return super.toString() +
                "\n\t\tmelting point = " + super.getMeltingPoint() +
                ", \n\t\tmolten = " + super.isMolten() +
                "\n\t\tType - Iron" +
                "\n\t\t\trivited = " + rivited +
                ", \n\t\t\tpolished = " + polished +
                "\n\t}";
    }

    public Boolean getRivited() {
        return rivited;
    }

    public void setRivited(Boolean rivited) {
        this.rivited = rivited;
    }

    public Boolean getPolished() {
        return polished;
    }

    public void setPolished(Boolean polished) {
        this.polished = polished;
    }
}