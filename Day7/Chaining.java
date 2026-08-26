package Day7;

public class Chaining {
    public static void main(String[] args) {
        fun1();
        System.out.println("Bye");
    }
    public static void fun1(){
        fun2();
        System.out.println("What are u doing?");
    }
    public static void fun2(){
        fun3();
        System.out.println("where are u from?");
    }
    public static void fun3(){
        System.out.println("Hello");
    }
    
}
