class Employee {
    String name;
    String department;

    Employee(String n, String d) {
        name = n;
        department = d;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
    }
}

class Manager extends Employee {
    int teamSize;
    String project;

    Manager(String n, String d, int t, String p) {
        super(n, d);
        teamSize = t;
        project = p;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Team Size: " + teamSize);
        System.out.println("Project: " + project);
    }
}

class Main {
    public static void main(String[] args) {
        System.out.println("Name : Jay");
        System.out.println("Enrollment : 240390107051");

        Employee e = new Employee("Rahul", "HR");
        Manager m = new Manager("Amit", "IT", 5, "AI Project");

        e.displayDetails();
        System.out.println();
        m.displayDetails();
    }
}
