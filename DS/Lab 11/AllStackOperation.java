import java.util.Scanner;
public class AllStackOperation{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StackOperation s = new StackOperation();
        System.out.println("Enter size of a Stack");
        int size = sc.nextInt();
        for(int i=1;i<=size;i++){
            System.out.println("Enter "+i+" element");
            int x = sc.nextInt();
            s.push(x);
        }
        boolean flag = true;
        while(flag != false){
            System.out.println("-------------------------");
            System.out.println("Enter Choice:");
            System.out.println("1.To Push");
            System.out.println("2.To Pop");
            System.out.println("3.To Peep");
            System.out.println("4.To change");
            System.out.println("5.To Display");
            System.out.println("6.To break the loop");

            int choice = sc.nextInt();
            
            switch(choice){
                case 1:{
                    System.out.println("Enter an element that you want to push");
                    int x = sc.nextInt();
                    s.push(x);
                    s.display();
                    break;
                }
                case 2:{
                    s.pop();
                    s.display();
                    break;
                }
                case 3:{
                    // System.out.println("Enter index to peep that data");
                    // int i = sc.nextInt();
                    s.peep();
                    break;
                }
                case 4:{
                    System.out.println("Enter element that you want to change");
                    int i = sc.nextInt();
                    System.out.println("Enter element that you want to replace with");
                    int x = sc.nextInt();
                    s.change(i,x);
                    s.display();
                    break;
                }
                case 5:{
                    s.display();
                    break;
                }
                case 6:{
                    flag = false;
                    break;
                }
                default :{
                    System.out.println("Enter valid choice");
                }
            }
        }

    }
}
class StackOperation{

    class node{
        int data;
        node link;
    }

    node top;
    StackOperation(){
        this.top=null;
    }

    public void push(int x){
        node n = new node();
        // check for stack Overflow
        if(n==null){
            System.out.println("Stack Overflow");
            return;
        }
        n.data = x;
        n.link = top;

        top = n;
    }
    public void pop(){
        if (top == null) {
            System.out.print("\nStack Underflow");
            return;
        }
        System.out.println("Current Top="+top.data);
        top = top.link;
        System.out.println("Updated Top="+top.data);
    }
    public void peep(){
        if(top!=null){
            System.out.println("Peeped data="+top.data);
        }
        else{
            System.out.println("Stack is empty");
        }
        // if(top-i+1 < 0){
        //     System.out.println("Stack Underflow");
        // }
        // else{
        //     System.out.println("Peeped data = "+top-i+1);
        // }
    }
    public void change(int i,int x){
        if (top == null) {
            System.out.print("\nStack Underflow");
            return;
        }
        node temp = top;
        while(temp.data != i){
            temp = temp.link;
        }
        if(temp.data == i){
            temp.data=x;
        }
        else{
            System.out.println("Element not found");
        }
    }
    public void display(){
        // check for stack underflow
        if(top==null){
            System.out.println("Stack Underflow");
        }
        else{
            node temp = top;
            System.out.println("Final LinkedList");
            while(temp!=null){
                System.out.print(temp.data);

                temp=temp.link;
                if(temp != null){
                    System.out.print(" -> "); 
                }
            }
            System.out.println();
        }
    }
}