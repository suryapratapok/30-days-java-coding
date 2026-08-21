package Day3;
import java.util.Scanner;
public class printeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a: ");
int a = sc.nextInt();
System.out.println("enter b : ");
int b = sc.nextInt();
for(int i=a;i<=b;i++){
    if(i%2==0) {
        System.out.println(i);
    }
}
    }
}
