class Employee {
    String name;
    String empId;
    double salary;

    Employee(String name, String empId, double salary) {
        this.name = name;
        this.empId = empId;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("Employee name: " + name);
        System.out.println("Employee id: " + empId);
        System.out.println("Salary: " + salary);
    }
}

class FullTimeEmployee extends Employee {
    double bonus;

    FullTimeEmployee(String name, String empId, double salary, double bonus) {
        super(name, empId, salary);
        this.bonus = bonus;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + (salary + bonus));
    }
}

class PartTimeEmployee extends Employee {
    int hoursWorked;
    double hourlyRate;

    PartTimeEmployee(String name, String empId, int hoursWorked, double hourlyRate) {
        super(name, empId, hoursWorked * hourlyRate);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Hourly Rate: " + hourlyRate);
        System.out.println("Total Pay: " + (hoursWorked * hourlyRate));
    }
}

class Main {
    public static void main(String[] args) {
        FullTimeEmployee ft = new FullTimeEmployee("Suvraj", "E001", 30000, 5000);
        PartTimeEmployee pt = new PartTimeEmployee("Rahul", "E002", 20, 200);

        System.out.println("--- Full Time Employee ---");
        ft.displayDetails();

        System.out.println("\n--- Part Time Employee ---");
        pt.displayDetails();
    }
}
