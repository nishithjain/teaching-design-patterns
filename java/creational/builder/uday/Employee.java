/**
 * Represents an employee with details such as name, age, ID, and gender.
 */
class Employee {

    private String firstName;
    private String lastName;
    private int age;
    private int empId;
    private String gender;

    /**
     * Constructs an Employee object using an EmployeeBuilder.
     *
     * @param builder the builder object containing employee details
     * @throws IllegalArgumentException if required fields (first name, last name, or ID) are missing
     */
    Employee(EmployeeBuilder builder) {
        if (builder.getFirstName() == null || builder.getLastName() == null) {
            throw new IllegalArgumentException("First name and Last name are required");
        }
        if (builder.getEmpId() == 0) {
            throw new IllegalArgumentException("Employee ID is required");
        }

        this.firstName = builder.getFirstName();
        this.lastName = builder.getLastName();
        this.age = builder.getAge();
        this.empId = builder.getEmpId();
        this.gender = builder.getGender();
    }

    /**
     * Sets the first name of the employee.
     *
     * @param firstName the first name to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Sets the last name of the employee.
     *
     * @param lastName the last name to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Returns the first name of the employee.
     *
     * @return the first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Returns the last name of the employee.
     *
     * @return the last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * A builder for creating Employee objects.
     */
    static class EmployeeBuilder {

        private String firstName;
        private String lastName;
        private int age;
        private int empId;
        private String gender;

        /**
         * Sets the first name in the builder.
         *
         * @param firstName the first name to set
         * @return the updated builder
         */
        public EmployeeBuilder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        /**
         * Sets the last name in the builder.
         *
         * @param lastName the last name to set
         * @return the updated builder
         */
        public EmployeeBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        /**
         * Sets the age in the builder.
         *
         * @param age the age to set
         * @return the updated builder
         */
        public EmployeeBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        /**
         * Sets the employee ID in the builder.
         *
         * @param empId the employee ID to set
         * @return the updated builder
         */
        public EmployeeBuilder setEmpId(int empId) {
            this.empId = empId;
            return this;
        }

        /**
         * Sets the gender in the builder.
         *
         * @param gender the gender to set
         * @return the updated builder
         */
        public EmployeeBuilder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        /**
         * Returns the first name from the builder.
         *
         * @return the first name
         */
        public String getFirstName() {
            return firstName;
        }

        /**
         * Returns the last name from the builder.
         *
         * @return the last name
         */
        public String getLastName() {
            return lastName;
        }

        /**
         * Returns the age from the builder.
         *
         * @return the age
         */
        public int getAge() {
            return age;
        }

        /**
         * Returns the employee ID from the builder.
         *
         * @return the employee ID
         */
        public int getEmpId() {
            return empId;
        }

        /**
         * Returns the gender from the builder.
         *
         * @return the gender
         */
        public String getGender() {
            return gender;
        }

        /**
         * Builds an Employee object using the builder's data.
         *
         * @return the created Employee object
         */
        public Employee build() {
            return new Employee(this);
        }
    }
}
