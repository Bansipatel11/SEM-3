import java.util.Scanner;
public class Program6 {
    public static void main(String[] args) {
        /* factors */
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter number: ");
            int num = sc.nextInt();

              System.out.print("Factors of " + num + " are: ");
          
              for (int i = 1; i <= num; ++i) {
          
                if (num % i == 0) {
                  System.out.print(i + " ");
                }
              }
              sc.close();
    }
}
