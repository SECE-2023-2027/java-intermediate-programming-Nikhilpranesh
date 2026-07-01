import java.util.Scanner;

// Student class to store student details
class Student {

    // Private variables (Encapsulation)
    private String name;
    private int[] marks;

    // Constructor to initialize values
    public Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

    // Getter for name (optional but good practice)
    public String getName() {
        return name;
    }

    // Method to calculate average marks
    public double calculateAverage() {

        // Validation: check if marks array is null or empty
        if (marks == null || marks.length == 0) {
            return 0.0;
        }

        int sum = 0;

        // Loop through marks and calculate sum
        for (int i = 0; i < marks.length; i++) {
            sum += marks[i];
        }

        // Calculate average
        double average = (double) sum / marks.length;

        return average;
    }
}

// Main class to run program
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Step 1: Take student name input
        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        // Step 2: Take number of subjects
        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();

        // Step 3: Validate number of subjects
        if (n <= 0) {
            System.out.println("Invalid number of subjects!");
            sc.close();
            return; // exit program
        }

        // Step 4: Create array to store marks
        int[] marks = new int[n];

        // Step 5: Take marks input
        for (int i = 0; i < n; i++) {

            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();

            // Optional validation for marks
            if (marks[i] < 0) {
                System.out.println("Negative marks not allowed. Setting to 0.");
                marks[i] = 0;
            }
        }

        // Step 6: Create Student object
        Student student = new Student(name, marks);

        // Step 7: Calculate average
        double avg = student.calculateAverage();

        // Step 8: Display result
        System.out.println("\n--- Student Details ---");
        System.out.println("Name: " + student.getName());
        System.out.println("Average Marks: " + avg);

        sc.close();
    }
}