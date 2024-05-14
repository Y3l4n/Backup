import java.util.Scanner;
public class test2 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in); //bat dau scan input
        System.out.print("Enter employee name: ");
        String employeeName = scanner.nextLine();

        System.out.print("Enter basic salary: ");
        double basicSalary = scanner.nextDouble();

        System.out.print("Enter salary coefficient: ");
        double salaryCoefficient = scanner.nextDouble();

        //tao instance cua class Employee thuoc file trenlop2 trong test2
        trenlop2.Employee Employee = new trenlop2().new Employee(employeeName, basicSalary, salaryCoefficient);

        Employee.printInfo();

        double currentSalary = Employee.getSalary(basicSalary, salaryCoefficient);
        System.out.println("Salary: "+ currentSalary);

        boolean increaseSalary = Employee.increaseSalary(2.2);
        System.out.println("Can you increase your salary?: "+increaseSalary);

        scanner.close();//ket thuc scan input
    }
}