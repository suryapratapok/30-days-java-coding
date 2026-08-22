package Day3;
import java.util.Scanner;

public class GP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first term : ");
        int a = sc.nextInt();
        System.out.println("Enter common ratio :");
        int r = sc.nextInt();
        System.out.println("Enter the number of terms: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            a = a * r;
    }
    sc.close();
}
    }
