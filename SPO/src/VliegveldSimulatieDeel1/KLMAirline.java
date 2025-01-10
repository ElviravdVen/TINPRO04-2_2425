/* *****************************
 * Author: Elvira van der Ven  *
 * Date:   10/01/2025          *                                                                                          *
 *******************************/

package VliegveldSimulatieDeel1;

public class KLMAirline {
    public static void main(String[] args) {
        // Stap 2: Vluchtenregistratie
        Flight[] flights = new Flight[5];

        // Stap 2: Objecten van het type Flight aanmaken en toevoegen aan het array
        flights[0] = new Flight("Amsterdam", "Rome", "22-11-2023", "Boeing 777");
        flights[1] = new Flight("New York", "Paris", "23-11-2023", "Airbus A320");
        flights[2] = new Flight("Tokyo", "Sydney", "24-11-2023", "Boeing 747");
        flights[3] = new Flight("London", "Berlin", "25-11-2023", "Airbus A380");
        flights[4] = new Flight("Dubai", "Los Angeles", "26-11-2023", "Boeing 737");

        // Stap 2: Aankomst- en vertrektijden toevoegen
        flights[0].scheduleArrival("10:30 AM");
        flights[1].schedule("2:00 PM", "4:30 PM");

        // Stap 3: Data hiding testen
        // Dit zou niet mogelijk moeten zijn: System.out.println(flights[0].arrivalTime);

        // Stap 4: Overzicht vluchten testen
        for (Flight flight : flights) {
            System.out.println(flight.toString());
        }
    }
}