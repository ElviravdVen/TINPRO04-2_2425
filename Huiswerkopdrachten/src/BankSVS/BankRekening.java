/* *****************************
 * Author: Elvira van der Ven  *
 * Date:   26/11/2024          *                                                                                          *
 *******************************/

package BankSVS;

public class BankRekening {
    private String rekeningNummer;
    private int saldoCenten;
    private String eigenaarNaam;

    public BankRekening(String rekeningNummer, int saldoCenten, String eigenaarNaam) {
        this.rekeningNummer = rekeningNummer;
        this.saldoCenten = saldoCenten;
        this.eigenaarNaam = eigenaarNaam;
    }

    public BankRekening() {
    }

    public String getRekeningNummer() {
        return rekeningNummer;
    }

    public int getSaldoCenten() {
        return saldoCenten;
    }

    public String getEigenaarNaam() {
        return eigenaarNaam;
    }

    void centenStorten(int bedrag){
        if(bedrag >0){
            this.saldoCenten += bedrag;
        }
    }
    void centenOpnemen(int bedrag){
        if(this.saldoCenten >bedrag) {
            this.saldoCenten -= bedrag;
        }
        else{
            System.out.println("Op te nemen bedrag is hoger dan het beschikbare saldo. U hebt " + saldoCenten + "eurocent op uw rekening.");
        }
    }
    void printRekenigInfo(){
        System.out.println(this.toString());
    }
    void veranderEigenaarNaam(String naam){
        this.eigenaarNaam = naam;
    }

    @Override
    public String toString() {
        return "BankRekening {" +
                "\n\trekeningnummer = '" + rekeningNummer + '\'' +
                ", \n\tsaldo in centen = " + saldoCenten +
                ", \n\teigenaar naam = '" + eigenaarNaam + '\'' +
                "\n}";
    }
}