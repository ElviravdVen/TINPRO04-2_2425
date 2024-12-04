/* *****************************
 * Author: Elvira van der Ven  *
 * Date:   29/11/2024          *                                                                                          *
 *******************************/

package les4;

public class App {
    public static void main(String[] args) {

        Student s1 = new Student("Aron");
        s1.setLeeftijd(199);
        System.out.println("Hoi ik ben " + s1.getNaam() +
                " en ik ben " + s1.getLeeftijd() + " jaar oud");

        Student s2 = new Student("Scott", 120);
        System.out.println("Hoi ik ben " + s2.getNaam() +
                " en ik ben " + s2.getLeeftijd() + " jaar oud");
        if(inputValidatie("200")){
            System.out.println("Het is een int! " + Integer.parseInt("200") + 3);
        }

    }
    //is de input valide == is het een int?
    public static boolean inputValidatie(String input){
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            // Sta een minteken toe alleen als het het eerste teken is
            if (i == 0 && c == '-') {
                continue;
            }
            if (!Character.isDigit(c)) {
                return false;
            }
        }
            return true;
    }
}