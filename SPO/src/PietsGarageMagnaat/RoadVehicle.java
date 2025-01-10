/**
 * @author A.P.A. Slaa
 * @date 26/10/2024
 */
package PietsGarageMagnaat;

public class RoadVehicle extends Vehicle {
    protected int numberOfWheels;
    protected boolean automaticTransmission;

    public RoadVehicle(String type, int maxSpeed, int passengerCapacity, int numberOfWheels, boolean automaticTransmission) {
        super(type, maxSpeed, passengerCapacity);
        this.numberOfWheels = numberOfWheels;
        this.automaticTransmission = automaticTransmission;
    }
}
