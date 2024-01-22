import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();

        int prod = 1;

        for(int i=a; i<=b; i++) {
            prod *= i;
        }
        System.out.println(prod);
    }
}