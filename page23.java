import java.util.Scanner;

public class page23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        for(int i=0;i<str.length();i++){
            int n = (int) str.charAt(i);
            if(i%2==0){
                char ch = (char) (n+1);
                System.out.print(ch);
            }
            else{
                char ch = (char) (n-1);
                System.out.print(ch);
            }

        }
    }
}
