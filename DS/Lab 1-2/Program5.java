import java.util.Scanner;
public class Program5 {
    public static void main(String[] args) {
        /* to check prime number */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int prime_num = sc.nextInt();
        int count=0;
        if(prime_num == 0||prime_num<1){
            System.out.println("Invalid input");
        }
        else{
            for(int i=2; i<prime_num/2; i++){
                if(prime_num%i==0){
                    count++;
                    break;
                }
            }
        }

        if(count==0){
            System.out.println("it is Prime number");
        }
        else{
            System.out.println("it is not a prime number");
        }
        sc.close();
    }
}
