import java.util.Scanner;

public class page14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int sum = 0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            int numch = (int) ch;
            if(numch>=97 && numch<=122){
                sum = sum - (numch-96);
            }
            if(numch>=65 && numch<=90){
                sum = sum + (numch-64);
            }
            if(ch==' ' || i==str.length()-1){
                if(sum>9){
                    System.out.print(9);
                }
                else if(sum<0){
                    System.out.print(0);
                }
                else{
                    System.out.print(sum);
                }
                sum = 0;
            }
        }
        
    }
}
