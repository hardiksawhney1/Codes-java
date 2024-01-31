import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class extra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> list = new ArrayList<>();
        for(int i=1;i<=n;i++){
            list.add(i+"");
        }
        Collections.sort(list);
        for(int i=0;i<n;i++){
            System.out.print(list.get(i)+" ");
        }

    }
}
