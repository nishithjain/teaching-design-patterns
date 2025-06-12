class Student {
  constructor(name, email, batch,phone) {
    this.name = name;
    this.email = email;
    this.phone =phone;
    this.batch = batch;
  }

  printDetails() {
    console.log(`name-${this.name} phone-${this.phone} email-${this.email} batch-${this.batch.courseName} teacher-${this.batch.teacher}`);
  }
}

export default Student;
