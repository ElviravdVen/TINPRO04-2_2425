/* *****************************
 * Author: Elvira van der Ven  *
 * Date:   10/01/2025          *                                                                                          *
 *******************************/

package VliegveldSimulatieDeel1;

public class Flight {
    private String origin;
    private String destination;
    private String departureTime;
    private String arrivalTime;
    private String flightDate;
    private String aircraftType;

    // Constructor voor het aanmaken van een Flight object
    public Flight(String origin, String destination, String flightDate, String aircraftType) {
        this.origin = origin;
        this.destination = destination;
        this.flightDate = flightDate;
        this.aircraftType = aircraftType;
    }

    // Methode voor het plannen van de aankomsttijd
    public void scheduleArrival(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }
    // Methode voor het plannen van zowel vertrek- als aankomsttijd
    public void schedule(String arrivalTime, String departureTime) {
        this.arrivalTime = arrivalTime;
        this.departureTime = departureTime;
    }
    // Methode om alle gegevens van de vlucht in een string weer te geven
    @Override
    public String toString() {
        return "Flight{" +
                "origin='" + origin + '\'' +
                ", destination='" + destination + '\'' +
                ", departureTime='" + departureTime + '\'' +
                ", arrivalTime='" + arrivalTime + '\'' +
                ", flightDate='" + flightDate + '\'' +
                ", aircraftType='" + aircraftType + '\'' +
                '}';
    }

}