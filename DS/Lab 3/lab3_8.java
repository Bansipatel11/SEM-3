import java.util.Arrays;
import java.util.Scanner;

public class lab3_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
       
        System.out.print("Enter the number of names: ");
        int n = sc.nextInt();
        
       
        sc.nextLine();
        
        
        String[] names = new String[n];
        
        
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = sc.nextLine();
        }
        
        
        Arrays.sort(names);
        
        
        System.out.println("\nSorted names:"+Arrays.toString(names));
       
        
       
        sc.close();
    }
}
