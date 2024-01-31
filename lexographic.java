import java.util.ArrayList;
import java.util.Collections;

public class lexicographicalOrder {
    public static void main(String[] args) {
        ArrayList<String>arr = new ArrayList<>();
        for (int i=1;i<=15;i++){
            arr.add(String.valueOf(i));
        }
        Collections.sort(arr);
        System.out.println(arr);
    }
}
