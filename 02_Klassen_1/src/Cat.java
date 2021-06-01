//import java.util.jar.Attributes.Name;

public class Cat{
    
    // Property | Attribut | Field
    public String name = "nobody";


    public void tellUrAddress(){
        System.out.println("blick von innen: " + this);
    }

    public void tellUrName() {
        System.out.println(this.name);
    }

    public void changeUrName(String name) {
        this.name = name;
    }

}