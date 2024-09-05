import java.util.Scanner;
public class Program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* to check entered character is vowel or not */
        System.out.println("Enter character");
        char ch = sc.nextLine().charAt(0);

        if(ch == 'a'|| ch == 'e'|| ch == 'i'|| ch == 'o'|| ch == 'u'){
            System.out.println("It is vowel");
        }
        else{
            System.out.println("Soryy! it's not");
        }

        sc.close();
    }
}
