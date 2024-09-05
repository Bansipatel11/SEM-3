import java.util.Scanner;
public class stackM {
    static int top=-1, max=5;
    static int[] stack_arr = new int[max];
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int flag=0;
        System.out.println("Welcome to stack");
        // for(int i=0 ; i<5 ; i++){
        //                 System.out.println("Enter element ");
        //                 int pushElement = sc.nextInt();
        //                 stackPush(pushElement);
        //                 }
        while (flag!=-1) {
            System.out.println("-------------------------");
            System.out.println("Enter 1. to push element");
            System.out.println("Enter 2. to pop element");
            System.out.println("Enter 3. to peep element");
            System.out.println("Enter 4. to change element");
            System.out.println("Enter 5. to display stack");
            System.out.println("And at final enter 6 to exit");
            int state = sc.nextInt();
            if(state==6){
                flag = -1;
                break;
            }
            else{
                

                switch (state) {
                    case 1: 
                        System.out.println("Enter Element to push");
                        int p = sc.nextInt();
                        stackPush(p);
                        stackDisplay();
                        break;
                         
                    case 2:
                        stackPop();
                        System.out.println(stack_arr[top+1]);
                        break;

                    case 3:   
                        System.out.println("Enter index of elemnt you want to peep from top");
                        int i = sc.nextInt();
                        stackPeep(i);
                        System.out.println("Peeped element = "+stack_arr[top-i+1]);
                        break;

                    case 4:
                        System.out.println("Enter index of element from top you want to change");
                        int x = sc.nextInt();
                        System.out.println("Enter element that you want to change with");
                        int c = sc.nextInt();
                        stackChange(x, c);
                        stackDisplay();
                        break;

                    case 5:    
                        stackDisplay();
                        break;
                
                    default:
                        System.out.println("Invalid input");
                        break;
                }
            }
        }
        sc.close();
    }

    public static void stackPush(int x){
        if(top >= max){
            System.out.println("Stack overflow");
        }
        else{
            top = top+1;
            stack_arr[top] = x;
        }
    }
    public static int stackPop(){
        if(top == 0){
            System.out.println("Stack underflow");
            return(0);
        }
        else{
            top = top-1;
            return(stack_arr[top+1]);
        }
    }
    public static int stackPeep(int i){
        if(top-i+1 <= -1){
            System.out.println("Stack underflow");
            return(0);
        }
        else{
            
            return (stack_arr[top-i+1]);
        }
    }
    public static int stackChange(int x, int c){
        if(top-x+1 <= -1){
            System.out.println("Stack underflow");
            return(0);
        }
        else{
            stack_arr[top-x+1] = c;
            return(stack_arr[top-x+1]);
        }
    }
    public static void stackDisplay(){
        if(top < 0){
            System.out.println("Stack is empty");
        }
        else{
            for(int i=0;i<=top;i++){
                System.out.print(stack_arr[i]+" , ");
            }
        }
    }
}
