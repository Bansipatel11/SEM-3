import java.util.Scanner;
class Node{
    int info;
    Node left;
    Node right;
    Node(int info){
        this.info = info;
        left = null;
        right = null;
    }
}
public class PreOrder{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter Size of an array");
        // int size = sc.nextInt();
        int[] arr = new int[8];
        for(int i=0;i<8;i++){
            System.out.println("Enter element at arr["+i+"]");
            arr[i] = sc.nextInt();
        }
        root = new Node(arr[0]);
        root.left = new Node(arr[1]);
        root.right = new Node(arr[2]);
        root.left.left = new Node(arr[3]);
        root.left.right = new Node(arr[4]);
        root.right.left = new Node(arr[5]);
        root.right.right = new Node(arr[6]);
        root.left.left.left = new Node(arr[7]);
        
        System.out.println("Tree in PreOrder");
        print(root);
    }
    static Node root=null;
    static void print(Node n){
        if(n == null){
            // System.out.println("Tree is empty");
            return;
        }
        
        System.out.print(n.info+" ");
        print(n.left);
        print(n.right);
    }
}