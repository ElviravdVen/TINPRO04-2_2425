package DroneSwarm;

public class SpecializedDrone extends AdvancedDrone {
    protected String sensors;

    public SpecializedDrone(String type, int id, String gripper, String tools, String sensors){
        super(type, id, gripper, tools);
        this.sensors = sensors;
    }

    public void performTask(Task task){
        //to do:
        //if the drone can handle the task, execute it.
        //else, upgrade (create a drone one complexity level higher and overwrite the current drone with it in the static array drones)
        //Have the new drone attempt the same task again.

        System.out.println("Drone " + id + " initiates task." );
        if(!(task.getType().equals("specialized"))){
            System.out.println("Task cannot be executed. Aborting.");
        }
        else {
            System.out.println("Specialized task performed by drone: " + id);
        }
    }

    public void printInfo(){
        super.printInfo();
        System.out.println("Sensors: " + this.sensors);
    }
}
