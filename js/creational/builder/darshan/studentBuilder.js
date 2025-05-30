class Student {
    constructor(builder) {
        if (!builder.firstName || !builder.lastName) {
            throw new Error("First name and Last name are required");
        }
        if (!builder.stdId) {
            throw new Error("Student ID is required");
        }
        if (builder.age < 6) {
            throw new Error("Student age must be at least 6 years");
        }

        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.stdId = builder.stdId;
        this.gender = builder.gender;
        this.fatherName = builder.fatherName;
        this.motherName = builder.motherName;
        this.inClass = builder.inClass;
    }

    setFirstName(firstName) {
        this.firstName = firstName;
    }

    setLastName(lastName) {
        this.lastName = lastName;
    }

    getFirstName() {
        return this.firstName;
    }

    getLastName() {
        return this.lastName;
    }

    getAge() {
        return this.age;
    }

    getStdId() {
        return this.stdId;  
    }

    getGender() {
        return this.gender;
    }

    getFather() {
        return this.fatherName;
    }

    getMother() {
        return this.motherName;
    }

    getClass() {
        return this.inClass;
    }
}

class StudentBuilder {
    constructor() {
        this.firstName = null;
        this.lastName = null;
        this.age = null;
        this.stdId = null;
        this.gender = null;
        this.fatherName = null;
        this.motherName = null;
        this.inClass = null;
    }

    setFirstName(firstName) {
        this.firstName = firstName;
        return this;
    }

    setLastName(lastName) {
        this.lastName = lastName;
        return this;
    }

    setAge(age) {
        this.age = age;
        return this;
    }

    setStdId(stdId) {
        this.stdId = stdId;
        return this;
    }

    setGender(gender) {
        this.gender = gender;
        return this;
    }

    setFathername(fatherName) {
        this.fatherName = fatherName;
        return this;
    }

    setMothername(motherName) {
        this.motherName = motherName;
        return this;
    }

    setClass(inClass) {  
        this.inClass = inClass;  
        return this;
    }

    build() {
        return new Student(this);
    }
}

// Usage example
const student = new StudentBuilder()
    .setFirstName("Lord")
    .setLastName("Ganesha")
    .setStdId(12167)
    .setAge(8)
    .setGender("Male")
    .setFathername("Shiva")
    .setMothername("Parvathi")
    .setClass("1st Standard")
    .build();

console.log(student);