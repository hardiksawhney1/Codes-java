import java.util.Scanner;

public class page33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String str = sc.next();
        int count = 0;
        for(int i =0;i<str.length();i++){
            if(str.charAt(i)==s.charAt(count)){
                count++;
            }
        }
        System.out.println(count);

    }
}
