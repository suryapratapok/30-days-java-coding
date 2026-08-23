package Day4;

public class continueloop {
    public static void main(String[] args) {
        for(int i =1;i<=100;i++){
            System.out.println("hello");
            if(i%2==1) continue;
            System.out.println(i);
        }
    }
    
}
