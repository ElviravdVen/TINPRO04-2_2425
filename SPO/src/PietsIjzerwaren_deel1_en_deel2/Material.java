package PietsIjzerwaren_deel1_en_deel2;

public class Material {

    private int meltingPoint;
    private Boolean molten;
    private String shape;
    private String color;
    private Boolean toyFinished;

    public Material(int meltingPoint) {
        this.meltingPoint = meltingPoint;
        this.molten = false;
        this.shape = "N/A";
        this.color = "N/A";
        this.toyFinished = false;
    }

    public Material() {
        this.meltingPoint = -1;
        this.molten = false;
        this.shape = "N/A";
        this.color = "N/A";
        this.toyFinished = false;
    }

    public void print(){
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "\tMaterial {" +
                "\n\t\tshape = '" + this.shape + '\'' +
                ",\n\t\tcolor = '" + this.color + '\'';
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public String getShape() {
        return shape;
    }

    public int getMeltingPoint() {
        return meltingPoint;
    }

    public void setMeltingPoint(int meltingPoint) {
        this.meltingPoint = meltingPoint;
    }

    public Boolean isMolten() {
        return molten;
    }

    public Boolean isToyFinished() {
        return toyFinished;
    }

    public void setToyFinished(Boolean toyFinished) {
        this.toyFinished = toyFinished;
    }

    public void setMolten(Boolean molten) {
        this.molten = molten;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String getColor(){
        return this.color;
    }
}
