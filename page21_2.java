import java.util.ArrayList;
import java.util.Scanner;

public class page21_2 {
    public static void main(String[] args) {

        //Method1
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // ArrayList<Integer> arr = new ArrayList<>();
        // for(int i=2;i<=n;i++){
        //     arr.add(i);
        //     n = n /i;
        // }
        // if(arr.contains(2)){
        //     arr.remove(Integer.valueOf(2));
        // }
        // if(arr.contains(3)){
        //     arr.remove(Integer.valueOf(3));
        // }
        // if(arr.contains(5)){
        //     arr.remove(Integer.valueOf(5));
        // }
        // if(arr.isEmpty()){
        //     System.out.println("true");
        // }
        // else{
        //     System.out.println("false");
        // }



        
        // Method 2

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int flag = 0;
        while(n!=1){
            if(n%2==0){
                n = n/2;
            }
            else if(n%3==0){
                n = n/3;
            }
            else if(n%5==0){
                n = n/5;
            }
            else{
                System.out.println("False- Not a ugly number");
                flag = 1;
                break;
            }
        }
        if(flag==0){
            System.out.println("True - ugly number");
        }
    }
}
