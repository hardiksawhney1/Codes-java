import java.util.Arrays;
import java.util.Scanner;

public class page55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n-1;i++){
            int mini = i;
            for(int j=i;j<n;j++){
                if(arr[j]<arr[mini]){
                    mini = j;
                }
            }
            int temp = arr[mini];
            arr[mini] = arr[i];
            arr[i] = temp;
            System.out.println(Arrays.toString(arr));
        }
    }
}
