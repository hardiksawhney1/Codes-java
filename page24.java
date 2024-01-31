import java.util.Scanner;

public class page24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = 0;
        int count =0;
        for(int i=a;i<=b;i++){
            int suml =0;
            int sumr =0;
            String str = i+"";
            if(str.length()%2==0){
                n = str.length()/2;
                for(int j=0;j<n;j++){
                    int x = str.charAt(j)-48;
                    suml = suml + x;
                }
                for(int j=n;j<str.length();j++){
                    int x = str.charAt(j)-48;
                    sumr = sumr + x;
                }
                if(suml==sumr){
                    System.out.println(str);
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
