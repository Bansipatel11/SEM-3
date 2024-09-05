import java.util.Scanner;
public class Program12{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        for(int i=1;i<=1000;i++){
            int n=i;
            while(n>0){
                int a = n%10;
                sum = sum + (a*a*a);
                n=n/10;
            }
            if(sum==i){
                System.out.println(i+" ");
            }
            sum=0;
        }
    }
}