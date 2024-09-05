import java.util.Scanner;
public class lab3_4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("enter the value of array index"+(i+1));
            arr[i]=sc.nextInt();
        }
        int largestIndex=0;
        for(int i=1;i<n;i++){
            if(arr[i]>arr[largestIndex]){
                largestIndex=i;
            }
        }

        int smallestIndex=0;
        for(int i=1;i<n;i++){
            if(arr[i]<arr[smallestIndex]){
                smallestIndex=i;
            }
        }
        System.out.println("Largest number is:"+arr[largestIndex]);
        System.out.println("Smallest number is:"+arr[smallestIndex]);
    }
}