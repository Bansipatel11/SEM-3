// Java program to pairwise swap elements of a linked list
class lab12_68 {
    Node first;

    class Node {
        int data;
        Node link;
        Node(int d)
        {
            data = d;
            link = null;
        }
    }

     public void pairWiseSwap(){
        if (first == null || first.link == null) {
            return;
        }
        Node prev = null;
        Node curr = first;
        Node link;
        first = first.link;
        while (curr != null && curr.link != null) {
            link = curr.link;
            if (prev != null) {
                prev.link = link;
            }
            prev = curr;
            curr = link;
            link = curr.link; 
            curr.link = prev;
            curr = link;
        }
        if (prev != null) {
            prev.link = curr; 
        }
    }

    public void push(int new_data)
    {
        Node new_node = new Node(new_data);

        new_node.link = first;
        first = new_node;
    }
    void printList()
    {
        Node temp = first;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.link;
        }
        System.out.println();
    }
    public static void main(String args[]){
        lab12_68 llist = new lab12_68();

        llist.push(8);
        llist.push(6);
        llist.push(5);
        llist.push(4);
        llist.push(3);
        llist.push(2);
        llist.push(1);
        System.out.println("Linked List before calling pairWiseSwap() ");
        llist.printList();

        llist.pairWiseSwap();

        System.out.println("Linked List after calling pairWiseSwap() ");
        llist.printList();
    }
}