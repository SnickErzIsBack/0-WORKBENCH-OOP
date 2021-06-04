public class SuperCat {
   // Property | Attribut | Field
   private String name;
   private String furColor;
   protected int age;
   
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
} //EoF