public class Cat{
    
    // Property | Attribut | Field
    public String name = "nobody";


    public void tellUrAddress(){
        System.out.println("blick von innen: " + this);
    }

    public void tellUrName() {
        System.out.println(this.name);
    }
}