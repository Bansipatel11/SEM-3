import java.util.Scanner;
public class lab3_1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter range of an array");
        int n = sc.nextInt();
        int[] arr= new int[n];
        for( int i=0;i<arr.length;i++){
            System.out.println("Enter an element of index"+(i+1));
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            System.out.println("arr["+i+"] = "+arr[i]);
        }
    }
}