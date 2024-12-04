/* *****************************
 * Author: Elvira van der Ven  *
 * Date:   22/11/2024          *                                                                                          *
 *******************************/

package les3;

import java.util.Arrays;

public class Snoeppot {
    public String[] snoepjes = {
            "Yoghurt gum - aardbei",
            "Yoghurt gum - banaan"
//            "Yoghurt gum - kers",
//            "Yoghurt gum - appel",
//            "Yoghurt gum - perzik",
//            "Yoghurt gum - framboos",
//            "Yoghurt gum - blauwe bes",
//            "Yoghurt gum - mango",
//            "Yoghurt gum - sinaasappel",
//            "Yoghurt gum - citroen"
    };
    public int aantalSnoepjes = snoepjes.length;

    public String getSnoepje() {
        String toReturnSnoep = snoepjes[aantalSnoepjes-1];
        snoepjes[aantalSnoepjes-1] = "opgegeten";
        aantalSnoepjes--;
        return toReturnSnoep;
    }
}