import java.util.ArrayList;
import java.util.Scanner;

public class page50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        ArrayList <Character> list = new ArrayList<>();
        for(int i=0;i<str.length();i++){
            list.add(str.charAt(i));
        }
        char maxch = str.charAt(0);
        
        int maxcount = 1;
        while(list.isEmpty()==false){
            int count = 0;
            char ch = list.get(0);
            for(int i=0;i<list.size();i++){
                if(ch==list.get(i)){
                    count++;
                }
            }
            if(count>maxcount){
                maxcount = count;
                maxch = ch;
            }
            list.remove(Character.valueOf(ch));
        }
        System.out.println(maxch);
    }
}
