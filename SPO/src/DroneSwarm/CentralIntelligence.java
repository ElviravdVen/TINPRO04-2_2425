package DroneSwarm;
import java.util.Random;
import java.util.random.*;

public class CentralIntelligence {
    static Drone[] drones = new Drone[5]; //static array for drones to write to
    public static void main(String[] args){
        //creates five drones
        for(int i = 0; i < 5; i++){
            drones[i] = new Drone("simple", i);
        }
        //have each drone attempt to execute a task of random difficulty
        for(Drone drone: drones){
            drone.performTask(generateTask());
        }
        //After all tasks have been handled print the type and properties of each drone.
        for(Drone drone: drones){
            drone.printInfo();
        }
    }

    //method generates a task of a random difficulty.
    private static Task generateTask(){
        Random random = new Random();
        return switch (random.nextInt(0, 3)) {
            case 0 -> new Task("simple");
            case 1 -> new Task("advanced");
            case 2 -> new Task("specialized");
            default -> new Task("random weird stuff");
        };
    }
}
