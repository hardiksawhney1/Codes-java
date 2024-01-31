import java.util.Scanner;

public class longestConsecutiveSubsequence {

    public  static int lcs(String x, String y, int m, int n){
        if (m==0||n==0) return 0;

        if (x.charAt(m-1)==y.charAt(n-1)){
            return 1+lcs(x,y,m-1,n-1);
        }
        else{
            return Math.max(lcs(x,y,m-1,n), lcs(x,y,m,n-1));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        String y = sc.nextLine();

        System.out.println(lcs(x,y,x.length(),y.length()));
    }
}
