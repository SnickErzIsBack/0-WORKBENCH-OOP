import org.graalvm.compiler.lir.aarch64.AArch64ControlFlow.StrategySwitchOp.SwitchClosure;

public class Cat 
{
    // Property | Attribut | Field
    public String name;
    public String furColor;
    public int age;
    public boolean isFemale;

    public Cat(String name, String furColor, int age, boolean isFemale) {
        this.name = name;
        this.furColor = furColor;
        this.age = age;
        this.isFemale = isFemale;
    }

    public String tellYourAttributes(String checkStr) {
        switch (checkStr) {
            case "#name":
                return this.name;
            case "#color":
                return this.furColor;
            case "#age":
                return this.checkCompliance();
                //return String.valueOf(this.age);
                //return Integer.toString(this.age);
            default:
                return "ERROR";
        }
    }

    public String checkCompliance(){
        if (isFemale) {
            return checkEscalationLevel();
        }else{
            return Integer.toString(this.age);}
    }

    public String checkEscalationLevel() {
        int counter = 1;
        switch (counter) {
            case 1:
                return "This is an inappropriate question!";
            case 2:
                return "I've told you once!";
            case 3:
                return "Talk to the hand!";
            default:
                return "something else ...";
        }
    }
}
