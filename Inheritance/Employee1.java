package Inheritance;

public class Employee1 {
    int id;
    String name;
    double salary;
    static int count;
    

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public static int getCount() {
        return count;
    }
    public static void setCount(int count) {
        Employee1.count = count;
    }

    // Default constructor
    Employee1() {
        id = 11;
        name = "samiksha";
        salary = 3500000;
        count++;
    }

    // Parameterized constructor
    public Employee1(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        count++;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

// ---------------- SALES MANAGER CLASS --------------------
class SalesManager extends Employee1 {
    double incentive;
    int target;

    public double getIncentive() {
        return incentive;
    }
    public void setIncentive(double incentive) {
        this.incentive = incentive;
    }
    public int getTarget() {
        return target;
    }
    public void setTarget(int target) {
        this.target = target;
    }

    SalesManager() {
        super();
        incentive = 11;
        target = 2;
    }

    public SalesManager(int id, String name, double salary, double incentive, int target) {
        super(id, name, salary);
        this.incentive = incentive;
        this.target = target;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Incentive: " + incentive);
        System.out.println("Target: " + target);
    }
}

// ---------------- HR CLASS --------------------
class HR extends Employee1 {
    double commissions;

    public double getCommissions() {
        return commissions;
    }
    public void setCommissions(double commissions) {
        this.commissions = commissions;
    }

    HR() {
        super();
        commissions = 1550.34;
    }

    public HR(int id, String name, double salary, double commissions) {
        super(id, name, salary);
        this.commissions = commissions;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Commissions: " + commissions);
    }
}

// ---------------- ADMIN CLASS --------------------
class Admin extends Employee1 {
    int allowance;

    int getAllowance() {
        return allowance;
    }
    void setAllowance(int allowance) {
        this.allowance = allowance;
    }

    Admin() {
        super();
        allowance = 80;
    }

    Admin(int id, String name, double salary, int allowance) {
        super(id, name, salary);
        this.allowance = allowance;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Allowance: " + allowance);
    }
}

// ---------------- MAIN CLASS --------------------
class Inheritance6 {
    public static void main(String[] args) {

    	Employee1 e = new Employee1();
        e.display();

        SalesManager sm2 = new SalesManager(112, "shalu", 70000, 12, 3);
        sm2.display();

        HR h = new HR(678,"sanika",80000,1550.34);
        h.display();
        
        Admin a = new Admin(234,"Payal",60000,80);
        a.display();

        System.out.println("\nEmployee total count: " + Employee1.getCount());
    }
}
