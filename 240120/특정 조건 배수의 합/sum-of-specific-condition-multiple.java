import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int sum = 0;

        for (int i = a; i <= b; i++) {
            if (i % 5 ==0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}