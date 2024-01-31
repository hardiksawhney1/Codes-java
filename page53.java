import java.util.Scanner;

public class page53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int original = n;
        int i =2;
        while(i<=original){
            if(n==1){
                break;
            }
            else if(n%i==0){
                n = n /i;
                System.out.print(i+" ");
            }
            else{
                i++;
            }
        }

    }
}
