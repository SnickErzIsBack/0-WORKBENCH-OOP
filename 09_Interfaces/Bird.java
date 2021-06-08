public class Bird extends HoneyBee{

    @Override
    public String fly() {
        return "I'm a bird, I can also fly!";
    }

    @Override
    public String doYourJob() {
        // das ist Bienenverhalten!
        return "I am NOT a BEE!";
    }

}//EoF