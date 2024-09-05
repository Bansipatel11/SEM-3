import java.util.Scanner;
class Node{
    int data;
    Node link;
    Node(int data){
        this.data = data;
        this.link = null;
    }
}
public class LinkedList_same_or_not{
    public static void main(String[] args){
        LinkedList list1 = new LinkedList();
        list1.InsertAtFirst(10);
        list1.InsertAtFirst(20);
        list1.InsertAtFirst(30);
        list1.InsertAtFirst(40);
        list1.InsertAtFirst(50);
        
        LinkedList list2 = new LinkedList();
        list2.InsertAtFirst(10);
        list2.InsertAtFirst(20);
        list2.InsertAtFirst(30);
        list2.InsertAtFirst(40);
        list2.InsertAtFirst(50);

        System.out.println("List 1:");  
        list1.display();
        System.out.println("List 2:");  
        list2.display();

        Node temp1 = list1.first;
        Node temp2 = list2.first;

        while(temp1 != null && temp2 != null){
            if(temp1.data != temp2.data){
                System.out.println("---------Data are not same--------");
                break;
            }
            temp1 = temp1.link;
            temp2 = temp2.link;            
        }
        System.out.println("--------List Are Same--------");
        
    }
}
class LinkedList{
    Node first;
    LinkedList(){
        this.first = first;
    }

    public void InsertAtFirst(int x){
            Node new_node = new Node(x);
            if(first == null){
                first = new_node;
            }
            else {  
            Node temp = first;  
            while (temp.link != null) {  
                temp = temp.link; // Traverse to the last node  
            }  
            temp.link = new_node;
        }
    }
    public void display() {  
        Node temp = first;  
        while (temp != null) {  
            System.out.print(temp.data + " -> ");  
            temp = temp.link;  
        }  
        System.out.println("null");  
    }  
}