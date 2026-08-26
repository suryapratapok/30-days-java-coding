//Method overloading 
package Day7;

public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println(sum(78,2,78));
        greet("Modi",80);


    }
     
    public static int sum(int a, int b){
        return(a + b);

    }
    public static int sum(int a,int b,int c){
        return(a + b +c);
    }
    public static int sum(double a, double b){
        return (int)(a + b);
    }
    static void greet(String name,int age){
        System.out.println("Hi "+ name + ". Your age is "+age);
    }
    static void greet(int age,String name){
        System.out.println("Hi "+ name + ". Your age is "+age);
    }
}
