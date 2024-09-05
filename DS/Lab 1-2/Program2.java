import java.util.Scanner;
public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* to check odd even */

        System.out.println("Enter Number");
        int num = sc.nextInt();

        if(num==0||num<0){
            System.out.println("Invalid number");
        }
        else{
            if(num%2==0){
                System.out.println("It is even");
            }
            else{
                System.out.println("It is odd");
            }
        }

        sc.close();
    }
}
