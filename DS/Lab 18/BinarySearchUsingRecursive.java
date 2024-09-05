import java.util.Scanner;
import java.util.Arrays;
public class BinarySearchUsingRecursive{
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
        int left = 0;
        int right = size-1;
        int ans = BinarySearch(arr,left,right,key);
        if(ans == -1){
            System.out.println("Element not found");
        }
        else{
        System.out.println("Element found At index "+ans);
        }

    }
    public static int BinarySearch(int arr[],int left,int right,int key){
        int flag = -1;
        if(left <= right){
            int middle = (left+right) / 2;
            if(arr[middle] == key){
                flag=1;
                return middle;
            }
            else if(key < arr[middle]){
                return BinarySearch(arr,left,middle-1,key);
            }
            else{
                return BinarySearch(arr,middle+1,right,key);
            }
        }
        return -1;
    }
}
