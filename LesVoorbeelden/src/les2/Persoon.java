/* *****************************
 * Author: ELvira van der Ven  *
 * Date:   13/11/2023          *                                                                                          *
 *******************************/

package les2;
import java.util.random.RandomGenerator;

public class Persoon {
    private int persoonID;
    private String naam;
    private int leeftijd;

    public Persoon() {
        this.persoonID = RandomGenerator.getDefault().nextInt(0, 999);
        this.naam = "persoon nr " + this.persoonID;
    }

    @Override
    public String toString() {
        return "Persoon {" +
                "\n\tpersoonID=" + persoonID +
                ", \n\tnaam='" + naam + '\'' +
                ", \n\tleeftijd=" + leeftijd +
                "\n}";
    }



    public Drankje haalDrankje(){
        int tijdstip = RandomGenerator.getDefault().nextInt(0,24);
        Drankje drankje = new Drankje();
        // Schrijf hier je code
        //als het tijdstip < 16 uur en tijdstip > 6 uur == als het overdag is
        System.out.println("Tijdstip: " + tijdstip + " uur.");
        //is het tussen 6 en 16 uur?

        if(tijdstip <16 && tijdstip >6)
        {
            //koffie of thee
            drankje.setNaam("koffie");
        } else if(leeftijd < 18){
            drankje.setNaam("Cola");
        }
        else if(leeftijd < 21){
            drankje.setNaam("biertje");
        }
        else{
            drankje.setNaam("Vodka");
        }

        //anders
        //meer keuze

        return drankje;
    }

    public int getPersoonID() {
        return persoonID;
    }

    public void setPersoonID(int persoonID) {
        this.persoonID = persoonID;
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
        this.leeftijd = leeftijd;
    }
}