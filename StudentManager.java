import java.util.Scanner;

class Student {
    String name;
    int rollNumber;
    double marks;
    Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("---------------------------");
    }
}

public class StudentManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int count = scanner.nextInt();
        scanner.nextLine();

        Student[] students = new Student[count];
        for (int i = 0; i < count; i++) {
            System.out.println("Enter details for Student " + (i + 1));

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Roll Number: ");
            int rollNumber = scanner.nextInt();

            System.out.print("Marks: ");
            double marks = scanner.nextDouble();
            scanner.nextLine();

            students[i] = new Student(name, rollNumber, marks);
        }

    
        System.out.println("\n--- Student Details ---");
        for (Student student : students) {
            student.display();
        }
        Student topper = students[0];
        for (int i = 1; i < students.length; i++) {
            if (students[i].marks > topper.marks) {
                topper = students[i];
            }
        }

        System.out.println("Toppers is:");
        topper.display();1


        scanner.close();
    }
}

