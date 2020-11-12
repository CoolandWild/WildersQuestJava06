public class Wilder {
     // attributes
     private String firstName;
     private boolean aware;
 
     // constructors
     public Wilder(String firstName,boolean aware) {
         this.firstName = firstName;
         this.aware = aware;
    }

     public String getfirstName() {
        return this.firstName;
    }
    
    public boolean isaware() {
        return this.aware;
    }

    public void setfirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public void setaware(boolean aware) {
        this.aware = aware;
    }
    public String whoIam() {
        if (aware) {
            return "Je m'appelle " + this.getfirstName() + " et je suis aware";
        }
        else  {
            return "Je m'appelle " + this.getfirstName() + " et je ne suis pas aware";
        }
    }
    
}