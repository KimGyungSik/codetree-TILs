import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sum = 0;
        int answer = 0;
        for(int i=1; i<=100; i++) {
            sum += i;
            if(sum>=n) {
                answer = i;
                break;
            }
        }
        System.out.println(answer);
    }
}