/* *****************************
 * Author: Elvira van der Ven  *
 * Date:   10/12/2023          *                                                                                          *
 *******************************/

package les9;

public class AverageFinder {
    public static void main(String[] args) {
        System.out.println("Average finder v0.1");
        System.out.println("Running with arguments:");
        for(String s : args){
            System.out.println(s);
        }
        double avg = findAverage(args);
        System.out.println("The average is " + avg);
    }

    private static double findAverage(String[] input) {
        int result = 0;
        for (String s : input) {
            result += Integer.parseInt(s);
        }
        System.out.println("Total count: " + result);
        result = result/input.length;
        return result;
    }
}