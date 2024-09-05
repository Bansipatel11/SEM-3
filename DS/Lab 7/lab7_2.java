import java.util.Stack;

public class lab7_2 {

public static void main(String[] args){
boolean eval = isInLanguage("sod$dos");

System.out.println(eval);


}




static //   astack.createStack();
    boolean isInLanguage(String aString){
    Stack<Character> aStack = new Stack<>(); 


    int i = 0;
    char ch = aString.charAt(i);
    while (ch != '$') {
        aStack.push(ch);
        i++;
    }
    //Skip the $
    ++i;

    // match the reverse of w
    boolean inLanguage = true; // assume string is in language
    while (inLanguage && i < aString.length()) {
        char stackTop;
        ch = aString.charAt(i);;
        try {
            stackTop =  (char) aStack.pop();
            if (stackTop == ch) {
                i++;
            } else {
                // top of stack is not ch(Charecter do not match)
                inLanguage = false; // reject string

            }
        } catch (Exception e) {
            // aStack.poo() failed, astack is empty (first, half of Stirng
            // is short than second half)

            inLanguage = false;
        }
    }

    if (inLanguage && aStack.isEmpty()) {
        return true;
    }
    else{
        return false;

    }
}
}

