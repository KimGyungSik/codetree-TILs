import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = 0;
        int three = 0;
        int five = 0;
        for(int i=0; i<10; i++) {
            n = s.nextInt();
            if(n%3==0) three++;
            if(n%5==0) five++;
        }
        System.out.printf("%d %d",three,five);
    }
}