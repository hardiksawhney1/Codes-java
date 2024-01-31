import java.util.ArrayList;
import java.util.Scanner;

public class page51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        sc.nextLine();
        String str2 = sc.nextLine();
        String arr[] = str2.split(" ");
        ArrayList<Character> list = new ArrayList<>();
        int flag = 0;
        for(int i=0;i<str1.length();i++){
            if(flag==0){
                char key = str1.charAt(i);
                String value = arr[i];
                if(list.contains(key)==false){
                    for(int j=i+1;j<str1.length();j++){
                        if(str1.charAt(j)==key){
                            if(arr[j].equals(value)==false){
                                flag = 1;
                                break;
                            }
                        }
                    }
                    list.add(key);
                }
            }
            else{
                break;
            }
        }
        if(flag==0){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }

        
    }
}
