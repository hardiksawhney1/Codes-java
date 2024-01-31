import java.util.Scanner;

public class knapsack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] w = new int[n];
        int[] p = new int[n];
        double[] r = new double[n];
        for(int i=0;i<n;i++){
            w[i] = sc.nextInt();
            p[i] = sc.nextInt();
            double d = w[i];
            r[i] = p[i]/d;
        }
        int sum = 0;
        int c = sc.nextInt();
        for(int i=0;i<n;i++){
            int maxind=i;
            for(int j=0;j<n;j++){
                if(r[j]>r[maxind]){
                    maxind=j;
                }
            }
            if(c>=w[maxind]){
                sum+=p[maxind];
                c=c-w[maxind];
            }
            r[maxind]=-10000;
        }
        System.out.println(sum);
    }
}
