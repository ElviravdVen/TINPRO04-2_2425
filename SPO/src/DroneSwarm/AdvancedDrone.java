package DroneSwarm;

public class AdvancedDrone extends Drone {

    protected String tools;

    public AdvancedDrone(String type, int id, String gripper, String tools){
        super(type, id);
        this.gripper = gripper;
        this.tools = tools;
    }

    public void performTask(Task task){
        //to do:
        //if the drone can handle the task, execute it.
        //else, upgrade (create a drone one complexity level higher and overwrite the current drone with it in the static array drones)
        //Have the new drone attempt the same task again.

        System.out.println("Drone " + id + " initiates task." );
        if(!(task.getType().equals("simple"))){
            System.out.println("error: task failed due to complexity. Upgrading...");
            CentralIntelligence.drones[id] = new SpecializedDrone("complex", id, "complex gripper", "complex tools", "complex sensors");
            CentralIntelligence.drones[id].performTask(task);
        }
        else {
            System.out.println("Advanced task performed by drone: " + id);
        }
    }

    public void printInfo(){
        super.printInfo();
        System.out.println("tool: " + this.tools);
    }
}
