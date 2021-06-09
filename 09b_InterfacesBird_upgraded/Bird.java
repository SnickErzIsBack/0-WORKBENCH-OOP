public class Bird implements IFly, IFeathers{
        // Can the Can - https://www.youtube.com/watch?v=fZxhyMx1xqg
    
        @Override
            public String hasFeathers() {
                return ("I'm a Bird, I got feathers!");
        }
    
        @Override
            public String fly() {
                return ("I can fly, too!");
        }
    
    }//EoF