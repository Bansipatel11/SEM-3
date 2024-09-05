import java.util.Scanner;
class Employee_Detail{
    int Employee_ID;
    String Name;
    String Designation;
    int Salary;

    void getDetail(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee ID");
        Employee_ID = sc.nextInt();
        System.out.println("Enter Employee name");
        Name = sc.next();
        System.out.println("Enter Employee Designation");
        Designation = sc.next();
        System.out.println("Enter Employee Salary");
        Salary = sc.nextInt();

    }
    void printDetail(){
        System.out.println("Employee Details");
        System.out.println(Employee_ID);
        System.out.println(Name);
        System.out.println(Designation);
        System.out.println(Salary);
    }
}
public class lab6_2{
    public static void main(String[] args){
        Employee_Detail a = new Employee_Detail();
        a.getDetail();
        a.printDetail();
    }
}