public class Level_1 extends Level_2{
    
    private int points = 100;
    private String levelName = "Level 1";
    
    public void play() {
        if (LevelManager.isPlayerinLevel_1()) {
            System.out.println("Hi, you've entered " + levelName + " here and I have " + points + " points for you!");    
        } else {
            super.play();    
        }
    }


} // EoF