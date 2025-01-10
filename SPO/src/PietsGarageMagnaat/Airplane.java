/**
 * @author A.P.A. Slaa
 * @date 26/10/2024
 */
package PietsGarageMagnaat;

public class Airplane extends Vehicle {
    protected int maxAltitude;
    protected boolean needLandingStrip;

    public Airplane(String type, int maxSpeed, int passengerCapacity, int maxAltitude, boolean needLandingStrip) {
        super(type, maxSpeed, passengerCapacity);
        this.maxAltitude = maxAltitude;
        this.needLandingStrip = needLandingStrip;
    }
}
