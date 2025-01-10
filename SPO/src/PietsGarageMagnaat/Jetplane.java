/**
 * @author A.P.A. Slaa
 * @date 26/10/2024
 */
package PietsGarageMagnaat;

public class Jetplane extends Airplane {
    protected int numberOfJetEngines;

    public Jetplane(String type, int maxSpeed, int passengerCapacity, int maxAltitude, boolean needLandingStrip, int numberOfJetEngines) {
        super(type, maxSpeed, passengerCapacity, maxAltitude, needLandingStrip);
        this.numberOfJetEngines = numberOfJetEngines;
    }

    public void printJetplane() {
        System.out.println("Jetplane{" +
                "numberOfJetEngines=" + numberOfJetEngines +
                ", maxAltitude=" + maxAltitude +
                ", needLandingStrip=" + needLandingStrip +
                ", type='" + type + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", passengerCapacity=" + passengerCapacity +
                '}');
    }
}
