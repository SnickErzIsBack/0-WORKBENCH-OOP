public class App {
    public static void main(String[] args) {
     
        HoneyBee queen = new Queen();
        HoneyBee worker = new Worker();
        HoneyBee drone = new Drone();
        Bird bird = new Bird();
        
        ausgabe(queen.doYourJob());
        // ausgabe(queen.fly());

        ausgabe("--------------------------------");

        ausgabe(worker.doYourJob());
        // ausgabe(worker.fly());
        
        ausgabe("--------------------------------");

        ausgabe(drone.doYourJob());
        // ausgabe(drone.fly());
        
        ausgabe("--------------------------------");

        ausgabe(bird.hasFeathers());
        // ausgabe(bird.fly());

        ausgabe("--------------------------------");

        flightTournament(drone);
        flightTournament(queen);
        flightTournament(worker);
        flightTournament(bird);
        
    }

    private static void flightTournament(IFly obj) {
        ausgabe(obj.fly());
    }

    private static void ausgabe(String outStr){
        System.out.println(outStr);
    }

} //EoF