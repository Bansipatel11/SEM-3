import java.util.Scanner;
public class SimpleQueue {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueClass q1 = new QueueClass();

        boolean flag = true;
        while(flag != false){
            System.out.println("-------------------------");
            System.out.println("Enter choice:");
            System.out.println("1. To Enqueue");
            System.out.println("2. To Dequeue");
            System.out.println("3. To Display");
            System.out.println("4. To break the loop");
            int choice = sc.nextInt();

            switch(choice){
                case 1:{
                    System.out.println("Enter Element to insert into queue");
                    int x = sc.nextInt();
                    q1.Enqueue(x);
                    q1.Display();
                    break;
                }
                case 2:{
                    q1.Dequeue();
                    q1.Display();
                    break;
                }
                case 3:{
                    q1.Display();
                    break;
                }
                case 4:{
                    flag = false;
                    break;
                }
                default :{
                    System.out.println("Enter Valid Choice");
                }
            }
            
        }
        // q1.Enqueue(20);
        // q1.Enqueue(30);
        // q1.Enqueue(40);
        // q1.Enqueue(50);
        // q1.Enqueue(60);
        // q1.display();

        // System.out.println();
        // q1.Dequeue();
        // q1.display();
    }
}
class QueueClass{
    int top = -1, f = -1, max = 5;
    int[] arr = new int[max];
    public void Enqueue(int data){
        if(top >= max){
            System.out.println("Queue Overflow");
            return;
        }
        else{

            if( f == -1){
                f = 0;
            }
            top = top+1;
            arr[top] = data;
        }
    }

    public int Dequeue(){
        int y = arr[f];
        if(top < -1){
            System.out.println("Queue underflow");
            return 0;
        }
        else{
            if(f==top){
                f = 0;
                top = 0;
                return y;
            }
            f++;
            return y;
        }
    }

    public void Display(){
        if(top < -1){
            System.out.println("Queue is empty");
        }
        else{
            for(int i=f;i<=top;i++){
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
    }
}