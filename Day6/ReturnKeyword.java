package Day6;

public class ReturnKeyword {

    public static void greet(int x) {
        if(x<0) return;
        System.out.println("good morning ");

        
    }
    public static void main(String[] args) {
        greet(-9);
    }
}
