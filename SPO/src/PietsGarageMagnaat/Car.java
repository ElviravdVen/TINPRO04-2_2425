/**
 * @author A.P.A. Slaa
 * @date 26/10/2024
 */

package PietsGarageMagnaat;


public class Car extends RoadVehicle {

    protected int numberOfDoors;

    public Car(String type, int maxSpeed, int passengerCapacity, int numberOfWheels, boolean automaticTransmission, int numberOfDoors) {
        super(type, maxSpeed, passengerCapacity, numberOfWheels, automaticTransmission);
        this.numberOfDoors = numberOfDoors;
    }

    public void printCar() {
        System.out.println("Car{" +
                "numberOfDoors=" + numberOfDoors +
                ", numberOfWheels=" + numberOfWheels +
                ", automaticTransmission=" + automaticTransmission +
                ", type='" + type + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", passengerCapacity=" + passengerCapacity +
                '}');
    }
}
