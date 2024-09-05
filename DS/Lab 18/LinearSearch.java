import java.util.Scanner;
public class LinearSearch{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter element at arr["+i+"]");
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter element to find");
        int key = sc.nextInt();
        boolean flag = false;
        for(int i=0;i<size;i++){
            if(arr[i] == key){
                flag = true;
                System.out.println(key+ " is at index " +i);
                break;
            }
        }
        if(flag == false){
            System.out.println("Element not found");
        }
    }
}