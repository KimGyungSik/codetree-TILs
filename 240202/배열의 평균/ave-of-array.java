import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[][] arr = new int[2][4];
        // 1. 가로 평균 = 가로줄의합 / 가로줄의 갯수  
        double sum1 = 0;
        // 2. 세로 평균 = 세로줄의 합/ 세로줄의 갯수
        double sum2 = 0;
        // 3. 전체 평균 = 전체수의 합/ 전체수의 갯수 
        double sum3 = 0;

        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                int n = s.nextInt();
                arr[i][j] = n;
                sum3 += n;
            }
        }

        for(int i = 0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                sum1 += arr[i][j];
            }
            System.out.print((sum1/4.0)+" ");
            sum1 = 0;
        }
        System.out.println();
        for(int i=0; i<arr[0].length; i++) {
            for(int j=0; j<2; j++) {
                sum2 += arr[j][i];
            }
            System.out.print((sum2/2.0)+" ");
            sum2 = 0;
        }
         System.out.println();
        System.out.println(sum3/8.0);
    }
}