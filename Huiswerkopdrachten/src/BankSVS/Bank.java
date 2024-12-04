/* *****************************
 * Author: Elvira van der Ven  *
 * Date:   26/11/2024          *                                                                                          *
 *******************************/

package BankSVS;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        /*
         * Deel 1
         */
        //Maak 3 Bankrekening objecten aan
//        BankRekening rekeningPrive = new BankRekening();
//        BankRekening rekeningWerk = new BankRekening();
//        BankRekening rekeningGezamenlijk = new BankRekening();
//
//        //Print van alle drie rekeningen de informatie uit de fields
//        rekeningPrive.printRekenigInfo();
//        rekeningWerk.printRekenigInfo();
//        rekeningGezamenlijk.printRekenigInfo();
//
//        //Geef alle drie bankrekeningen een andere eigenaarNaam
//        rekeningPrive.veranderEigenaarNaam("Elvira");
//        rekeningWerk.veranderEigenaarNaam("Diederik");
//        rekeningGezamenlijk.veranderEigenaarNaam("TI");
//
//        //Stort 100 euro op de 1 rekening, 200 op de 2 en 3000 op de 3 rekening
//        rekeningPrive.centenStorten(10000);
//        rekeningWerk.centenStorten(20000);
//        rekeningGezamenlijk.centenStorten(300000);
//
//        //Neem 10 euro op van de 3 rekening, 20 van de 2 en 30 van de 1 rekening
//        rekeningPrive.centenOpnemen(3000);
//        rekeningWerk.centenOpnemen(2000);
//        rekeningGezamenlijk.centenOpnemen(1000);
//
//        //Print ten slotte opnieuw van alle drie rekeningen de informatie
//        rekeningPrive.printRekenigInfo();
//        rekeningWerk.printRekenigInfo();
//        rekeningGezamenlijk.printRekenigInfo();

        /*
         * Optioneel deel 1: Kan je de code nog korter / efficiënter schrijven?
         */

//        BankRekening[] rekeningen = new BankRekening[]{new BankRekening(), new BankRekening(), new BankRekening()};
//        String[] namen = {"Elvira", "Diederik", "TI"};
//        int[] teStorten = {100, 200, 3000};
//        int[] opTeNemen = {30, 20, 10};
//
//        // //Print van alle drie rekeningen de informatie uit de fields
//        for(BankRekening rekening : rekeningen){
//            rekening.printRekenigInfo();
//        }
//
//        for(int i = 0; i < rekeningen.length; i++){
//            //Geef alle drie bankrekeningen een andere eigenaarNaam
//            rekeningen[i].veranderEigenaarNaam(namen[i]);
//            //Stort geld
//            rekeningen[i].centenStorten(teStorten[i]*100);
//            //Neem geld op
//            rekeningen[i].centenOpnemen(opTeNemen[i]*100);
//            //Print ten slotte opnieuw de informatie
//            rekeningen[i].printRekenigInfo();
//        }

        /*
         * Deel 2
         */
//
//        BankRekening rekeningPrive = new BankRekening("12345", 100, "Elvira");
//        BankRekening rekeningWerk = new BankRekening("34567", 200, "Diederik");
//        BankRekening rekeningGezamenlijk = new BankRekening("56789",3000, "TI");
//
//        BankRekening[] rekeningen = new BankRekening[3];
//        rekeningen[0] = rekeningPrive;
//        rekeningen[1] = rekeningWerk;
//        rekeningen[2] = rekeningGezamenlijk;

        /*
         * Bovenstaande efficienter:
         */
        String[] rekeningNummers = {"12345", "34567", "56789"};
        int[] teStorten = {100, 200, 3000};
        String[] namen = {"Elvira", "Diederik", "TI"};

        BankRekening[] rekeningen = new BankRekening[3];
        for(int i = 0; i < rekeningen.length; i++){
            rekeningen[i] = new BankRekening(rekeningNummers[i], teStorten[i], namen[i]);
        }


        /*
         * Keuzemenu van deel 2
         */
        String rekeningNummer = "";
        int keuzemenu;
        int indexRekening = -1;
        Scanner scanner = new Scanner(System.in);
        boolean isGeldig = false;
        //rekening controlleren
        while(!isGeldig){
            System.out.println("Wat is uw rekeningnummer?");
            rekeningNummer = scanner.nextLine();
            for(int i = 0; i <rekeningen.length; i++){
                if(rekeningen[i].getRekeningNummer().equalsIgnoreCase(rekeningNummer)){
                    isGeldig = true;
                    indexRekening = i;
                    break;
                }
            }
        }
        System.out.print("Rekening gevonden. ");
        boolean isRunning = true;
        while(isRunning){
            System.out.println("Kies uit deze vier opties: \n" +
                    "\t1. Stort 10 euro.\n" +
                    "\t2. Neem 10 euro op.\n" +
                    "\t3. Print rekeninginfo.\n" +
                    "\t4. Stoppen.\n" +
                    "Voer nu de cijfer van uw keuze in.");
            keuzemenu = Integer.parseInt(scanner.nextLine());
            switch (keuzemenu){
                case 1:
                    rekeningen[indexRekening].centenStorten(1000);
                    break;
                case 2:
                    rekeningen[indexRekening].centenOpnemen(1000);
                    break;
                case 3:
                    rekeningen[indexRekening].printRekenigInfo();
                    break;
                case 4:
                    System.out.println("U hebt gekozen om te stoppen. Programma wordt nu afgesloten.");
                    isRunning = false;
                    return;
                default:
                    System.out.println("Ongeldige input. Kies aub een cijfer 1 t/m 4 en druk op enter.");
            }
        }



    }
}