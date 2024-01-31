import java.util.Scanner;

public class page10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int k = sc.nextInt();
        for(int i=0;i<=n-k;i++){
            for(int j=i;j<=i+k-1;j++){
                if(arr[j]<0){
                    System.out.print(arr[j]+" ");
                    break;
                }
                else if(j==i+k-1){
                    System.out.print("0"+" ");
                }
            }
        }
        

    }
}
