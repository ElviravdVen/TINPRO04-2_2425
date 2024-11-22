/* *****************************
 * Author: Elvira van der Ven  *
 * Date:   22/11/2024          *                                                                                          *
 *******************************/

package les3;

import java.util.Arrays;

public class Snoeppot {
    public String[] snoepjes = {
            "Lolly",
            "Drop",
            "Winegum",
            "Spekkie",
            "Toffee",
            "Mars",
            "Snickers",
            "Twix",
            "KitKat",
            "MilkyWay",
            "Bounty",
            "Skittles",
            "Mentos",
            "Chocoladereep",
            "Smarties",
            "Toblerone",
            "Bonbon",
            "Gummybeer",
            "Pepermunt",
            "Zure mat"
    };
    public int aantalSnoepjes = snoepjes.length;

    public String getSnoepje() {
        String toReturnSnoep = snoepjes[aantalSnoepjes-1];
        snoepjes[aantalSnoepjes-1] = "opgegeten";
        aantalSnoepjes--;
        return toReturnSnoep;
    }
}