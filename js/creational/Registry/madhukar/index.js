import Batch from './batch.js';
import BatchRegistry from './batchregistry.js';
import Student from './student.js';

// creating batches in registry
BatchRegistry.register("design-pattern", new Batch("design-pattern", "3 Months", "Mon-Wed-Fri",  "Nishith"));
BatchRegistry.register("dev-ops", new Batch("dev-ops", "2 Months", "Tue-Thu",  "Mukund"));

// Creataing  students and assigning cloned batches
const students = [
  new Student("Madhukar", "madhukarmp11@gmail.com", BatchRegistry.get("dev-ops"),8317426804),
  new Student("Praful", "praful@gmail.com", BatchRegistry.get("design-pattern"),8317426804),
  new Student("darshan","darshan@gmail.com",BatchRegistry.get("dev-ops"),9872340908),
];

// Print student details
students.forEach(student => student.printDetails());
