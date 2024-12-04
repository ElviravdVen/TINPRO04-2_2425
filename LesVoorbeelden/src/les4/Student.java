/* *****************************
 * Author: Elvira van der Ven  *
 * Date:   29/11/2024          *                                                                                          *
 *******************************/

package les4;

public class Student {

    static int nummer;
    private String naam;
    private int leeftijd;

    public Student(String naam) {
        this.naam = naam;
    }

    public Student(String naam, int leeftijd) {
        this.naam = naam;
        this.setLeeftijd(leeftijd);
        //this.leeftijd = leeftijd;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public int getLeeftijd() {
        return leeftijd;
    }

    public void setLeeftijd(int leeftijd) {
        if(leeftijd < 100 && leeftijd > 0){
            this.leeftijd = leeftijd;
        }
        else{
            System.out.println("Leeftijd was buiten de range van 0 en 100. Leeftijd is nu gezet op gemiddelde van 19 jaar");
            this.leeftijd = 19;
        }
    }
}