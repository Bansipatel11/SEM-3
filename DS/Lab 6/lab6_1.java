import java.util.*;
public class lab6_1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Element");
        int a = sc.nextInt();
        System.out.println("Enter Second Element");
        int b = sc.nextInt();
        System.out.println("Before Swap");
        System.out.println(a);
        System.out.println(b);
        System.out.println("After Swap");
        swap_number s = new swap_number();
        s.swap(a,b);
    }
}

class swap_number{
    public void swap(int a,int b){
        int temp = a;
        a=b;
        b=temp;
        System.out.println(a);
        System.out.println(b);
    }
}
