import java.util.Scanner;

public class page21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int diff = 0;
        for(int i=1;i<str.length();i++){
            System.out.print(str.charAt(i-1));
            diff = str.charAt(i)-str.charAt(i-1);
            System.out.print(diff);
        }
        System.out.print(str.charAt(str.length()-1));
    }
}
