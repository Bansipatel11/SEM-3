 import java.util.Scanner;
 public class BubbleSort{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter an element at arr["+i+"]");
            arr[i] = sc.nextInt();
        }
        int last = n-1;
        int exchs = 0;
        for(int i=0;i<=n-2;i++){
            for(int j=0;j<=last-1;j++){   
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    exchs++;
                }
            }
        }
            if(exchs == 0){
                System.out.println("Entered array is sorted");
            }
            else{
                System.out.println("Sorted array");
                for(int i=0;i<n;i++){
                    System.out.println(arr[i]);
                }
            }

    }
}
 