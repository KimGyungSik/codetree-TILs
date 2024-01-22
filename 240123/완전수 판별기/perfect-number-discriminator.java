import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sum = 0;
        
        for(int i=1; i<n; i++) {
            if(n%i==0) {
                sum += i;
            }
        }
        if(sum==6) 
            System.out.println("P");
        else 
            System.out.println("N");
    }
}