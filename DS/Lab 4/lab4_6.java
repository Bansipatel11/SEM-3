import java.util.Scanner;
public class lab4_6{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of first array");
        int m=sc.nextInt();
        System.out.println("Enter size of second array");
        int n=sc.nextInt();
        int[] arr1 = new int[m];
        int[] arr2 = new int[n];
        System.out.println("Enter elements for first array");
        for(int i=0;i<m;i++){
            System.out.println("Enter element of arr["+i+"]");
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter elements for second array");
         for(int i=0;i<n;i++){
            System.out.println("Enter element of arr["+i+"]");
            arr2[i]=sc.nextInt();
        }
        int[] arr3 = new int[m+n];
        for(int i=0;i<m;i++){
            arr3[i] = arr1[i];
        }
        for(int i=0;i<n;i++){
            arr3[m+i] = arr2[i];
        }
        for(int i=0;i<arr3.length;i++){
            System.out.println(arr3[i]);
        }
    }
}