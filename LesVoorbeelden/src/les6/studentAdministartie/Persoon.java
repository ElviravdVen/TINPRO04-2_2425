/* *****************************
 * Author: Elvira van der Ven  *
 * Date:   06/12/2024          *                                                                                          *
 *******************************/

package les6.studentAdministartie;

public class Persoon {
    private String voornaam;
    private String  achternaam;

    public Persoon(){
    }

    public String getAchternaam(){
        return this.achternaam;
    }

    public void setPersoonsNaam(String voornaam, String achternaam){
        this.voornaam = voornaam;
        this.achternaam = achternaam;

    }
    public String getVoornaam(){
        return this.voornaam;
    }
}