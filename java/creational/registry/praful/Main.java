import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Registering sample batches
        BatchRegistry.registerBatch("Java", new Batch("Java"));
        BatchRegistry.registerBatch("Python", new Batch("Python"));

        System.out.println("Available Batches:");
        for (String batchName : BatchRegistry.getBatchNames()) {
            System.out.println("- " + batchName);
        }

        System.out.print("\nEnter batch name to add student to: ");
        String batchInput = scanner.nextLine().trim();
        Batch batch = BatchRegistry.getBatch(batchInput);

        if (batch == null) {
            System.out.println("Batch not found!");
            scanner.close();
            return;
        }

        // Collect student details
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Age: ");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter Gender: ");
        String gender = scanner.nextLine();

        System.out.print("Enter Phone Number: ");
        String phoneNumber = scanner.nextLine();

        System.out.print("Enter Location: ");
        String location = scanner.nextLine();

        // Create and add student
        Student student = new Student(name, age, gender, phoneNumber, location);
        batch.addStudent(student);

        System.out.println("\nStudent added to '" + batch.getName() + "' batch.");

        // Display all students in the batch
        System.out.println(" Students in " + batch.getName() + " Batch:");
        for (Student s : batch.getStudents()) {
            System.out.println(" - " + s.toString());
        }

        scanner.close();
    }
}
