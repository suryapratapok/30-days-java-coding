package Day3;

import java.util.Scanner;
class tableofn{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = scn.nextInt();
        for(int i=n; i<=n*10;i+=n){
            System.out.println(i);
        }
    }
}