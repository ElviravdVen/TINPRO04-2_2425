/* *****************************
 * Author: Elvira van der Ven  *
 * Date:   10/12/2024          *                                                                                          *
 *******************************/

package les7.groep1;

public class Student {
    String naam;
    int lengte;
    int geslacht;
    protected Project project;

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public int getLengte() {
        return lengte;
    }

    public void setLengte(int lengte) {
        this.lengte = lengte;
    }

    public int getGeslacht() {
        return geslacht;
    }

    public void setGeslacht(int geslacht) {
        this.geslacht = geslacht;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }
}