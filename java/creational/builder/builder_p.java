public class builder_p {
    private final String name;
    private final int age;
    private final String address;
    private final String phoneNumber;
    private final String email;

    private builder_p(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.address = builder.address;
        this.phoneNumber = builder.phoneNumber;
        this.email = builder.email;
    }
    public static class Builder {
        private String name;
        private int age;
        private String address;
        private String phoneNumber;
        private String email;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public builder_p build() {
            return new builder_p(this);
        }
    }
    @Override
    public String toString() {
        return "Name= " + name + "\n" +
                "Age= " + age +"\n"+
                "Address= " + address + "\n" +
                "PhoneNumber= " + phoneNumber + "\n" +
                "Email= " + email + "\n" ;
    }
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