/**
 * @author A.P.A. Slaa
 * @date 26/10/2024
 */
package PietsGarageMagnaat;

public class Vehicle {
    protected String type;
    protected int maxSpeed;
    protected int passengerCapacity;

    public Vehicle(String type, int maxSpeed, int passengerCapacity) {
        this.type = type;
        this.maxSpeed = maxSpeed;
        this.passengerCapacity = passengerCapacity;
    }
}
