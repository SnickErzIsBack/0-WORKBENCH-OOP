public class Cat 
{
    // Property | Attribut | Field
    private String name;
    private String furColor;
    private int age;
    private int level; // intern verwendet

    public Cat(String name, String furColor, int age) {
        this.name = name;
        this.furColor = furColor;
        this.age = age;
    }

    public String tellYourAttributes(String checkStr) {
        switch (checkStr) {
            case "#name":
                return this.name;
            case "#color":
                return this.furColor;
            default:
                return "ERROR";
        }
    }

    private String tellYourAge() {
        return this.checkEscalationLevel();
    }

    private String checkEscalationLevel() {

        this.level++;

        switch (level) {
            case 1:
                return "This is an inappropriate question!";
            case 2:
                return "I've told you once!";
            case 3:
                return "Talk to the hand!";
            default:
                return "#!?&&%";
        }
    }
}
