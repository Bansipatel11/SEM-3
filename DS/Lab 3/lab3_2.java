import java.util.Scanner;
public class lab3_2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        int m = sc.nextInt();
         System.out.println("enter secound number");
        int n = sc.nextInt();
    int sum=0;
    if(m<n){
        for(int i=m;i<=n;i++){
            sum=sum+i;
        }
    }
    else if(m>n){
        for(int i=n;i<=m;i++){
            sum=sum+i;
        }
    }
    else{
        System.out.println("Enter valid number");
    }
    System.out.println(sum);
    }
}