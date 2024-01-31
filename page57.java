import java.util.Scanner;

public class page57 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            int maxi = 0;
            for(int j=0;j<n;j++){
                if(arr[j]>arr[maxi]){
                    maxi = j;
                }
            }
            System.out.print(maxi+" ");
            arr[maxi] = -100000;
        }
    }
}
