package PietsIjzerwaren_deel1_en_deel2;
public class Machine {
    private Boolean on;

    public Machine() {
        this.on = false;
    }

    public Boolean getOn() {
        return on;
    }

    public void setOn(Boolean on) {
        this.on = on;
    }

    public Material process(Material mat){
        if(!getOn()){
            System.out.println("Turn the machine on!");
        }
        return mat;
    }
}