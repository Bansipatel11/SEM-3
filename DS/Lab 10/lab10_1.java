import java.util.Scanner;
class node{
    int data;
    node link;
    node(int data){
        this.data = data;
        this.link = null;
    }
}
public class lab10_1{
    public static void main(String[] args){
        node n1 = new node(10);
        node n2 = new node(20);
        node n3 = new node(30);
        node n4 = new node(40);

        n1.link = n2;
        n2.link = n3;
        n3.link = n4;

        node temp = n1;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.link;
        }

    }
}