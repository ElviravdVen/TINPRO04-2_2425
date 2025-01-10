/**
 * @author A.P.A. Slaa
 * @date 26/10/2024
 */
package PietsGarageMagnaat;

public class FuelTruck extends RoadVehicle {
    protected int capacity;

    public FuelTruck(String type, int maxSpeed, int passengerCapacity, int numberOfWheels, boolean automaticTransmission, int capacity) {
        super(type, maxSpeed, passengerCapacity, numberOfWheels, automaticTransmission);
        this.capacity = capacity;
    }

    public void printFuelTruck() {
        System.out.println("FuelTruck{" +
                "capacity=" + capacity +
                ", numberOfWheels=" + numberOfWheels +
                ", automaticTransmission=" + automaticTransmission +
                ", type='" + type + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", passengerCapacity=" + passengerCapacity +
                '}');
    }
}
