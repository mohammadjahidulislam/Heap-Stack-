Name:MD.Jahidul Islam














ID:IT24018













Problem 1: Student.java









Source Code:









import java.util.Scanner;

class Student {
    // Instance variable: Student object-er bhetore (Heap) thake
    int age;

    void display(int m) {
        // Local variable: display() method-er stack frame-e thake
        int marks = m;

        System.out.println("Instance Variable (age): " + age);
        System.out.println("Local Variable (marks): " + marks);
    }
}

public class StackHeapDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Age: ");
        int age = sc.nextInt();
        System.out.print("Marks: ");
        int marks = sc.nextInt();

        // 's' reference stack-e, Student object heap-e
        Student s = new Student();
        s.age = age;

        System.out.println();
        System.out.println("Student Object Created");
        System.out.println("Object Identity Hash Code: " + System.identityHashCode(s));
        s.display(marks);

        sc.close();
    }
}




OUTPUT:








<img width="1752" height="252" alt="image" src="https://github.com/user-attachments/assets/98be1868-3047-4923-8ca8-c9c88a4ff45c" />
























PROBLEM 2: Employee.java







Source Code:










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






OUTPUT:






<img width="1810" height="546" alt="image" src="https://github.com/user-attachments/assets/df1e07dd-8c47-41ed-8b30-6ac792411407" />




