import java.util.Scanner;
public class Program10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter days");
        int days = sc.nextInt();

        long year,week;
        year = days/365;
        days=days%365;

        week = days/7;
        days = days%7;

        System.out.println(year+"Year:"+week+"Week:"+days+"Days");

        sc.close();
    }
}
