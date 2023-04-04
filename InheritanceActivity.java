package assignment;

class Employee {
    long employeeId;
    String employeeName;
    String employeeAddress;
    long employeePhone;
    double basicSalary;
    double specialAllowance = 250.80;
    double Hra = 1000.50;

    Employee(long employeeId, String employeeName, String employeeAddress, long employeePhone, double basicSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeAddress = employeeAddress;
        this.employeePhone = employeePhone;
        this.basicSalary = basicSalary;
    }

    void calculateSalary() {
        double salary = basicSalary + (basicSalary * specialAllowance / 100) + (basicSalary * Hra / 100);
        System.out.println("Salary of " + employeeName + " is: Rs " + salary);
    }
}

class Manager extends Employee {
    

    Manager(long employeeId, String employeeName, String employeeAddress, long employeePhone, double basicSalary) {
    	super(employeeId, employeeName, employeeAddress, employeePhone, basicSalary);
    }

    /*void calculateSalary() {
        double salary = basicSalary + (basicSalary * specialAllowance / 100) + (basicSalary * Hra / 100);
        System.out.println("Salary of " + employeeName + " is: Rs " + salary);
    }*/
}

public class InheritanceActivity {
    public static void main(String[] args) {
    	//test case 1
        Manager ob = new Manager(126534, "Peter", "Chennai India", 237844, 65000);
        ob.calculateSalary();
    }
}
