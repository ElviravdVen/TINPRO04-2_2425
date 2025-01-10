/**
 * @author A.P.A. Slaa
 * @date 26/10/2024
 */
package PietsGarageMagnaat;

public class Helicopter extends Airplane {
    protected int rotors;

    public Helicopter(String type, int maxSpeed, int passengerCapacity, int maxAltitude, boolean needLandingStrip, int rotors) {
        super(type, maxSpeed, passengerCapacity, maxAltitude, needLandingStrip);
        this.rotors = rotors;
    }


    public void printHelicopter() {
        System.out.println("Helicopter{" +
                "rotors=" + rotors +
                ", maxAltitude=" + maxAltitude +
                ", needLandingStrip=" + needLandingStrip +
                ", type='" + type + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", passengerCapacity=" + passengerCapacity +
                '}');
    }
}
