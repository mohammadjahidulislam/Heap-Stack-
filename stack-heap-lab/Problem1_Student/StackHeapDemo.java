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
