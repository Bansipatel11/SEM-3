//Delete Alternate Nodes of a  Doubly Linked List
import java.util.*;
public class Del_Alt_Node{
    class Node{
        int info;
        Node link;
        Node lpter;
        Node rpter;
        Node(int info){
            this.info = info;
            this.link = null;
            lpter = null;
            rpter = null;
        }
    }
    Node head;
    Node tail;
    Del_Alt_Node(){
        this.head = null;
        this.tail = null;
    }
    void deleteAlt(){
        if(head == null){
            return;
        }
        Node temp = head;
        while(temp != null && temp.rpter != null){
            temp.rpter = temp.rpter.rpter;
            temp = temp.rpter;
        }
    }
    public void push(int info){
        Node new_node = new Node(info);
        if(tail == null){
            head = new_node;
            tail = new_node;
            head.lpter = null;
            tail.rpter = null;
        }
        else{
            tail.rpter = new_node;
            new_node.lpter = tail;
            tail = new_node;
            tail.rpter = null;
        }
    }
    void Display(){
        Node temp = head; 
        if(temp == null) { 
            System.out.println("List Is Empty");
            return;
        } 
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
        Del_Alt_Node d = new Del_Alt_Node();

        System.out.println("Enter Size Of A Linked List");
        int size = sc.nextInt();
        for(int i=0;i<size;i++){
            System.out.println("Enter Element");
            int ai = sc.nextInt();
            d.push(ai);
        }
        System.out.println("-----Linked List Before Calling DeleteAlt-----");
        d.Display();
        d.deleteAlt();
        
        System.out.println("-----Linked List After Calling DeleteAlt-----");
        d.Display();
    }
}