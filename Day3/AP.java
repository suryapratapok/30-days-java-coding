package Day3;
import java.util.Scanner;
public class AP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        for(int i=n;i<=2*n+1;i+=2){
            System.out.println(i);
        }

        
    }
}
