import java.util.Scanner;

public class page59 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String arr[]=str.split(" ");
        int n = arr.length;
        for(int i=0;i<n;i++){
            int count = 0;
            for(int j=0;j<n;j++){
                if(arr[i].equals(arr[j]) && i!=j){
                    count++;
                }
            }
            if(count==0){
                System.out.println(arr[i]);
                break;
            }
        }
    }
}
