import java.util.Scanner;

class Employee {

private String employeeName;
private double employeeSalary;

public void readEmployeeData () {
Scanner sc = new Scanner(System.in);

System.out.println ("Enter employee name");
 employeeName = sc.nextLine();

System.out.println ("Enter employee Salary");
 employeeSalary = sc.nextDouble();
}

public void  displayEmployeeData () {
 System.out.println ("Employee Name :" + employeeName);
 System.out.println ("Employee Salary :" + employeeSalary);
}

public static void main (String[] args) {
System.out.println("Enrollment No : 240390107051");
Employee emp = new Employee();

emp.readEmployeeData ();
emp.displayEmployeeData ();

}

}