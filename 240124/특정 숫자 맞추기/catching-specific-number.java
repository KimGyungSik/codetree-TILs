import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while(true) {
            int a = s.nextInt();
            if(a<25)
                System.out.println("Higher");
            if(a>25)
                System.out.println("Lower");
            if(a==25) {
                System.out.println("Good");
                break; 
            }
        }
    }
}