class Batch {
  constructor(courseName, duration, schedule,teacher) {
    this.courseName = courseName;
    this.duration = duration;
    this.schedule = schedule;
    this.teacher = teacher;
  }

  clone() {
    const proto = Object.getPrototypeOf(this);           // Get the prototype of the current object
    const cloned = Object.create(proto);                 // Create a new object with the same prototype
    Object.assign(cloned, this);                         // Copy all properties from this object to the new one
    return cloned;  
    // or  
    //return Object.assign(Object.create(Object.getPrototypeOf(this)), this);
  }
}

export default Batch;
