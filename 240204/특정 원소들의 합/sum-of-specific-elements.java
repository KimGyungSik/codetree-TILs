import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[][] arr= new int[4][4];
        int sum = 0;
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[0].length; j++) {
                arr[i][j] = s.nextInt();
                if(i>=j) {
                    sum += arr[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}