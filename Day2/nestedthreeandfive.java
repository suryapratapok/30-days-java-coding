package Day2;

import java.util.Scanner;

public class nestedthreeandfive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter as number: ");
        int n = sc.nextInt();
        if (n%5==0) {
            if (n%3==0) {
                System.out.println("the number is devisible by both 3 and 5 ");
            }
            else{
                System.out.println("not devisible");
            }
        }
else{
    System.out.println("not Devisible");
}
    }
}
