import java.util.*;
public class Infix_to_Postfix{

    public static void infixToPostfix(String infix){
        Stack<Character> s = new Stack<>();
        int top=0;
        char next;
        s.push('(');
        top++;
        int r = 0;
        String inString = infix + ')';
        
        char temp;
        String polish="";
            
            for(int i=0;i<inString.length();i++){
                next = inString.charAt(i);
                if(top<1){
                    System.out.println("Invalid String");
                    return;
                }
            

            while(stack_Prec(s.peek()) > input_Prec(next)){
                temp = s.pop();
                top--;
                polish = polish +temp;
                r = r + rank(temp);  
                if(r<1){
                System.out.println("Invalid!");
                }
            }
            if(stack_Prec(s.peek()) != input_Prec(next)){
                s.push(next);
                top++;
            }
            else{
                s.pop();
                top--;
            }
        }
            // i++;
            // next = infix.charAt(i);
        
            if(top != 0 || r != 1){
                System.out.println("Invalid");
            }    
            else{
                System.out.println("PostFix String ="+polish);
            }
    }
    

    public static int input_Prec(char ch){
        if(ch=='^'){
            return 6;
        }
        else if(ch=='*' || ch=='/'){
            return 3;
        }
        else if(ch=='+' || ch=='-'){
            return 1;
        }
        else if(ch>='A' && ch<='Z' || ch>='a' && ch<='z'){
            return 7;
        }
        else if(ch=='('){
            return 9;
        }
        else if(ch==')'){
            return 0;
        }
        else{
            return -1;
        }
    }
    public static int stack_Prec(char ch){
        if(ch=='^'){
            return 5;
        }
        else if(ch=='*' || ch=='/'){
            return 4;
        }
        else if(ch=='+' || ch=='-'){
            return 2;
        }
        else if(ch>='A' && ch<='Z' || ch>='a' && ch<='z'){
            return 8;
        }
        else if(ch=='('){
            return 0;
        }
        else{
            return -1;
        }
    }
    public static int rank(char ch){
        if(ch=='+' || ch=='-' || ch=='*' || ch=='/' || ch=='^'){
            return -1;
        }
        else if(ch>='A' && ch<='Z' || ch>='a' && ch<='z'){
            return 1;
        }
        else{
            return 0;  
        }

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String infix = sc.nextLine();
        System.out.println("Infix String ="+infix);
        infixToPostfix(infix);
    }
}

