//pass by value concept..
package Day6;

public class swapusingfunc {
    public static void swap(int a,int b){
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println(a+" "+b+" swap func");
    }
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        System.out.println(a+" "+b+" main func");
        swap(a,b);
        System.out.println(a+" "+b+" main func");

    }
}
