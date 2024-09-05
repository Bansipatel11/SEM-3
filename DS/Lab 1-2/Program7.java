import java.util.Scanner;
public class Program7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Seconds");
        int seconds = sc.nextInt();

        long hour,minutes;
        hour = seconds/3600;
        seconds=seconds%3600;

        minutes = seconds/60;
        seconds = seconds%60;

        System.out.println(hour+"Hours:"+minutes+"Minutes"+seconds+"Seconds");

        sc.close();
    }
}
