import java.util.Scanner;
public class recognize{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String as '[(a-z)c(a-z)]' :");
        String str = sc.next();
        int i=1;
        while(str.charAt(i)!='c'){
            i++;
        }
        i++;
        int j = i;
        i-=2;
        
        while(str.charAt(j)!=' '){
            if(str.charAt(j)==str.charAt(i)){
                i--;
                j++;
            }
            else{
                System.out.println("Invalid String");
                break;
            }
            System.out.println("valid String");
            break;
        }
    }
}
// class String{
//     String str;
//     String(String str){
//         this.str = str;
//     }
// }