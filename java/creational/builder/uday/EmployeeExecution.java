/**
 * Demonstrates the usage of the Employee class and EmployeeBuilder to create an Employee object.
 */
public class EmployeeExecution {

    /**
     * The entry point of the application.
     *
     * @param args the command-line arguments (not used)
     */
    public static void main(String[] args) {
        try {
            // Building an Employee object using EmployeeBuilder
            Employee employee = new Employee.EmployeeBuilder()
                    .setFirstName("John")
                    .setLastName("Doe")
                    .setAge(30)
                    .setEmpId(101)
                    .setGender("Male")
                    .build();

            // Output the Employee details
            System.out.println("Employee created successfully:");
            System.out.println("First Name: " + employee.getFirstName());
            System.out.println("Last Name: " + employee.getLastName());

        } catch (IllegalArgumentException e) {
            // Handle invalid input during Employee creation
            System.err.println("Error: " + e.getMessage());
        }
    }
}
