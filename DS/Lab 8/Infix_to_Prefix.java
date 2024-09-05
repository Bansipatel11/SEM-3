import java.util.*;

public class Infix_to_Prefix{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a new String : ");
        String infix = sc.nextLine();
        String revString = "";
        for(int i=infix.length()-1;i>=0;i--){
            if(infix.charAt(i)=='('){
                revString = revString + ')';
            }
            else if(infix.charAt(i)==')'){
                revString = revString + '(';
            }
            else{
            revString = revString + infix.charAt(i);
            }      
        }
        System.out.println("Reverce String:"+revString);

        infixToPrefix(revString);

    }

    public static void infixToPrefix(String revString){
        Stack<Character> s = new Stack<>();
        int top=0;
        s.push('(');
        top++;
        char next;
        int r = 0;
        String inString = revString + ')';
        
        char temp;
        String polish="";
            
            for(int i=0;i<inString.length();i++){
                next = inString.charAt(i);
                if(top<1){
                    System.out.println("Invalid String");
                    return;
                }
                while(stackPrec(s.peek()) > inputPrec(next)){
                    temp = s.pop();
                    top--;
                    polish = polish +temp;
                    r = r + rankValue(temp);  
                    if(r<1){
                    System.out.println("Invalid!");
                    }
                }
                if(stackPrec(s.peek()) != inputPrec(next)){
                    s.push(next);
                    top++;
                }
                else{
                    s.pop();
                    top--;
                }
            }
            if(top != 0 || r != 1){
                System.out.println("Invalid");
            }    
            else{
                System.out.println("Nearly PostFix String ="+polish);
            }
            String finalPref = "";
            for(int i = polish.length()-1;i>=0;i--){
                finalPref = finalPref + polish.charAt(i);
            }
            System.out.println("Prefix String: "+finalPref);
        }
    
    public static int stackPrec(char ch){
        if(ch=='+' || ch=='-'){
            return 1;
        }
        else if (ch=='*' || ch=='/'){
            return 3;
        }
        else if (ch=='^'){
            return 6;
        }
        else if ((ch>='a'&& ch<='z') || (ch>='A' && ch<='Z')){
            return 8;
        }
        else
            return 0;
    }
    public static int inputPrec(char ch){
        if(ch=='+' || ch=='-'){
            return 2;
        }
        else if (ch=='*' || ch=='/'){
            return 4;
        }
        else if (ch=='^'){
            return 5;
        }
        else if (ch>='a'&& ch<='z' || (ch>='A' && ch<='Z')){
            return 7;
        }
        else if(ch=='('){
            return 9;
        }
        else 
            return 0;
     }

    public static int rankValue(char ch)
    {
        if(ch=='+' || ch=='-' || ch=='*' || ch=='/' || ch=='^'){
            return -1;
        }
        else
            return 1;
     }
}