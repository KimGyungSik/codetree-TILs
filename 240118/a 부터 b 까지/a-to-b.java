import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int b = s.nextInt();

        while(a<=b) {
            if(a%2==0) {
                System.out.print(a+" ");
                a += 3;
            }else {
                System.out.print(a+" ");
                a *= 2;
            }
        }
    }
}