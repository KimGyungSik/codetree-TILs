import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();

        int i = a<b ? b : a ;
        int i2 = a>b ? b : a;
        for(int x = i; i>=i2; i--) {
            System.out.print(i+" ");
        }
    }
}