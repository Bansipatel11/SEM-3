import java.util.Scanner;
class Student_Detail{
    int Enrollment_No;
    String Name;
    int Semester;
    double CPI;

    void getDetail(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student Enrollment Number");
        Enrollment_No = sc.nextInt();
        System.out.println("Enter Student Name");
        Name = sc.next();
        System.out.println("Enter Student Semester");
        Semester = sc.nextInt();
        System.out.println("Enter Student CPI");
        CPI = sc.nextDouble();
    }
    void printDetail(){
        System.out.println("Student Details");
        System.out.println(Enrollment_No);
        System.out.println(Name);
        System.out.println(Semester);
        System.out.println(CPI);
    }
}
public class lab6_3{
    public static void main(String[] args){
        Student_Detail[] s = new Student_Detail[5];
        for(int i=0;i<5;i++){
            s[i] = new Student_Detail();
            s[i].getDetail();
        }
        for(int i=0;i<5;i++){
            s[i].printDetail();
        }
    }
}