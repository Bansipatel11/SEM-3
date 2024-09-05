import java.util.Scanner;
public class Program1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* Area of circle */

        System.out.println("Enter Radius");
        double radius = sc.nextInt();

        double ans = Math.PI*radius*radius;
        System.out.println("area of circle with radius "+radius+" is "+ans);

        sc.close();
    }
}