import java.util.Scanner;
public class Program8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");
        int number = sc.nextInt();

        System.out.println("Enter power you want of given number: ");
        int power = sc.nextInt();
        int sum=1;
        for(int i=1;i<=power;i++){
            sum = sum*number;
        }
        
        System.out.println("Simplification is: "+sum);
        sc.close();
    }
}