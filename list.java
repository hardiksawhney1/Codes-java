import java.util.ArrayList;
import java.util.Scanner;

public class list {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            int n = sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            while(n!=-1){
                arr.add(n);
                n = sc.nextInt();
            }
            int k = sc.nextInt();
            int pair = arr.size()/k; // 10/4=2
            int extra = arr.size()%k;// 10%4=2 
            int x=0;
            for(int i=0;i<pair;i++){
                for(int j=x+k-1;j>=x;j--){
                    System.out.print(arr.get(j)+" ");
                }
                x=x+k;
            }
            for(int i=arr.size()-1;i>=arr.size()-extra;i--){
                System.out.print(arr.get(i)+" ");
            }

            

            t--;
        }
        System.out.println();
    }
}
