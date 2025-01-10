/**
 * @author A.P.A. Slaa
 * @date 26/10/2024
 */
package PietsGarageMagnaat;

public class VehicleBay {
    public static void main(String[] args){
        Helicopter copter = new Helicopter("Chinouk", 200, 20, 200, false, 2);
        Jetplane jetplane = new Jetplane("Boeing 747", 250, 250, 1000, true, 4);
        FuelTruck fuelTruck = new FuelTruck("Scania", 200, 2, 8, false, 2500);
        Car car = new Car("Volvo stationwagon", 200, 5, 4, false, 4);
        copter.printHelicopter();
        jetplane.printJetplane();
        fuelTruck.printFuelTruck();
        car.printCar();
    }
}
