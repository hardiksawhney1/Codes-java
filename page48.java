import java.util.Arrays;
import java.util.Scanner;

public class page48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n+1];
        for(int i=0;i<=n;i++){
            arr[i] = Integer.bitCount(i); //Integer.toBinaryString
        }
        System.out.println(Arrays.toString(arr));

    }
}
