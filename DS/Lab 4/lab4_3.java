import java.util.Scanner;
public class lab4_3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        System.out.println("Enter an element of an array in assending order");
        for(int i=0;i<arr.length-1;i++){
            System.out.println("Enter an element at index["+i+"]");
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter number to insert");
        int num = sc.nextInt();
        int i=n-1;
        while(arr[i-1]>=num){
            arr[i] = arr[i-1];
            i--;
        }
        arr[i] = num;
        System.out.println("New Array");
        for(int j=0;i<arr.length;j++){
            System.out.println(arr[j]);
        }
    }
}