import java.util.Scanner;

public class page11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int count = 1;
        for(int i=1;i<n;i++){
            if (arr[i]>max){
                count++;
                max = arr[i];
            }
        }
        System.out.println(count);

    }
}
