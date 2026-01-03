public class Employee {

    // private instance variables
    private int employee_id;
    private String employee_name;
    private double employee_salary;

    // Getter and Setter for employee_id
    public int getEmployeeId() {
        return employee_id;
    }
    public void setEmployeeId(int employee_id) {
        this.employee_id = employee_id;
    }
    // Getter and Setter for employee_name
    public String getEmployeeName() {
        return employee_name;
    }
    public void setEmployeeName(String employee_name) {
        this.employee_name = employee_name;
    }
    // Setter for employee_salary
    public void setEmployeeSalary(double employee_salary) {
        this.employee_salary = employee_salary;
    }
    // Getter for employee_salary (formatted string)
    public String getEmployeeSalary() {
        return String.format("Rs.%.2f", employee_salary);
    }

    // main method inside same class
    public static void main(String[] args) {

        Employee emp = new Employee();

        emp.setEmployeeId(101);
        emp.setEmployeeName("Sumit");
        emp.setEmployeeSalary(55000.75);

        System.out.println("Employee ID: " + emp.getEmployeeId());
        System.out.println("Employee Name: " + emp.getEmployeeName());
        System.out.println("Employee Salary: " + emp.getEmployeeSalary());
    }
}
