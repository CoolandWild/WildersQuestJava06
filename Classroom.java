public class Classroom {
    public static void main(String[] args) {
        
        Wilder jcV = new Wilder("Jean-Claude", true);
        System.out.println(jcV.whoIam());

        Wilder henri = new Wilder("Henri", false);
        System.out.println(henri.whoIam());

        Wilder eric = new Wilder("Eric", true);
        System.out.println(eric.whoIam() + " mais le matin seulement !!!");
    }
}
