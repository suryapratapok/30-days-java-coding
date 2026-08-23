package Day3;
import java.util.Scanner;

public class highestfactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter n:");
        int n = sc.nextInt();
        int hf = 1;
        for(int i = n-1;i>=1;i--){
            if(n%i==0){
                hf = i;
                break;
            }
        }
        System.out.println(hf);
    }
}
