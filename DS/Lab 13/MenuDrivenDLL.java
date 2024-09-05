//Menu Driven Of Doubly Linked Linear List
import java.util.*;

public class MenuDrivenDLL{
    class Node{
    int info;
    Node lpter;
    Node rpter;
        Node(int info){
            this.info = info;
            lpter = null;
            rpter = null;
        }
    }
    Node head;
    Node tail;
    public MenuDrivenDLL(){
        this.head = null;
        this.tail = null;
    }
    int size=0;
    public void InsertAtFirst(int info){
        Node new_node = new Node(info);
        if(head == null){
            head = new_node;
            tail = new_node;
            head.lpter = null;
            tail.rpter = null;
            size++;
        }
        else{
            head.lpter = new_node;
            new_node.rpter = head;
            head = new_node;
            new_node.lpter = null;
            size++;
        }
    }
    public void InsertAtLast(int info){
        Node new_node = new Node(info);
        if(tail == null){
            head = new_node;
            tail = new_node;
            head.lpter = null;
            tail.rpter = null;
            size++;
        }
        else{
            tail.rpter = new_node;
            new_node.lpter = tail;
            tail = new_node;
            tail.rpter = null;
            size++;
        }
    }
    public void InsertAtPosition(int info,int position){
        Node new_node = new Node(info);
        if(position < 0 || position > size){
            System.out.println("Enter Valid Position");
            return;
        }
        if(position == 1){
            InsertAtFirst(info);
        } 
        else{
            Node temp = head;
            int currPosition = 1;

            while(temp != null && currPosition<position){
                temp = temp.rpter;
                currPosition++;
            }
            if(temp == null){
                InsertAtLast(info);
            }
            else{
                new_node.rpter = temp;
                new_node.lpter = temp.lpter;
                temp.lpter.rpter = new_node;
                temp.lpter = new_node;
                size++;
            }
        }
    }
    public void Delete(int position){
        Node temp = head;
        if(position < 0 || position > size){
            System.out.println("Enter Valid Position");
            return;
        }
        if(temp == null){
            System.out.println("List Is Empty");
            return;
        }
        else{
            for(int i=1;i<position;i++){
                temp = temp.rpter;
            }
            if(temp == head){
                head = temp.rpter;
                size--;
            }
            else if(temp == tail){
                tail = tail.lpter;
                size--;
            }
            else{
                temp.lpter.rpter = temp.rpter;
                temp.rpter.lpter = temp.lpter;
                size--;
            }
        }
    }
    public void Display(){
        
        Node temp = head; 
        if(temp == null) { 
            System.out.println("List Is Empty");
            return;
        } 
        System.out.println("----Final Doubly Linked List----");
        while(temp != null){
            System.out.print(temp.info);
            temp = temp.rpter; 
            if(temp != null){
                System.out.print(" -> ");
            } 
        }
        System.out.println();
    } 
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        MenuDrivenDLL d = new MenuDrivenDLL();
        boolean flag = true;
        while(flag != false){
            System.out.println("--------------------------------------------");
            System.out.println("Enter Choice");
            System.out.println("1.To Insert At First ");
            System.out.println("2.To Insert At Last ");
            System.out.println("3.To Insert At Specific Position");
            System.out.println("4.To Delete At Specific Position");
            System.out.println("5.To Display Linked List");
            System.out.println("6.To Break The Loop");
            int choice = sc.nextInt();

            switch(choice){
                case 1:{
                    System.out.println("Enter element to insert at first :");
                    int x = sc.nextInt();
                    d.InsertAtFirst(x);
                    d.Display();
                    break;
                }
                case 2:{
                    System.out.println("Enter element to insert at last :");
                    int y = sc.nextInt();
                    d.InsertAtLast(y);
                    d.Display();
                    break;
                }
                case 3:{
                    System.out.println("Enter element to insert At Specific Position:");
                    int a = sc.nextInt();
                    System.out.println("Enter position to insert above element");
                    int pos = sc.nextInt();
                    d.InsertAtPosition(a,pos);
                    d.Display();
                    break;
                }
                case 4:{
                    System.out.println("Enter position to Delete:");
                    int b = sc.nextInt();
                    d.Delete(b);
                    d.Display();
                    break;
                }
                case 5:{
                    d.Display();
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