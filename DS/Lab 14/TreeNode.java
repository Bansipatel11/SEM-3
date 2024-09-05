import java.util.Scanner;
public class TreeNode {
    public TreeNode left, right;
    public int val;

    public TreeNode(int val) {
        this.val = val;
    }
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[8];
        for(int i=0;i<8;i++){
            System.out.println("Enter element at arr["+i+"]");
            arr[i] = sc.nextInt();
        }
        arrayToTree(arr);
    }
}

public TreeNode arrayToTree(Integer[] arr){
    TreeNode root = createTreeNode(arr,1);
    return root;
}

private TreeNode createTreeNode(Integer[] arr, int index){
    if(index<=arr.length){
        Integer value = arr[index-1];
        if(value!=null){
            TreeNode t = new TreeNode(value);
            t.left = createTreeNode(arr, index*2);
            t.right = createTreeNode(arr, index*2+1);
            return t;
        }
    }
    return null;
}