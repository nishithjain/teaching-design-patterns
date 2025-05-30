public class builder_p {
    // Fields for the person object
    private final String name;
    private final int age;
    private final String address;
    private final String phoneNumber;
    private final String email;

// Private constructor, only accessible from Builder
    private builder_p(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.address = builder.address;
        this.phoneNumber = builder.phoneNumber;
        this.email = builder.email;
    }
    // Static inner Builder class
    public static class Builder {
        // Builder fields
        private String name;
        private int age;
        private String address;
        private String phoneNumber;
        private String email;
    // Setter for name, returns Builder for chaining
        public Builder setName(String name) {
            this.name = name;
            return this;
        }
        // Setter for age, returns Builder for chaining
        public Builder setAge(int age) {
            this.age = age;
            return this;
        }
        // Setter for address, returns Builder for chaining
        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }
        // Setter for phoneNumber, returns Builder for chaining
        public Builder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        // Setter for email, returns Builder for chaining
        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }
        // Build method to create the person object
        public builder_p build() {
            return new builder_p(this);
        }
    }
    // toString method to display the person object
    public String toString() {
        return "Name= " + name + "\n" +
                "Age= " + age +"\n"+
                "Address= " + address + "\n" +
                "PhoneNumber= " + phoneNumber + "\n" +
                "Email= " + email + "\n" ;
    }
    // Main method to demonstrate the Builder pattern
    public static void main(String[] args) {
        builder_p person = new builder_p.Builder()
                .setName("Praful Jain P")
                .setAge(19)
                .setAddress("123 Main St")
                .setPhoneNumber("123-456-7890")
                .setEmail("praful@gmail.com")
                .build();
        System.out.println(person);
        
    }
}