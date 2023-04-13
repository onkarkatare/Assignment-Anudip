package assignment;

class Employee {
    long employeeId;
    String employeeName;
    String employeeAddress;
    long employeePhone;
    double basicSalary;
    double specialAllowance = 250.80;
    double hra = 1000.50;

    Employee(long employeeId, String employeeName, String employeeAddress, long employeePhone, double basicSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeAddress = employeeAddress;
        this.employeePhone = employeePhone;
        this.basicSalary = basicSalary;
    }

    void calculateSalary() {
        double salary = basicSalary + (basicSalary * specialAllowance / 100) + (basicSalary * hra / 100);
        double transportAllowance = basicSalary * 10 / 100;
        salary += transportAllowance;
        System.out.println("Salary of " + employeeName + " is: Rs " + salary);
    }

    void calculateTransportAllowance() {
        double transportAllowance = basicSalary * 10 / 100;
        double salary = basicSalary + (basicSalary * specialAllowance / 100) + (basicSalary * hra / 100);
        salary += transportAllowance;
        System.out.println("Transport allowance of " + employeeName + " is: Rs " + transportAllowance);
        System.out.println("Final salary of " + employeeName + " is: Rs " + (salary - transportAllowance));
    }
}

class Manager extends Employee {
    Manager(long employeeId, String employeeName, String employeeAddress, long employeePhone, double basicSalary) {
        super(employeeId, employeeName, employeeAddress, employeePhone, basicSalary);
    }

    void calculateTransportAllowance() {
        double transportAllowance = basicSalary * 15 / 100;
        double salary = basicSalary + (basicSalary * specialAllowance / 100) + (basicSalary * hra / 100);
        salary += transportAllowance;
        System.out.println("Transport allowance of " + employeeName + " is: Rs " + transportAllowance);
        System.out.println("Final salary of " + employeeName + " is: Rs " + (salary - transportAllowance));
    }
}

class Trainee extends Employee {
    Trainee(long employeeId, String employeeName, String employeeAddress, long employeePhone, double basicSalary) {
        super(employeeId, employeeName, employeeAddress, employeePhone, basicSalary);
    }
}

public class InheritanceActivity {
    public static void main(String[] args) {
        // test case 1
        Manager ob = new Manager(126534, "Peter", "Chennai India", 237844, 65000);
        ob.calculateSalary();
        ob.calculateTransportAllowance();

        // test case 2
        Trainee trainee = new Trainee(29846, "Jack", "Mumbai India", 442085, 45000);
        trainee.calculateSalary();
        trainee.calculateTransportAllowance();
    }
}

