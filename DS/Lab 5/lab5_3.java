//Anagram
import java.util.Arrays;
import java.util.Scanner;
public class lab5_3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of an array");
        int n = sc.nextInt();
        String[] arr = new String[n];
        for(int i=0;i<n;i++){
            System.out.println("enter word at index arr["+i+"]");
            arr[i] = sc.next();
        }
        int random = (int)(Math.random()*n-1);
        System.out.println("Random word is:"+arr[random]);

        System.out.println("Enter Word to check Anagram:");
        String word = sc.next();

        char[] c = word.toCharArray();
        char[] ch = arr[random].toCharArray();
        
        Arrays.sort(c);
        Arrays.sort(ch);

        int temp = 0;
        for(int i=0;i<c.length;i++){
            if(c[i]==ch[i]){
                temp++;
                continue;
            }
            else{
                System.out.println("--------------------------------");
                System.out.println("Not Anagram");
                break;
            }
        }
        if(temp==c.length){
            System.out.println("----------------------------------------");
            System.out.println("It is Anagram");
        }
        
    }
}
