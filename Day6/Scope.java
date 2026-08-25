package Day6;

public class Scope {
    static int i;
    public static void main(String[] args) {
        i = 16;
        System.out.println(i);
        int i = 23;
        System.out.println(i);
        funv();

    }
    public static void funv(){
        System.out.println(i);
        int i = 70;
        System.out.println(i);
    }
}
