import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        char[][] arr = new char[5][3];

        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                String input = s.next();
                char c = input.charAt(0);
                arr[i][j] = Character.toUpperCase(c);
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}