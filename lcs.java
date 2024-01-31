public class lcs {
    public static void main(String[] args) {
        String s1 = "aabba";
        String s2 ="aaaaa";
        int i=0;
        int j=0;
        int count=0;
        while(i<s1.length() && j<s2.length()){
            if(s1.charAt(i)==s2.charAt(j)){
                i++; 
                j++;
                count++;
            }
            else{
                if(s1.length()>s2.length()){
                    i++;
                }
                else{
                    j++;
                }
            }
        }
        System.out.println(count);
    }
}
