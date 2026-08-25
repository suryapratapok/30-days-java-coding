
package Day6;
import java.util.Scanner;
public class permutation {
    public static int Fact(int x){
        int xFact = 1;
        for(int i=1;i<=x;i++){
            xFact *= i;
        }
        return xFact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n:");
        int n = sc.nextInt();
        System.out.println("enter r:");
        int r = sc.nextInt();

        int nfact = Fact(n);
        int rfact = Fact(r);
        
        int ncr = nfact/rfact;
System.out.println(ncr);
    }
}
