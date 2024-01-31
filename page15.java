import java.util.Scanner;
public class page15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = sc.nextInt();
        String arr[] = str.split(" ");
        for(int i= arr.length-1;i>=0;i--){
            System.out.println(i+1+" "+arr[i]);
        }
        if(arr.length>=n){
            System.out.println("Present");
        }
        else{
            System.out.println("Not Present");
        }
    }
}
