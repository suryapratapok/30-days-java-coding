package Day2;
import java.util.Scanner;
public class perimeterarea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length : ");
        int length = sc.nextInt();
        System.out.println("enter breadth : ");
        int breadth = sc.nextInt();
        int area = length * breadth;
        int perimeter = 2 * (length + breadth);
        if (area>perimeter) {
            System.out.println("Area is greater than perimeter ");
        }
        else{
            System.out.println("Area is less than perimeter ");
        }
    }
}
