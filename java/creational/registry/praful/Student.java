public class Student {
    private String name;
    private int age;
    private String gender;
    private String phoneNumber;
    private String location;

    public Student(String name, int age, String gender, String phoneNumber, String location) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "\tName: " + name +"\n"+
               "\tAge: " + age +"\n"+
               "\tGender: " + gender +"\n"+
               "\tPhone: " + phoneNumber +"\n"+
               "\tLocation: " + location+"\n";
    }
}
