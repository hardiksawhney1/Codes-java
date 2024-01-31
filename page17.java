import java.util.ArrayList;
import java.util.*;

public class page17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String arr[] = str.split(" ");
        ArrayList<Integer> arry = new ArrayList<>();
        ArrayList<Integer> arry2 = new ArrayList<>();
        for(int i =0; i<arr.length;i++){
            int n = Integer.parseInt(arr[i]);
            arry.add(n);
            arry2.add(n);
        }
        int count = 0;
        for(int i=0;i<arry2.size();i++){
            arry.remove(i);
            int suml = 0;
            int sumr =0 ;
            for(int j=0;j<arry.size();j++){
                if(j%2==0){
                    suml = suml + arry.get(j);
                }
                else{
                    sumr = sumr + arry.get(j);
                }
            }
            if(suml == sumr){
                count++;
            }
            arry = arry2;
        }
        System.out.println(count);
    }
}
