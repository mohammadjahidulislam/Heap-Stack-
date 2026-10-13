import java.util.Scanner;

class Employee {
    // Instance field: Employee object-er bhetore (Heap) thake
    int salary;

    void display(int b) {
        // Local variable: display() method-er stack frame-e thake
        int bonus = b;

        System.out.println();
        System.out.println("Inside display() Method:");
        System.out.println("Salary (Instance Variable): " + salary);
        System.out.println("Bonus (Local Variable): " + bonus);

        // Local inner class: display() er bhetore define kora
        class Report {
            void show() {
                // show() nijer method frame-e cholে
                System.out.println("Report: Employee salary is " + salary);
            }
        }

        // Report object-o Heap-e toiri hoy
        Report r = new Report();
        System.out.println();
        System.out.println("Report Object Created");
        System.out.println("Report Identity Hash Code: " + System.identityHashCode(r));
        r.show();
    }
}

public class EmployeeReportDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter salary: ");
        int salary = sc.nextInt();
        System.out.print("Enter bonus: ");
        int bonus = sc.nextInt();

        Employee e = new Employee();
        e.salary = salary;

        System.out.println();
        System.out.println("Employee Object Created");
        System.out.println("Employee Identity Hash Code: " + System.identityHashCode(e));

        e.display(bonus);

        System.out.println();
        System.out.println("Memory Concept:");
        System.out.println("Employee object -> Heap");
        System.out.println("Report object -> Heap");
        System.out.println("salary -> Instance field");
        System.out.println("bonus -> Local variable in display()");
        System.out.println("show() -> Executes in its own method frame");

        sc.close();
    }
}
