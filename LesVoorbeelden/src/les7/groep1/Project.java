/* *****************************
 * Author: Elvira van der Ven  *
 * Date:   10/12/2024          *                                                                                          *
 *******************************/

package les7.groep1;

public class Project {

    protected Student eigenaar;

    String getEigenaastNaam(){
       return this.eigenaar.naam;
    }

    @Override
    public String toString() {
        return "Project{" +
                "eigenaar=" + eigenaar +
                '}';
    }
}