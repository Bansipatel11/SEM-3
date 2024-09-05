import java.util.Scanner;
public class Program3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* factorial with recursion */
        System.out.println("enter number: ");
        int fact_num = sc.nextInt();

        int sum=1;
        sum =  factorialWithRecursion(fact_num);
        System.out.println("Factorial of "+fact_num+" is "+sum);

        sc.close();
    }
    public static int factorialWithRecursion(int n){
       
        if(n==0){
            return 1;
        }
        else{
            return n*factorialWithRecursion(n-1);
        }
    
    }

}