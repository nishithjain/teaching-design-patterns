class Employee{
  constructor(builder){            // assingning values from builder to employee
    this.firstName=builder.firstName;
    this.lastName=builder.lastName;
    this.age=builder.age;
    this.position=builder.position;
    this.department=builder.department;
    this.salary=builder.salary;
  }
}

class EmployeeBuilder{                    //assigning values using helper class or builder class using setter function
  setFirstName(firstName){
    this.firstName=firstName;
    return this;
  }

  setLastName(lastName){
    this.lastName=lastName;
    return this;
  }

  setAge(age){
    this.age=age;
    return this;
  }

  setPosition(position){
    this.position=position;
    return this;
  }

  setDepartment(department){
    this.department=department;
    return this;
  }

  setSalary(salary){
    this.salary=salary;
    return this;
  }

  build(){
    if(!this.firstName || this.firstName.trim()===""){              // validating firstname and lastname
      throw new Error("First name is required and cannot be empty");
    }
    if(!this.lastName || this.lastName.trim()=== ""){
      throw new Error("Last name is required and cannot be empty");
    }
    return new Employee(this);
  }
}

const employee = new EmployeeBuilder()
  .setFirstName("Madhukar")                     //doing method chaining to send values to builder             
  .setLastName("MP")
  .setAge(22)
  .setPosition("Software Engineer")
  .setDepartment("IT")
  .setSalary(30000)
  .build();           //calling the build function to build the object                           

console.log(employee);   //printing the object 
