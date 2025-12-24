import java.util.Scanner;

public class Employeemanage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Emplooyee ID: ");
        int epmid = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter  age: ");
        int age = sc.nextInt();
        System.out.print("Enter Salary: ");
        double Sal = sc.nextDouble();

        System.out.println("Choose Department:");
        System.out.println("1. IT");
        System.out.println("2. HR");
        System.out.print("Enter choice: ");
        int dept = sc.nextInt();

        switch (dept) {
            case 1: 
                System.out.println("\nIT Roles:");
                System.out.println("1. Developer");
                System.out.println("2. Tester");
                System.out.print("Select role: ");
                int itRole = sc.nextInt();

                switch (itRole) {
                    case 1:
                        System.out.println("Role: Developer");
                        System.out.println("Designation: Software Engineer");
                        System.out.println(Sal + (Sal* 30/100));
                        break;
                    case 2:
                        System.out.println("Role: Tester");
                        System.out.println("Designation: QA Engineer");
                        System.out.println(Sal + (Sal* 20/100));
                        break;
                    default:
                        System.out.println("Invalid IT role selection");
                        System.out.println("Null");
                }
                break;
            case 2: //Hr role 
                System.out.println("\nHR Roles:");
                System.out.println("1. Recruiter");
                System.out.println("2. HR Executive");
                System.out.print("Select role: ");
                int hrRole = sc.nextInt();

                switch (hrRole) {
                    case 1:
                        System.out.println("Role: Recruiter");
                        System.out.println("Designation: Talent Acquisition Specialist");
                        System.out.println(Sal + (Sal*15/100));
                        break;
                    case 2:
                        System.out.println("Role: HR Executive");
                        System.out.println("Designation: Human Resources Officer");
                        System.out.println(Sal + (Sal*10/100));
                        break;
                    default:
                        System.out.println("Invalid HR role selection");
                        System.out.println("Null");
                }
                break;

        }
    }
}
