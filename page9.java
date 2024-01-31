import java.util.Scanner;

public class page9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            String str = "Yes";
            String res = "";
            String check = sc.next();
            int len = check.length();
            for(int i=0;i<len;i++){
                res = res + str;
            }
            if(res.contains(check)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            t--;
        }
    }
}
