import java.util.Scanner;
class Stack{
    int Top;
    int n;
    int arr[];
    public Stack(int n){
        Top = -1;
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("enter element");
            arr[i] = sc.nextInt();
            Top++;
        }
        
    }
    public void push(int x){
        if(Top>=n-1){
            System.out.println("Stack Overflow");
        }
        Top++;
        arr[Top] = x;
    }
    public int pop(){
        if(Top<=-1){
            System.out.println("Stack Underflow");
            return(0);
        }
        else{
            Top--;
            return (arr[Top]);
        }
    }
    public int peep(int i){
        if(Top-i+1 < 0){
            System.out.println("Stack Underflow");
            return(0);
        }
        else{
            return (arr[Top-i+1]);
        }
    }
    public void change(int i,int x){
        if(Top-i+1 < 0){
            System.out.println("Stack Underflow");
        }
        else{
            arr[Top-i+1] = x;
            
        }
    }
}
public class lab7_1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size");
        int n = sc.nextInt();
        Stack s = new Stack(n);
        System.out.println("Enter choice:");
        System.out.println("1-Push");
        System.out.println("2-pop");
        System.out.println("3-peep");
        System.out.println("4-change");
        int ch = sc.nextInt();
        switch(ch){
            case 1:{
                System.out.println("Write an element that you want to push ");
                int x = sc.nextInt();
                s.push(x);
                break;
            }
            case 2:{
                s.pop();
                break;
            }
            case 3:{
                System.out.println("Enter index to peep an element");
                int i = sc.nextInt();
                s.peep(i);
                break;
            }
            case 4:{
                System.out.println("Enter index to change an element");
                int i= sc.nextInt();
                System.out.println("enter element that you want to change at index "+i);
                int x = sc.nextInt();
                s.change(i,x);
                break;
            }
            default : {
                System.out.println("Enter valid choice");
            }

        }
    }
}