import java.util.Scanner;

public class page52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        for(int i=0;i<k;i++){
            int max = arr[i];
            int maxi = i;
            for(int j=0;j<n;j++){
                if(arr[j]>max){
                    max = arr[j];
                    maxi = j;
                }
            }
            arr[maxi] = -100000;
            if(i==k-1){
                System.out.println(max);
            }
        }
    }
}
