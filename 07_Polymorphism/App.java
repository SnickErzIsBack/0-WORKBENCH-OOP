public class App {
    public static void main(String[] args) {
       
        HoneyBee queen = new Queen();
        HoneyBee worker = new Worker();
        HoneyBee drone = new Drone();

        ausgabe(queen.doYourJob());
        ausgabe(worker.doYourJob());
        ausgabe(drone.doYourJob());

        ausgabe("------------------------");

        ausgabe(queen.FLY());
        ausgabe(worker.FLY());
        ausgabe(drone.FLY());

        ausgabe("------------------------");

        HoneyBee bee = new HoneyBee();
        ausgabe(bee.doYourJob());
    }

    private static void ausgabe(String outStr){
        System.out.println(outStr);
    }
}
