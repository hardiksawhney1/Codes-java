import java.util.Scanner;

public class page19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        // for(int i=0;i<=str.length()-3;i++){
        //     for(int j=i+3;j<=str.length();j++){
        //         String s = str.substring(i, j);
        //         StringBuilder sb = new StringBuilder(s);
        //         String s2 = sb.reverse()+"";
        //         if(s.equals(s2)){
        //             System.out.println(s+" "+i+"-"+(j-1));
        //         }
        //     }
        // }
        int flag = 0;
        int k = 3;
        while(k<=str.length()){
            for(int i=0;i<str.length()-(k-1);i++){
                String s = str.substring(i, i+k);
                StringBuilder sb = new StringBuilder(s);
                String s2 = sb.reverse()+"";
                if(s.equals(s2)){
                    System.out.println(s+" "+i+"-"+(i+k-1));
                    flag = 1;
                }
            }
            k++;
        }
        if(flag==0){
            System.out.println("No palindromic string found");
        }
    }
    
}
