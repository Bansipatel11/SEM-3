// Menu Driven Of Circuler Linked List (Lab 13_1)
import java.util.*;
public class MenuDrivenCLL{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        CLL c = new CLL();
        System.out.println("Enter Size of a Linked List");
        int size = sc.nextInt();
        for(int i=0; i<size;i++){
            System.out.println("Enter element to insert:");
            int x = sc.nextInt();
            c.InsertAtFirst(x);
        }
        boolean flag = true;
        while(flag != false){
            System.out.println("--------------------------------------------");
            System.out.println("Enter Choice");
            System.out.println("1.To Insert At First Position");
            System.out.println("2.To Insert At Last Position");
            System.out.println("3.To Insert In Order");
            System.out.println("4.To Delete A Node");
            System.out.println("5.To Display Linked List");
            System.out.println("6.To Break The Loop");
            int choice = sc.nextInt();

            switch(choice){
                case 1:{
                    System.out.println("Enter element to insert at first Position:");
                    int x = sc.nextInt();
                    c.InsertAtFirst(x);
                    c.Display();
                    break;
                }
                case 2:{
                    System.out.println("Enter element to insert at last Position:");
                    int y = sc.nextInt();
                    c.InsertAtLast(y);
                    c.Display();
                    break;
                }
                case 3:{
                    System.out.println("Enter element to insert in Order:");
                    int a = sc.nextInt();
                    c.InsertInOrder(a);
                    c.Display();
                    break;
                }
                case 4:{
                    System.out.println("Enter element to Delete:");
                    int b = sc.nextInt();
                    c.Delete(b);
                    c.Display();
                    break;
                }
                case 5:{
                    c.Display();
                    break;
                }
                case 6:{
                    flag = false;
                    break;
                }
                default:{
                    System.out.println("Enter Valid Choice");
                    break;
                }
            }
        }
    }
}
class node{
    int info;
    node link;
    node(int info){
        this.info=info;
        this.link=null;
    }
}
class CLL{
    node first;
    node last = null;
    
    public void InsertAtFirst(int x){
        node new_node = new node(x);
        new_node.info = x;
        if(first==null){
            new_node.link = new_node;
            first=new_node;
            last=new_node;
        }
        else{
            new_node.link = first;
            last.link = new_node;
            first=new_node;
        }
    }
    public void InsertAtLast(int x){
        node new_node = new node(x);
        new_node.info = x;
        if(first==null){
            new_node.link = new_node;
            first=new_node;
            last=new_node;
        }
        else{
            new_node.link = first;
            last.link = new_node;
            last=new_node;
        }
    }
    public void InsertInOrder(int x){
        node new_node = new node(x);
        new_node.info = x;
        if(first==null){
            new_node.link = new_node;
            first=new_node;
            last=new_node;
            return;
        }
        if(new_node.info<= first.info){
            new_node.link = first;
            last.link = new_node;
            first= new_node;
            return;
        }
        node temp = first;
        while(temp != last && new_node.info >= (temp.link).info){
            temp = temp.link;
        }
        new_node.link = temp.link;
        temp.link = new_node;
        if(temp == last){
            last = new_node;
        }
        return;
    }
    public void Delete(int x){
        if(first == null){
            System.out.println("Linked List Is Empty");
            return;
        }
        node pred = null;
        node temp = first;
        while(temp.info != x && temp != last){
            pred = temp;
            temp = temp.link;
        }
        if(temp.info != x){
            System.out.println("Node Not Found");
            return;
        }
        if(first == last){
            first = null;
            last = null;
        }
        else if(x == first.info){
            first = first.link;
            last.link = first;
        }
        else{
            pred.link = temp.link;
            if(x == last.info){
                // x = last;
                last = pred;
            }
        }
        return;
    }
    public void Display(){
        System.out.println("Final LinkedList");
        node temp = first;
        System.out.print(temp.info);
        temp = temp.link;
        System.out.print(" -> ");
        while(temp != first){
            System.out.print(temp.info);
            temp = temp.link;
            if(temp!= first){
                System.out.print(" -> ");
            }
        }
        System.out.println();
        // System.out.println("First="+first.info);
        // System.out.println("Last="+last.info);
    }
}