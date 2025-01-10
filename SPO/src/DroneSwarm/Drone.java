package DroneSwarm;

public class Drone {
    protected int id;
    protected String type;
    protected String gripper = "regular gripper";

    public Drone(String type, int id){
        this.id = id;
        this.type = type;
    }

    public void performTask(Task task){
        //to do:
        //if the drone can handle the task, execute it.
        //else, upgrade (create a drone one complexity level higher and overwrite the current drone with it in the static array drones)
        //Have the new drone attempt the same task again.

        System.out.println("Drone " + id + " initiates task." );
        if(!(task.getType().equals("advanced"))){
            System.out.println("error: task failed due to complexity. Upgrading...");
            CentralIntelligence.drones[id] = new AdvancedDrone("advanced", id, "advanced gripper", "advanced tools");
            CentralIntelligence.drones[id].performTask(task);
        }
        else {
            System.out.println("Simple task performed by drone: " + id);
        }
    }

    public void printInfo(){
        System.out.println("droneNumber: " + id);
        System.out.println("type: " + type);
        System.out.println("gripper: " + gripper);
    }
}
