import java.util.Scanner;

public class ReplaceNumberInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read n numbers in an array
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Read two different numbers
        System.out.print("Enter the number to be replaced: ");
        int toBeReplaced = sc.nextInt();
        System.out.print("Enter the number to replace with: ");
        int replaceWith = sc.nextInt();
        
        // Replace the first occurrence of toBeReplaced with replaceWith
        int index = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == toBeReplaced) {
                arr[i] = replaceWith;
                index = i;
                break;
            }
        }
        
        // Print index and final array
        System.out.println("Index of replaced number: " + index);
        System.out.print("Final array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        
        sc.close();
    }
}