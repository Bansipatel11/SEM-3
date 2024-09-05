import java.util.Scanner;
public class lab4_4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array");
        int size=sc.nextInt();
        int[] old_array = new int[size];
        int[] new_array = new int[size-1];
        for(int i=0;i<size;i++){
            System.out.println("Enter element of arr["+i+"]");
            old_array[i] = sc.nextInt();
        }
        int index=0;
        System.out.println("Enter element to delete");
        int element = sc.nextInt();
        for(int i=0;i<size;i++){
            if(old_array[i]==element){
                index=i;
            }
        }
        for(int i=0;i<index;i++){
            new_array[i]=old_array[i];
        }
        for(int i=index;i<size-1;i++){
            new_array[i]=old_array[i+1];
        }
        System.out.println("Final Array");
        for(int i=0;i<size-1;i++){
            System.out.println(new_array[i]);
        }
    }
}