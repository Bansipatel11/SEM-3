import java.util.Scanner;
public class Program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* factorial */
        System.out.println("Enter number you want to find factorial of: ");
        int fact_num = sc.nextInt();
        int sum=1;
        for(int i=1 ; i<=fact_num; i++){
            sum=sum*i;
        }

        System.out.println("factorial is: "+sum);
        sc.close();
    }
}
