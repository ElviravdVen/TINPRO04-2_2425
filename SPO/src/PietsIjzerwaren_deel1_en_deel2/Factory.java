package PietsIjzerwaren_deel1_en_deel2;
import java.util.Random;
public class Factory {
    public static void main(String[] args) {

        Random random = new Random();

        //vul een array met tien materialen, iron of plastic.
        Material[] materials = new Material[10];
        for (int i = 0; i < 10; i++) {
            int rand = random.nextInt(4);
            switch(rand){
                case 0:
                    materials[i] = new Iron(1538);
                    break;
                case 1:
                    materials[i] = new Plastic(210);
                    break;
                case 2:
                    materials[i] = new Wood();
                    break;
                case 3:
                    materials[i] = new Rubber(150);
                    break;
            }
        }

        //maak een array met alle vijf de machines.
        Machine[] machines = new Machine[7];
        machines[1] = new Sawer();
        machines[5] = new Chiseler();
        machines[0] = new Smelter(2000);
        machines[2] = new Shaper();
        machines[3] = new Polisher();
        machines[4] = new Rivetter();
        machines[6] = new Painter("blue");

        for (Machine machine : machines){
            machine.setOn(true);
        }

        int i = 1;
        for (Material materiaal : materials){
            System.out.print(i + " - Material: ");
            i++;
            switch (materiaal) {
                case Iron iron:
                    System.out.print("Iron.\n");
                    break;
                case Plastic plastic:
                    System.out.print("Plastic.\n");
                    break;
                case Wood wood:
                    System.out.print("Wood.\n");
                    break;
                case Rubber rubber:
                    System.out.print("Rubber.\n");
                    break;
                default:
                    System.out.print("Unknown material.\n");
                    break;
            }
            for (Machine machine : machines){
                //while(!materiaal.isToyFinished()) {
                    machine.process(materiaal);
                //}
            }
            System.out.println("-------------------");
        }
//        for (Material mat :materials){
//            mat.print();
//        }
    }
}