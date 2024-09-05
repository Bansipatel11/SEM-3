// Write a program to sort elements of a linked list. 
public class lab12_65{
    public static void main(String[] args){
        LL l1 = new LL();
        l1.insertAtFirst(50);
        l1.insertAtFirst(30);
        l1.insertAtFirst(50);
        l1.insertAtFirst(20);
        l1.insertAtFirst(30);
        l1.sortLL();
        l1.display();
    }
}

class LL{
    class Node{
        int data;
        Node link;
        Node(int data){
            this.data = data;
            this.link = null;
        }
    }
    public Node first = null;
    // This function inserts an element at the first position in Singly Linked Linear List
    public void insertAtFirst(int data){
        Node newNode = new Node(data);
            if(first==null){
                first = newNode;
                return;
            }
                Node temp = first;
                first = newNode;
                first.link = temp;
        
    }
    //Making a function sortLL which will sort linked list in ascending order
    //e.g. 1->5->3
    //Output: 1->3->5
    public void sortLL(){
        Node curr = first;
        Node index = null;
        int temp;
        if(first==null){
            return;
        }
        else{
            while(curr!=null){
                index = curr.link;
                while(index!=null){
                    if(curr.data>index.data){
                        //swap logic
                        temp = curr.data;
                        curr.data = index.data;
                        index.data= temp;
                    }
                    index = index.link;
                }
                curr = curr.link;
            }
        }
    }
    //This function displays the final output of corresponding Singly Linked List
    public void display(){
        Node current = first;
        while(current!=null){
            System.out.print(current.data+" ");
            current = current.link;
        }
        System.out.println();
    }
}