import java.util.Scanner;
public class page18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String s = sc.next();
        int count = 0;
        String arr[] = str.split(" ");
        for(int i=0;i<arr.length;i++){
            if(arr[i].equals(s)){
                count++;
            }
        }
        System.out.println(count);
    }
}
