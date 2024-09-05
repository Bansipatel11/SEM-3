import java.util.Scanner;
import java.util.Arrays;

public class BinarySearch{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter element at arr["+i+"]");
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("--------Sorted Array--------");
        for(int i=0;i<size;i++){
            System.out.println(arr[i]);
        }
        System.out.println("Enter element to find :");
        int key = sc.nextInt();
        boolean flag = false;
        int left = 0;
        int right = size-1;
        while(left <= right){
            int middle = (left+right) / 2;
            if(arr[middle] == key){
                System.out.println(key+" Element is at index "+middle);
                flag = true;
                break;
            }
            else if(key < arr[middle]){
                right = middle - 1;
            }
            else{
                left = middle + 1;
            }
        }
        if(flag == false){
            System.out.println("Element not found");
        }
    }
}