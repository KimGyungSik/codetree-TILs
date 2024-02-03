import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[][] arr= new int[s.nextInt()][s.nextInt()];
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                if(i>0)
                    arr[i][j] = arr[i-1][j]+arr[i].length;
                else 
                    arr[i][j] = j+1;
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}