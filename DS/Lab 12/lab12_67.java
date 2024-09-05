import java.io.*;

class lab12_67 {

    // Structure of a Node
    public static class ListNode {
        int data;
        ListNode next;
        ListNode(int data) { this.data = data; }
    }

    // Euclidean function for GCD Calculation
    public static int gcd(int x, int y)
    {
        if (y == 0)
            return x;
        return gcd(y, x % y);
    }

    // Insertion of GCD
    public static ListNode
    insertGreatestCommonDivisors(ListNode head)
    {

        // Base Case
        if (head == null || head.next == null)
            return head;

        // Variable initialization
        ListNode prev = null;
        ListNode curr = head;
        ListNode n = curr.next;

        // Traversing linked list and simultaniously
        // inserting new node having gcd of both nodes
        while (n != null) {
            int val = gcd(curr.data, n.data);
            ListNode temp = new ListNode(val);
            prev = curr;
            curr = n;
            n = n.next;
            temp.next = curr;
            prev.next = temp;
        }
        return head;
    }

    // Driver Function
    public static void main(String[] args)
    {

        // Creating a linked list
        ListNode head = new ListNode(30);
        head.next = new ListNode(6);
        head.next.next = new ListNode(14);
        head.next.next.next = new ListNode(3);

        // Function call for operation
        ListNode ans = insertGreatestCommonDivisors(head);
        ListNode temp = ans;

        // Traversing the final linked list
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}