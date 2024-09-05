// Evaluation Postfix Expretion
// "231*+9-"
import java.util.*;
public class Evaluation_Of_Postfix{
    public static void main(String[] args){
        System.out.println("Enter String");
        String infix = sc.next();
        System.out.println("PostFix Evaluation:" + posteval(infix));
    }
    static int posteval(String infix){
        Stack<Integer> s = new Stack<>();
        for(int i=0;i<infix.length();i++){
            char temp = infix.charAt(i);
            if(Character.isDigit(temp)){
                s.push(Integer.parseInt(String.valueOf(temp)));
            }
            else{
                int op2 = s.pop();
                int op1 = s.pop();
                switch(temp){
                    case'+':{
                        s.push(op1 + op2);
                        break;
                    }
                    case'-':{
                        s.push(op1 - op2);
                        break;
                    }
                    case'*':{
                        s.push(op1 * op2);
                        break;
                    }
                    case'/':{
                        s.push(op1 / op2);
                        break;
                    }
                    // case'^':{
                    //     s.push(op1^op2);
                    //     break;
                    // }
                }
            }
        }
        return(s.pop());
    }
}