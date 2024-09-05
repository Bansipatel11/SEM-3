import java.util.Scanner;
public class lab4_5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array");
        int size=sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter element of arr["+i+"]");
            arr[i] = sc.nextInt();
        }
        int index=0;
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(arr[i]==arr[j]){
                    index=i;
                }
            }
        }
        for(int i=index;i<size-2;i++){
            arr[i]=arr[i+1];
        }
        for(int i=0;i<size-2;i++){
            System.out.println(arr[i]);
        }
    }
}