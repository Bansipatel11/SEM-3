import java.util.Scanner;
public class lab3_2UsingArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range of an array");
        int k = sc.nextInt();
        int[] arr=new int[k];
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter the value of an array["+i+"]");
            arr[i]=sc.nextInt();
        }
        System.out.println("enter two index from an array to sum ");
        System.out.println("enter first index");
        int m = sc.nextInt();
         System.out.println("enter last index");
        int n = sc.nextInt();
    int sum=0;

    
    if(m<n){
        for(int i=m;i<=n;i++){
            sum = sum+arr[i];
        }
    }
    else if(m>n){
        for(int i=n;i<=m;i++){
            sum = sum+arr[i];
        }
    }
    else{
        System.out.println("Enter valid number");
    }
    System.out.println("Sum="+sum);
    }
}