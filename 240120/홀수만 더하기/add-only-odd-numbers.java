import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int x = 0;
        int sum = 0;
        for(int i=0; i<n; i++) {
            x = s.nextInt();
            if(x%2!=0&&x%3==0)
                sum += x;
        }
        System.out.println(sum);
    }
}