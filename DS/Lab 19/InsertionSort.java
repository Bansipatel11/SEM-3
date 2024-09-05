
import java.util.Scanner;

public class InsertionSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an Array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int k = 0; k < size; k++) {
            System.out.println("Enter Element at[" + k + "]");
            arr[k] = sc.nextInt();
        }
        int j = 0;
        int key;
        int i = 1;
        while (i < size) {
            j = i - 1;
            key = arr[i];
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
            i = i + 1;
        }
        System.out.println("Sorted Array");
        for (i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
